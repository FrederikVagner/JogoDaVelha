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

	public void setElemento(int i, int j, Tipo t)
			throws IndexOutOfBoundsException, IllegalAccessException {
		if (i > 2 || j > 2)
			throw new IndexOutOfBoundsException();
		if (tabuleiro[i][j] == Tipo.VAZIO)
			tabuleiro[i][j] = t;
		else
			throw new IllegalAccessException();
	}

	public boolean vitoria(int i, int j, Tipo t) {
		//checa diagonais:
		//chaca por linha
		for(int aj = 0; aj < 3; aj++){
			if (t != tabuleiro[i][aj])
				return false;
		}
		//checa por coluna
		for(int ai = 0; ai < 3; ai++){
			if (t != tabuleiro[ai][j])
				return false;
		}
		return true;
	}

	public void pirnt() {
		System.out.println("\'" + tabuleiro[0][0].getNome() + ","
				+ tabuleiro[0][1].getNome() + "," + tabuleiro[0][2].getNome());
		System.out.println(" " + tabuleiro[1][0].getNome() + ","
				+ tabuleiro[1][1].getNome() + "," + tabuleiro[1][2].getNome());
		System.out.println(" " + tabuleiro[2][0].getNome() + ","
				+ tabuleiro[2][1].getNome() + "," + tabuleiro[2][2].getNome()
				+ "\'");
	}
}
