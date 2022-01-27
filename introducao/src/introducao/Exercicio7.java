/*
 * 7. Um sistema de equações lineares do tipo: ax+by = c | dx+ey = f , pode ser resolvido segundo mostrado abaixo :
 * X= (ce-bf)/(ae-bd)  Y= (af-cd)/(ae-bd)
 * 		Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os
		valores de x e y.
 */

package introducao;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double a, b, c, d, e, f, x, y;
		System.out.println("Digite os valores de A, B, C, D, E e F: ");
		a = in.nextDouble();
		b = in.nextDouble();
		c = in.nextDouble();
		d = in.nextDouble();
		e = in.nextDouble();
		f = in.nextDouble();

		x = (c * e - b * f) / (a * e - b * d);
		y = (a * f - c * d) / (a * e - b * d);
		System.out.println("O valor de X é: " + x);
		System.out.println("E o valor de Y é: " + y);
		in.close();
	}

}
