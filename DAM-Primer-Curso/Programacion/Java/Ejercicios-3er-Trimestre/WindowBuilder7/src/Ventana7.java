import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana7 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana7 frame = new Ventana7();
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
	public Ventana7() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 406);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(26, 26, 65, 20);
		contentPane.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(26, 132, 65, 20);
		contentPane.add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(26, 225, 65, 20);
		contentPane.add(spinner_2);
		
		JLabel lblNewLabel = new JLabel("Compuerta 1");
		lblNewLabel.setBounds(114, 29, 89, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblCompuerta_1 = new JLabel("Compuerta 2");
		lblCompuerta_1.setBounds(114, 135, 76, 14);
		contentPane.add(lblCompuerta_1);
		
		JLabel lblCompuerta = new JLabel("Compuerta 3");
		lblCompuerta.setBounds(114, 228, 89, 14);
		contentPane.add(lblCompuerta);
		
		JButton btnNewButton = new JButton("Actualizar Caudal");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x1 = Integer.parseInt(spinner.getValue().toString());
				int x2 = Integer.parseInt(spinner_1.getValue().toString());
				int x3 = Integer.parseInt(spinner_2.getValue().toString());
			}
		});
		btnNewButton.setBounds(26, 309, 137, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("Resultado");
		lblNewLabel_3.setBounds(173, 313, 76, 14);
		contentPane.add(lblNewLabel_3);
	}
}
