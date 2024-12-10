package ejer17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener {
	private JMenuBar mb;
	private JMenu menu1;
	private JMenuItem m1, m2, m3;
	
	public Formulario() {
		setLayout(null);
		mb = new JMenuBar();
		setJMenuBar(mb);
		menu1 = new JMenu("Opciones");
		mb.add(menu1);
		m1 = new JMenuItem("Rojo");
		m1.addActionListener(this);
		menu1.add(m1);
		m2=new JMenuItem("Verde");
		m2.addActionListener(this);
		///Inventado por mí ya que estoy ciego a partir de aquí hasta ///
		menu1.add(m2);
		m3 = new JMenuItem("Azul");
		m3.addActionListener(this);
		menu1.add(m3);
		///
	}
	
	public void actionPerformed(ActionEvent e) {
		Container f = this.getContentPane();
		if (e.getSource()==m1) {
			f.setBackground(new Color(255,0,0));
		}
		if (e.getSource()==m2) {
			f.setBackground(new Color(0,255,0));
		}
		if (e.getSource()==m3) {
			f.setBackground(new Color(0,0,255));
		}
	}
	
	public static void main(String[] args) {
		Formulario formulario1 = new Formulario();
		formulario1.setBounds(0,10,200,300);
		formulario1.setVisible(true);
		formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
