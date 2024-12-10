package bd10;

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
import javax.swing.JTextArea;

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
		setBounds(100, 100, 1085, 516);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl1 = new JLabel("NIL: ");
		lbl1.setBounds(36, 21, 45, 13);
		contentPane.add(lbl1);
		
		JLabel lbl2 = new JLabel("Título:");
		lbl2.setBounds(36, 54, 45, 13);
		contentPane.add(lbl2);
		
		JLabel lbl3 = new JLabel("Fecha Publicación:");
		lbl3.setBounds(36, 88, 95, 13);
		contentPane.add(lbl3);
		
		JLabel lbl4 = new JLabel("Editorial: ");
		lbl4.setBounds(36, 123, 45, 13);
		contentPane.add(lbl4);
		
		JLabel lbl5 = new JLabel("Autor: ");
		lbl5.setBounds(36, 162, 45, 13);
		contentPane.add(lbl5);
		
		JLabel lbl6 = new JLabel("Precio:");
		lbl6.setBounds(36, 206, 45, 13);
		contentPane.add(lbl6);
		
		tf1 = new JTextField();
		tf1.setBounds(137, 18, 138, 19);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setBounds(137, 51, 138, 19);
		contentPane.add(tf2);
		tf2.setColumns(10);
		
		tf3 = new JTextField();
		tf3.setBounds(137, 85, 138, 19);
		contentPane.add(tf3);
		tf3.setColumns(10);
		
		tf4 = new JTextField();
		tf4.setBounds(137, 120, 138, 19);
		contentPane.add(tf4);
		tf4.setColumns(10);
		
		tf5 = new JTextField();
		tf5.setBounds(137, 159, 138, 19);
		contentPane.add(tf5);
		tf5.setColumns(10);
		
		tf6 = new JTextField();
		tf6.setBounds(137, 203, 138, 19);
		contentPane.add(tf6);
		tf6.setColumns(10);
		
		JLabel lblresultado = new JLabel(" ");
		lblresultado.setBounds(36, 442, 189, 13);
		contentPane.add(lblresultado);
		
		JButton btnAlta = new JButton("Alta");
		btnAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection
				conexion = DriverManager.getConnection("jdbc:mysql://localhost/bd9","root","");
					Statement comando = conexion.createStatement();
					int cantidad = comando.executeUpdate("insert into libros values('"+tf1.getText()+"','"+tf2.getText()+"','"+tf3.getText()+"','"+tf4.getText()+"','"+tf5.getText()+"','"+tf6.getText()+"');");
					if (cantidad == 1) {
						lblresultado.setText("Se ha dado de alta correctamente");
					}else {
						lblresultado.setText("Ha ocurrido un error");
					}
				}catch(Exception ex) {
					System.out.println(ex);
					lblresultado.setText("Has metido los datos erroneamente o duplicados.Hazlo bien.");
				}
			}
		});
		btnAlta.setBounds(36, 265, 85, 21);
		contentPane.add(btnAlta);
		
		JButton btnBaja = new JButton("Baja");
		btnBaja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection
				conexion = DriverManager.getConnection("jdbc:mysql://localhost/bd9","root","");
					Statement comando = conexion.createStatement();
					int cantidad = comando.executeUpdate("delete from libros where NIL='"+tf1.getText()+"';");
					if (cantidad == 1) {
						lblresultado.setText("Se ha dado de baja correctamente");
					}else {
						lblresultado.setText("Ha ocurrido un error");
					}
				}catch (Exception ex){
					System.out.println(ex);
				}
			}
		});
		btnBaja.setBounds(159, 265, 85, 21);
		contentPane.add(btnBaja);
		
		JButton btnModi = new JButton("Modificar");
		btnModi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection
				conexion = DriverManager.getConnection("jdbc:mysql://localhost/bd9","root","");
					Statement comando = conexion.createStatement();
					int cantidad = comando.executeUpdate("update libros set Titulo='"+tf2.getText()+"',"+"fechaPubli='"+tf3.getText()+"',Edi='"+tf4.getText()+"',Autor='"+tf5.getText()+"',Precio='"+tf6.getText()+"'where NIL ='"+tf1.getText()+"';");
					if (cantidad == 1) {
						lblresultado.setText("Se ha modificado correctamente");
					}else {
						lblresultado.setText("Ha ocurrido un error");
					}
				}catch (Exception ex){
					System.out.println(ex);
				}
			}
		});
		btnModi.setBounds(289, 265, 85, 21);
		contentPane.add(btnModi);
		
		tf7 = new JTextField();
		tf7.setBounds(179, 336, 96, 19);
		contentPane.add(tf7);
		tf7.setColumns(10);
		
		JLabel lbl7 = new JLabel("NIL a consultar: ");
		lbl7.setBounds(36, 339, 95, 13);
		contentPane.add(lbl7);
		
		JButton btnConsultar = new JButton("Consultar: ");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					lblresultado.setText(" ");
					Connection
				conexion = DriverManager.getConnection("jdbc:mysql://localhost/bd9","root","");
					Statement comando = conexion.createStatement();
					ResultSet rst = comando.executeQuery("select NIL, Titulo, fechaPubli, Edi, Autor, Precio from libros where NIL='"+tf7.getText()+"';");
					if (rst.next()==true) {
						tf1.setText(rst.getString("NIL"));
						tf2.setText(rst.getString("Titulo"));
						tf3.setText(rst.getString("fechaPubli"));
						tf4.setText(rst.getString("Edi"));
						tf5.setText(rst.getString("Autor"));
						tf6.setText(rst.getString("Precio"));
					}else {
						lblresultado.setText("No existe un libro con este NIL");
					}
				}catch (Exception ex) {
					System.out.println(ex);
				}
			}
		});
		btnConsultar.setBounds(36, 387, 85, 21);
		contentPane.add(btnConsultar);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(691, 308, 240, 147);
		contentPane.add(textArea);
		
		JButton btnBuscar = new JButton("New button");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBuscar.setBounds(474, 356, 85, 21);
		contentPane.add(btnBuscar);
		
	}
}
