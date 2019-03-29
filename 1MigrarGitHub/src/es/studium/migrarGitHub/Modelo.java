package es.studium.migrarGitHub;

public class Modelo {
	public void ContarPalabras(String escrito) {
		System.out.println(escrito.split("\\s+|\n").length);
	}
}
 