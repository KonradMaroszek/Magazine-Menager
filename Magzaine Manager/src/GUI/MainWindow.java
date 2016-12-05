package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.JSpinner;
import java.awt.List;

public class MainWindow {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_5;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
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
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(148, 0, 211));
		frame.setBounds(100, 100, 1024, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[grow]", "[grow]"));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(tabbedPane, "cell 0 0,grow");
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Archiwum", new ImageIcon(MainWindow.class.getResource("/mss32/IKONY/Archiwum.png")), panel, null);
		panel.setLayout(new MigLayout("", "[grow]", "[grow]"));
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBackground(Color.LIGHT_GRAY);
		panel.add(tabbedPane_1, "cell 0 0,grow");
		
		JPanel panel_5 = new JPanel();
		tabbedPane_1.addTab("Wydania", new ImageIcon(MainWindow.class.getResource("/mss32/IKONY/Wydanie.png")), panel_5, null);
		
		JPanel panel_6 = new JPanel();
		tabbedPane_1.addTab("Artyku\u0142y", new ImageIcon(MainWindow.class.getResource("/mss32/IKONY/Artyku\u0142.png")), panel_6, null);
		
		JPanel panel_7 = new JPanel();
		tabbedPane_1.addTab("Reklamy", new ImageIcon(MainWindow.class.getResource("/mss32/IKONY/reklamy.png")), panel_7, null);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Aktualne wydanie", new ImageIcon(MainWindow.class.getResource("/mss32/IKONY/Magazyn.png")), panel_1, null);
		panel_1.setLayout(new MigLayout("", "[grow]", "[grow]"));
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_2.setBackground(Color.LIGHT_GRAY);
		panel_1.add(tabbedPane_2, "cell 0 0,grow");
		
		JPanel panel_8 = new JPanel();
		tabbedPane_2.addTab("Informacje", new ImageIcon(MainWindow.class.getResource("/mss32/IKONY/Informacja.png")), panel_8, null);
		
		JPanel panel_11 = new JPanel();
		tabbedPane_2.addTab("Spis tre\u015Bci", new ImageIcon(MainWindow.class.getResource("/mss32/IKONY/spis tresci.png")), panel_11, null);
		
		JPanel panel_9 = new JPanel();
		tabbedPane_2.addTab("Artyku\u0142y", new ImageIcon(MainWindow.class.getResource("/mss32/IKONY/Artyku\u0142.png")), panel_9, null);
		
		JPanel panel_10 = new JPanel();
		tabbedPane_2.addTab("Reklamy", new ImageIcon(MainWindow.class.getResource("/mss32/IKONY/reklamy.png")), panel_10, null);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Kontrahenci i reklamodawcy", new ImageIcon(MainWindow.class.getResource("/mss32/IKONY/Reklamodawcy.png")), panel_4, null);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Autorzy", new ImageIcon(MainWindow.class.getResource("/mss32/IKONY/Autorzy.png")), panel_3, null);
		panel_3.setLayout(new MigLayout("", "[][][grow][][][][][][][][][][][][][][][][][][][][][][][][][][][]", "[][][][][][][][][][grow][][][][][]"));
		
		JButton btnNewButton_3 = new JButton("Dodaj");
		panel_3.add(btnNewButton_3, "cell 0 0");
		
		JButton btnNewButton_4 = new JButton("Usu\u0144");
		panel_3.add(btnNewButton_4, "cell 1 0");
		
		JButton btnNewButton_5 = new JButton("Wyszukaj");
		panel_3.add(btnNewButton_5, "cell 2 0");
		
		JRadioButton rdbtnTrybEdycji_1 = new JRadioButton("Tryb edycji");
		panel_3.add(rdbtnTrybEdycji_1, "cell 3 0");
		
		Box horizontalBox_2 = Box.createHorizontalBox();
		panel_3.add(horizontalBox_2, "cell 0 2 30 1,grow");
		
		JLabel lblImie = new JLabel("Imie:");
		horizontalBox_2.add(lblImie);
		
		Component horizontalStrut_15 = Box.createHorizontalStrut(20);
		horizontalBox_2.add(horizontalStrut_15);
		
		Component horizontalStrut_16 = Box.createHorizontalStrut(30);
		horizontalBox_2.add(horizontalStrut_16);
		
		textField_5 = new JTextField();
		horizontalBox_2.add(textField_5);
		textField_5.setColumns(10);
		
		Component horizontalStrut_6 = Box.createHorizontalStrut(20);
		horizontalBox_2.add(horizontalStrut_6);
		
		Component horizontalStrut_13 = Box.createHorizontalStrut(20);
		horizontalBox_2.add(horizontalStrut_13);
		
		JLabel lblNewLabel_8 = new JLabel("Ulica:");
		horizontalBox_2.add(lblNewLabel_8);
		
		Component horizontalStrut_14 = Box.createHorizontalStrut(20);
		horizontalBox_2.add(horizontalStrut_14);
		
		Component horizontalStrut_17 = Box.createHorizontalStrut(20);
		horizontalBox_2.add(horizontalStrut_17);
		
		textField_17 = new JTextField();
		horizontalBox_2.add(textField_17);
		textField_17.setColumns(10);
		
		Box horizontalBox_3 = Box.createHorizontalBox();
		panel_3.add(horizontalBox_3, "cell 0 3 30 1,grow");
		
		JLabel lblDrugieImie = new JLabel("Drugie imie:");
		horizontalBox_3.add(lblDrugieImie);
		
		Component horizontalStrut_21 = Box.createHorizontalStrut(10);
		horizontalBox_3.add(horizontalStrut_21);
		
		textField_13 = new JTextField();
		horizontalBox_3.add(textField_13);
		textField_13.setColumns(10);
		
		Component horizontalStrut_20 = Box.createHorizontalStrut(20);
		horizontalBox_3.add(horizontalStrut_20);
		
		Component horizontalStrut_19 = Box.createHorizontalStrut(20);
		horizontalBox_3.add(horizontalStrut_19);
		
		JLabel lblNumerLokalu = new JLabel("Nr lokalu:");
		horizontalBox_3.add(lblNumerLokalu);
		
		Component horizontalStrut_18 = Box.createHorizontalStrut(20);
		horizontalBox_3.add(horizontalStrut_18);
		
		textField_18 = new JTextField();
		horizontalBox_3.add(textField_18);
		textField_18.setColumns(10);
		
		Box horizontalBox_4 = Box.createHorizontalBox();
		panel_3.add(horizontalBox_4, "cell 0 4 30 1,grow");
		
		JLabel lblNewLabel_7 = new JLabel("Nazwisko:");
		horizontalBox_4.add(lblNewLabel_7);
		
		Component horizontalStrut_31 = Box.createHorizontalStrut(20);
		horizontalBox_4.add(horizontalStrut_31);
		
		textField_14 = new JTextField();
		horizontalBox_4.add(textField_14);
		textField_14.setColumns(10);
		
		Component horizontalStrut_22 = Box.createHorizontalStrut(20);
		horizontalBox_4.add(horizontalStrut_22);
		
		Component horizontalStrut_23 = Box.createHorizontalStrut(20);
		horizontalBox_4.add(horizontalStrut_23);
		
		JLabel lblNrBudynku_1 = new JLabel("Nr budynku:");
		horizontalBox_4.add(lblNrBudynku_1);
		
		Component horizontalStrut_28 = Box.createHorizontalStrut(7);
		horizontalBox_4.add(horizontalStrut_28);
		
		textField_19 = new JTextField();
		horizontalBox_4.add(textField_19);
		textField_19.setColumns(10);
		
		Box horizontalBox_5 = Box.createHorizontalBox();
		panel_3.add(horizontalBox_5, "cell 0 5 30 1,grow");
		
		JLabel lblNrTelefonu = new JLabel("Nr telefonu:");
		horizontalBox_5.add(lblNrTelefonu);
		
		Component horizontalStrut_32 = Box.createHorizontalStrut(13);
		horizontalBox_5.add(horizontalStrut_32);
		
		textField_15 = new JTextField();
		horizontalBox_5.add(textField_15);
		textField_15.setColumns(10);
		
		Component horizontalStrut_25 = Box.createHorizontalStrut(20);
		horizontalBox_5.add(horizontalStrut_25);
		
		Component horizontalStrut_24 = Box.createHorizontalStrut(20);
		horizontalBox_5.add(horizontalStrut_24);
		
		JLabel lblMiasto_1 = new JLabel("Miasto:");
		horizontalBox_5.add(lblMiasto_1);
		
		Component horizontalStrut_29 = Box.createHorizontalStrut(30);
		horizontalBox_5.add(horizontalStrut_29);
		
		textField_20 = new JTextField();
		horizontalBox_5.add(textField_20);
		textField_20.setColumns(10);
		
		Box horizontalBox_6 = Box.createHorizontalBox();
		panel_3.add(horizontalBox_6, "cell 0 6 30 1,grow");
		
		JLabel lblAdresEmail = new JLabel("Adres email:");
		horizontalBox_6.add(lblAdresEmail);
		
		Component horizontalStrut_33 = Box.createHorizontalStrut(8);
		horizontalBox_6.add(horizontalStrut_33);
		
		textField_16 = new JTextField();
		horizontalBox_6.add(textField_16);
		textField_16.setColumns(10);
		
		Component horizontalStrut_27 = Box.createHorizontalStrut(20);
		horizontalBox_6.add(horizontalStrut_27);
		
		Component horizontalStrut_26 = Box.createHorizontalStrut(20);
		horizontalBox_6.add(horizontalStrut_26);
		
		JLabel lblKodPocztowy_1 = new JLabel("K. pocztowy:");
		horizontalBox_6.add(lblKodPocztowy_1);
		
		textField_21 = new JTextField();
		horizontalBox_6.add(textField_21);
		textField_21.setColumns(10);
		
		Box horizontalBox_7 = Box.createHorizontalBox();
		panel_3.add(horizontalBox_7, "cell 0 7 30 1,grow");
		
		Component horizontalStrut_30 = Box.createHorizontalStrut(510);
		horizontalBox_7.add(horizontalStrut_30);
		
		JLabel lblNewLabel_9 = new JLabel("Kraj:");
		horizontalBox_7.add(lblNewLabel_9);
		
		Component horizontalStrut_34 = Box.createHorizontalStrut(47);
		horizontalBox_7.add(horizontalStrut_34);
		
		textField_22 = new JTextField();
		horizontalBox_7.add(textField_22);
		textField_22.setColumns(10);
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		panel_3.add(horizontalBox_1, "cell 0 8 2 1");
		
		JLabel lblListaArtykuw = new JLabel("Lista artyku\u0142\u00F3w");
		horizontalBox_1.add(lblListaArtykuw);
		
		Box horizontalBox = Box.createHorizontalBox();
		panel_3.add(horizontalBox, "cell 0 9 30 2,grow");
		
		List list = new List();
		horizontalBox.add(list);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Subskrybenci", new ImageIcon(MainWindow.class.getResource("/mss32/IKONY/Subskrybcja.png")), panel_2, null);
		panel_2.setLayout(new MigLayout("", "[][][][grow][][][][][grow]", "[][][][][][][][][][][][][][][][][][grow][][][][][][][][][][grow][][][][][][][][]"));
		
		JLabel lblNewLabel_4 = new JLabel("Imie:");
		panel_2.add(lblNewLabel_4, "flowx,cell 0 1");
		
		Component horizontalStrut = Box.createHorizontalStrut(150);
		panel_2.add(horizontalStrut, "cell 0 1");
		
		JLabel lblNewLabel_5 = new JLabel("Dodatkowe informacje:");
		panel_2.add(lblNewLabel_5, "cell 2 1");
		
		Box verticalBox = Box.createVerticalBox();
		panel_2.add(verticalBox, "cell 2 2 6 5,grow");
		
		JEditorPane editorPane = new JEditorPane();
		verticalBox.add(editorPane);
		
		JLabel lblNewLabel = new JLabel("Drugie Imie:");
		panel_2.add(lblNewLabel, "flowx,cell 0 2");
		
		JLabel lblNewLabel_1 = new JLabel("Nazwisko");
		panel_2.add(lblNewLabel_1, "flowx,cell 0 3");
		
		JLabel lblNewLabel_2 = new JLabel("Data rozpocz\u0119cia subskrypcji:");
		panel_2.add(lblNewLabel_2, "flowx,cell 0 4");
		
		JLabel lblDataZakoczeniaSubskrypcji = new JLabel("Data zako\u0144czenia subskrypcji:");
		panel_2.add(lblDataZakoczeniaSubskrypcji, "flowx,cell 0 5");
		
		JLabel lblNewLabel_3 = new JLabel("Ilo\u015B\u0107 zamawianych:");
		panel_2.add(lblNewLabel_3, "flowx,cell 0 6");
		
		textField = new JTextField();
		panel_2.add(textField, "cell 0 1");
		textField.setColumns(30);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(110);
		panel_2.add(horizontalStrut_1, "cell 0 2");
		
		textField_1 = new JTextField();
		textField_1.setColumns(30);
		panel_2.add(textField_1, "cell 0 2");
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(122);
		panel_2.add(horizontalStrut_2, "cell 0 3");
		
		textField_2 = new JTextField();
		textField_2.setColumns(30);
		panel_2.add(textField_2, "cell 0 3");
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(7);
		panel_2.add(horizontalStrut_3, "cell 0 4");
		
		textField_3 = new JTextField();
		textField_3.setColumns(30);
		panel_2.add(textField_3, "cell 0 4");
		
		Component horizontalStrut_4 = Box.createHorizontalStrut(5);
		panel_2.add(horizontalStrut_4, "cell 0 5");
		
		textField_6 = new JTextField();
		textField_6.setColumns(30);
		panel_2.add(textField_6, "cell 0 5");
		
		Component horizontalStrut_5 = Box.createHorizontalStrut(66);
		panel_2.add(horizontalStrut_5, "cell 0 6");
		
		textField_4 = new JTextField();
		textField_4.setColumns(30);
		panel_2.add(textField_4, "cell 0 6");
		
		JSeparator separator = new JSeparator();
		panel_2.add(separator, "cell 0 7");
		
		JLabel lblDaneDoWysyki = new JLabel("Dane do wysy\u0142ki:");
		panel_2.add(lblDaneDoWysyki, "flowx,cell 0 9");
		
		JLabel lblNewLabel_6 = new JLabel("Uwagi subskrybenta:");
		panel_2.add(lblNewLabel_6, "cell 2 9");
		
		JLabel lblUlica = new JLabel("Ulica:");
		panel_2.add(lblUlica, "flowx,cell 0 10");
		
		Box verticalBox_1 = Box.createVerticalBox();
		panel_2.add(verticalBox_1, "cell 2 10 5 6,grow");
		
		JEditorPane editorPane_1 = new JEditorPane();
		verticalBox_1.add(editorPane_1);
		
		JLabel lblNrBudynku = new JLabel("Nr budynku:");
		panel_2.add(lblNrBudynku, "flowx,cell 0 11");
		
		JLabel lblNrLokalu = new JLabel("Nr lokalu:");
		panel_2.add(lblNrLokalu, "flowx,cell 0 12");
		
		JLabel lblMiasto = new JLabel("Miasto:");
		panel_2.add(lblMiasto, "flowx,cell 0 13");
		
		JLabel lblKodPocztowy = new JLabel("Kod pocztowy:");
		panel_2.add(lblKodPocztowy, "flowx,cell 0 14");
		
		JLabel lblKraj = new JLabel("Kraj");
		panel_2.add(lblKraj, "flowx,cell 0 15");
		
		Component horizontalStrut_7 = Box.createHorizontalStrut(145);
		panel_2.add(horizontalStrut_7, "cell 0 10");
		
		Component horizontalStrut_8 = Box.createHorizontalStrut(108);
		panel_2.add(horizontalStrut_8, "cell 0 11");
		
		Component horizontalStrut_9 = Box.createHorizontalStrut(122);
		panel_2.add(horizontalStrut_9, "cell 0 12");
		
		Component horizontalStrut_10 = Box.createHorizontalStrut(134);
		panel_2.add(horizontalStrut_10, "cell 0 13");
		
		Component horizontalStrut_11 = Box.createHorizontalStrut(93);
		panel_2.add(horizontalStrut_11, "cell 0 14");
		
		Component horizontalStrut_12 = Box.createHorizontalStrut(152);
		panel_2.add(horizontalStrut_12, "cell 0 15");
		
		textField_7 = new JTextField();
		textField_7.setColumns(30);
		panel_2.add(textField_7, "cell 0 10");
		
		textField_8 = new JTextField();
		textField_8.setColumns(30);
		panel_2.add(textField_8, "cell 0 11");
		
		textField_9 = new JTextField();
		textField_9.setColumns(30);
		panel_2.add(textField_9, "cell 0 12");
		
		textField_10 = new JTextField();
		textField_10.setColumns(30);
		panel_2.add(textField_10, "cell 0 13");
		
		textField_11 = new JTextField();
		textField_11.setColumns(30);
		panel_2.add(textField_11, "cell 0 14");
		
		textField_12 = new JTextField();
		textField_12.setColumns(30);
		panel_2.add(textField_12, "cell 0 15");
		
		Box horizontalBox_8 = Box.createHorizontalBox();
		panel_2.add(horizontalBox_8, "cell 2 0");
		
		JButton btnNewButton_1 = new JButton("Dodaj");
		panel_2.add(btnNewButton_1, "flowx,cell 0 0");
		
		JButton btnNewButton_2 = new JButton("Usu\u0144");
		panel_2.add(btnNewButton_2, "cell 0 0");
		
		JButton btnNewButton = new JButton("Wyszukaj");
		panel_2.add(btnNewButton, "cell 0 0");
		
		JRadioButton rdbtnTrybEdycji = new JRadioButton("Tryb edycji");
		panel_2.add(rdbtnTrybEdycji, "cell 0 0 9 1,grow");
	}

}
