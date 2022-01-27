/*
 * 8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
	percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
	Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
	escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
	consumidor.
 */

package introducao;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double cusFab, cusFin, percDis, imp;
		System.out.println("Entre com o custo de fábrica do veiculo: R$");
		cusFab = in.nextDouble();

		percDis = cusFab * 0.28;
		imp = cusFab * 0.45;

		cusFin = cusFab + percDis + imp;

		System.out.println("O custo do veiculo para o consumidor é: R$" + cusFin);
		in.close();
	}

}
