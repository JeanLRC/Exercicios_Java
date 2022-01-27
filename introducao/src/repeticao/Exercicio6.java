/*
 * 6- Escrever um programa que receba vários números inteiros no teclado. E no
	final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
 */

package repeticao;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n, soma = 0, qtdM = 0;
		float med;
		System.out.println("Para terminar o programa digite 0(zero)");
		do {
			System.out.println("Digite um número: ");
			n = leia.nextInt();
			if (n % 3 == 0) {
				qtdM++;
				soma += n;
			}
		} while (n != 0);
		qtdM--;
		med = soma / qtdM;
		System.out.println("A média dos números multiplos de 3 foi " + med);
		leia.close();
	}

}
