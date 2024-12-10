package ejer13;

import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{
	private JTextArea textarea1, textarea2;
	private JButton boton1;
	private JScrollPane scrollpanel1, scrollpanel2;
	
	public Formulario() {
		setLayout(null);
		textarea1 = new JTextArea();
		scrollpanel1=new JScrollPane(textarea1);
		scrollpanel1.setBounds(0,0,200,200);
		add(scrollpanel1);						///Si pones scrollpanel no hace falta dar las coordenadas de textarea ni agregarla
		textarea2 = new JTextArea();
		scrollpanel2=new JScrollPane(textarea2);
		scrollpanel2.setBounds(250,0,200,200);
		add(scrollpanel2);						///Si pones scrollpanel no hace falta dar las coordenadas de textarea ni agregarla
		boton1 = new JButton("Verificar contenido");
		boton1.setBounds(60,250,200,50);
		add(boton1);
		boton1.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==boton1) {
			String texto1= textarea1.getText();
			String texto2= textarea2.getText();
			if (texto1.equals(texto2)==true) {
				setTitle("Son iguales");
			}else {
				setTitle("No son iguales");
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
