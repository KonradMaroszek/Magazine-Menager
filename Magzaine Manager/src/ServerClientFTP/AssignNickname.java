package ServerClientFTP;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import Database.FetchQuery;


public class AssignNickname implements Callable<String>{
	

	private Socket socket;
	
	public AssignNickname(Socket s)
	{
		this.socket = s;
	}
	
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		BufferedReader incoming = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String str = null;
		String login = null;
		String password = null;
		while(true)
		{
			if((str = incoming.readLine()) != null) 
			{
				login = str.trim().split(":")[0];
				password = str.trim().split(":")[1];
				ExecutorService executor = Executors.newFixedThreadPool(1);
				ArrayList<Map<String, Object>> m = executor.submit(new FetchQuery("Select * from userzy where login = '"+login+"' and password = '"+password+"'")).get();
				if(m.size() > 0)  
				{
					PrintWriter outgoing = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
					outgoing.println("logged");
					outgoing.flush();
					break;
				}
				else
				{
					PrintWriter outgoing = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
					outgoing.println("error");
					outgoing.flush();
					socket.close();
					throw new Exception();
				}
			}
		}
		return login;
	}

}
