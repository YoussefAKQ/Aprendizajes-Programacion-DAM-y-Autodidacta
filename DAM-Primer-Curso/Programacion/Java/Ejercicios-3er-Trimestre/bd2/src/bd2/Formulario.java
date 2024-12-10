package bd2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Formulario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JButton btnConsulta;
	private JLabel labelResultado;

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
		setBounds(100, 100, 667, 411);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDescripcion = new JLabel("Descripción del artículo");
		lblDescripcion.setBounds(33, 36, 140, 13);
		contentPane.add(lblDescripcion);
		
		JLabel lblPrecio = new JLabel("Precio: ");
		lblPrecio.setBounds(33, 82, 67, 13);
		contentPane.add(lblPrecio);
		
		tf1 = new JTextField();
		tf1.setBounds(221, 33, 188, 19);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setBounds(221, 79, 126, 19);
		contentPane.add(tf2);
		tf2.setColumns(10);
		
		tf3 = new JTextField();
		tf3.setBounds(221, 143, 96, 19);
		contentPane.add(tf3);
		tf3.setColumns(10);
		
		JLabel labelResultado = new JLabel("resultado");
		labelResultado.setBounds(364, 146, 87, 13);
		contentPane.add(labelResultado);
		
		JButton btnConsulta = new JButton("Consulta por código");
		btnConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelResultado.setText("");
				tf1.setText("");
				tf2.setText("");
				try {
					Connection
				conexion=DriverManager.getConnection("jdbc:mysql://localhost/bd1","root","");
					Statement comando=conexion.createStatement();
					ResultSet registro = comando.executeQuery("select descripcion,precio from articulos where codigo="+tf3.getText());
					
					if (registro.next()==true) {
						tf1.setText(registro.getString("descripcion"));
						tf2.setText(registro.getString("precio"));
					}else {
						labelResultado.setText("No existe un artículo con dicho código");
					}
				}catch(SQLException ex) {
					setTitle(ex.toString());
				}
			}
		});
		btnConsulta.setBounds(33, 142, 151, 21);
		contentPane.add(btnConsulta);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelResultado.setText("");
				try {
					Connection
				conexion=DriverManager.getConnection("jdbc:mysql://localhost/bd1","root","");
					Statement comando=conexion.createStatement();
					int cantidad = comando.executeUpdate("delete from articulos where codigo="+tf3.getText());
					if (cantidad==1) {
						tf1.setText("");
						tf2.setText("");
						labelResultado.setText("Se borró el artículo con dicho código");
					}else {
						labelResultado.setText("No existe un artículo con dicho código");
					}
					conexion.close();
				}catch(SQLException ex) {
					setTitle(ex.toString());
				}
			}
		});
		btnBorrar.setBounds(33, 196, 151, 21);
		contentPane.add(btnBorrar);
		
		
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelResultado.setText("");
				try {
					Connection
				conexion = DriverManager.getConnection("jdbc:mysql://localhost/bd1","root","");
					Statement comando=conexion.createStatement();
					int cantidad = comando.executeUpdate("update articulos set descripcion='"+tf1.getText()+"',"+"precio="+tf2.getText()+"where codigo ="+tf3.getText());
					if (cantidad==1) {
						labelResultado.setText("Se modifico la descripcion y el precio del artículo con dicho código");
					}else {
						labelResultado.setText("No existe un artículo con dicho código");
					}
				}catch(SQLException ex) {
					setTitle(ex.toString());
				}
				
			}
		});
		
		btnModificar.setBounds(33, 247, 151, 21);
		contentPane.add(btnModificar);
	}
	private void cargarDriver() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception ex) {
			setTitle(ex.toString());
		}
	}

}
