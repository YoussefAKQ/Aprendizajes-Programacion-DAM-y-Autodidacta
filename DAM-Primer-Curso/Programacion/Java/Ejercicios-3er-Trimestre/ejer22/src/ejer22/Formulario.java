package ejer22;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;


public class Formulario extends JFrame implements ActionListener, ChangeListener{
	private JCheckBox box1,box2,box3;
	public Formulario() {
		setLayout(null);
		box1 = new JCheckBox("Windows");
		box1.setBounds(10,50,100,30);
		box1.addChangeListener(this);
		add(box1);
		box2 = new JCheckBox("Linux");
		box2.setBounds(10,50,100,30);
		box2.addChangeListener(this);
		add(box1);
		box3 = new JCheckBox("MacOS");
		box3.setBounds(10,50,100,30);
		box3.addChangeListener(this);
		add(box3);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e) {
			
		}
	}

}
