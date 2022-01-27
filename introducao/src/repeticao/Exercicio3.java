/*
 	3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		21 anos. Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
 */

package repeticao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		int idade, tPMe21 = 0, tPMa50 = 0;
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();

		while (idade != -99) {
			if (idade < 21) {
				tPMe21++;
			} else if (idade > 50) {
				tPMa50++;
			}
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
		}
		System.out.println("O total de pessoas com menos de 21 anos é: " + tPMe21);
		System.out.println("O total de pessoas com mais  de 50 anos é: " + tPMa50);
		leia.close();

	}

}
