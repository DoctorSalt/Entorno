package es.studium.migrarGitHub;

public class Principal {
	public static void main(String[] args) {
		Vista vis = new Vista();
		Modelo mod = new Modelo();
		new Controlador(vis, mod); 
	}
}
