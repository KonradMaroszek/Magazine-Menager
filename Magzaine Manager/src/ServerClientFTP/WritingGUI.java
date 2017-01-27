package ServerClientFTP;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class WritingGUI extends Thread {
	private OutputStream stream;
	private JTextField textField;
	private JLabel timer;
	public WritingGUI(OutputStream s, JTextField textField, JLabel timer)
	{
		stream = s;
		this.textField = textField;
		this.timer = timer;
	}
	
	public void run()
	{
		try {
			writeToServer(stream, textField, timer);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void writeToServer(OutputStream stream, JTextField textField, JLabel timer) throws IOException {
		PrintWriter out = new PrintWriter(new OutputStreamWriter(stream));
		String str = "";
		if (!(str = textField.getText()).equals(""))
		{
			out.println(str);
			out.flush();
			textField.setText("");
			timer.setText("-");
		}
		
		
		
}
}
