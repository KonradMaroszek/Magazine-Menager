package ServerClientFTP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.SocketException;

import javax.swing.JLabel;
import javax.swing.JTextArea;

public class ReadingGUI extends Thread {
	private Socket socket;
	private JTextArea quiz;
	private JLabel timer;
	public ReadingGUI(Socket s, JTextArea quiz, JLabel timer)
	{
		this.socket = s;
		this.timer = timer;
		this.quiz = quiz;
	}
	
	public void run()
	{
		ListeningForMessages(socket, quiz);
	}

	@SuppressWarnings("deprecation")
	private void ListeningForMessages(Socket socket, JTextArea chat) {
		// TODO Auto-generated method stub
		
		try {
			
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String message = null;
			Thread countdown = null;
			while(!(message = in.readLine()).equals("exit()")) 	
				{
					if(message != null)	
					{	
						chat.setText(chat.getText() + "\n" + message);
						if(message.contains("A)") && message.contains("B)") && message.contains("C)") && message.contains("D)")) 
						{
							if(countdown != null) countdown.interrupt();
							countdown = new TimeCountdown(timer, socket);
							countdown.start();
						}
					}
				}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			chat.setText(chat.getText()+"\n Disconnected from server.");
			System.out.println("Disconnected.");
		}
	}
	
}
