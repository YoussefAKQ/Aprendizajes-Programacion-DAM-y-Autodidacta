import java.awt.EventQueue;
import java.util.Scanner;
import java.util.InputMismatchException;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 661, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(256, 107, 155, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(256, 155, 155, 19);
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton("Dividir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String cad1 = textField.getText();
					String cad2 = textField_1.getText();
					int num1 = Integer.parseInt(cad1);
					int num2 = Integer.parseInt(cad2);
					int divi = num1/num2;
					String cad4 = Integer.toString(divi);
					setTitle(cad4);
				}catch(NumberFormatException ex) {
					setTitle("Tienen que ser valores enteros");
				}catch(ArithmeticException ex) {
					setTitle("No se pueden dividir estos valores");
				}
			}
		});
		btnNewButton.setBounds(47, 238, 85, 21);
		contentPane.add(btnNewButton);
	}
}
