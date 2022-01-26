/*
 	2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
		expressa em anos, meses e dias.
 */

package introducao;
import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Informe sua idade em dias: ");
		int diasTotais = in.nextInt();
		
		int dias,meses,anos;
		anos  = diasTotais/365;
		meses = (diasTotais%365)/30;
		dias  = (diasTotais%365)%30;
		System.out.println("Sua idade é: "+anos+" Anos "+meses+" meses"+" e "+dias+" dias");
		in.close();
	}

}
