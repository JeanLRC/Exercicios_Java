/*
 * 5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
	aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
	respectivamente.
 */

package introducao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double n1, n2, n3, media;
		System.out.println("Digite as notas: ");
		n1 = in.nextDouble();
		n2 = in.nextDouble();
		n3 = in.nextDouble();

		media = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;
		System.out.println("A média foi: " + media);
		in.close();
	}

}
