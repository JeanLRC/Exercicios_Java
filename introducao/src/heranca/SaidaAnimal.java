package heranca;

import java.util.Scanner;

public class SaidaAnimal {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String nome, som;
		int idade;

		Cachorro C1 = new Cachorro();

		System.out.println("Nome do Cachorro: ");
		nome = leia.next();
		C1.setNome(nome);
		System.out.println("Idade do cachorro:");
		idade = leia.nextInt();
		C1.setIdade(idade);
		System.out.println("Qual o som que faz: ");
		som = leia.next();
		C1.setEmiteSom(som);
		C1.Status();
		Cavalo V1 = new Cavalo();
		V1.setNome("Pé de Pano");
		V1.setIdade(15);
		V1.setEmiteSom("Relinchar");
		V1.Status();
		leia.close();
	}

}
