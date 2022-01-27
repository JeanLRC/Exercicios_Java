/*
 * 4. Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
calcule a seguinte expressão:   D= (R+S)/2, onde R =(A+B)² e S= (B+C)²  
 */

package introducao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		double A, B, C, R, S, D;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite três números inteiros positivos: ");
		A = in.nextDouble();
		B = in.nextDouble();
		C = in.nextDouble();

		R = Math.pow((A + B), 2);
		S = Math.pow((B + C), 2);
		D = (R + S) / 2;
		System.out.println("O Resultado final é: " + D);
		in.close();
	}

}
