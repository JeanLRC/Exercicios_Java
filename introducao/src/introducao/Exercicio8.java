/*
 * 8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
	percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
	Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
	escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
	consumidor.
 */

package introducao;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double cusFab, cusFin, percDis, imp;
		System.out.println("Entre com o custo de f�brica do veiculo: R$");
		cusFab = in.nextDouble();

		percDis = cusFab * 0.28;
		imp = cusFab * 0.45;

		cusFin = cusFab + percDis + imp;

		System.out.println("O custo do veiculo para o consumidor �: R$" + cusFin);
		in.close();
	}

}
