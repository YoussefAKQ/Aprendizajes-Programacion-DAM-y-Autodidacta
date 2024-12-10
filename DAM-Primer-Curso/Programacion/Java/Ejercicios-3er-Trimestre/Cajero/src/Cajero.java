import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Cajero extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private double suma = 0.00;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cajero frame = new Cajero();
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
	public Cajero() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 940, 495);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea2 = new JTextArea();
		textArea2.setBounds(10, 66, 359, 22);
		contentPane.add(textArea2);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(591, 81, 285, 278);
		contentPane.add(textArea);
		
		JLabel lblsuma = new JLabel("0.00");
		lblsuma.setBounds(591, 45, 113, 26);
		contentPane.add(lblsuma);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                textArea2.setText(textArea2.getText() + "1");
			}
		});
		btn1.setBounds(10, 113, 113, 47);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                textArea2.setText(textArea2.getText() + "2");
			}
		});
		btn2.setBounds(133, 113, 113, 47);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                textArea2.setText(textArea2.getText() + "3");
			}
		});
		btn3.setBounds(256, 113, 113, 47);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                textArea2.setText(textArea2.getText() + "4");
			}
		});
		btn4.setBounds(10, 191, 113, 47);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                textArea2.setText(textArea2.getText() + "5");
			}
		});
		btn5.setBounds(133, 191, 113, 47);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                textArea2.setText(textArea2.getText() + "6");
			}
		});
		btn6.setBounds(256, 191, 113, 47);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                textArea2.setText(textArea2.getText() + "7");
			}
		});
		btn7.setBounds(10, 267, 113, 47);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                textArea2.setText(textArea2.getText() + "8");
			}
		});
		btn8.setBounds(133, 267, 113, 47);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                textArea2.setText(textArea2.getText() + "9");
			}
		});
		btn9.setBounds(256, 267, 113, 47);
		contentPane.add(btn9);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                textArea2.setText(textArea2.getText() + "0");
			}
		});
		btn0.setBounds(133, 343, 113, 47);
		contentPane.add(btn0);
		
		
		JButton btnbolsa = new JButton("Bolsa");
		btnbolsa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String ct = textArea2.getText();	//2
					int veces = Integer.parseInt(ct);	//2
					
				 for (int x=0;x<veces;x++) {	//mientras 0 es menor que 2
		                textArea.setText(textArea.getText() + "Bolsa	0,15$"+"\n");
		                String cad1 = lblsuma.getText();
		                Double x2 = Double.parseDouble(cad1);
		                x2 = x2 + 0.15;
		                x2 = Math.round(x2 * 100.0) / 100.0;
		                String cad2 = Double.toString(x2);
		                lblsuma.setText(cad2);
				 }
				 
				}catch(Exception ex) {
					textArea2.setText("1");
				}
		 }
		});
		btnbolsa.setBounds(539, 391, 92, 30);
		contentPane.add(btnbolsa);
		
		JButton btnPan = new JButton("Lista Pan");
		btnPan.setBounds(10, 343, 113, 47);
		contentPane.add(btnPan);
		
		JLabel lblusuario = new JLabel("Usuario:");
		lblusuario.setBounds(10, 10, 58, 13);
		contentPane.add(lblusuario);
		
		JLabel lblNewLabel = new JLabel("16");
		lblNewLabel.setBounds(78, 10, 45, 13);
		contentPane.add(lblNewLabel);
		
		JButton btntotal = new JButton("Total");
		btntotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btntotal.setBounds(796, 391, 80, 30);
		contentPane.add(btntotal);
		
		JButton btncodigo = new JButton("Codigo");
		btncodigo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btncodigo.setBounds(677, 391, 80, 30);
		contentPane.add(btncodigo);
		
		
		JButton btnborrar = new JButton("<--");
		btnborrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String currentText = textArea2.getText();
			        if (currentText.length() > 0) {
			            textArea2.setText(currentText.substring(0, currentText.length() - 1));
			        }
			    }
			});
		btnborrar.setBounds(391, 68, 74, 22);
		contentPane.add(btnborrar);
		
	}
}
