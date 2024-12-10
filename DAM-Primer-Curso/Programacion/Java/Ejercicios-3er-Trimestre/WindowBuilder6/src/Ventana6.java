import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.Choice;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Ventana6 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana6 frame = new Ventana6();
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
	public Ventana6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 901, 544);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("A (0,80)");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(34, 62, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("B (1,20)");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(34, 122, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("C (3,10)");
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(34, 175, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		comboBox.setBounds(531, 62, 52, 22);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"10", "20", "30", "40", "50", "60", "70", "80", "90"}));
		comboBox_1.setBounds(531, 149, 52, 22);
		contentPane.add(comboBox_1);
		
		JLabel lblNewLabel = new JLabel("Correcto/Incorrecto");
		lblNewLabel.setBounds(286, 346, 114, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int euros= Integer.parseInt((String)comboBox.getSelectedItem());
				int centimos= Integer.parseInt((String)comboBox_1.getSelectedItem());
				if (rdbtnNewRadioButton.isSelected()&&euros==0&&centimos==80) {
					lblNewLabel.setText("Correcto");
				}else {
					if (rdbtnNewRadioButton_1.isSelected()&&euros==1&&centimos==20) {
						lblNewLabel.setText("Correcto");
					}else {
						if (rdbtnNewRadioButton_2.isSelected()&&euros==3&&centimos==10) {
							lblNewLabel.setText("Correcto");
						}else {
							lblNewLabel.setText("Incorrecto");
						}
					}
				}
			}
		});
		btnNewButton.setBounds(77, 342, 89, 23);
		contentPane.add(btnNewButton);

	}
}
