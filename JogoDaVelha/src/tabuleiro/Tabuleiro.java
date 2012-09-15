/**
 * 
 */
package tabuleiro;

/**
 * @author frederik
 * 
 */
public class Tabuleiro {
	private Tipo[][] tabuleiro;

	public Tabuleiro() {
		tabuleiro = new Tipo[3][3];
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				tabuleiro[i][j] = Tipo.VAZIO;
	}

	public void pirnt() {
		System.out.println("\'" + tabuleiro[0][0].getNome() + ","
				+ tabuleiro[0][1].getNome() + "," + tabuleiro[0][2].getNome());
		System.out.println(" " + tabuleiro[1][0].getNome() + ","
				+ tabuleiro[1][1].getNome() + "," + tabuleiro[1][2].getNome());
		System.out.println(" " + tabuleiro[0][0].getNome() + ","
				+ tabuleiro[0][1].getNome() + "," + tabuleiro[1][2].getNome()
				+ "\'");
	}
}
