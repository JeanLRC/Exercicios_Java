/*
 * 	6. Construa um programa em c que, tendo como dados de entrada dois pontos
	quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a dist�ncia entre eles. A f�rmula
 	que efetua tal c�lculo �: d = raiz�(x2-x1)�+(y2-y1)�
 */

package introducao;
import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double x1, x2, y1, y2, Dist;
		System.out.println("Digite as coordenadas de inicio: ");
		x1 = in.nextDouble();
		y1 = in.nextDouble();
		System.out.println("Agora digite as coordenadas de destino: ");
		x2 = in.nextDouble();
		y2 = in.nextDouble();
		Dist = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1, 2));
		System.out.println("A dist�ncia entre os pontos �: "+Dist);
		in.close();
	}

}
