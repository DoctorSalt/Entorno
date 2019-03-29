package es.studium.migrarGitHub;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Controlador implements WindowListener, ActionListener{

	private Vista Vista;
	private Modelo Modelo;

	public Controlador(Vista objVista, Modelo objModelo) {
		this.Vista = objVista;
		this.Modelo = objModelo; 
		objVista.boton.addActionListener(this);
		objVista.addWindowListener(this); 
	}
	@Override
	public void actionPerformed(ActionEvent evento) {
		if(Vista.boton.equals(evento.getSource())) {
			String escrito = Vista.texto.getText();
			Modelo.ContarPalabras(escrito);
		}		
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}



}
