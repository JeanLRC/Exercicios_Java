/*
 	2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
 */

package repeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int x, par = 0, imp = 0, n;

		for (x = 0; x < 10; x++) {
			System.out.println("Digite um número: ");
			n = leia.nextInt();
			if (n % 2 == 0) {
				par++;
			} else {
				imp++;
			}
		}
		System.out.println("Dos números informados: " + par + " eram par e " + imp + " eram impares.");
		leia.close();
	}
}
