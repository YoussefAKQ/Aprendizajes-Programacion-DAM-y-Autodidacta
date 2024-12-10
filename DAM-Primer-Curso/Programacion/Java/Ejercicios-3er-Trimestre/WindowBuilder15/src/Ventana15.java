import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana15 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private boolean bandera=false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana15 frame = new Ventana15();
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
	public Ventana15() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 536, 422);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Partido 1:");
		lblNewLabel.setBounds(24, 31, 59, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblPartido = new JLabel("Partido 2:");
		lblPartido.setBounds(24, 60, 59, 13);
		contentPane.add(lblPartido);
		
		JLabel lblPartido_1 = new JLabel("Partido 3:");
		lblPartido_1.setBounds(24, 96, 59, 13);
		contentPane.add(lblPartido_1);
		
		tf1 = new JTextField();
		tf1.setBounds(81, 28, 96, 19);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setColumns(10);
		tf2.setBounds(81, 57, 96, 19);
		contentPane.add(tf2);
		
		tf3 = new JTextField();
		tf3.setColumns(10);
		tf3.setBounds(81, 93, 96, 19);
		contentPane.add(tf3);
		
		JButton btnNewButton = new JButton("Graficar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bandera = true;
				repaint();
			}
		});
		btnNewButton.setBounds(27, 138, 113, 36);
		contentPane.add(btnNewButton);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		if (bandera == true) {
			String s1=tf1.getText();
			String s2=tf2.getText();
			String s3=tf3.getText();
			int v1=Integer.parseInt(s1);
			int v2=Integer.parseInt(s2);
			int v3=Integer.parseInt(s3);
			int suma=v1+v2+v3;
			int grados1=v1*360/suma;
			int grados2=v2*360/suma;
			int grados3=v3*360/suma;
			
			g.setColor(new Color(255,0,0));
			g.fillArc(50,250,200,200,0,grados1);
			g.fillRect(370,250,20,20);
			g.drawString("Partido 1",400,270);
			
			g.setColor(new Color(0,128,0));
			g.fillArc(50,250,200,200,grados1,grados2);
			g.fillRect(370,280,20,20);
			g.drawString("Partido 2",400,300);
			
			g.setColor(new Color(0,0,255));
			g.fillArc(50,250,200,200,grados1+grados2,grados3);
			g.fillRect(370,310,20,20);
			g.drawString("Partido 3", 400, 330); 
		}
	}
}
