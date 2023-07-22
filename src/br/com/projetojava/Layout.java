package br.com.projetojava;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Container;

public class Layout  extends JFrame {
	public Layout() {
		
	
	super ("Meu Layout");
	
	Container c = getContentPane(); 
	c.add(BorderLayout.NORTH, new JButton("Botão Norte"));
	c.add(BorderLayout.SOUTH, new JButton("Botao Sul"));
	
	
	//getContentPane().add(new JButton("Botão Centralizado"));
	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300,300);
    setVisible(true);
	
	
	}
	
	public static void main(String[] args) {
		new Layout();
	}
}
