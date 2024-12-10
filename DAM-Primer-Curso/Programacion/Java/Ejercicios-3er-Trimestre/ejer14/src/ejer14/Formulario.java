package ejer14;

import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ItemListener{
	private JComboBox<String>combo1;
	public Formulario() {
		setLayout(null);
		combo1=new JComboBox<String>();
		combo1.setBounds(10,10,80,20);
		add(combo1);
		combo1.addItem("Rojo");
		combo1.addItem("Azul");
		combo1.addItem("Morado");
		combo1.addItem("Marrón");
		combo1.addItem("Rosa");
		combo1.addItemListener(this);
		
	}
	
	public void itemStateChanged(ItemEvent e) {
		String seleccionado = (String)combo1.getSelectedItem();
		setTitle(seleccionado);
	}
	
	public static void main(String[] args) {
		Formulario formulario1 = new Formulario();
		formulario1.setBounds(0,0,300,300);
		formulario1.setVisible(true);
		formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
