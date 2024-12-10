package ejer16;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Formulario extends JFrame implements ItemListener,ActionListener{
	private JLabel label1, label2;
	private JTextArea textarea1;
	private JButton boton1;
	private JComboBox<String> combo1;
	private JTextField textfield1;
	
	public Formulario() {
		setLayout(null);
		label1 = new JLabel("Nombre");
		label1.setBounds(10,10,100,30);
		add(label1);
		label2 = new JLabel("País");
		label2.setBounds(10,60,100,30);
		add(label2);
		boton1 = new JButton("Confirmar");
		boton1.setBounds(10,120,100,30);
		boton1.addActionListener(this);
		add(boton1);
		textfield1 = new JTextField();
		textfield1.setBounds(80,10,100,30);
		add(textfield1);
		combo1 = new JComboBox<String>();
		combo1.setBounds(80,60,100,30);
		add(combo1);
		combo1.addItem("Francia");
		combo1.addItem("España");
		combo1.addItem("Inglaterra");
		combo1.addItem("Alemania");
		combo1.addItem("Rusia");
		combo1.addItemListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==boton1) {
			String cad1 = textfield1.getText();
			String cad2 = (String)combo1.getSelectedItem();
			setTitle(cad1+" - "+cad2);
		}
	}
	
	public static void main(String[] args) {
		Formulario formulario1 = new Formulario();
		formulario1.setBounds(0,0,300,300);
		formulario1.setVisible(true);
		formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
