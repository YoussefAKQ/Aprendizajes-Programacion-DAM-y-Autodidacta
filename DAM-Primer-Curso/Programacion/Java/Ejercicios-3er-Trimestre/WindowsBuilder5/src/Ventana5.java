import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana5 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel posicion_1;
	private JLabel lblEstatico;
	private String cad1;
	private int x1 = 1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana5 frame = new Ventana5();
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
	public Ventana5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 845, 515);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton boton1 = new JButton("4");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				posicion_1.setText("4");		
				if (x1<4) {
					cad1 = "Sube";
				}else if(x1==4){
					cad1 = "Piso Actual";
				}else {
					cad1 = "Baja";
				}
				lblEstatico.setText(cad1);
				x1=4;
			}
		});
		boton1.setBounds(75, 63, 61, 50);
		contentPane.add(boton1);
		
		JButton boton2 = new JButton("3");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				posicion_1.setText("3");
				if (x1<3) {
					cad1 = "Sube";
				}else if(x1==3){
					cad1 = "Piso Actual";
				}else {
					cad1 = "Baja";
				}
				lblEstatico.setText(cad1);
				x1=3;
			}
		});
		boton2.setBounds(75, 136, 61, 50);
		contentPane.add(boton2);
		
		JButton boton3 = new JButton("2");
		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				posicion_1.setText("2");
				if (x1<2) {
					cad1 = "Sube";
				}else if(x1==2){
					cad1 = "Piso Actual";
				}else {
					cad1 = "Baja";
				}
				lblEstatico.setText(cad1);
				x1=2;
			}
		});
		boton3.setBounds(75, 213, 61, 50);
		contentPane.add(boton3);
		
		JButton boton4 = new JButton("1");
		boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				posicion_1.setText("1");

				if (x1<1) {
					cad1 = "Sube";
				}else if(x1==1){
					cad1 = "Piso Actual";
				}else {
					cad1 = "Baja";
				}
				lblEstatico.setText(cad1);
				x1=1;
			}
			
		});
		boton4.setBounds(75, 295, 61, 50);
		contentPane.add(boton4);
		
		JLabel bajaosube = new JLabel("Direccion");
		bajaosube.setBounds(278, 154, 68, 14);
		contentPane.add(bajaosube);
		
		JLabel posicion = new JLabel("Piso");
		posicion.setBounds(278, 113, 46, 14);
		contentPane.add(posicion);
		
		posicion_1 = new JLabel("1");
		posicion_1.setBounds(380, 113, 46, 14);
		contentPane.add(posicion_1);
		
		lblEstatico = new JLabel("Estatico");
		lblEstatico.setBounds(380, 154, 97, 14);
		contentPane.add(lblEstatico);
	}

}
