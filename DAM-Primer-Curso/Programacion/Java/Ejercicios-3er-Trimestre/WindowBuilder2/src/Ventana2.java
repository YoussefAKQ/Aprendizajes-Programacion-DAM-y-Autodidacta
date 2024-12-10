import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana2 extends JFrame {

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
					Ventana2 frame = new Ventana2();
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
	public Ventana2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 594, 398);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel LabelValor1 = new JLabel("Primer Valor");
		LabelValor1.setBounds(40, 48, 95, 14);
		contentPane.add(LabelValor1);
		
		JLabel LabelValor2 = new JLabel("Segundo Valor");
		LabelValor2.setBounds(40, 119, 95, 14);
		contentPane.add(LabelValor2);
		
		JLabel LabelResultado = new JLabel("Resultado");
		LabelResultado.setBounds(451, 247, 95, 14);
		contentPane.add(LabelResultado);
		
		textField = new JTextField();
		textField.setBounds(176, 45, 152, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(176, 116, 152, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton Boton1 = new JButton("Sumar");
		Boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					String cad1 = textField.getText();
					String cad2 = textField_1.getText();
					int x1 = Integer.parseInt(cad1);
					int x2 = Integer.parseInt(cad2);
					int x4 = x1 + x2;
					String cad4 = Integer.toString(x4);
					LabelResultado.setText(cad4);
			}
		});
		Boton1.setBounds(215, 243, 89, 23);
		contentPane.add(Boton1);
	}

}
