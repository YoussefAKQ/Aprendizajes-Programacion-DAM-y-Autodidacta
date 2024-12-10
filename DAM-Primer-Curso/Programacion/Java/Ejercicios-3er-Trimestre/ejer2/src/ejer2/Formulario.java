package ejer2;

import javax.swing.*;

public class Formulario extends JFrame {
	
	public Formulario() {
		setLayout(null);
	}
	
	public static void main(String[] args) {
		Formulario formulario1 = new Formulario();
		formulario1.setBounds(10,20,400,300);
		formulario1.setVisible(true);
		formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario1.setResizable(false);			///en true sí puedo cambiar el tamaño
	}
	
}
