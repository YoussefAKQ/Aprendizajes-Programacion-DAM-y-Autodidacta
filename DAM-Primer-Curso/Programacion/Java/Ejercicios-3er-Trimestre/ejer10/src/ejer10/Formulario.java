package ejer10;

import javax.swing.*;

import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{
	private JTextField textfield1, textfield2;
	private JButton boton1;
	private JLabel label1,label2;
	private String contra;
	private String nombre;
	private String bien, mal;
	
	private Formulario() {
		setLayout(null);
		label1 = new JLabel("Usuario");
		label1.setBounds(10,10,100,30);
		add(label1);
		label2 = new JLabel("Contra");
		label2.setBounds(10,50,100,30);
		add(label2);
		textfield1 = new JTextField();
		textfield1.setBounds(110,10,100,30);
		add(textfield1);
		textfield2 = new JTextField();
		textfield2.setBounds(110,50,100,30);
		add(textfield2);
		boton1 = new JButton("Confirmar");
		boton1.setBounds(75,130,100,40);
		add(boton1);
		boton1.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		String contra = "abc123";
		String nombre = "Juan";
		String bien = "Correcto";
		String mal = "Incorrecto";
		if (e.getSource()==boton1) {
			String cad1=textfield1.getText();
			String cad2=textfield2.getText();	
			if (cad1.equals(nombre)&&cad2.equals(contra)) {
				setTitle(bien);
			}else {
				setTitle(mal);
			}
		}
	}
	
	public static void main (String[] args) {
		Formulario formulario1 = new Formulario();
		formulario1.setBounds(1,1,300,300);
		formulario1.setVisible(true);
		formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	

}
