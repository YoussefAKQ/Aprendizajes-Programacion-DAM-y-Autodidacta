package ejer4;

import javax.swing.*;

public class Formulario extends JFrame{
	private JLabel label1, label2, label3;
	
	public Formulario() {
		setLayout(null);
		label1=new JLabel("Azul");
		label1.setBounds(10,20,300,30);
		add(label1);
		label2=new JLabel("Rojo");
		label2.setBounds(10,100,100,30);
		add(label2);
		label3=new JLabel("Verde");
		label3.setBounds(10,180,50,30);
		add(label3);

	}
	
	public static void main(String[] args) {
		Formulario formulario1 = new Formulario();
		formulario1.setBounds(0,0,500,500);
		formulario1.setResizable(true);	
		formulario1.setVisible(true);
		formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
		
}
