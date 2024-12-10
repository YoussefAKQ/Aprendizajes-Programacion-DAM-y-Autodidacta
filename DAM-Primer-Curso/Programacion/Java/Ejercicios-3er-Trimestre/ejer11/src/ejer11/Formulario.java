package ejer11;

import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame{
	private JTextField textfield1;
	private JTextArea textarea1;
	
	public Formulario() {
		setLayout(null);
		textfield1 = new JTextField();
		textfield1.setBounds(10,10,200,30);
		add(textfield1);
		textarea1 = new JTextArea();
		textarea1.setBounds(10,50,400,300);
		add(textarea1);
	}
	
	public static void main(String[] args) {
		Formulario formulario1 = new Formulario();
		formulario1.setBounds(0,0,540,400);
		formulario1.setVisible(true);
		formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
