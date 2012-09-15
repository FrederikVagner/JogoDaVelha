/**
 * 
 */
package tabuleiro;

/**
 * @author frederik
 *
 */
public enum Tipo {
	VAZIO(' '),
	X('x'),
	O('o');
	
	final private char nome;
	
	private Tipo(char str) {
		nome = str;
	}
}
