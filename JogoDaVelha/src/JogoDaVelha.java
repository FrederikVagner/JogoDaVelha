import tabuleiro.Tabuleiro;
import tabuleiro.Tipo;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author frederik
 */
public class JogoDaVelha {

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		Tabuleiro tab = new Tabuleiro();
		try {
			tab.pirnt();
			tab.setElemento(2, 1, Tipo.X);
			tab.pirnt();
			tab.setElemento(2, 0, Tipo.X);
			tab.setElemento(2, 2, Tipo.X);
			tab.pirnt();
			System.out.println(tab.vitoria(2, 2, Tipo.X));
		} catch (Exception e) {

		}
	}
}
