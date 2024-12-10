package ejer19;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Formulario extends JFrame implements ActionListener{
	private JMenuBar mb;
	private JMenu menu1, menu2;
	private JMenuItem m1, m2;
	private JTextField textfield1, textfield2;
	
	public Formulario() {
		setLayout(null);
		mb = new JMenuBar();
		setJMenuBar(mb);
		menu1 = new JMenu("Opciones");
		mb.add(menu1);
		menu2 = new JMenu("Tamaño ventana");
		menu1.add(menu2);
		m1 = new JMenuItem("Aplicar");
		menu2.add(m1);
		m1.addActionListener(this);
		m2 = new JMenuItem("Finalizar programa");
		menu2.add(m2);
		m2.addActionListener(this);
		textfield1 = new JTextField();
		textfield1.setBounds(10,10,100,20);
		add(textfield1);
		textfield2 = new JTextField();
		textfield2.setBounds(10,50,100,20);
		add(textfield2);
	}
	
	public void actionPerformed(ActionEvent e) {
		String cad1 = textfield1.getText();
		String cad2 = textfield2.getText();
		int cad1int = Integer.parseInt(cad1);
		int cad2int = Integer.parseInt(cad2);
		if (e.getSource()==m1) {
			setSize(cad1int,cad2int);
		}
		if (e.getSource()==m2) {
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		Formulario formulario1 = new Formulario();
		formulario1.setBounds(10,10,300,300);
		formulario1.setVisible(true);
		formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

///PRUEBA A HACERLO CON UN MENU, HECHO POR MÍ ESTE
