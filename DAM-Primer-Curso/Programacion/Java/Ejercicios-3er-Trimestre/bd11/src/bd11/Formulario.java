package bd11;

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
import javax.swing.JScrollPane;
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
	private JTextField tfPrecio;
	private JTextField tfFecha;

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
		setBounds(100, 100, 1029, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl1 = new JLabel("NIL: ");
		lbl1.setBounds(22, 26, 45, 13);
		contentPane.add(lbl1);
		
		JLabel lbl2 = new JLabel("Titulo: ");
		lbl2.setBounds(22, 59, 45, 13);
		contentPane.add(lbl2);
		
		JLabel lbl3 = new JLabel("Fecha Publicación: ");
		lbl3.setBounds(22, 103, 96, 13);
		contentPane.add(lbl3);
		
		JLabel lbl4 = new JLabel("Editorial: ");
		lbl4.setBounds(22, 145, 45, 13);
		contentPane.add(lbl4);
		
		JLabel lbl5 = new JLabel("Autor: ");
		lbl5.setBounds(22, 185, 45, 13);
		contentPane.add(lbl5);
		
		JLabel lbl6 = new JLabel("Precio: ");
		lbl6.setBounds(22, 225, 45, 13);
		contentPane.add(lbl6);
		
		tf1 = new JTextField();
		tf1.setBounds(167, 23, 135, 19);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setBounds(167, 56, 135, 19);
		contentPane.add(tf2);
		tf2.setColumns(10);
		
		tf3 = new JTextField();
		tf3.setBounds(167, 100, 135, 19);
		contentPane.add(tf3);
		tf3.setColumns(10);
		
		tf4 = new JTextField();
		tf4.setBounds(167, 142, 135, 19);
		contentPane.add(tf4);
		tf4.setColumns(10);
		
		tf5 = new JTextField();
		tf5.setBounds(167, 182, 135, 19);
		contentPane.add(tf5);
		tf5.setColumns(10);
		
		tf6 = new JTextField();
		tf6.setBounds(167, 222, 135, 19);
		contentPane.add(tf6);
		tf6.setColumns(10);
		
		JLabel lblresultado = new JLabel(" ");
		lblresultado.setBounds(22, 450, 334, 13);
		contentPane.add(lblresultado);
		
		JButton btnAlta = new JButton("Alta");
		btnAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection
				conexion = DriverManager.getConnection("jdbc:mysql://localhost/bd11","root","");
					Statement comando = conexion.createStatement();
					int cantidad = comando.executeUpdate("insert into libros values('"+tf1.getText()+"','"+tf2.getText()+"','"+tf3.getText()+"','"+tf4.getText()+"','"+tf5.getText()+"','"+tf6.getText()+"');");
					if (cantidad == 1) {
						lblresultado.setText("Se ha dado de alta correctamente");
					}else {
						lblresultado.setText("Ha ocurrido un error");
					}
				} catch (Exception ex) {
					System.out.println(ex);
					lblresultado.setText("Ha introducido los datos erróneamente. Inténtelo de nuevo.");
				}
			}
		});
		btnAlta.setBounds(22, 282, 85, 21);
		contentPane.add(btnAlta);
		
		JButton btnBaja = new JButton("Baja");
		btnBaja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection
				conexion = DriverManager.getConnection("jdbc:mysql://localhost/bd11","root","");
					Statement comando = conexion.createStatement();
					int cantidad = comando.executeUpdate("delete from libros where NIL='"+tf1.getText()+"';");
					if (cantidad == 1) {
						lblresultado.setText("Se ha dado de baja correctamente");
					}else {
						lblresultado.setText("Ha ocurrido un error");
					}
				} catch (Exception ex) {
					System.out.println(ex);
					lblresultado.setText("Ha ocurrido un error interno");
				}
			}
		});
		btnBaja.setBounds(147, 282, 85, 21);
		contentPane.add(btnBaja);
		
		JButton btnModi = new JButton("Modificar");
		btnModi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection
				conexion = DriverManager.getConnection("jdbc:mysql://localhost/bd11","root","");
					Statement comando = conexion.createStatement();
					int cantidad = comando.executeUpdate("update libros set Titulo='"+tf2.getText()+"',fechaPubli='"+tf3.getText()+"',Edi='"+tf4.getText()+"',Autor='"+tf5.getText()+"',Precio='"+tf6.getText()+"'where NIL = '"+tf1.getText()+"';");
					if (cantidad == 1) {
						lblresultado.setText("Se ha modificado correctamente");
					}else {
						lblresultado.setText("Ha ocurrido un error");
					}
				} catch (Exception ex) {
					System.out.println(ex);
					lblresultado.setText("Ha ocurrido un error interno");
				}
			}
		});
		btnModi.setBounds(271, 282, 85, 21);
		contentPane.add(btnModi);
		
		tf7 = new JTextField();
		tf7.setBounds(167, 361, 135, 19);
		contentPane.add(tf7);
		tf7.setColumns(10);
		
		JLabel lbl7 = new JLabel("Consulta por NIL:");
		lbl7.setBounds(22, 364, 128, 13);
		contentPane.add(lbl7);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection
				conexion = DriverManager.getConnection("jdbc:mysql://localhost/bd11","root","");
					Statement comando = conexion.createStatement();
					ResultSet rst = comando.executeQuery("select NIL, Titulo, fechaPubli, Edi, Autor, Precio from libros where NIL='"+tf7.getText()+"';");
					if (rst.next() == true) {
						tf1.setText(rst.getString("NIL"));
						tf2.setText(rst.getString("Titulo"));
						tf3.setText(rst.getString("fechaPubli"));
						tf4.setText(rst.getString("Edi"));
						tf5.setText(rst.getString("Autor"));
						tf6.setText(rst.getString("Precio"));
						lblresultado.setText("Datos encontrados");
					}else {
						lblresultado.setText("No hay datos con ese NIL");
					}
				} catch (Exception ex) {
					System.out.println(ex);
					lblresultado.setText("Ha ocurrido un error interno");
				}
			}
		});
		btnConsultar.setBounds(22, 402, 85, 21);
		contentPane.add(btnConsultar);
		
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(811, 313, 173, 96);
		contentPane.add(textArea);
		
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(749, 10, 256, 280);
		contentPane.add(scrollPane);
		
		JButton btnPrecio = new JButton("Mostrar libros más caros que: ");
		btnPrecio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					lblresultado.setText(" ");
					textArea.setText(" ");
					Connection
				conexion = DriverManager.getConnection("jdbc:mysql://localhost/bd11","root","");
					Statement comando = conexion.createStatement();
					ResultSet rst = comando.executeQuery("select NIL, Titulo, fechaPubli, Edi, Autor, Precio from libros where Precio >'"+tfPrecio.getText()+"';");
					while (rst.next() == true) {
						textArea.append(rst.getString("NIL")+"\n");
						textArea.append(rst.getString("Titulo")+"\n");
						textArea.append(rst.getString("fechaPubli")+"\n");
						textArea.append(rst.getString("Edi")+"\n");
						textArea.append(rst.getString("Autor")+"\n");
						textArea.append(rst.getString("Precio")+"\n");
						textArea.append("---------------------------"+"\n");
						lblresultado.setText("Se han encontrado libros");
					}
				} catch (Exception ex) {
					System.out.println(ex);
					lblresultado.setText("Ha ocurrido un error interno");
				}
			}
		});
		btnPrecio.setBounds(360, 39, 219, 21);
		contentPane.add(btnPrecio);
		
		tfPrecio = new JTextField();
		tfPrecio.setBounds(611, 40, 96, 19);
		contentPane.add(tfPrecio);
		tfPrecio.setColumns(10);
		
		JButton btnFecha = new JButton("Mostrar libros más antiguos que la fecha:");
		btnFecha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					textArea.setText(" ");
					lblresultado.setText(" ");
					Connection
				conexion = DriverManager.getConnection("jdbc:mysql://localhost/bd11","root","");
					Statement comando = conexion.createStatement();
					ResultSet rst = comando.executeQuery("select NIL, Titulo, fechaPubli, Edi, Autor, Precio from libros where fechaPubli <'"+tfFecha.getText()+"';");
					while (rst.next() == true) {
						textArea.append(rst.getString("NIL")+"\n");
						textArea.append(rst.getString("Titulo")+"\n");
						textArea.append(rst.getString("fechaPubli")+"\n");
						textArea.append(rst.getString("Edi")+"\n");
						textArea.append(rst.getString("Autor")+"\n");
						textArea.append(rst.getString("Precio")+"\n");
						textArea.append("---------------------------"+"\n");
						lblresultado.setText("Se han encontrado libros");
					}
				} catch (Exception ex) {
					System.out.println(ex);
					lblresultado.setText("Ha ocurrido un error interno");
				}
			}
		});
		btnFecha.setBounds(312, 202, 281, 21);
		contentPane.add(btnFecha);
		
		tfFecha = new JTextField();
		tfFecha.setBounds(611, 203, 96, 19);
		contentPane.add(tfFecha);
		tfFecha.setColumns(10);
	}
}
