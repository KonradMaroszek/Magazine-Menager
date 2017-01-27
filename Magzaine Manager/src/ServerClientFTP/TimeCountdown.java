package ServerClientFTP;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JLabel;

public class TimeCountdown extends Thread {
	
	private JLabel timer;
	private int counter;
	private Socket socket;
	public TimeCountdown(JLabel timer, Socket socket)
	{
		this.timer = timer;
		this.socket = socket;
	}
	
	@SuppressWarnings("deprecation")
	public void run()
	{
		try {
			counter = 30;
			timer.setText("" + counter);
			while(counter > 0)
			{
				if((timer.getText().equals("-"))) 
				{
					break;
				}
				else
				{
					counter -= 1;
					timer.setText("" + counter);
					Thread.sleep(1000);
				}
			}
			if(counter == 0)
			{
				timer.setText("Czas minal!");
				PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
				synchronized(out)
				{
					out.println("Blank!");
					out.flush();
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("TimeCountdown couldnt send message to server.");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("TimeCountdown interrupted.");
		}
		
		
	}
}
