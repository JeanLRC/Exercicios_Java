/*
 * 6- Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
	final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
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
			System.out.println("Digite um n�mero: ");
			n = leia.nextInt();
			if (n % 3 == 0) {
				qtdM++;
				soma += n;
			}
		} while (n != 0);
		qtdM--;
		med = soma / qtdM;
		System.out.println("A m�dia dos n�meros multiplos de 3 foi " + med);
		leia.close();
	}

}
