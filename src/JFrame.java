import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import org.bson.Document;

import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.UpdateResult;
import java.awt.FlowLayout;

public class JFrame extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_10;
	private JTextField textField_9;
	private JTextField textField_11;
	private JTextField textField_12;
	private int id_usuario = -1;
	
	private JLabel lblNewLabel_13;
	private JLabel lblNewLabel_14;
	private JLabel lblNewLabel_20;
	private JLabel lblNewLabel_21;
	private JLabel lblNewLabel_22;
	private JLabel lblNewLabel_23;
	private JLabel lblNewLabel_24;
	private JLabel lblNewLabel_25;

	private JButton btnNewButton_13_1;
	private JButton btnNewButton_13_3;
	private JButton btnNewButton_13;
	private JButton btnNewButton_13_2;
	private JPanel PanelFinal;
	private JPanel PanelJugar;

	private JButton btnNewButton_13_5;
	private JButton btnNewButton_13_5_1;
	private JButton btnNewButton_13_5_1_1;
	private JButton btnNewButton_13_5_1_1_1;
	private JPanel panel_5;
	private JPanel panel_2;
	private JPanel panel_2_1;
	private JPanel panel_2_2;
	
	private List<Document> preguntasPartida = new ArrayList<>();
	private String respuestaCorrectaActual = "";
	private int indicePregunta = 0;
	private int puntos = 0;
	private int racha = 0;
	private int aciertos = 0;
	private int MayorRacha =0;
	private int ComodinesUsados =0;
	private boolean comodinChatUsado = false;
	private boolean comodinSaltarUsado = false;
	private boolean comodinProteccionUsado = false;
	private boolean comodin5050Usado = false;

	private boolean proteccionActiva = false;

	private int votosA = 0;
	private int votosB = 0;
	private int votosC = 0;
	private int votosD = 0;
	

	private ImageIcon cargarIcono(String ruta) {
		URL url = getClass().getResource(ruta);
		System.out.println("Ruta: " + ruta + " -> " + url);
		if (url == null) {
			JOptionPane.showMessageDialog(this, "No se encontró la imagen: " + ruta);
			return null;
		}
		return new ImageIcon(url);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame frame = new JFrame();
					frame.setVisible(true);
					 frame.iniciarPartida();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JFrame() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 934, 807);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));

		JPanel PanelPrincipal = new JPanel();
		contentPane.add(PanelPrincipal, "name_16548883768400");
		PanelPrincipal.setLayout(null);

		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(118, 606, 245, 70);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setOpaque(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBorder(null);
		PanelPrincipal.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setForeground(new Color(255, 0, 0));
		btnNewButton_1.setBounds(541, 597, 245, 75);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setOpaque(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setBorder(null);
		PanelPrincipal.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setForeground(new Color(255, 0, 0));
		btnNewButton_2.setBounds(243, 40, 229, 58);
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setOpaque(false);
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setFocusPainted(false);
		btnNewButton_2.setBorder(null);
		PanelPrincipal.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setForeground(new Color(255, 0, 0));
		btnNewButton_3.setBounds(594, 40, 229, 64);
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_3.setContentAreaFilled(false);
		btnNewButton_3.setOpaque(false);
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setFocusPainted(false);
		btnNewButton_3.setBorder(null);
		PanelPrincipal.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setForeground(new Color(255, 0, 0));
		btnNewButton_4.setBounds(47, 40, 186, 58);
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNewButton_4.setContentAreaFilled(false);
		btnNewButton_4.setOpaque(false);
		btnNewButton_4.setBorderPainted(false);
		btnNewButton_4.setFocusPainted(false);
		btnNewButton_4.setBorder(null);
		PanelPrincipal.add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5.setForeground(new Color(255, 0, 0));
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 56));
		btnNewButton_5.setContentAreaFilled(false);
		btnNewButton_5.setOpaque(false);
		btnNewButton_5.setBorderPainted(false);
		btnNewButton_5.setFocusPainted(false);
		btnNewButton_5.setBorder(null);
		btnNewButton_5.setBounds(261, 385, 357, 87);
		PanelPrincipal.add(btnNewButton_5);

		JPanel fondoPrincipal = new JPanel();
		fondoPrincipal.setBounds(0, 0, 920, 768);
		PanelPrincipal.add(fondoPrincipal);

		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon(JFrame.class.getResource("/imagenes/ConcursoFondo (1).png")));
		fondoPrincipal.add(lblNewLabel_7);

		JButton btnNewButton_9 = new JButton("");
		btnNewButton_9.setBounds(294, 483, 293, 64);
		btnNewButton_9.setContentAreaFilled(false);
		btnNewButton_9.setOpaque(false);
		btnNewButton_9.setBorderPainted(false);
		btnNewButton_9.setFocusPainted(false);
		btnNewButton_9.setBorder(null);
		PanelPrincipal.add(btnNewButton_9);

		JPanel PanelRegistrarse = new JPanel();
		PanelRegistrarse.setBackground(new Color(255, 204, 255));
		contentPane.add(PanelRegistrarse, "name_16691066515999");
		PanelRegistrarse.setLayout(null);

		textField = new JTextField();
		textField.setForeground(new Color(0, 0, 0));
		textField.setBounds(139, 114, 214, 18);
		PanelRegistrarse.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(139, 175, 214, 18);
		PanelRegistrarse.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(139, 351, 289, 18);
		PanelRegistrarse.add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(139, 238, 214, 18);
		PanelRegistrarse.add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setBounds(139, 300, 214, 18);
		PanelRegistrarse.add(textField_4);
		textField_4.setColumns(10);

		JLabel lblNewLabel = new JLabel("Genero:");
		lblNewLabel.setForeground(new Color(255, 102, 255));
		lblNewLabel.setBounds(17, 466, 63, 12);
		PanelRegistrarse.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Correo Electronico");
		lblNewLabel_1.setForeground(new Color(255, 102, 255));
		lblNewLabel_1.setBounds(17, 354, 127, 12);
		PanelRegistrarse.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Telefono");
		lblNewLabel_2.setForeground(new Color(255, 102, 255));
		lblNewLabel_2.setBounds(17, 303, 84, 12);
		PanelRegistrarse.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Fecha De Nacimiento");
		lblNewLabel_3.setForeground(new Color(255, 102, 255));
		lblNewLabel_3.setBounds(17, 241, 135, 15);
		PanelRegistrarse.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Apellidos");
		lblNewLabel_4.setForeground(new Color(255, 102, 255));
		lblNewLabel_4.setBounds(17, 178, 63, 12);
		PanelRegistrarse.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Nombre");
		lblNewLabel_5.setForeground(new Color(255, 0, 255));
		lblNewLabel_5.setBounds(17, 117, 68, 12);
		PanelRegistrarse.add(lblNewLabel_5);

		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setBounds(69, 48, 172, 58);
		btnNewButton_6.setContentAreaFilled(false);
		btnNewButton_6.setOpaque(false);
		btnNewButton_6.setBorderPainted(false);
		btnNewButton_6.setFocusPainted(false);
		btnNewButton_6.setBorder(null);
		PanelRegistrarse.add(btnNewButton_6);

		JLabel lblNewLabel_6 = new JLabel("¿Ya tienes una cuenta?");
		lblNewLabel_6.setForeground(new Color(255, 102, 255));
		lblNewLabel_6.setBounds(17, 619, 148, 27);
		PanelRegistrarse.add(lblNewLabel_6);

		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.setBounds(166, 631, 187, 51);
		btnNewButton_7.setContentAreaFilled(false);
		btnNewButton_7.setOpaque(false);
		btnNewButton_7.setBorderPainted(false);
		btnNewButton_7.setFocusPainted(false);
		btnNewButton_7.setBorder(null);
		PanelRegistrarse.add(btnNewButton_7);

		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.setBackground(new Color(255, 255, 255));
		btnNewButton_8.setContentAreaFilled(false);
		btnNewButton_8.setOpaque(false);
		btnNewButton_8.setBorderPainted(false);
		btnNewButton_8.setFocusPainted(false);
		btnNewButton_8.setBorder(null);
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_8.setForeground(new Color(0, 0, 0));
		btnNewButton_8.setBounds(39, 529, 247, 80);
		PanelRegistrarse.add(btnNewButton_8);

		textField_7 = new JTextField();
		textField_7.setBounds(135, 406, 293, 18);
		PanelRegistrarse.add(textField_7);
		textField_7.setColumns(10);

		JLabel lblNewLabel_8 = new JLabel("Contraseña");
		lblNewLabel_8.setForeground(new Color(255, 102, 255));
		lblNewLabel_8.setBounds(17, 409, 84, 12);
		PanelRegistrarse.add(lblNewLabel_8);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("Otro");
		rdbtnNewRadioButton.setBounds(447, 462, 102, 20);
		PanelRegistrarse.add(rdbtnNewRadioButton);

		JRadioButton Hombre = new JRadioButton("Hombre");
		Hombre.setBounds(139, 462, 102, 20);
		PanelRegistrarse.add(Hombre);

		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Mujer");
		rdbtnNewRadioButton_2.setBounds(296, 462, 102, 20);
		PanelRegistrarse.add(rdbtnNewRadioButton_2);

		ButtonGroup grupoGenero = new ButtonGroup();
		grupoGenero.add(Hombre);
		grupoGenero.add(rdbtnNewRadioButton_2);
		grupoGenero.add(rdbtnNewRadioButton);

		Hombre.setSelected(true);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 0, 920, 768);
		PanelRegistrarse.add(panel_3);

		JLabel lblNewLabel_8_1 = new JLabel("New label");
		lblNewLabel_8_1.setIcon(new ImageIcon(JFrame.class.getResource("/imagenes/RegistrarseFondo.png")));
		panel_3.add(lblNewLabel_8_1);

		JPanel PanelinicioSesion = new JPanel();
		contentPane.add(PanelinicioSesion, "name_765803670900");
		PanelinicioSesion.setLayout(null);

		textField_5 = new JTextField();
		textField_5.setBounds(278, 224, 325, 29);
		PanelinicioSesion.add(textField_5);
		textField_5.setColumns(10);

		textField_6 = new JTextField();
		textField_6.setBounds(278, 285, 325, 29);
		PanelinicioSesion.add(textField_6);
		textField_6.setColumns(10);

		JLabel lblNewLabel_9 = new JLabel("Correo Electronico");
		lblNewLabel_9.setForeground(new Color(255, 102, 255));
		lblNewLabel_9.setBounds(390, 202, 125, 12);
		PanelinicioSesion.add(lblNewLabel_9);

		JLabel lblNewLabel_10 = new JLabel("Contraseña");
		lblNewLabel_10.setForeground(new Color(255, 102, 255));
		lblNewLabel_10.setBounds(390, 263, 100, 12);
		PanelinicioSesion.add(lblNewLabel_10);

		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("¿Eres humano?");
		chckbxNewCheckBox_3.setFont(new Font("Calibri", Font.PLAIN, 18));
		chckbxNewCheckBox_3.setForeground(new Color(255, 102, 255));
		chckbxNewCheckBox_3.setBounds(373, 342, 178, 65);
		chckbxNewCheckBox_3.setContentAreaFilled(false);
		chckbxNewCheckBox_3.setOpaque(false);
		chckbxNewCheckBox_3.setBorderPainted(false);
		chckbxNewCheckBox_3.setFocusPainted(false);
		chckbxNewCheckBox_3.setBorder(null);
		PanelinicioSesion.add(chckbxNewCheckBox_3);

		JLabel lblNewLabel_11 = new JLabel("¿No tienes una cuenta?");
		lblNewLabel_11.setForeground(new Color(255, 102, 255));
		lblNewLabel_11.setBounds(356, 475, 142, 60);
		PanelinicioSesion.add(lblNewLabel_11);

		JButton btnNewButton_10 = new JButton("");
		btnNewButton_10.setBounds(500, 475, 194, 60);
		btnNewButton_10.setContentAreaFilled(false);
		btnNewButton_10.setOpaque(false);
		btnNewButton_10.setBorderPainted(false);
		btnNewButton_10.setFocusPainted(false);
		btnNewButton_10.setBorder(null);
		PanelinicioSesion.add(btnNewButton_10);

		JButton btnNewButton_11 = new JButton("");
		btnNewButton_11.setBounds(346, 391, 250, 74);
		btnNewButton_11.setContentAreaFilled(false);
		btnNewButton_11.setOpaque(false);
		btnNewButton_11.setBorderPainted(false);
		btnNewButton_11.setFocusPainted(false);
		btnNewButton_11.setBorder(null);
		PanelinicioSesion.add(btnNewButton_11);

		JButton btnNewButton_12 = new JButton("");
		btnNewButton_12.setBounds(58, 47, 178, 60);
		btnNewButton_12.setContentAreaFilled(false);
		btnNewButton_12.setOpaque(false);
		btnNewButton_12.setBorderPainted(false);
		btnNewButton_12.setFocusPainted(false);
		btnNewButton_12.setBorder(null);
		PanelinicioSesion.add(btnNewButton_12);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 920, 769);
		PanelinicioSesion.add(panel);

		JLabel lblNewLabel_12 = new JLabel("New label");
		lblNewLabel_12.setIcon(new ImageIcon(JFrame.class.getResource("/imagenes/InicioSesionFondo.png")));
		panel.add(lblNewLabel_12);

		PanelJugar = new JPanel();
		contentPane.add(PanelJugar, "name_35085604832999");
		PanelJugar.setLayout(null);

		btnNewButton_13 = new JButton("New button");
		btnNewButton_13.setForeground(new Color(255, 102, 255));
		btnNewButton_13.setContentAreaFilled(false);
		btnNewButton_13.setOpaque(false);
		btnNewButton_13.setBorderPainted(false);
		btnNewButton_13.setFocusPainted(false);
		btnNewButton_13.setBorder(null);
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_13.setBounds(90, 568, 330, 99);
		PanelJugar.add(btnNewButton_13);

		btnNewButton_13_1 = new JButton("New button");
		btnNewButton_13_1.setForeground(new Color(255, 102, 255));
		btnNewButton_13_1.setContentAreaFilled(false);
		btnNewButton_13_1.setOpaque(false);
		btnNewButton_13_1.setBorderPainted(false);
		btnNewButton_13_1.setFocusPainted(false);
		btnNewButton_13_1.setBorder(null);
		btnNewButton_13_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_13_1.setBounds(88, 452, 330, 99);
		PanelJugar.add(btnNewButton_13_1);

		btnNewButton_13_2 = new JButton("New button");
		btnNewButton_13_2.setForeground(new Color(255, 102, 255));
		btnNewButton_13_2.setContentAreaFilled(false);
		btnNewButton_13_2.setOpaque(false);
		btnNewButton_13_2.setBorderPainted(false);
		btnNewButton_13_2.setFocusPainted(false);
		btnNewButton_13_2.setBorder(null);
		btnNewButton_13_2.setBounds(453, 568, 350, 99);
		PanelJugar.add(btnNewButton_13_2);

		btnNewButton_13_3 = new JButton("New button");
		btnNewButton_13_3.setForeground(new Color(255, 102, 255));
		btnNewButton_13_3.setContentAreaFilled(false);
		btnNewButton_13_3.setOpaque(false);
		btnNewButton_13_3.setBorderPainted(false);
		btnNewButton_13_3.setFocusPainted(false);
		btnNewButton_13_3.setBorder(null);
		btnNewButton_13_3.setBounds(450, 452, 350, 106);
		PanelJugar.add(btnNewButton_13_3);

		JButton btnNewButton_2_1 = new JButton("");
		btnNewButton_2_1.setOpaque(false);
		btnNewButton_2_1.setForeground(Color.RED);
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2_1.setFocusPainted(false);
		btnNewButton_2_1.setContentAreaFilled(false);
		btnNewButton_2_1.setBorderPainted(false);
		btnNewButton_2_1.setBorder(null);
		btnNewButton_2_1.setBounds(325, 99, 195, 64);
		PanelJugar.add(btnNewButton_2_1);

		JButton btnNewButton_3_1 = new JButton("");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3_1.setOpaque(false);
		btnNewButton_3_1.setForeground(Color.RED);
		btnNewButton_3_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_3_1.setFocusPainted(false);
		btnNewButton_3_1.setContentAreaFilled(false);
		btnNewButton_3_1.setBorderPainted(false);
		btnNewButton_3_1.setBorder(null);
		btnNewButton_3_1.setBounds(579, 99, 195, 64);
		PanelJugar.add(btnNewButton_3_1);

		JButton btnNewButton_4_1 = new JButton("");
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4_1.setOpaque(false);
		btnNewButton_4_1.setForeground(Color.RED);
		btnNewButton_4_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNewButton_4_1.setFocusPainted(false);
		btnNewButton_4_1.setContentAreaFilled(false);
		btnNewButton_4_1.setBorderPainted(false);
		btnNewButton_4_1.setBorder(null);
		btnNewButton_4_1.setBounds(121, 99, 195, 64);
		PanelJugar.add(btnNewButton_4_1);

		lblNewLabel_13 = new JLabel("New label");
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_13.setForeground(new Color(102, 204, 255));
		lblNewLabel_13.setBounds(33, 229, 741, 195);
		PanelJugar.add(lblNewLabel_13);

		lblNewLabel_14 = new JLabel("New label");
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_14.setForeground(new Color(0, 204, 255));
		lblNewLabel_14.setBackground(new Color(255, 255, 0));
		lblNewLabel_14.setBounds(784, 206, 96, 59);
		PanelJugar.add(lblNewLabel_14);
		
		lblNewLabel_20 = new JLabel("New label");
		lblNewLabel_20.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_20.setForeground(new Color(255, 0, 51));
		lblNewLabel_20.setBounds(784, 275, 96, 41);
		PanelJugar.add(lblNewLabel_20);
		
		panel_5 = new JPanel();
		panel_5.setOpaque(false);
		panel_5.setBorder(null);
		panel_5.setBounds(43, 661, 181, 99);
		PanelJugar.add(panel_5);
		
		JLabel lblNewLabel_26 = new JLabel("");
		lblNewLabel_26.setIcon(new ImageIcon(JFrame.class.getResource("/imagenes/chat good.png")));
		panel_5.add(lblNewLabel_26);
		
		panel_2 = new JPanel();
		panel_2.setBounds(289, 661, 169, 99);
		panel_2.setOpaque(false);
		panel_2.setBorder(null);
		PanelJugar.add(panel_2);
		
		JLabel lblNewLabel_27 = new JLabel("");
		lblNewLabel_27.setIcon(new ImageIcon(JFrame.class.getResource("/imagenes/saltar.png")));
		panel_2.add(lblNewLabel_27);
		
		panel_2_1 = new JPanel();
		panel_2_1.setOpaque(false);
		panel_2_1.setBorder(null);
		panel_2_1.setBounds(500, 662, 168, 98);
		
		PanelJugar.add(panel_2_1);
		
		JLabel lblNewLabel_28 = new JLabel("");
		lblNewLabel_28.setIcon(new ImageIcon(JFrame.class.getResource("/imagenes/proteccion.png")));
		panel_2_1.add(lblNewLabel_28);
		
		panel_2_2 = new JPanel();
		panel_2_2.setOpaque(false);
		panel_2_2.setBorder(null);
		panel_2_2.setBounds(712, 662, 168, 98);
		PanelJugar.add(panel_2_2);
		
		JLabel lblNewLabel_29 = new JLabel("");
		lblNewLabel_29.setIcon(new ImageIcon(JFrame.class.getResource("/imagenes/5050.png")));
		panel_2_2.add(lblNewLabel_29);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(0, 0, 920, 770);
		PanelJugar.add(panel_8);
		
		JLabel lblNewLabel_30 = new JLabel("");
		lblNewLabel_30.setIcon(new ImageIcon(JFrame.class.getResource("/imagenes/JugarFondo (1).png")));
		panel_8.add(lblNewLabel_30);
		
		btnNewButton_13_5 = new JButton("New button");
		btnNewButton_13_5.setOpaque(false);
		btnNewButton_13_5.setForeground(new Color(255, 102, 255));
		btnNewButton_13_5.setFocusPainted(false);
		btnNewButton_13_5.setContentAreaFilled(false);
		btnNewButton_13_5.setBorderPainted(false);
		btnNewButton_13_5.setBorder(null);
		btnNewButton_13_5.setBounds(43, 661, 181, 99);
		PanelJugar.add(btnNewButton_13_5);
		
		btnNewButton_13_5_1 = new JButton("New button");
		btnNewButton_13_5_1.setOpaque(false);
		btnNewButton_13_5_1.setForeground(new Color(255, 102, 255));
		btnNewButton_13_5_1.setFocusPainted(false);
		btnNewButton_13_5_1.setContentAreaFilled(false);
		btnNewButton_13_5_1.setBorderPainted(false);
		btnNewButton_13_5_1.setBorder(null);
		btnNewButton_13_5_1.setBounds(289, 661, 169, 99);
		PanelJugar.add(btnNewButton_13_5_1);
		
		btnNewButton_13_5_1_1 = new JButton("New button");
		btnNewButton_13_5_1_1.setOpaque(false);
		btnNewButton_13_5_1_1.setForeground(new Color(255, 102, 255));
		btnNewButton_13_5_1_1.setFocusPainted(false);
		btnNewButton_13_5_1_1.setContentAreaFilled(false);
		btnNewButton_13_5_1_1.setBorderPainted(false);
		btnNewButton_13_5_1_1.setBorder(null);
		btnNewButton_13_5_1_1.setBounds(500, 662, 168, 98);
		PanelJugar.add(btnNewButton_13_5_1_1);
		
		btnNewButton_13_5_1_1_1 = new JButton("New button");
		btnNewButton_13_5_1_1_1.setOpaque(false);
		btnNewButton_13_5_1_1_1.setForeground(new Color(255, 102, 255));
		btnNewButton_13_5_1_1_1.setFocusPainted(false);
		btnNewButton_13_5_1_1_1.setContentAreaFilled(false);
		btnNewButton_13_5_1_1_1.setBorderPainted(false);
		btnNewButton_13_5_1_1_1.setBorder(null);
		btnNewButton_13_5_1_1_1.setBounds(712, 661, 168, 96);
		PanelJugar.add(btnNewButton_13_5_1_1_1);

		JPanel PanelCuenta = new JPanel();
		contentPane.add(PanelCuenta, "name_41410621485400");
		PanelCuenta.setLayout(null);

		JButton btnNewButton_4_1_1 = new JButton("");
		btnNewButton_4_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4_1_1.setOpaque(false);
		btnNewButton_4_1_1.setForeground(Color.RED);
		btnNewButton_4_1_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNewButton_4_1_1.setFocusPainted(false);
		btnNewButton_4_1_1.setContentAreaFilled(false);
		btnNewButton_4_1_1.setBorderPainted(false);
		btnNewButton_4_1_1.setBorder(null);
		btnNewButton_4_1_1.setBounds(357, 54, 206, 60);
		PanelCuenta.add(btnNewButton_4_1_1);

		textField_8 = new JTextField();
		textField_8.setForeground(new Color(51, 204, 255));
		textField_8.setBounds(347, 204, 443, 28);
		PanelCuenta.add(textField_8);
		textField_8.setOpaque(false);
		textField_8.setBorder(null);
		textField_8.setColumns(10);

		textField_10 = new JTextField();
		textField_10.setForeground(new Color(0, 204, 255));
		textField_10.setText("");
		textField_10.setBounds(347, 273, 443, 28);
		PanelCuenta.add(textField_10);
		textField_10.setOpaque(false);
		textField_10.setBorder(null);
		textField_10.setColumns(10);

		textField_9 = new JTextField();
		textField_9.setForeground(new Color(0, 204, 255));
		textField_9.setBounds(347, 343, 443, 28);
		PanelCuenta.add(textField_9);
		textField_9.setOpaque(false);
		textField_9.setBorder(null);
		textField_9.setColumns(10);

		textField_11 = new JTextField();
		textField_11.setForeground(new Color(0, 204, 255));
		textField_11.setBounds(347, 411, 443, 28);
		PanelCuenta.add(textField_11);
		textField_11.setOpaque(false);
		textField_11.setBorder(null);
		textField_11.setColumns(10);

		textField_12 = new JTextField();
		textField_12.setForeground(new Color(0, 204, 255));
		textField_12.setBounds(347, 482, 443, 28);
		PanelCuenta.add(textField_12);
		textField_12.setOpaque(false);
		textField_12.setBorder(null);
		textField_12.setColumns(10);

		JButton btnNewButton_13_4 = new JButton("");
		btnNewButton_13_4.setOpaque(false);
		btnNewButton_13_4.setForeground(new Color(255, 102, 255));
		btnNewButton_13_4.setFocusPainted(false);
		btnNewButton_13_4.setContentAreaFilled(false);
		btnNewButton_13_4.setBorderPainted(false);
		btnNewButton_13_4.setBorder(null);
		btnNewButton_13_4.setBounds(372, 520, 179, 60);
		PanelCuenta.add(btnNewButton_13_4);

		JLabel lblNewLabel_15 = new JLabel("New label");
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_15.setForeground(new Color(255, 102, 255));
		lblNewLabel_15.setBounds(489, 642, 138, 63);
		PanelCuenta.add(lblNewLabel_15);

		JLabel lblNewLabel_15_1 = new JLabel("New label");
		lblNewLabel_15_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_15_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_15_1.setForeground(new Color(255, 102, 255));
		lblNewLabel_15_1.setBounds(290, 642, 132, 63);
		PanelCuenta.add(lblNewLabel_15_1);

		JLabel lblNewLabel_15_2 = new JLabel("New label");
		lblNewLabel_15_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_15_2.setForeground(new Color(255, 102, 204));
		lblNewLabel_15_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_15_2.setBounds(105, 653, 112, 41);
		PanelCuenta.add(lblNewLabel_15_2);

		JLabel lblNewLabel_15_3 = new JLabel("New label");
		lblNewLabel_15_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_15_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_15_3.setForeground(new Color(255, 102, 255));
		lblNewLabel_15_3.setBounds(688, 642, 146, 60);
		PanelCuenta.add(lblNewLabel_15_3);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 920, 760);
		PanelCuenta.add(panel_1);

		JLabel lblNewLabel_19 = new JLabel("New label");
		lblNewLabel_19.setIcon(new ImageIcon(JFrame.class.getResource("/imagenes/CuentaFondo (3).png")));
		panel_1.add(lblNewLabel_19);

		JPanel PanelRanking = new JPanel();
		contentPane.add(PanelRanking, "name_47057366368100");
		PanelRanking.setLayout(null);

		JButton btnNewButton_4_1_1_1 = new JButton("");
		btnNewButton_4_1_1_1.setOpaque(false);
		btnNewButton_4_1_1_1.setForeground(Color.RED);
		btnNewButton_4_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNewButton_4_1_1_1.setFocusPainted(false);
		btnNewButton_4_1_1_1.setContentAreaFilled(false);
		btnNewButton_4_1_1_1.setBorderPainted(false);
		btnNewButton_4_1_1_1.setBorder(null);
		btnNewButton_4_1_1_1.setBounds(326, 63, 228, 63);
		PanelRanking.add(btnNewButton_4_1_1_1);

		JLabel lblNewLabel_17 = new JLabel("New label");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_17.setForeground(new Color(255, 255, 0));
		lblNewLabel_17.setBounds(265, 318, 471, 44);
		PanelRanking.add(lblNewLabel_17);

		JLabel lblNewLabel_17_1 = new JLabel("New label");
		lblNewLabel_17_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_17_1.setForeground(new Color(153, 153, 153));
		lblNewLabel_17_1.setBounds(264, 411, 471, 38);
		PanelRanking.add(lblNewLabel_17_1);

		JLabel lblNewLabel_17_2 = new JLabel("New label");
		lblNewLabel_17_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_17_2.setForeground(new Color(0, 102, 255));
		lblNewLabel_17_2.setBounds(264, 684, 471, 38);
		PanelRanking.add(lblNewLabel_17_2);

		JLabel lblNewLabel_17_3 = new JLabel("New label");
		lblNewLabel_17_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_17_3.setForeground(new Color(204, 153, 0));
		lblNewLabel_17_3.setBounds(264, 504, 471, 38);
		PanelRanking.add(lblNewLabel_17_3);

		JLabel lblNewLabel_17_4 = new JLabel("New label");
		lblNewLabel_17_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_17_4.setForeground(new Color(0, 204, 255));
		lblNewLabel_17_4.setBounds(264, 595, 471, 38);
		PanelRanking.add(lblNewLabel_17_4);

		JPanel panel_4 = new JPanel();
		panel_4.setBounds(0, 0, 920, 770);
		PanelRanking.add(panel_4);

		JLabel lblNewLabel_16 = new JLabel("New label");
		lblNewLabel_16.setIcon(new ImageIcon(JFrame.class.getResource("/imagenes/RankingFondo.png")));
		panel_4.add(lblNewLabel_16);

		JPanel PanelComoJugar = new JPanel();
		contentPane.add(PanelComoJugar, "name_49153342610900");
		PanelComoJugar.setLayout(null);

		JPanel panel_6 = new JPanel();
		panel_6.setBounds(0, 0, 920, 770);
		PanelComoJugar.add(panel_6);

		JLabel lblNewLabel_18 = new JLabel("New label");
		lblNewLabel_18.setIcon(new ImageIcon(JFrame.class.getResource("/imagenes/JugarFondo.png")));
		panel_6.add(lblNewLabel_18);

		JButton btnNewButton_4_1_1_2 = new JButton("");
		btnNewButton_4_1_1_2.setOpaque(false);
		btnNewButton_4_1_1_2.setForeground(Color.RED);
		btnNewButton_4_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNewButton_4_1_1_2.setFocusPainted(false);
		btnNewButton_4_1_1_2.setContentAreaFilled(false);
		btnNewButton_4_1_1_2.setBorderPainted(false);
		btnNewButton_4_1_1_2.setBorder(null);
		btnNewButton_4_1_1_2.setBounds(27, 63, 206, 63);
		PanelComoJugar.add(btnNewButton_4_1_1_2);

		JButton btnNewButton_4_1_1_1_1 = new JButton("");
		btnNewButton_4_1_1_1_1.setOpaque(false);
		btnNewButton_4_1_1_1_1.setForeground(Color.RED);
		btnNewButton_4_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNewButton_4_1_1_1_1.setFocusPainted(false);
		btnNewButton_4_1_1_1_1.setContentAreaFilled(false);
		btnNewButton_4_1_1_1_1.setBorderPainted(false);
		btnNewButton_4_1_1_1_1.setBorder(null);
		btnNewButton_4_1_1_1_1.setBounds(657, 63, 253, 63);
		PanelComoJugar.add(btnNewButton_4_1_1_1_1);
		
		PanelFinal = new JPanel();
		contentPane.add(PanelFinal, "name_10405878642900");
		PanelFinal.setLayout(null);
		
		JButton btnNewButton_4_1_1_1_2 = new JButton("");
		btnNewButton_4_1_1_1_2.setOpaque(false);
		btnNewButton_4_1_1_1_2.setForeground(Color.RED);
		btnNewButton_4_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNewButton_4_1_1_1_2.setFocusPainted(false);
		btnNewButton_4_1_1_1_2.setContentAreaFilled(false);
		btnNewButton_4_1_1_1_2.setBorderPainted(false);
		btnNewButton_4_1_1_1_2.setBorder(null);
		btnNewButton_4_1_1_1_2.setBounds(582, 152, 174, 57);
		PanelFinal.add(btnNewButton_4_1_1_1_2);
		
		JButton btnNewButton_4_1_1_1_3 = new JButton("");
		btnNewButton_4_1_1_1_3.setOpaque(false);
		btnNewButton_4_1_1_1_3.setForeground(Color.RED);
		btnNewButton_4_1_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNewButton_4_1_1_1_3.setFocusPainted(false);
		btnNewButton_4_1_1_1_3.setContentAreaFilled(false);
		btnNewButton_4_1_1_1_3.setBorderPainted(false);
		btnNewButton_4_1_1_1_3.setBorder(null);
		btnNewButton_4_1_1_1_3.setBounds(310, 153, 240, 53);
		PanelFinal.add(btnNewButton_4_1_1_1_3);
		
		JButton btnNewButton_4_1_1_1_4 = new JButton("");
		btnNewButton_4_1_1_1_4.setOpaque(false);
		btnNewButton_4_1_1_1_4.setForeground(Color.RED);
		btnNewButton_4_1_1_1_4.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNewButton_4_1_1_1_4.setFocusPainted(false);
		btnNewButton_4_1_1_1_4.setContentAreaFilled(false);
		btnNewButton_4_1_1_1_4.setBorderPainted(false);
		btnNewButton_4_1_1_1_4.setBorder(null);
		btnNewButton_4_1_1_1_4.setBounds(111, 157, 170, 51);
		PanelFinal.add(btnNewButton_4_1_1_1_4);
		
		lblNewLabel_21 = new JLabel("New label");
		lblNewLabel_21.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_21.setFont(new Font("Calibri Light", Font.BOLD, 13));
		lblNewLabel_21.setForeground(new Color(255, 0, 255));
		lblNewLabel_21.setBounds(131, 480, 127, 42);
		PanelFinal.add(lblNewLabel_21);
		
		lblNewLabel_22 = new JLabel("New label");
		lblNewLabel_22.setFont(new Font("Calibri Light", Font.BOLD, 13));
		lblNewLabel_22.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_22.setForeground(new Color(255, 0, 255));
		lblNewLabel_22.setBounds(448, 480, 127, 42);
		PanelFinal.add(lblNewLabel_22);
		
		lblNewLabel_23 = new JLabel("New label");
		lblNewLabel_23.setFont(new Font("Calibri Light", Font.BOLD, 13));
		lblNewLabel_23.setForeground(new Color(255, 0, 255));
		lblNewLabel_23.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_23.setBounds(369, 553, 206, 53);
		PanelFinal.add(lblNewLabel_23);
		
		lblNewLabel_24 = new JLabel("New label");
		lblNewLabel_24.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_24.setFont(new Font("Calibri Light", Font.BOLD, 13));
		lblNewLabel_24.setForeground(new Color(255, 0, 255));
		lblNewLabel_24.setBounds(611, 480, 127, 38);
		PanelFinal.add(lblNewLabel_24);
		
		lblNewLabel_25 = new JLabel("New label");
		lblNewLabel_25.setForeground(new Color(255, 0, 255));
		lblNewLabel_25.setFont(new Font("Calibri Light", Font.BOLD, 13));
		lblNewLabel_25.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_25.setBounds(293, 480, 127, 42);
		PanelFinal.add(lblNewLabel_25);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(0, 0, 920, 769);
		PanelFinal.add(panel_7);
		
		JLabel lblNewLabel_21_1 = new JLabel("New label");
		lblNewLabel_21_1.setIcon(new ImageIcon(JFrame.class.getResource("/imagenes/FinalFondo.png")));
		panel_7.add(lblNewLabel_21_1);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelPrincipal.setVisible(false);
				PanelinicioSesion.setVisible(true);
			}
		});

		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelPrincipal.setVisible(true);
				PanelRegistrarse.setVisible(false);
			}
		});

		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelPrincipal.setVisible(false);
				PanelRegistrarse.setVisible(true);
			}
		});

		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelRegistrarse.setVisible(true);
				PanelinicioSesion.setVisible(false);
			}
		});

		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelPrincipal.setVisible(true);
				PanelinicioSesion.setVisible(false);
			}
		});

		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelinicioSesion.setVisible(true);
				PanelRegistrarse.setVisible(false);
			}
		});

		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelPrincipal.setVisible(true);
				PanelJugar.setVisible(false);
			}
		});

		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelJugar.setVisible(true);
				PanelPrincipal.setVisible(false);
			}
		});

		btnNewButton_4_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelPrincipal.setVisible(true);
				PanelCuenta.setVisible(false);
			}
		});

		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelCuenta.setVisible(true);
				PanelPrincipal.setVisible(false);
			}
		});

		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelCuenta.setVisible(true);
				PanelJugar.setVisible(false);
			}
		});

		btnNewButton_4_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelPrincipal.setVisible(true);
				PanelRanking.setVisible(false);
			}
		});

		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelRanking.setVisible(true);
				PanelPrincipal.setVisible(false);
			}
		});

		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelComoJugar.setVisible(true);
				PanelPrincipal.setVisible(false);
			}
		});

		btnNewButton_4_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelPrincipal.setVisible(true);
				PanelComoJugar.setVisible(false);
			}
		});

		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelComoJugar.setVisible(true);
				PanelJugar.setVisible(false);
			}
		});

		btnNewButton_4_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelJugar.setVisible(true);
				PanelComoJugar.setVisible(false);
			}
		});
		
		btnNewButton_4_1_1_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelPrincipal.setVisible(true);
				PanelFinal.setVisible(false);
			}
		});
		
		btnNewButton_4_1_1_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelJugar.setVisible(true);
				PanelFinal.setVisible(false);
			}
		});
		
		btnNewButton_4_1_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelCuenta.setVisible(true);
				PanelFinal.setVisible(false);
			}
		});

		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String uri = "mongodb+srv://hectorgd711_db_user:ReFcQMhbNqdAvOGJ"
						+ "@proyectostreamersg6.5osvic5.mongodb.net/?appName=ProyectoStreamersG6";

				try (MongoClient mongoClient = MongoClients.create(uri)) {
					MongoDatabase mongoDatabase = mongoClient.getDatabase("ProyectoStreamersG6");
					MongoCollection<Document> coleccion = mongoDatabase.getCollection("preguntas");
					MongoCollection<Document> usuarios = mongoDatabase.getCollection("usuarios");

					DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/uuuu")
							.withResolverStyle(ResolverStyle.STRICT);

					String nombre = textField.getText().trim();
					String apellidos = textField_1.getText().trim();
					String correo = textField_2.getText().trim().toLowerCase();
					String fechaTexto = textField_3.getText().trim();
					String telefono = textField_4.getText().trim();
					String contrasena = textField_7.getText().trim();

					String genero = "";
					if (Hombre.isSelected()) {
						genero = "Hombre";
					} else if (rdbtnNewRadioButton_2.isSelected()) {
						genero = "Mujer";
					} else if (rdbtnNewRadioButton.isSelected()) {
						genero = "Otro";
					}

					boolean hayError = false;

					textField.setForeground(Color.BLACK);
					textField_1.setForeground(Color.BLACK);
					textField_2.setForeground(Color.BLACK);
					textField_3.setForeground(Color.BLACK);
					textField_4.setForeground(Color.BLACK);
					textField_7.setForeground(Color.BLACK);

					if (nombre.isEmpty()) {
						textField.setForeground(Color.RED);
						textField.setText("Rellena el nombre");
						hayError = true;
					} else if (nombre.length() < 5) {
						textField.setForeground(Color.RED);
						textField.setText("Minimo 5 caracteres");
						hayError = true;
					}

					if (apellidos.isEmpty()) {
						textField_1.setForeground(Color.RED);
						textField_1.setText("Rellena los apellidos");
						hayError = true;
					} else if (apellidos.length() < 5) {
						textField_1.setForeground(Color.RED);
						textField_1.setText("Minimo 5 caracteres");
						hayError = true;
					}

					if (correo.isEmpty()) {
						textField_2.setForeground(Color.RED);
						textField_2.setText("Rellena el correo");
						hayError = true;
					} else if (!correo.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {
						textField_2.setForeground(Color.RED);
						textField_2.setText("Correo no valido");
						hayError = true;
					} else {
						Document usuarioExistente = usuarios.find(new Document("CorreoElectronico", correo)).first();
						if (usuarioExistente != null) {
							textField_2.setForeground(Color.RED);
							textField_2.setText("Correo ya en uso");
							hayError = true;
						}
					}

					LocalDate fechaNacimiento = null;
					if (fechaTexto.isEmpty()) {
						textField_3.setForeground(Color.RED);
						textField_3.setText("Rellena la fecha");
						hayError = true;
					} else {
						try {
							fechaNacimiento = LocalDate.parse(fechaTexto, formatter);
						} catch (DateTimeParseException ex) {
							textField_3.setForeground(Color.RED);
							textField_3.setText("Ejemplo: 25/1/2015");
							hayError = true;
						}
					}

					if (telefono.isEmpty()) {
						textField_4.setForeground(Color.RED);
						textField_4.setText("Rellena el telefono");
						hayError = true;
					} else if (!telefono.matches("\\d{9}")) {
						textField_4.setForeground(Color.RED);
						textField_4.setText("No es un numero valido");
						hayError = true;
					}

					if (contrasena.isEmpty()) {
						textField_7.setForeground(Color.RED);
						textField_7.setText("Rellena la contraseña");
						hayError = true;
					} else if (contrasena.length() < 5) {
						textField_7.setForeground(Color.RED);
						textField_7.setText("Minimo 5 caracteres");
						hayError = true;
					}

					if (genero.isEmpty()) {
						JOptionPane.showMessageDialog(null, "Selecciona un genero");
						hayError = true;
					}

					if (hayError) {
						return;
					}

					Document ultimoUsuario = usuarios.find().sort(new Document("ID_Usuario", -1)).first();

					int siguienteId = 1;
					if (ultimoUsuario != null && ultimoUsuario.getInteger("ID_Usuario") != null) {
						siguienteId = ultimoUsuario.getInteger("ID_Usuario") + 1;
					}

					Document nuevoUsuario = new Document("ID_Usuario", siguienteId).append("Nombre", nombre)
							.append("Apellidos", apellidos).append("FechaNacimiento", fechaNacimiento.toString())
							.append("NumeroTelefono", telefono).append("CorreoElectronico", correo)
							.append("Contraseña", contrasena).append("Genero", genero).append("PuntosTotales", 0)
							.append("MejorPuntuacion", 0).append("PartidasJugadas", 0).append("Victorias", 0)
							.append("Derrotas", 0);

					usuarios.insertOne(nuevoUsuario);
					id_usuario = siguienteId;
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");
					textField_7.setText("");

					Hombre.setSelected(false);
					rdbtnNewRadioButton_2.setSelected(false);
					rdbtnNewRadioButton.setSelected(false);

					JOptionPane.showMessageDialog(null, "Usuario creado correctamente");
				}
			}
		});

		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String uri = "mongodb+srv://hectorgd711_db_user:ReFcQMhbNqdAvOGJ"
						+ "@proyectostreamersg6.5osvic5.mongodb.net/?appName=ProyectoStreamersG6";

				try (MongoClient mongoClient = MongoClients.create(uri)) {
					MongoDatabase mongoDatabase = mongoClient.getDatabase("ProyectoStreamersG6");
					MongoCollection<Document> usuarios = mongoDatabase.getCollection("usuarios");

					String correo = textField_5.getText().trim().toLowerCase();
					String contrasena = textField_6.getText().trim();

					// Si no está marcada la casilla, no hace nada
					if (!chckbxNewCheckBox_3.isSelected()) {
						return;
					}

					boolean loginCorrecto = false;

					// CORREO VACIO
					if (correo.isEmpty()) {
						textField_5.setText("Rellena esto");
					} else {
						Document usuario = usuarios.find(new Document("CorreoElectronico", correo)).first();

						if (usuario == null) {
							textField_5.setText("No se ha encontrado ningun usuario con este correo");
						} else {
							// CONTRASEÑA VACIA
							if (contrasena.isEmpty()) {
								textField_6.setText("Rellena esto");
							} else {
								String contrasenaBD = usuario.getString("Contraseña");

								if (!contrasena.equals(contrasenaBD)) {
									textField_6.setText("Contraseña incorrecta");
								} else {
									Integer idBD = usuario.getInteger("ID_Usuario");
									if (idBD != null) {
										id_usuario = idBD;
									}

									loginCorrecto = true;

									textField_5.setText("");
									textField_6.setText("");

									PanelinicioSesion.setVisible(false);
									PanelPrincipal.setVisible(true);
								}
							}
						}
					}

					// Siempre se desmarca al pulsar el botón
					chckbxNewCheckBox_3.setSelected(false);
				}
			}
		});
		
		btnNewButton_9.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {

		    	String uri = "mongodb+srv://hectorgd711_db_user:ReFcQMhbNqdAvOGJ"
						+ "@proyectostreamersg6.5osvic5.mongodb.net/?appName=ProyectoStreamersG6";

				try (MongoClient mongoClient = MongoClients.create(uri)) {
					MongoDatabase mongoDatabase = mongoClient.getDatabase("ProyectoStreamersG6");
		        MongoCollection<Document> usuarios = mongoDatabase.getCollection("usuarios");

		        // Limpiar labels antes de rellenarlos
		        lblNewLabel_17.setText("");
		        lblNewLabel_17_1.setText("");
		        lblNewLabel_17_3.setText("");
		        lblNewLabel_17_4.setText("");
		        lblNewLabel_17_2.setText("");

		        List<JLabel> labelsRanking = Arrays.asList(
		            lblNewLabel_17,    // Top 1
		            lblNewLabel_17_1,  // Top 2
		            lblNewLabel_17_3,  // Top 3
		            lblNewLabel_17_4,  // Top 4
		            lblNewLabel_17_2   // Top 5
		        );

		        int i = 0;

		        for (Document usuario : usuarios.find()
		                .sort(new Document("MejorPuntuacion", -1))
		                .limit(5)) {

		            String nombre = usuario.getString("Nombre");
		            String apellidos = usuario.getString("Apellidos");
		            Integer mejorPuntuacion = usuario.getInteger("MejorPuntuacion");

		            if (nombre == null) nombre = "";
		            if (apellidos == null) apellidos = "";
		            if (mejorPuntuacion == null) mejorPuntuacion = 0;

		            labelsRanking.get(i).setText((nombre + " " + apellidos).trim() + " - " + mejorPuntuacion);
		            i++;
		        }
		    }
		}});
		
		btnNewButton_3.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {

		    	String uri = "mongodb+srv://hectorgd711_db_user:ReFcQMhbNqdAvOGJ"
						+ "@proyectostreamersg6.5osvic5.mongodb.net/?appName=ProyectoStreamersG6";

				try (MongoClient mongoClient = MongoClients.create(uri)) {
					MongoDatabase mongoDatabase = mongoClient.getDatabase("ProyectoStreamersG6");
		        MongoCollection<Document> usuarios = mongoDatabase.getCollection("usuarios");

		        Document usuario = usuarios.find(new Document("ID_Usuario", id_usuario)).first();
		        
		        final Color COLOR_OK = new Color(51, 204, 255);
		        final Color COLOR_ERROR = Color.RED;

		        if (usuario != null) {
		            String nombre = usuario.getString("Nombre");
		            String apellidos = usuario.getString("Apellidos");
		            String fechaNacimiento = usuario.getString("FechaNacimiento");
		            String telefono = usuario.getString("NumeroTelefono");
		            String correo = usuario.getString("CorreoElectronico");

		            Integer mejorPuntuacion = usuario.getInteger("MejorPuntuacion");
		            Integer partidasJugadas = usuario.getInteger("PartidasJugadas");
		            Integer victorias = usuario.getInteger("Victorias");
		            Integer derrotas = usuario.getInteger("Derrotas");

		            if (nombre == null) nombre = "";
		            if (apellidos == null) apellidos = "";
		            if (telefono == null) telefono = "";
		            if (correo == null) correo = "";

		            if (mejorPuntuacion == null) mejorPuntuacion = 0;
		            if (partidasJugadas == null) partidasJugadas = 0;
		            if (victorias == null) victorias = 0;
		            if (derrotas == null) derrotas = 0;

		            String fechaMostrada = "";
		            if (fechaNacimiento != null && !fechaNacimiento.isEmpty()) {
		                try {
		                    LocalDate fecha = LocalDate.parse(fechaNacimiento); // lee 2022-02-02
		                    DateTimeFormatter formatterSalida = DateTimeFormatter.ofPattern("d/M/uuuu");
		                    fechaMostrada = fecha.format(formatterSalida); // muestra 2/2/2022
		                } catch (Exception ex) {
		                    fechaMostrada = fechaNacimiento;
		                }
		            }

		            textField_8.setText(nombre);
		            textField_10.setText(apellidos);
		            textField_9.setText(fechaMostrada);
		            textField_11.setText(telefono);
		            textField_12.setText(correo);

		            textField_8.setForeground(COLOR_OK);
		            textField_10.setForeground(COLOR_OK);
		            textField_9.setForeground(COLOR_OK);
		            textField_11.setForeground(COLOR_OK);
		            textField_12.setForeground(COLOR_OK);

		            lblNewLabel_15_2.setText(String.valueOf(mejorPuntuacion));
		            lblNewLabel_15_1.setText(String.valueOf(partidasJugadas));
		            lblNewLabel_15.setText(String.valueOf(victorias));
		            lblNewLabel_15_3.setText(String.valueOf(derrotas));
		        }
		    }
		}});
		
		btnNewButton_3_1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {

		    	String uri = "mongodb+srv://hectorgd711_db_user:ReFcQMhbNqdAvOGJ"
						+ "@proyectostreamersg6.5osvic5.mongodb.net/?appName=ProyectoStreamersG6";

				try (MongoClient mongoClient = MongoClients.create(uri)) {
					MongoDatabase mongoDatabase = mongoClient.getDatabase("ProyectoStreamersG6");
		        MongoCollection<Document> usuarios = mongoDatabase.getCollection("usuarios");

		        Document usuario = usuarios.find(new Document("ID_Usuario", id_usuario)).first();
		        
		        final Color COLOR_OK = new Color(51, 204, 255);
		        final Color COLOR_ERROR = Color.RED;

		        if (usuario != null) {
		            String nombre = usuario.getString("Nombre");
		            String apellidos = usuario.getString("Apellidos");
		            String fechaNacimiento = usuario.getString("FechaNacimiento");
		            String telefono = usuario.getString("NumeroTelefono");
		            String correo = usuario.getString("CorreoElectronico");

		            Integer mejorPuntuacion = usuario.getInteger("MejorPuntuacion");
		            Integer partidasJugadas = usuario.getInteger("PartidasJugadas");
		            Integer victorias = usuario.getInteger("Victorias");
		            Integer derrotas = usuario.getInteger("Derrotas");

		            if (nombre == null) nombre = "";
		            if (apellidos == null) apellidos = "";
		            if (telefono == null) telefono = "";
		            if (correo == null) correo = "";

		            if (mejorPuntuacion == null) mejorPuntuacion = 0;
		            if (partidasJugadas == null) partidasJugadas = 0;
		            if (victorias == null) victorias = 0;
		            if (derrotas == null) derrotas = 0;

		            String fechaMostrada = "";
		            if (fechaNacimiento != null && !fechaNacimiento.isEmpty()) {
		                try {
		                    LocalDate fecha = LocalDate.parse(fechaNacimiento); // lee 2022-02-02
		                    DateTimeFormatter formatterSalida = DateTimeFormatter.ofPattern("d/M/uuuu");
		                    fechaMostrada = fecha.format(formatterSalida); // muestra 2/2/2022
		                } catch (Exception ex) {
		                    fechaMostrada = fechaNacimiento;
		                }
		            }

		            textField_8.setText(nombre);
		            textField_10.setText(apellidos);
		            textField_9.setText(fechaMostrada);
		            textField_11.setText(telefono);
		            textField_12.setText(correo);

		            textField_8.setForeground(COLOR_OK);
		            textField_10.setForeground(COLOR_OK);
		            textField_9.setForeground(COLOR_OK);
		            textField_11.setForeground(COLOR_OK);
		            textField_12.setForeground(COLOR_OK);

		            lblNewLabel_15_2.setText(String.valueOf(mejorPuntuacion));
		            lblNewLabel_15_1.setText(String.valueOf(partidasJugadas));
		            lblNewLabel_15.setText(String.valueOf(victorias));
		            lblNewLabel_15_3.setText(String.valueOf(derrotas));
		        }
		    }
		}});
		
		btnNewButton_4_1_1_1_2.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {

		    	String uri = "mongodb+srv://hectorgd711_db_user:ReFcQMhbNqdAvOGJ"
						+ "@proyectostreamersg6.5osvic5.mongodb.net/?appName=ProyectoStreamersG6";

				try (MongoClient mongoClient = MongoClients.create(uri)) {
					MongoDatabase mongoDatabase = mongoClient.getDatabase("ProyectoStreamersG6");
		        MongoCollection<Document> usuarios = mongoDatabase.getCollection("usuarios");

		        Document usuario = usuarios.find(new Document("ID_Usuario", id_usuario)).first();
		        
		        final Color COLOR_OK = new Color(51, 204, 255);
		        final Color COLOR_ERROR = Color.RED;

		        if (usuario != null) {
		            String nombre = usuario.getString("Nombre");
		            String apellidos = usuario.getString("Apellidos");
		            String fechaNacimiento = usuario.getString("FechaNacimiento");
		            String telefono = usuario.getString("NumeroTelefono");
		            String correo = usuario.getString("CorreoElectronico");

		            Integer mejorPuntuacion = usuario.getInteger("MejorPuntuacion");
		            Integer partidasJugadas = usuario.getInteger("PartidasJugadas");
		            Integer victorias = usuario.getInteger("Victorias");
		            Integer derrotas = usuario.getInteger("Derrotas");

		            if (nombre == null) nombre = "";
		            if (apellidos == null) apellidos = "";
		            if (telefono == null) telefono = "";
		            if (correo == null) correo = "";

		            if (mejorPuntuacion == null) mejorPuntuacion = 0;
		            if (partidasJugadas == null) partidasJugadas = 0;
		            if (victorias == null) victorias = 0;
		            if (derrotas == null) derrotas = 0;

		            String fechaMostrada = "";
		            if (fechaNacimiento != null && !fechaNacimiento.isEmpty()) {
		                try {
		                    LocalDate fecha = LocalDate.parse(fechaNacimiento); // lee 2022-02-02
		                    DateTimeFormatter formatterSalida = DateTimeFormatter.ofPattern("d/M/uuuu");
		                    fechaMostrada = fecha.format(formatterSalida); // muestra 2/2/2022
		                } catch (Exception ex) {
		                    fechaMostrada = fechaNacimiento;
		                }
		            }

		            textField_8.setText(nombre);
		            textField_10.setText(apellidos);
		            textField_9.setText(fechaMostrada);
		            textField_11.setText(telefono);
		            textField_12.setText(correo);

		            textField_8.setForeground(COLOR_OK);
		            textField_10.setForeground(COLOR_OK);
		            textField_9.setForeground(COLOR_OK);
		            textField_11.setForeground(COLOR_OK);
		            textField_12.setForeground(COLOR_OK);

		            lblNewLabel_15_2.setText(String.valueOf(mejorPuntuacion));
		            lblNewLabel_15_1.setText(String.valueOf(partidasJugadas));
		            lblNewLabel_15.setText(String.valueOf(victorias));
		            lblNewLabel_15_3.setText(String.valueOf(derrotas));
		        }
		    }
		}});
		
		btnNewButton_13_4.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {

		    	String uri = "mongodb+srv://hectorgd711_db_user:ReFcQMhbNqdAvOGJ"
						+ "@proyectostreamersg6.5osvic5.mongodb.net/?appName=ProyectoStreamersG6";
		    	
		    	final Color COLOR_OK = new Color(51, 204, 255);
		    	final Color COLOR_ERROR = Color.RED;
		    	
				try (MongoClient mongoClient = MongoClients.create(uri)) {
					MongoDatabase mongoDatabase = mongoClient.getDatabase("ProyectoStreamersG6");
		        MongoCollection<Document> usuarios = mongoDatabase.getCollection("usuarios");

		        String nombre = textField_8.getText().trim();
		        String apellidos = textField_10.getText().trim();
		        String fechaTexto = textField_9.getText().trim();
		        String telefono = textField_11.getText().trim();
		        String correo = textField_12.getText().trim().toLowerCase();

		        DateTimeFormatter formatterEntrada = DateTimeFormatter.ofPattern("d/M/uuuu")
		                .withResolverStyle(ResolverStyle.STRICT);

		        LocalDate fechaNacimiento = null;

		        // NOMBRE
		        if (nombre.isEmpty()) {
		            textField_8.setForeground(COLOR_ERROR);
		            textField_8.requestFocus();
		            JOptionPane.showMessageDialog(null, "Debes rellenar el nombre");
		            return;
		        }
		        if (nombre.length() < 5) {
		            textField_8.setForeground(COLOR_ERROR);
		            textField_8.requestFocus();
		            JOptionPane.showMessageDialog(null, "El nombre debe tener mínimo 5 caracteres");
		            return;
		        }

		        // APELLIDOS
		        if (apellidos.isEmpty()) {
		            textField_10.setForeground(COLOR_ERROR);
		            textField_10.requestFocus();
		            JOptionPane.showMessageDialog(null, "Debes rellenar los apellidos");
		            return;
		        }
		        if (apellidos.length() < 5) {
		            textField_10.setForeground(COLOR_ERROR);
		            textField_10.requestFocus();
		            JOptionPane.showMessageDialog(null, "Los apellidos deben tener mínimo 5 caracteres");
		            return;
		        }

		        // FECHA
		        if (fechaTexto.isEmpty()) {
		            textField_9.setForeground(COLOR_ERROR);
		            textField_9.requestFocus();
		            JOptionPane.showMessageDialog(null, "Debes rellenar la fecha de nacimiento");
		            return;
		        }

		        try {
		            fechaNacimiento = LocalDate.parse(fechaTexto, formatterEntrada);
		        } catch (DateTimeParseException ex) {
		            textField_9.setForeground(COLOR_ERROR);
		            textField_9.requestFocus();
		            JOptionPane.showMessageDialog(null, "Rellena la fecha como el ejemplo: 25/1/2015");
		            return;
		        }

		        // TELEFONO
		        if (telefono.isEmpty()) {
		            textField_11.setForeground(COLOR_ERROR);
		            textField_11.requestFocus();
		            JOptionPane.showMessageDialog(null, "Debes rellenar el teléfono");
		            return;
		        }
		        if (!telefono.matches("\\d{9}")) {
		            textField_11.setForeground(COLOR_ERROR);
		            textField_11.requestFocus();
		            JOptionPane.showMessageDialog(null, "El teléfono debe tener 9 números");
		            return;
		        }

		        // CORREO
		        if (correo.isEmpty()) {
		            textField_12.setForeground(COLOR_ERROR);
		            textField_12.requestFocus();
		            JOptionPane.showMessageDialog(null, "Debes rellenar el correo electrónico");
		            return;
		        }
		        if (!correo.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {
		            textField_12.setForeground(COLOR_ERROR);
		            textField_12.requestFocus();
		            JOptionPane.showMessageDialog(null, "El correo electrónico no es válido");
		            return;
		        }

		        Document usuarioConEseCorreo = usuarios.find(
		            new Document("CorreoElectronico", correo)
		                .append("ID_Usuario", new Document("$ne", id_usuario))
		        ).first();

		        if (usuarioConEseCorreo != null) {
		            textField_12.setForeground(COLOR_ERROR);
		            textField_12.requestFocus();
		            JOptionPane.showMessageDialog(null, "Ese correo ya está en uso");
		            return;
		        }

		        UpdateResult resultado = usuarios.updateOne(
		            new Document("ID_Usuario", id_usuario),
		            new Document("$set", new Document("Nombre", nombre)
		                .append("Apellidos", apellidos)
		                .append("FechaNacimiento", fechaNacimiento.toString()) // se guarda tipo 2022-02-02
		                .append("NumeroTelefono", telefono)
		                .append("CorreoElectronico", correo))
		        );

		        if (resultado.getMatchedCount() == 0) {
		            JOptionPane.showMessageDialog(null, "No se encontró el usuario actual");
		            return;
		        }

		        // Si todo sale bien, volver a color original
		        textField_8.setForeground(COLOR_OK);
		        textField_10.setForeground(COLOR_OK);
		        textField_9.setForeground(COLOR_OK);
		        textField_11.setForeground(COLOR_OK);
		        textField_12.setForeground(COLOR_OK);

		        JOptionPane.showMessageDialog(null, "Datos actualizados correctamente");
		    }
		   
		    }});
		
		ActionListener listenerRespuestas = new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        JButton boton = (JButton) e.getSource();
		        String respuestaPulsada = (String) boton.getClientProperty("respuesta");
		        responderPregunta(respuestaPulsada);
		    }
		};

		btnNewButton_13_1.addActionListener(listenerRespuestas);
		btnNewButton_13_3.addActionListener(listenerRespuestas);
		btnNewButton_13.addActionListener(listenerRespuestas);
		btnNewButton_13_2.addActionListener(listenerRespuestas);
		
		
		btnNewButton_13_5_1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        if (comodinSaltarUsado) {
		            return;
		        }

		        comodinSaltarUsado = true;
		        ComodinesUsados++;
		        btnNewButton_13_5_1.setVisible(false);
		        panel_2.setVisible(false);
		        indicePregunta++;
		        cargarPreguntaActual();
		    }
		});
		
		btnNewButton_13_5_1_1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        if (comodinProteccionUsado) {
		            return;
		        }

		        comodinProteccionUsado = true;
		        proteccionActiva = true;
		        btnNewButton_13_5_1_1.setVisible(false);
		        panel_2_1.setVisible(false);
		        ComodinesUsados++;

		    }
		});
		
		btnNewButton_13_5_1_1_1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        if (comodin5050Usado) {
		            return;
		        }

		        comodin5050Usado = true;
		        btnNewButton_13_5_1_1_1.setVisible(false);
		        panel_2_2.setVisible(false);
		        ComodinesUsados++;
		        aplicarComodin5050();
		    }
		});
		
		btnNewButton_13_5.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        if (comodinChatUsado) {
		            return;
		        }

		        comodinChatUsado = true;
		        ComodinesUsados++;
		        aplicarComodinChat();
		        btnNewButton_13_5.setVisible(false);
		        panel_5.setVisible(false);
		    }
		});
		
		
		
	}
	
	
	
	public void iniciarPartida() {
		String uri = "mongodb+srv://hectorgd711_db_user:ReFcQMhbNqdAvOGJ"
				+ "@proyectostreamersg6.5osvic5.mongodb.net/?appName=ProyectoStreamersG6";

		try (MongoClient mongoClient = MongoClients.create(uri)) {
			MongoDatabase mongoDatabase = mongoClient.getDatabase("ProyectoStreamersG6");
	    MongoCollection<Document> preguntas = mongoDatabase.getCollection("preguntas");

	    preguntasPartida.clear();
	    respuestaCorrectaActual = "";
	    indicePregunta = 0;
	    puntos = 0;
	    racha = 0;
	    aciertos = 0;
	    MayorRacha =0;
		ComodinesUsados =0;

	    lblNewLabel_13.setText("");
	    lblNewLabel_14.setText("Puntos: 0");
	    lblNewLabel_20.setText("Racha: 0");

	    btnNewButton_13_1.setText("A");
	    btnNewButton_13_3.setText("B");
	    btnNewButton_13.setText("C");
	    btnNewButton_13_2.setText("D");

	    btnNewButton_13_1.putClientProperty("respuesta", null);
	    btnNewButton_13_3.putClientProperty("respuesta", null);
	    btnNewButton_13.putClientProperty("respuesta", null);
	    btnNewButton_13_2.putClientProperty("respuesta", null);
	    
	    comodinChatUsado = false;
	    comodinSaltarUsado = false;
	    comodinProteccionUsado = false;
	    comodin5050Usado = false;

	    proteccionActiva = false;

	    votosA = 0;
	    votosB = 0;
	    votosC = 0;
	    votosD = 0;
	    
	    btnNewButton_13_5.setVisible(true);
	    panel_5.setVisible(true);

	    btnNewButton_13_5_1.setVisible(true);
	    panel_2.setVisible(true);

	    btnNewButton_13_5_1_1.setVisible(true);
	    panel_2_1.setVisible(true);

	    btnNewButton_13_5_1_1_1.setVisible(true);
	    panel_2_2.setVisible(true);
	    

	    AggregateIterable<Document> resultado = preguntas.aggregate(Arrays.asList(
	        new Document("$sample", new Document("size", 10))
	    ));

	    for (Document doc : resultado) {
	        preguntasPartida.add(doc);
	    }

	    if (preguntasPartida.size() < 10) {
	        JOptionPane.showMessageDialog(null, "Necesitas al menos 10 preguntas en la base de datos.");
	        return;
	    }

	    lblNewLabel_14.setText(String.valueOf(puntos));
	    lblNewLabel_20.setText(String.valueOf(racha));

	    cargarPreguntaActual();
	    
	    
	}
}

	public void cargarPreguntaActual() {
	    if (indicePregunta >= 10) {
	        finalizarPartida();
	        return;
	    }

	    Document pregunta = preguntasPartida.get(indicePregunta);

	    String enunciado = pregunta.getString("Pregunta");
	    String correcta = pregunta.getString("RespuestaCorrecta");

	    List<String> opciones = new ArrayList<>();
	    opciones.add(correcta);
	    opciones.add(pregunta.getString("RespuestaIncorrecta1"));
	    opciones.add(pregunta.getString("RespuestaIncorrecta2"));
	    opciones.add(pregunta.getString("RespuestaIncorrecta3"));

	    Collections.shuffle(opciones);

	    respuestaCorrectaActual = correcta;

	    lblNewLabel_13.setText((indicePregunta + 1) + "/10 - " + enunciado);

	    btnNewButton_13_1.setText("A) " + opciones.get(0));
	    btnNewButton_13_3.setText("B) " + opciones.get(1));
	    btnNewButton_13.setText("C) " + opciones.get(2));
	    btnNewButton_13_2.setText("D) " + opciones.get(3));

	    btnNewButton_13_1.putClientProperty("respuesta", opciones.get(0));
	    btnNewButton_13_3.putClientProperty("respuesta", opciones.get(1));
	    btnNewButton_13.putClientProperty("respuesta", opciones.get(2));
	    btnNewButton_13_2.putClientProperty("respuesta", opciones.get(3));

	    lblNewLabel_14.setText("Puntos: " + puntos);
	    lblNewLabel_20.setText("Racha: " + racha);
	}
	
	public void responderPregunta(String respuestaPulsada) {
	    if (respuestaPulsada == null) {
	        return;
	    }

	    if (respuestaPulsada.equals(respuestaCorrectaActual)) {
	        aciertos++;
	        racha++;
	        puntos += 5 + ((racha - 1) * 2);

	        if (racha > MayorRacha) {
	            MayorRacha = racha;
	        }

	        proteccionActiva = false;

	        lblNewLabel_14.setText("Puntos: " + puntos);
	        lblNewLabel_20.setText("Racha: " + racha);

	        indicePregunta++;
	        cargarPreguntaActual();
	    } else {
	        if (proteccionActiva) {
	            proteccionActiva = false;

	            JButton[] botones = {
	                btnNewButton_13_1,
	                btnNewButton_13_3,
	                btnNewButton_13,
	                btnNewButton_13_2
	            };

	            for (JButton boton : botones) {
	                String respuesta = (String) boton.getClientProperty("respuesta");
	                if (respuesta != null && respuesta.equals(respuestaPulsada)) {
	                    boton.setText("INCORRECTO");
	                    boton.putClientProperty("respuesta", "INCORRECTO");
	                }
	            }

	            return;
	        }

	        racha = 0;
	        lblNewLabel_14.setText("Puntos: " + puntos);
	        lblNewLabel_20.setText("Racha: " + racha);

	        indicePregunta++;
	        cargarPreguntaActual();
	    }
	}
	
	public void finalizarPartida() {
		String uri = "mongodb+srv://hectorgd711_db_user:ReFcQMhbNqdAvOGJ"
				+ "@proyectostreamersg6.5osvic5.mongodb.net/?appName=ProyectoStreamersG6";

		try (MongoClient mongoClient = MongoClients.create(uri)) {
			MongoDatabase mongoDatabase = mongoClient.getDatabase("ProyectoStreamersG6");
	    MongoCollection<Document> usuarios = mongoDatabase.getCollection("usuarios");

	    boolean victoria = aciertos >= 8;

	    if (id_usuario != -1) {
	        Document usuario = usuarios.find(new Document("ID_Usuario", id_usuario)).first();

	        int mejorActual = 0;
	        if (usuario != null && usuario.getInteger("MejorPuntuacion") != null) {
	            mejorActual = usuario.getInteger("MejorPuntuacion");
	        }

	        Document inc = new Document("PartidasJugadas", 1)
	                .append("PuntosTotales", puntos);

	        if (victoria) {
	            inc.append("Victorias", 1);
	        } else {
	            inc.append("Derrotas", 1);
	        }

	        Document update = new Document("$inc", inc);

	        if (puntos > mejorActual) {
	            update.append("$set", new Document("MejorPuntuacion", puntos));
	        }

	        usuarios.updateOne(new Document("ID_Usuario", id_usuario), update);
	    }

	    PanelJugar.setVisible(false);
	    PanelFinal.setVisible(true);
	    actualizarPanelFinal();
	    iniciarPartida();
	    
	}
	}
		
	
	public void actualizarPanelFinal() {
	    int mejorPuntuacionUsuario = 0;

	    String uri = "mongodb+srv://hectorgd711_db_user:ReFcQMhbNqdAvOGJ"
				+ "@proyectostreamersg6.5osvic5.mongodb.net/?appName=ProyectoStreamersG6";

		try (MongoClient mongoClient = MongoClients.create(uri)) {
			MongoDatabase mongoDatabase = mongoClient.getDatabase("ProyectoStreamersG6");
	    MongoCollection<Document> usuarios = mongoDatabase.getCollection("usuarios");

	    Document usuario = usuarios.find(new Document("ID_Usuario", id_usuario)).first();

	    if (usuario != null && usuario.getInteger("MejorPuntuacion") != null) {
	        mejorPuntuacionUsuario = usuario.getInteger("MejorPuntuacion");
	    }

	    lblNewLabel_21.setText(String.valueOf(puntos));
	    lblNewLabel_25.setText(String.valueOf(aciertos));
	    lblNewLabel_22.setText(String.valueOf(ComodinesUsados));
	    lblNewLabel_24.setText(String.valueOf(MayorRacha));
	    lblNewLabel_23.setText(String.valueOf(mejorPuntuacionUsuario));
	}
		
	
}
	
	
	public void aplicarComodin5050() {
	    List<JButton> botonesIncorrectos = new ArrayList<>();

	    JButton[] botones = {
	        btnNewButton_13_1,
	        btnNewButton_13_3,
	        btnNewButton_13,
	        btnNewButton_13_2
	    };

	    for (JButton boton : botones) {
	        String respuesta = (String) boton.getClientProperty("respuesta");
	        if (respuesta != null && !respuesta.equals(respuestaCorrectaActual)) {
	            botonesIncorrectos.add(boton);
	        }
	    }

	    Collections.shuffle(botonesIncorrectos);

	    for (int i = 0; i < 2; i++) {
	        JButton boton = botonesIncorrectos.get(i);
	        boton.setText("INCORRECTO");
	        boton.putClientProperty("respuesta", "INCORRECTO");
	    }
	}
	
	public void aplicarComodinChat() {
	    votosA = 0;
	    votosB = 0;
	    votosC = 0;
	    votosD = 0;

	    Random random = new Random();

	    JButton[] botones = {
	        btnNewButton_13_1,
	        btnNewButton_13_3,
	        btnNewButton_13,
	        btnNewButton_13_2
	    };

	    for (int i = 0; i < 5000; i++) {
	        int numero = random.nextInt(100) + 1;

	        if (numero >= 1 && numero <= 60) {
	            for (int j = 0; j < botones.length; j++) {
	                String respuesta = (String) botones[j].getClientProperty("respuesta");
	                if (respuesta != null && respuesta.equals(respuestaCorrectaActual)) {
	                    if (j == 0) votosA++;
	                    if (j == 1) votosB++;
	                    if (j == 2) votosC++;
	                    if (j == 3) votosD++;
	                }
	            }
	        } else {
	            List<Integer> incorrectas = new ArrayList<>();

	            for (int j = 0; j < botones.length; j++) {
	                String respuesta = (String) botones[j].getClientProperty("respuesta");
	                if (respuesta != null && !respuesta.equals(respuestaCorrectaActual)) {
	                    incorrectas.add(j);
	                }
	            }

	            int elegida = incorrectas.get(random.nextInt(incorrectas.size()));

	            if (elegida == 0) votosA++;
	            if (elegida == 1) votosB++;
	            if (elegida == 2) votosC++;
	            if (elegida == 3) votosD++;
	        }
	    }

	    btnNewButton_13_1.setText(btnNewButton_13_1.getText() + " (" + votosA + ")");
	    btnNewButton_13_3.setText(btnNewButton_13_3.getText() + " (" + votosB + ")");
	    btnNewButton_13.setText(btnNewButton_13.getText() + " (" + votosC + ")");
	    btnNewButton_13_2.setText(btnNewButton_13_2.getText() + " (" + votosD + ")");
	}
	
	

}