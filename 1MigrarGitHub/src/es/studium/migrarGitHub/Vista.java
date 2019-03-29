package es.studium.migrarGitHub;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;

public class Vista extends Frame {

 
	private static final long serialVersionUID = 1L;

	TextArea texto = new TextArea(50,50);
	Label etiqueta = new Label("Contar Palabras");
	Button boton = new Button("Dale");
	
	Panel panel1 = new Panel();
	Panel panel2 = new Panel();
	
	Vista(){
	setTitle("Contar Palabras");
	setLocationRelativeTo(null);
	setLayout(new GridLayout(2,1));
	add(panel1);
	add(panel2);
	panel1.add(texto);
	panel2.add(etiqueta);
	panel2.add(boton);
	setSize(500,500);
	setResizable(false);
	setVisible(true);
	}

}
