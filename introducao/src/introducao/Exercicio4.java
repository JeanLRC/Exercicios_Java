/*
 * 4. Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e
calcule a seguinte express�o:   D= (R+S)/2, onde R =(A+B)� e S= (B+C)�  
 */

package introducao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		double A, B, C, R, S, D;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite tr�s n�meros inteiros positivos: ");
		A = in.nextDouble();
		B = in.nextDouble();
		C = in.nextDouble();

		R = Math.pow((A + B), 2);
		S = Math.pow((B + C), 2);
		D = (R + S) / 2;
		System.out.println("O Resultado final �: " + D);
		in.close();
	}

}
