import java.awt.EventQueue;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Formulario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

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
		setBounds(100, 100, 515, 433);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
	
	public void paint (Graphics g){
		super.paint(g);
		
		g.setColor(Color.blue);
		g.drawLine(0,70,100,70);
		g.drawRect(150,70,50,70);
		g.drawRoundRect(250,70,50,70,6,6);
		g.drawOval(350,70,50,70);
		int[]vx1= {500,550,450};
		int[]vy1= {70,120,120};
		g.drawPolygon(vx1,vy1,3);
		
		g.setColor(Color.red);
		g.fillRect(150,270,50,70);
		g.fillRoundRect(250,270,50,70,6,6);
		g.fillOval(350,270,50,70);
		int[]vx2= {500,550,450};
		int[]vy2= {270,320,320};
		g.fillPolygon(vx2,vy2,3);
		
		g.setColor(Color.green);
		g.fillOval(150,600,60,70);
		g.fillOval(250,600,60,70);
		int[]vx3= {500,550,};
		int[]vy3= {70,120,120};
		g.fillPolygon(vx3,vy3,3);
		
	}

}
