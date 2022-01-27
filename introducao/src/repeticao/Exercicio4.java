/*
 * 4- Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;
 o número de mulheres nervosas;..
 o número de homens agressivos;..
 o número de outros calmos;..
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos.
 */

package repeticao;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		int idade, sexo, opc, hA = 0, mN = 0, oC = 0, nMa40 = 0, cMe18 = 0, x = 1;
		int f = 0, m = 0, o = 0, c = 0, n = 0, a = 0;
		Scanner leia = new Scanner(System.in);

		while (x <= 5) {
			System.out.println("\tIndice da " + x + "ª pessoa!");
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			System.out.println("Escolha seu sexo sendo, 1-Feminino, 2-Masculino, 3-Outros: ");
			sexo = leia.nextInt();
			switch (sexo) {
			case 1:
				f++;
				break;
			case 2:
				m++;
				break;
			case 3:
				o++;
				break;
			default:
				System.out.println("Opção inválida.");
				break;
			}
			System.out.println("Escolha qual você se considera sendo, 1-Calma, 2-Nervosa, 3-Agressiva");
			opc = leia.nextInt();
			switch (opc) {
			case 1:
				c++;
				break;
			case 2:
				n++;
				break;
			case 3:
				a++;
				break;
			default:
				System.out.println("Opção Invalida!");
				break;
			}
			if (sexo == 1 && opc == 2) {
				mN++;
			}
			if (sexo == 2 && opc == 3) {
				hA++;
			}
			if (sexo == 3 && opc == 1) {
				oC++;
			}
			if (opc == n && idade >= 40) {
				nMa40++;
			}
			if (opc == 1 && idade <= 18) {
				cMe18++;
			}
			x++;
		}
		System.out.println("O número de pessoas calmas é: " + c);
		System.out.println("O número de mulheres nervosas é: " + mN);
		System.out.println("O número de homens agressivos é: " + hA);
		System.out.println("O número de outros calmos é: " + oC);
		System.out.println("O número de pessoas com mais de 40 anos nervosas é: " + nMa40);
		System.out.println("O número de pessoas com menos de 18 anos calmas é: " + cMe18);
	}

}
