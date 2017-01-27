package ServerClientFTP;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.ServerSocket;
import java.awt.event.ActionEvent;
import javax.swing.JList;

public class ServerGUI {

	private JFrame frame;
	private JTextField portTextField;
	private JTextField maxClientsTextField;
	private ServerSocket sock = null;
	private JList<String> connectionsList;
	private JButton btnZakonczNasluchiwanie;
	private Thread mainThread;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ServerGUI window = new ServerGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ServerGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		portTextField = new JTextField();
		portTextField.setBounds(10, 33, 86, 20);
		frame.getContentPane().add(portTextField);
		portTextField.setColumns(10);
		
		JLabel lblNumerPortu = new JLabel("Numer portu:");
		lblNumerPortu.setBounds(10, 11, 86, 14);
		frame.getContentPane().add(lblNumerPortu);
		
		maxClientsTextField = new JTextField();
		maxClientsTextField.setBounds(10, 85, 86, 20);
		frame.getContentPane().add(maxClientsTextField);
		maxClientsTextField.setColumns(10);
		
		JLabel lblMaksLiczbaClientow = new JLabel("Maks. liczba klientow:");
		lblMaksLiczbaClientow.setBounds(10, 60, 127, 14);
		frame.getContentPane().add(lblMaksLiczbaClientow);
		
		connectionsList = new JList<String> (new DefaultListModel<String>());
		connectionsList.setBounds(213, 35, 157, 111);
		frame.getContentPane().add(connectionsList);
		
		
		JButton btnRozpocznijNasuchiwanie = new JButton("Rozpocznij nasluchiwanie");
		btnRozpocznijNasuchiwanie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int port_number = 1234;
				int max_clients = 108 ;
				try
				{
					// if correct args, sets port number, max clients.
					if(!maxClientsTextField.getText().equals("")) max_clients = Integer.parseInt(maxClientsTextField.getText());
					if (!portTextField.getText().equals("") ) port_number = Integer.parseInt(portTextField.getText());
					// New server socket
					sock = new ServerSocket(port_number);
					sock.setReceiveBufferSize(max_clients);
					mainThread = new WaitForClientsThread(sock, connectionsList);
					mainThread.start();
					
				}
				catch(IndexOutOfBoundsException exc)
				{
					System.out.println("Enter correct port number!");
				}
				catch (IOException e1) {
					// TODO Auto-generated catch block
					System.out.println("Connection error.");
				}
				catch(NumberFormatException err)
				{
					System.out.println("Wrong port number");
				} 
				
			}
		});
		btnRozpocznijNasuchiwanie.setBounds(10, 203, 170, 20);
		frame.getContentPane().add(btnRozpocznijNasuchiwanie);
		
		
		
		JLabel lblCurrentlyConnected = new JLabel("Obecne polaczenia:");
		lblCurrentlyConnected.setBounds(213, 11, 157, 14);
		frame.getContentPane().add(lblCurrentlyConnected);
		
		btnZakonczNasluchiwanie = new JButton("Zakoncz nasluchiwanie");
		btnZakonczNasluchiwanie.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(sock != null)
				{
					try {
						sock.close();
						mainThread.interrupt();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
			}
		});
		btnZakonczNasluchiwanie.setBounds(10, 234, 170, 17);
		frame.getContentPane().add(btnZakonczNasluchiwanie);
		
	}
	
	
	
}
