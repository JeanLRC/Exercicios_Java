/*
 	2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
 */

package repeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int x, par = 0, imp = 0, n;

		for (x = 0; x < 10; x++) {
			System.out.println("Digite um n�mero: ");
			n = leia.nextInt();
			if (n % 2 == 0) {
				par++;
			} else {
				imp++;
			}
		}
		System.out.println("Dos n�meros informados: " + par + " eram par e " + imp + " eram impares.");
		leia.close();
	}
}
