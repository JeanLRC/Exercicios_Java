/*
 *	 2. Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
		que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
		imprima a média aritmética dos lançamentos, contabilize e apresente também
		quantas foram as ocorrências da maior pontuação.
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
			System.out.println("A " + (x + 1) + "ª jogada foi: " + vet[x]);
			if (vet[x] == maior) {
				qtdM++;
			}
		}
		System.out.println("A média aritmética dos dados foi: " + med);
		System.out.println("O maior dado " + maior + " caiu " + qtdM + " Vez(es)");
	}

}
