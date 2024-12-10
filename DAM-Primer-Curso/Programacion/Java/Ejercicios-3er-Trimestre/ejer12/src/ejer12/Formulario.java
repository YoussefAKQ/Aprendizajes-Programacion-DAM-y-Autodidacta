package ejer12;

import javax.swing.*;

import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{
	private JScrollPane scrollpanel1;
	private JTextArea textarea1;
	private JButton boton1;
	
	public Formulario() {
		setLayout(null);
		textarea1=new JTextArea();
		scrollpanel1=new JScrollPane(textarea1);
		scrollpanel1.setBounds(10,10,300,200);
		add(scrollpanel1);
		boton1 = new JButton("Enviar");
		boton1.setBounds(10,260,100,30);
		add(boton1);
		boton1.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==boton1) {
			String texto = textarea1.getText();
			if (texto.indexOf("Java")!=-1|texto.indexOf("java")!=-1) {
				setTitle("Hay java o Java");
			}else {
				setTitle("No hay java");
			}
		}
	}
	
	public static void main(String[] args) {
		Formulario formulario1 = new Formulario();
		formulario1.setBounds(0,0,540,400);
		formulario1.setVisible(true);
		formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
