package ejer7;

import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{
	JButton boton1, boton2;
	
	public Formulario() {
		setLayout(null);
		boton1 = new JButton("Varon");
		boton1.setBounds(200,100,90,30);
		add(boton1);
		boton1.addActionListener(this);
		boton2 = new JButton("Mujer");
		boton2.setBounds(100,100,90,30);
		add(boton2);
		boton2.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==boton1) {
			setTitle("VARON");
		}
		if (e.getSource()==boton2) {
			setTitle("MUJER");
		}
	}
	
	public static void main(String[] args) {
		Formulario formulario1 = new Formulario();
		formulario1.setBounds(0,0,400,300);
		formulario1.setVisible(true);
		formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
