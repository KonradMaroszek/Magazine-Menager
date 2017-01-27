package ServerClientFTP;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;



public class NewConnectionThread extends Thread {
	
	private Socket mySocket;
	private String nickname;
	
	public NewConnectionThread(Socket s, String nick)
	{
		mySocket = s;
		nickname = nick;
	}
	public void run()
	{
		try {
			(new MsgListener(mySocket, nickname)).start();
		} catch (NullPointerException exc) {
			// TODO Auto-generated catch block
			System.out.println("Disconnected.");
		} 
	}
	
}
