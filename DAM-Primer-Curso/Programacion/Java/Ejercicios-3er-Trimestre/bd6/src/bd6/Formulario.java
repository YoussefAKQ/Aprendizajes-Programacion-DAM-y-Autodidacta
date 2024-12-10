package bd6;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.sql.*;

public class Formulario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JTextField tf4;
	private JTextField tf5;
	private JTextField tf6;
	private JLabel lblresultado;
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
		setBounds(100, 100, 656, 403);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblresultado = new JLabel("Resultado");
		lblresultado.setBounds(49, 343, 172, 13);
		contentPane.add(lblresultado);
		
		JLabel lbldni = new JLabel("DNI: ");
		lbldni.setBounds(49, 10, 45, 13);
		contentPane.add(lbldni);
		
		JLabel lblnombre = new JLabel("Nombre: ");
		lblnombre.setBounds(49, 51, 84, 13);
		contentPane.add(lblnombre);
		
		JLabel lblfechanac = new JLabel("Fecha Nacimiento: ");
		lblfechanac.setBounds(49, 87, 140, 13);
		contentPane.add(lblfechanac);
		
		JLabel lbldireccion = new JLabel("Direccion: ");
		lbldireccion.setBounds(49, 127, 84, 13);
		contentPane.add(lbldireccion);
		
		JLabel lbltelef = new JLabel("Teléfono: ");
		lbltelef.setBounds(49, 164, 84, 13);
		contentPane.add(lbltelef);
		
		tf1 = new JTextField();
		tf1.setBounds(199, 7, 157, 19);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setBounds(199, 48, 157, 19);
		contentPane.add(tf2);
		tf2.setColumns(10);
		
		tf3 = new JTextField();
		tf3.setBounds(199, 84, 157, 19);
		contentPane.add(tf3);
		tf3.setColumns(10);
		
		tf4 = new JTextField();
		tf4.setBounds(199, 124, 157, 19);
		contentPane.add(tf4);
		tf4.setColumns(10);
		
		tf5 = new JTextField();
		tf5.setBounds(199, 161, 157, 19);
		contentPane.add(tf5);
		tf5.setColumns(10);
		
		JButton btnAlta = new JButton("Alta");
		btnAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblresultado.setText("");
				try {
					Connection
				conexion = DriverManager.getConnection("jdbc:mysql://localhost/bd2","root","");
					Statement comando = conexion.createStatement();
					int cantidad = comando.executeUpdate("insert into personas values ("+"'"+tf1.getText()+"'"+","+"'"+tf2.getText()+"'"+","+"'"+tf3.getText()+"'"+","+"'"+tf4.getText()+"'"+","+"'"+tf5.getText()+"'"+");");
					if (cantidad == 1) {
						System.out.println("Se ha añadido correctamente a la base de datos");
						lblresultado.setText("Se ha añadido correctamente");
					}else {
						System.out.println("Ha habido un error");
						lblresultado.setText("Ha habido un error");
					}
					conexion.close();
				}catch(Exception ex) {
					System.out.println(ex);
				}
			}
		});
		btnAlta.setBounds(49, 230, 85, 21);
		contentPane.add(btnAlta);
		
		JButton btnBaja = new JButton("Baja");
		btnBaja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblresultado.setText("");
				try {
					Connection
				conexion = DriverManager.getConnection("jdbc:mysql://localhost/bd2","root","");
					Statement comando = conexion.createStatement();
					int cantidad2 = comando.executeUpdate("delete from personas where DNI = "+"'"+tf1.getText()+"'"+";");
					if (cantidad2 == 1) {
						System.out.println("Se ha eliminado correctamente de la base de datos");
						lblresultado.setText("Se ha eliminado correctamente");
					}else {
						System.out.println("Ha habido un error");
						lblresultado.setText("Ha habido un error");
					}
					conexion.close();
				}catch(Exception ex) {
					System.out.println(ex);
				}
			}
		});
		btnBaja.setBounds(187, 230, 85, 21);
		contentPane.add(btnBaja);
		
		JButton btnmodi = new JButton("Modificar datos del DNI: ");
		btnmodi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblresultado.setText("");
				try {
					Connection
				conexion = DriverManager.getConnection("jdbc:mysql://localhost/bd2","root","");
					Statement comando = conexion.createStatement();
					int cantidad2 = comando.executeUpdate("update personas set DNI="+"'"+tf1.getText()+"',"+"NOMBRE="+"'"+tf2.getText()+"',"+"FECNAC="+"'"+tf3.getText()+"',"+"DIR="+"'"+tf4.getText()+"',"+"TFNO="+"'"+tf5.getText()+"' "+"where DNI="+"'"+tf7.getText()+"'"+";");
					if (cantidad2 == 1) {
						System.out.println("Se ha modificado correctamente el DNI: "+tf7.getText());
						lblresultado.setText("Se ha modificado correctamente el DNI: "+tf7.getText());
					}else {
						System.out.println("Ha habido un error");
						lblresultado.setText("Ha habido un error");
					}
					conexion.close();
				}catch(Exception ex) {
					System.out.println(ex);
				}
			}
		});
		btnmodi.setBounds(314, 230, 203, 21);
		contentPane.add(btnmodi);
		
		JButton btnconsu = new JButton("Consultar DNI");
		btnconsu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblresultado.setText("");
				try {
					Connection
				conexion = DriverManager.getConnection("jdbc:mysql://localhost/bd2","root","");
					Statement comando = conexion.createStatement();
					ResultSet registro = comando.executeQuery("select DNI, NOMBRE, FECNAC, DIR, TFNO from personas where DNI="+"'"+tf6.getText()+"'"+";");
					if (registro.next()==true) {
						tf1.setText(registro.getString("DNI"));
						tf2.setText(registro.getString("NOMBRE"));
						tf3.setText(registro.getString("FECNAC"));
						tf4.setText(registro.getString("DIR"));
						tf5.setText(registro.getString("TFNO"));
					}else {
						System.out.println("Ha habido un error");
						lblresultado.setText("Ha habido un error");
					}
					conexion.close();
				}catch(Exception ex) {
					System.out.println(ex);
				}
			}
		});

		btnconsu.setBounds(29, 295, 140, 21);
		contentPane.add(btnconsu);
		
		tf6 = new JTextField();
		tf6.setBounds(199, 296, 157, 19);
		contentPane.add(tf6);
		tf6.setColumns(10);
		
		tf7 = new JTextField();
		tf7.setBounds(536, 231, 96, 19);
		contentPane.add(tf7);
		tf7.setColumns(10);

	}
}
