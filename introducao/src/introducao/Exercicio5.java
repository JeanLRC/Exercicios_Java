/*
 * 5. Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
	aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
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
		System.out.println("A m�dia foi: " + media);
		in.close();
	}

}
