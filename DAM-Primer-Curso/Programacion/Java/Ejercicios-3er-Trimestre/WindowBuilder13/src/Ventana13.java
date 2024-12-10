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

public class Ventana13 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JSpinner sp1, sp2;
	private JComboBox comboBox;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana13 frame = new Ventana13();
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
	public Ventana13() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 721, 534);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hoja");
		lblNewLabel.setBounds(98, 100, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Margen Superior");
		lblNewLabel_1.setBounds(256,100,115,14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Margen Inferior");
		lblNewLabel_2.setBounds(256,210,92,14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Orientacion de pagina");
		lblNewLabel_3.setBounds(448,100,105,14);
		contentPane.add(lblNewLabel_3);

		JSpinner sp1 = new JSpinner();
		sp1.setBounds(256, 230, 54, 20);
		sp1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				repaint();
			}
		});
		sp1.setModel(new SpinnerNumberModel(0,0,10,1));
		contentPane.add(sp1);
		
		JSpinner sp2 = new JSpinner();
		sp2.setBounds(256,125,54,20);
		sp2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				repaint();
			}
		});
		sp2.setModel(new SpinnerNumberModel(0,0,10,1));
		contentPane.add(sp2);
		
		comboBox = new JComboBox();
		comboBox.setBounds(448,124,105,22);
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				repaint();
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Horizontal", "Vertical"}));
		comboBox.setToolTipText("");
		contentPane.add(comboBox);
		
		JButton btnInicializar = new JButton("Inicializar");
		btnInicializar.setBounds(88,319,8,23);
		btnInicializar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnInicializar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						sp1.setValue(0);
						sp2.setValue(0);
						comboBox.setSelectedIndex(0);
						repaint();
					}
				});
				
			}
		});
		contentPane.add(btnInicializar);
	}
	
	public void paint(Graphics g){
		
	}
}
