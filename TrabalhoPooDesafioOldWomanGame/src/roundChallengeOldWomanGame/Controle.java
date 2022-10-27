package roundChallengeOldWomanGame;

import java.util.Scanner;

public class Controle {
	Scanner scanf = new Scanner(System.in);
	private String jogo[][] = { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "9" } }; // proteger a matriz
																							// apenas,sem getters e
																							// setters

	String Exibir() {
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.print("   " + jogo[linha][coluna]);// exibe o tabuleiro de posiçoes
			}
			System.out.println("\n");

		}
		return null;
	}

	public boolean Confere(String posicao) {// se e VALIDO
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) { // verifica se ja nao tem marcado o mesmo lugar
				if (jogo[linha][coluna].equals(posicao)) {
					return true;

				}

			}
		}
		return false;
	}

	void Jogada(String posicao, String Jogador) {
		if (posicao.equals("1")) {
			jogo[0][0] = Jogador;

		} else if (posicao.equals("2")) {
			jogo[0][1] = Jogador;

		} else if (posicao.equals("3")) {
			jogo[0][2] = Jogador;

		} else if (posicao.equals("4")) { // marca as jogadas no tabuleiro,x ou o
			jogo[1][0] = Jogador;

		} else if (posicao.equals("5")) {
			jogo[1][1] = Jogador;

		} else if (posicao.equals("6")) {
			jogo[1][2] = Jogador;

		} else if (posicao.equals("7")) {
			jogo[2][0] = Jogador;

		} else if (posicao.equals("8")) {
			jogo[2][1] = Jogador;

		} else if (posicao.equals("9")) {
			jogo[2][2] = Jogador;

		}
	}

	String Vencedor(int jogadas) {
		String[] Possibilidades = new String[8];
		String winner = "null"; // quando der velha
		if (jogadas == 9) {
			winner = "Empate! ";

		}

		Possibilidades[0] = jogo[0][0] + jogo[0][1] + jogo[0][2];
		Possibilidades[1] = jogo[1][0] + jogo[1][1] + jogo[1][2]; // linhas
		Possibilidades[2] = jogo[2][0] + jogo[2][1] + jogo[2][2];

		Possibilidades[3] = jogo[0][0] + jogo[1][0] + jogo[2][0];
		Possibilidades[4] = jogo[0][1] + jogo[1][1] + jogo[2][1];// colunas //combinaçoes possiveis para vencer o jogo
		Possibilidades[5] = jogo[0][2] + jogo[1][2] + jogo[2][2];

		Possibilidades[6] = jogo[0][0] + jogo[1][1] + jogo[2][2];
		Possibilidades[7] = jogo[0][2] + jogo[1][1] + jogo[2][0];// diagonais
		for (int i = 0; i < Possibilidades.length; i++) {
			if (Possibilidades[i].equals("xxx")) {
				winner = "Venceu jogador(a) 1!"; // Definindo Vencedor

			} else if (Possibilidades[i].equals("ooo")) {
				winner = "Venceu jogador(a) 2!";

			}

		}
		return winner;
	}
}
