package bd7;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Formulario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JTextField tf4;
	private JTextField tf5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
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
	public Formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 651, 416);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl1 = new JLabel("Total de kilómetros recorridos: ");
		lbl1.setBounds(10, 10, 180, 13);
		contentPane.add(lbl1);
		
		JLabel lbl2 = new JLabel("Precio de gasolina (por litro):");
		lbl2.setBounds(10, 33, 148, 13);
		contentPane.add(lbl2);
		
		JLabel lbl3 = new JLabel("Dinero de gasolina gastado en el viaje: ");
		lbl3.setBounds(10, 56, 207, 13);
		contentPane.add(lbl3);
		
		JLabel lbl4 = new JLabel("Tiempo que se ha tardado (horas) :");
		lbl4.setBounds(10, 79, 196, 13);
		contentPane.add(lbl4);
		
		JLabel lbl5 = new JLabel("Tiempo que se ha tardado (minutos):");
		lbl5.setBounds(10, 102, 180, 13);
		contentPane.add(lbl5);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 144, 617, 197);
		contentPane.add(textArea);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String String1 = tf1.getText();
				double totalkm = Double.parseDouble(String1);
				String String2 = tf2.getText();
				double preciogas = Double.parseDouble(String2);
				String String3 = tf3.getText();
				double dinerogas = Double.parseDouble(String3);
				String String4 = tf4.getText();
				double tiempoh = Double.parseDouble(String4);
				String String5 = tf5.getText();
				double tiempomin = Double.parseDouble(String5);
				
				double velocidadmedia = (tiempomin/60 + tiempoh)/totalkm;
				String cad4 = Double.toString(velocidadmedia);
				textArea.setText(cad4+ String5+"\n");
				textArea.append(String5+"\n");
				textArea.append(String4+"\n");
				textArea.append("hola");
				
				System.out.println();
			}
		});
		btnCalcular.setBounds(276, 358, 85, 21);
		contentPane.add(btnCalcular);
		
		tf1 = new JTextField();
		tf1.setBounds(265, 7, 278, 19);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setBounds(265, 30, 278, 19);
		contentPane.add(tf2);
		tf2.setColumns(10);
		
		tf3 = new JTextField();
		tf3.setBounds(265, 53, 278, 19);
		contentPane.add(tf3);
		tf3.setColumns(10);
		
		tf4 = new JTextField();
		tf4.setBounds(265, 76, 278, 19);
		contentPane.add(tf4);
		tf4.setColumns(10);
		
		tf5 = new JTextField();
		tf5.setBounds(265, 99, 278, 19);
		contentPane.add(tf5);
		tf5.setColumns(10);
	}
}
