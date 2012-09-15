/**
 * 
 */
package tabuleiro;

/**
 * @author frederik
 * 
 */
public class Tabuleiro {
	static private Tabuleiro tab;

	static public Tabuleiro getInstance() {
		if (tab == null)
			tab = new Tabuleiro();
		return tab;
	}

	private Tipo[][] tabuleiro;

	private Tabuleiro() {
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

	public Estado estadojogo() {
		if (vitoria(Tipo.X))
			return Estado.VITX;
		if (vitoria(Tipo.O))
			return Estado.VITO;
		return gameover();
	}

	private boolean vitoria(Tipo t) {
		// checar por linha
		for (int i = 0; i < 3; i++) {
			if (tabuleiro[i][0] == t && tabuleiro[i][1] == t
					&& tabuleiro[i][2] == t)
				return true;
		}
		// checar por coluna
		for (int j = 0; j < 3; j++) {
			if (tabuleiro[0][j] == t && tabuleiro[1][j] == t
					&& tabuleiro[2][j] == t)
				return true;
		}
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

	public Estado gameover() {
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				if (tabuleiro[i][j] == Tipo.VAZIO)
					return Estado.EMJOGO;
		return Estado.GAMEOVER;
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
