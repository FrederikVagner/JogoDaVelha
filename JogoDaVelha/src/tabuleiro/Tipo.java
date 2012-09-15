/**
 * 
 */
package tabuleiro;

/**
 * @author frederik
 *
 */
public enum Tipo {
	VAZIO(" "),
	X("X"),
	O("O");
	
	private String nome;
	
	private Tipo(String str) {
		nome = str;
	}

	public String getNome() {
		return nome;
	}
}
