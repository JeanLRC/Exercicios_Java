/*
 *	 4. Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
		em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
		diagonal, ou seja, diagonal principal.
 */

package vetorEMatriz;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int m[][] = new int[3][3], somaT = 0, sDP = 0, x, y;
		for (x = 0; x < 3; x++) {
			for (y = 0; y < 3; y++) {
				System.out.println("Digite um número: ");
				m[x][y] = leia.nextInt();
				somaT += m[x][y];
				if (x == y) {
					sDP += m[x][y];
				}
			}
		}
		for(x=0;x<3;x++)
		{
			for(y=0;y<3;y++)
			{
				System.out.printf("\t" + m[x][y]);
			}
			System.out.println("");
		}
		System.out.println("A soma dos valores da matriz é: " + somaT);
		System.out.println("A soma dos valores da diagonal principal é: " + sDP);
	}

}
