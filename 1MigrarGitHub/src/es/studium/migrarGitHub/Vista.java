package es.studium.migrarGitHub;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;

public class Vista extends Frame {


	private static final long serialVersionUID = 1L;

	TextArea texto = new TextArea();
	Label etiqueta = new Label("Etiqueta");
	Button boton = new Button("Botón");
	
	Panel panel1 = new Panel();
	Panel panel2 = new Panel();
	
	Vista(){
	setTitle("Soy algo");
	setSize(300,300);
	setLocationRelativeTo(null);
	setLayout(new GridLayout(2,1));
	panel1.add(texto);
	panel2.add(etiqueta);
	panel2.add(boton);
	add(panel1);
	add(panel2);
	setResizable(false);
	setVisible(true);
	}

}
