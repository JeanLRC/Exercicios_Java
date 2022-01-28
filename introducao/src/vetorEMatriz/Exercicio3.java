/*
 *	 3. Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
		a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
		b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.
 */

package vetorEMatriz;

import java.util.Random;

public class Exercicio3 {

	public static void main(String[] args) {
		Random n = new Random();
		// Declarando Matrizes
		int n1[][] = new int[4][6], n2[][] = new int[4][6];
		int m1[][] = new int[4][6], m2[][] = new int[4][6];
		int x, y;

		for (x = 0; x < 4; x++) { // Preenchendo a matriz N1 com números aleatórios
			for (y = 0; y < 6; y++) {
				n1[x][y] = n.nextInt(20);
			}
		}
		System.out.println("\n___________________________________");
		System.out.println("\tMatriz N1");
		for (x = 0; x < 4; x++) { // Mostrando a matriz N1
			for (y = 0; y < 6; y++) {
				System.out.printf("\t" + n1[x][y]);
			}
			System.out.println("");
		}
		for (x = 0; x < 4; x++) { // Preenchendo a matriz N2 com números aleatórios
			for (y = 0; y < 6; y++) {
				n2[x][y] = n.nextInt(20);
			}
		}
		System.out.println("\n___________________________________");
		System.out.println("\n\tMatriz N2");
		for (x = 0; x < 4; x++) { // Mostrando a matriz N2
			for (y = 0; y < 6; y++) {
				System.out.printf("\t" + n2[x][y]);
			}
			System.out.println("");
		}
		for (x = 0; x < 4; x++) { // Preenchendo a matriz M1 com a soma dos valores de mesma posição das matrizes
									// N1 e N2
			for (y = 0; y < 6; y++) {
				m1[x][y] = n1[x][y] + n2[x][y];
			}
		}
		System.out.println("\n___________________________________");
		System.out.println("\nMatriz M1 soma de N1 e N2");
		for (x = 0; x < 4; x++) // Mostrando a matriz M1
		{
			for (y = 0; y < 6; y++) {
				System.out.printf("\t" + m1[x][y]);
			}
			System.out.println("");
		}
		for (x = 0; x < 4; x++) { // Preenchendo a matriz M2 com a subtração dos valores de mesma posição das
									// matrizes N1 e N2

			for (y = 0; y < 6; y++) {
				m2[x][y] = n1[x][y] - n2[x][y];
			}
		}
		System.out.println("\n___________________________________");
		System.out.println("\nMatriz M2 subtração de N1 por N2");
		for (x = 0; x < 4; x++) // Mostrando a matriz M2
		{
			for (y = 0; y < 6; y++) {
				System.out.printf("\t" + m2[x][y]);
			}
			System.out.println("");
		}
	}

}
