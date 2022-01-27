/*
  	3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
		expressa em segundos e mostre-o expresso em horas, minutos e segundos.
 */

package introducao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		int hora, min, sec, secTotal;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite a duração do evento em segundos: ");
		secTotal = in.nextInt();
		hora = secTotal / 3600;
		min = (secTotal % 3600) / 60;
		sec = (secTotal % 3600) % 60;

		System.out.println("O evento durou " + hora + " Horas " + min + " Minutos e " + sec + " Segundos");
		in.close();
	}

}
