import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
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
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
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
		btnNewButton_3.setForeground(new Color(255, 0, 0));
		btnNewButton_3.setBounds(594, 40, 229, 64);
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_3.setContentAreaFilled(false);
		btnNewButton_3.setOpaque(false);
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setFocusPainted(false);
		btnNewButton_3.setBorder(null);
		PanelPrincipal.add(btnNewButton_1);
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
		PanelPrincipal.add(btnNewButton_1);
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
		PanelPrincipal.add(btnNewButton_1);
		btnNewButton_5.setBounds(261, 385, 357, 87);
		PanelPrincipal.add(btnNewButton_5);
		
		JPanel fondoPrincipal = new JPanel();
		fondoPrincipal.setBounds(0, 0, 920, 768);
		PanelPrincipal.add(fondoPrincipal);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\aaron\\Downloads\\ConcursoFondo (1).png"));
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
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Hombre\r\n");
		chckbxNewCheckBox.setForeground(new Color(0, 0, 0));
		chckbxNewCheckBox.setBounds(139, 462, 92, 20);
		PanelRegistrarse.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Mujer");
		chckbxNewCheckBox_1.setBounds(261, 462, 92, 20);
		PanelRegistrarse.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Otro");
		chckbxNewCheckBox_2.setBounds(398, 462, 92, 20);
		PanelRegistrarse.add(chckbxNewCheckBox_2);
		
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
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 0, 920, 768);
		PanelRegistrarse.add(panel_3);
		
		JLabel lblNewLabel_8_1 = new JLabel("New label");
		lblNewLabel_8_1.setIcon(new ImageIcon("C:\\Users\\aaron\\Downloads\\RegistrarseFondo.png"));
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
		lblNewLabel_12.setIcon(new ImageIcon("C:\\Users\\aaron\\Downloads\\InicioSesionFondo.png"));
		panel.add(lblNewLabel_12);
		
		JPanel PanelJugar = new JPanel();
		contentPane.add(PanelJugar, "name_35085604832999");
		PanelJugar.setLayout(null);
		
		JButton btnNewButton_13 = new JButton("New button");
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
		
		JButton btnNewButton_13_1 = new JButton("New button");
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
		
		JButton btnNewButton_13_2 = new JButton("New button");
		btnNewButton_13_2.setForeground(new Color(255, 102, 255));
		btnNewButton_13_2.setContentAreaFilled(false);
		btnNewButton_13_2.setOpaque(false);
		btnNewButton_13_2.setBorderPainted(false);
		btnNewButton_13_2.setFocusPainted(false);
		btnNewButton_13_2.setBorder(null);
		btnNewButton_13_2.setBounds(453, 568, 350, 99);
		PanelJugar.add(btnNewButton_13_2);
		
		JButton btnNewButton_13_3 = new JButton("New button");
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
		
		JLabel lblNewLabel_13 = new JLabel("New label");
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_13.setForeground(new Color(102, 204, 255));
		lblNewLabel_13.setBounds(121, 229, 653, 146);
		PanelJugar.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("New label");
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_14.setForeground(new Color(0, 204, 255));
		lblNewLabel_14.setBackground(new Color(255, 255, 0));
		lblNewLabel_14.setBounds(784, 154, 96, 54);
		PanelJugar.add(lblNewLabel_14);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 920, 769);
		PanelJugar.add(panel_2);
		
		JLabel lblNewLabel_13_1 = new JLabel("New label");
		lblNewLabel_13_1.setIcon(new ImageIcon("C:\\Users\\aaron\\Downloads\\JugarFondo (1).png"));
		panel_2.add(lblNewLabel_13_1);

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
	}
}


