import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Ventana4 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int contador = 0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana4 frame = new Ventana4();
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
	public Ventana4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 884, 507);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Resultado");
		lblNewLabel.setBounds(610, 146, 88, 14);
		contentPane.add(lblNewLabel);
		
		JLabel medio = new JLabel("Parte 2");
		medio.setBounds(326, 146, 46, 14);
		contentPane.add(medio);
		
		JLabel izquierda = new JLabel("Parte 1");
		izquierda .setBounds(230, 146, 46, 14);
		contentPane.add(izquierda );
		
		JLabel derecha = new JLabel("Parte 3");
		derecha.setBounds(420, 146, 46, 14);
		contentPane.add(derecha);
		
		
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (contador==1) {
					
				}
			}
		});
		btnNewButton.setBounds(206, 216, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (contador==1) {
					
				}
			}
		});
		btnNewButton_1.setBounds(305, 216, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (contador==1) {
					
				}
			}
		});
		btnNewButton_2.setBounds(412, 216, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (contador==1) {
					
				}
			}
		});
		btnNewButton_3.setBounds(206, 282, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (contador==1) {
					
				}
			}
		});
		btnNewButton_4.setBounds(309, 282, 89, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (contador==1) {
					
				}
			}
		});
		btnNewButton_5.setBounds(412, 282, 89, 23);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("7");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (contador==1) {
					
				}
			}
		});
		btnNewButton_6.setBounds(206, 345, 89, 23);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("8");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (contador==1) {
					
				}
			}
		});
		btnNewButton_7.setBounds(309, 345, 89, 23);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("9");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (contador==1) {
					
				}
			}
		});
		btnNewButton_8.setBounds(412, 345, 89, 23);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("=");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_9.setBounds(505, 142, 89, 23);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_9_1 = new JButton("-");
		btnNewButton_9_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				medio.setText("-");
				contador = contador + 1;
			}
		});
		btnNewButton_9_1.setBounds(522, 282, 89, 23);
		contentPane.add(btnNewButton_9_1);
		
		JButton btnNewButton_9_2 = new JButton("+");
		btnNewButton_9_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_9_2.setBounds(522, 216, 89, 23);
		contentPane.add(btnNewButton_9_2);
		
		JButton btnNewButton_10 = new JButton("0");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_10.setBounds(206, 399, 295, 23);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("*");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_11.setBounds(522, 399, 89, 23);
		contentPane.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("/");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_12.setBounds(522, 345, 89, 23);
		contentPane.add(btnNewButton_12);
		

	}
}
