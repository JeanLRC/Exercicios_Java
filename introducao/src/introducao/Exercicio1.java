/*
  	1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
		dias e mostre-a expressa apenas em dias.
 */

package introducao;
import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int diasTotais;
		System.out.println("Informe sua idade em anos: ");			
		int anos = in.nextInt();
		System.out.println("Quantos meses: ");
		int meses = in.nextInt();
		System.out.println("Quantos dias: ");
		int dias = in.nextInt();
		
		diasTotais=(anos*365)+(meses*30)+dias;
		System.out.println("Sua idade em dias é: "+diasTotais);
		in.close();
	}

}
