/*
 * 	1) Crie uma classe cliente e apresente os atributos e métodos referentes
		esta classe, em seguida crie um objeto cliente, defina as instancias deste
		objeto e apresente as informações deste objeto no console.
 */

package programacaoOrientadaAObjetos;

//import java.util.Scanner;

public class SaidaCliente {
	public static void main(String[] args) {
		// Scanner leia = new Scanner(System.in);
		// String nome, endereco, email, telefone, cpf;
		// int idade;

		// System.out.println("Informe seu nome:");
		// nome = leia.next();
		// System.out.println("");

		Cliente c1 = new Cliente();

		c1.nome = "Loren Ipsun";
		c1.cpf = "192.168.0.1";
		c1.telefone = "40028922";
		c1.endereco = "Rua dos Bobos, Nº0";
		c1.email = "abc@def.com";
		c1.idade = 22;
		c1.Status();

	}

}
