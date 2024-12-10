package bd8;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.sql.*;
import java.sql.Connection;

public class Formulario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JTextField tf4;
	private JTextField tf5;
	private JTextField tf6;
	private JTextField tf7;

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
		setBounds(100, 100, 765, 509);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl1 = new JLabel("NIL:");
		lbl1.setBounds(33, 37, 45, 13);
		contentPane.add(lbl1);
		
		JLabel lbl2 = new JLabel("Título: ");
		lbl2.setBounds(33, 78, 45, 13);
		contentPane.add(lbl2);
		
		JLabel lbl3 = new JLabel("Fecha Publicación: ");
		lbl3.setBounds(33, 119, 120, 13);
		contentPane.add(lbl3);
		
		JLabel lbl4 = new JLabel("Edi: ");
		lbl4.setBounds(33, 166, 45, 13);
		contentPane.add(lbl4);
		
		JLabel lbl5 = new JLabel("Autor: ");
		lbl5.setBounds(33, 209, 76, 13);
		contentPane.add(lbl5);
		
		JLabel lbl6 = new JLabel("Precio: ");
		lbl6.setBounds(33, 257, 45, 13);
		contentPane.add(lbl6);
		
		JLabel lbl7 = new JLabel("Consultar por NIL:");
		lbl7.setBounds(33, 409, 120, 13);
		contentPane.add(lbl7);
		
		tf1 = new JTextField();
		tf1.setBounds(164, 34, 176, 19);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setBounds(164, 75, 176, 19);
		contentPane.add(tf2);
		tf2.setColumns(10);
		
		tf3 = new JTextField();
		tf3.setBounds(164, 116, 176, 19);
		contentPane.add(tf3);
		tf3.setColumns(10);
		
		tf4 = new JTextField();
		tf4.setBounds(164, 163, 176, 19);
		contentPane.add(tf4);
		tf4.setColumns(10);
		
		tf5 = new JTextField();
		tf5.setBounds(164, 206, 176, 19);
		contentPane.add(tf5);
		tf5.setColumns(10);
		
		tf6 = new JTextField();
		tf6.setBounds(161, 254, 179, 19);
		contentPane.add(tf6);
		tf6.setColumns(10);
		
		tf7 = new JTextField();
		tf7.setBounds(163, 406, 178, 19);
		contentPane.add(tf7);
		tf7.setColumns(10);
		
		JLabel lblResultado1 = new JLabel("New label");
		lblResultado1.setBounds(459, 138, 238, 13);
		contentPane.add(lblResultado1);
		
		JLabel label = new JLabel("New label");
		label.setBounds(438, 342, 35, -2);
		contentPane.add(label);
		
		JLabel lblResultado2 = new JLabel("New label");
		lblResultado2.setBounds(438, 409, 151, 13);
		contentPane.add(lblResultado2);
		
		JButton btnAlta = new JButton("Alta");
		btnAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection
				conexion = DriverManager.getConnection("jdbc:mysql://localhost/bd8","root","");
					Statement comando=conexion.createStatement();
					int cantidad = comando.executeUpdate("insert into libros values ('"+tf1.getText()+"',"+"'"+tf2.getText()+"',"+tf3.getText()+"',"+tf4.getText()+"',"+tf5.getText()+"',"+tf6.getText()+"'"+");");
					if (cantidad = 1) {
						lblResultado1.setText("Se ha dado de alta correctamente");
					}else {
						lblResultado1.setText("No se ha podido dar de alta");
					}
				}catch(Exception ex) {
					lblResultado1.setText("Ha ocurrido un error interno");
				}
				conexion.Close();
			}
		});
		btnAlta.setBounds(33, 319, 85, 21);
		contentPane.add(btnAlta);
		
		JButton btnBaja = new JButton("Baja");
		btnBaja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBaja.setBounds(164, 319, 85, 21);
		contentPane.add(btnBaja);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnModificar.setBounds(310, 319, 85, 21);
		contentPane.add(btnModificar);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConsultar.setBounds(33, 432, 85, 21);
		contentPane.add(btnConsultar);
	}
	
	private void cargarDriver() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception ex) {
			setTitle(ex.toString());
		}
	}
}
