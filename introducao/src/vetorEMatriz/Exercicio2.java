/*
 *	 2. Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
		que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
		imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
		quantas foram as ocorr�ncias da maior pontua��o.
 */

package vetorEMatriz;

import java.util.Random;

public class Exercicio2 {

	public static void main(String[] args) {
		int vet[] = new int[10], maior = 0, soma = 0, qtdM = 0;
		float med;
		Random rolls = new Random();

		for (int x = 0; x < 10; x++) {
			vet[x] = rolls.nextInt(20) + 1;
			soma += x;
			if (vet[x] > maior) {
				maior = vet[x];
			}
		}
		med = soma / 10;
		for (int x = 0; x < 10; x++) {
			System.out.println("A " + (x + 1) + "� jogada foi: " + vet[x]);
			if (vet[x] == maior) {
				qtdM++;
			}
		}
		System.out.println("A m�dia aritm�tica dos dados foi: " + med);
		System.out.println("O maior dado " + maior + " caiu " + qtdM + " Vez(es)");
	}

}
