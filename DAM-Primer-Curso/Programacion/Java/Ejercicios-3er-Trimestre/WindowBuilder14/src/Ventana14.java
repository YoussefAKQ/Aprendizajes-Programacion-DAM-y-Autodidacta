import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana14 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana14 frame = new Ventana14();
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
	public Ventana14() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 730, 557);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(0, 0, 100, 25));
		spinner.setBounds(101, 145, 66, 20);
		contentPane.add(spinner);
		
		JLabel lblNewLabel = new JLabel("velocidad de desplazmiento");
		lblNewLabel.setBounds(81, 122, 141, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Selección de botón");
		lblNewLabel_1.setBounds(348, 122, 116, 13);
		contentPane.add(lblNewLabel_1);
		
		comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				repaint();
			}
		});
		comboBox.setBounds(348, 145, 83, 21);
		contentPane.add(comboBox);
		comboBox.addItem("Izquierdo");
		comboBox.addItem("Derecho");

	}
	
	
	public void paint(Graphics g){
		super.paint(g);
		g.setColor(Color.black);
		g.drawRect(350, 250, 150, 175);
		if (comboBox.getSelectedItem().toString().equals("Izquierdo")) {
			g.setColor(Color.black);
			g.fillRect(350, 250, 75, 75);
			g.setColor(Color.red);
			g.fillOval(350, 250, 75, 75);
		}else {
			g.setColor(Color.black);
			g.fillRect(425, 250, 75, 75);
			g.setColor(Color.red);
			g.fillOval(425, 250, 75, 75);
		}
		
	}
	
}
