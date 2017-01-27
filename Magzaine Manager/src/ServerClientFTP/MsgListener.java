package ServerClientFTP;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import Database.Execute_command;
import Database.FetchQuery;

public class MsgListener extends Thread {

	private String nickname;
	private Socket mySocket;
	public MsgListener(Socket mySocket, String nickname)
	{
		this.nickname = nickname;
		this.mySocket = mySocket;
	}
	public void run()
	{
		String str;
		BufferedReader incoming;
		int nr_pytania = 1;
		int wynik = 0;
		boolean poprawnie_odpowiedziano = false;
		try {
			incoming = new BufferedReader(new InputStreamReader(mySocket.getInputStream()));
			PrintWriter outgoing = new PrintWriter(new OutputStreamWriter(mySocket.getOutputStream()));
			ExecutorService executor = Executors.newFixedThreadPool(1);
			// Wysyla pierwsze pytanie
			Future<ArrayList<Map<String, Object>>> next = executor.submit(new FetchQuery("Select tresc, odpowiedzi, poprawne from pytania where nr_pytania = " + (nr_pytania)));
			Map<String, Object> m = next.get().get(0);
			String poprawne_odp = m.get(3).toString();
			outgoing.println(m.get(1).toString());
			outgoing.flush();
			outgoing.println(m.get(2).toString());
			outgoing.flush();
			// Czeka na odpowiedz, sprawdza czy jest poprawna, wczytuje i wysyla kolejne pytanie (petla)
			while (!(str = incoming.readLine()).equals("exit()") && nr_pytania <= 5) {
				nr_pytania += 1;
				if(poprawne_odp.contains(", "))
				{
					poprawnie_odpowiedziano = true;
					for(String odp : poprawne_odp.split(", "))
					{
						if (!str.contains(odp))
						{
							poprawnie_odpowiedziano = false;
						}
					}
					
				}
				if(str.trim().equals(poprawne_odp.trim())) poprawnie_odpowiedziano = true;
				
				if(poprawnie_odpowiedziano == true) wynik += 1;
				if(nr_pytania > 5) break;
				else
				{
					next = executor.submit(new FetchQuery("Select tresc, odpowiedzi, poprawne from pytania where nr_pytania = " + nr_pytania));
					m = next.get().get(0);
					poprawne_odp = m.get(3).toString();
					outgoing.println(m.get(1).toString());
					outgoing.flush();
					outgoing.println(m.get(2).toString());
					outgoing.flush();
				}
				
				
			}
			// ZAPIS WYNIKOW
			executor.submit(new Execute_command("Insert into wyniki (nick, data, wynik) values ('"+nickname+"', ('"+ (new Timestamp(new Date().getTime()))+"'), "+ wynik + ")"));
			outgoing.println("Uzyskales " + wynik + " pkt.");
			outgoing.flush();
			mySocket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
