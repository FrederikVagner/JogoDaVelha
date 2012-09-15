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
		// checar por linha
		if (tabuleiro[i][0] == t && tabuleiro[i][1] == t
				&& tabuleiro[i][2] == t)
			return true;
		// checar por coluna
		if (tabuleiro[0][j] == t && tabuleiro[1][j] == t
				&& tabuleiro[2][j] == t)
			return true;
		// checa diagonal principal
		if (tabuleiro[0][0] == t && tabuleiro[1][1] == t
				&& tabuleiro[2][2] == t)
			return true;
		// checa anti diagonal
		if (tabuleiro[0][2] == t && tabuleiro[1][1] == t
				&& tabuleiro[2][0] == t)
			return true;
		return false;
	}

	public boolean gameover() {
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				if (tabuleiro[i][j] == Tipo.VAZIO)
					return false;
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
