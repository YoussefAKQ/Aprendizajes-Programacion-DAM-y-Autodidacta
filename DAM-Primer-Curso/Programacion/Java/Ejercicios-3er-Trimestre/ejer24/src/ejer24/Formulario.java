package ejer24;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class Formulario extends JFrame implements ChangeListener{
	private JTextField textfield1, textfield2;
	private JRadioButton radiobutton1, radiobutton2;
	private ButtonGroup bg;
	public Formulario() {
		setLayout(null);
		bg=new ButtonGroup();
		textfield1 = new JTextField();
		textfield1.setBounds(10,20,80,40);
		add(textfield1);
		textfield2 = new JTextField();
		textfield2.setBounds(10,70,80,40);
		add(textfield2);
		radiobutton1 = new JRadioButton("Sumar");
		radiobutton1.setBounds(10,120,80,50);
		radiobutton1.addChangeListener(this);
		add(radiobutton1);
		bg.add(radiobutton1);
		radiobutton2 = new JRadioButton("Restar");
		radiobutton2.setBounds(10,170,80,50);
		radiobutton2.addChangeListener(this);
		add(radiobutton2);
		bg.add(radiobutton2);
		
	}
	
	public void Magia() {
		String cad1 = textfield1.getText();
		String cad2 = textfield2.getText();
		int x1 = Integer.parseInt(cad1);
		int x2 = Integer.parseInt(cad2);
		int x3 = x1 + x2;
		String cad3 = Integer.toString(x3);
		setTitle(cad3);
	}
	
	
	public void Magia2() {
		String cad1 = textfield1.getText();
		String cad2 = textfield2.getText();
		int x1 = Integer.parseInt(cad1);
		int x2 = Integer.parseInt(cad2);
		int x4 = x1 - x2;
		String cad4 = Integer.toString(x4);
		setTitle(cad4);
	}
	
	public void stateChanged(ChangeEvent e) {

		if (radiobutton1.isSelected()) {
			Magia();
		}
		if (radiobutton2.isSelected()) {
			Magia2();
		}
	}
	
	public static void main(String[] args) {
		Formulario formulario1 = new Formulario();
		formulario1.setBounds(10,10,400,400);
		formulario1.setVisible(true);
		formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}

