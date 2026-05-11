import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import java.awt.Color;
import javax.swing.JScrollBar;
import javax.swing.JEditorPane;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JLabel;

public class JFrame extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame frame = new JFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JFrame() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 934, 807);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, "name_16548883768400");
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Inicio Sesion");
		btnNewButton.setBounds(86, 446, 171, 39);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnNewButton.setBackground(Color.GREEN);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Registrarse");
		btnNewButton_1.setBounds(602, 446, 153, 39);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_1.setBackground(Color.YELLOW);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Como Jugar");
		btnNewButton_2.setBounds(168, 29, 139, 33);
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.setBackground(new Color(0, 0, 160));
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Cuenta");
		btnNewButton_3.setBounds(782, 24, 109, 39);
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_3.setBackground(new Color(128, 128, 255));
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Inicio");
		btnNewButton_4.setBounds(64, 28, 77, 31);
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNewButton_4.setBackground(new Color(0, 128, 255));
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Jugar");
		btnNewButton_5.setBounds(373, 313, 167, 77);
		btnNewButton_5.setForeground(Color.BLACK);
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 56));
		btnNewButton_5.setBackground(Color.RED);
		panel_1.add(btnNewButton_5);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, "name_16691066515999");
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(139, 114, 214, 18);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(139, 175, 214, 18);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(139, 351, 343, 18);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(139, 238, 213, 18);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(139, 300, 214, 18);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Hombre\r\n");
		chckbxNewCheckBox.setBounds(139, 419, 92, 20);
		panel.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Mujer");
		chckbxNewCheckBox_1.setBounds(267, 419, 92, 20);
		panel.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Otro");
		chckbxNewCheckBox_2.setBounds(400, 419, 92, 20);
		panel.add(chckbxNewCheckBox_2);
		
		JLabel lblNewLabel = new JLabel("Genero:");
		lblNewLabel.setBounds(57, 423, 44, 12);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Correo Electronico");
		lblNewLabel_1.setBounds(38, 354, 91, 12);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Telefono");
		lblNewLabel_2.setBounds(57, 303, 44, 12);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Fecha De Nacimiento");
		lblNewLabel_3.setBounds(57, 241, 44, 12);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Apellidos");
		lblNewLabel_4.setBounds(57, 178, 44, 12);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Nombre");
		lblNewLabel_5.setBounds(57, 117, 44, 12);
		panel.add(lblNewLabel_5);
		
		JButton btnNewButton_6 = new JButton("Inicio");
		btnNewButton_6.setBounds(17, 10, 84, 20);
		panel.add(btnNewButton_6);
		
		JLabel lblNewLabel_6 = new JLabel("¿Ya tienes una cuenta?");
		lblNewLabel_6.setBounds(57, 524, 105, 12);
		panel.add(lblNewLabel_6);
		
		JButton btnNewButton_7 = new JButton("Inicia Sesion");
		btnNewButton_7.setBounds(194, 520, 122, 20);
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("Registrarse");
		btnNewButton_8.setBounds(57, 466, 122, 48);
		panel.add(btnNewButton_8);

	}
}
