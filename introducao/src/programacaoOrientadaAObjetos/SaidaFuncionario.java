/*
 * 4) Crie uma classe funcion�rio e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto funcion�rio, defina as
instancias deste objeto e apresente as informa��es deste objeto no
console.
 */

package programacaoOrientadaAObjetos;

public class SaidaFuncionario {

	public static void main(String[] args) {

		Funcionario F1 = new Funcionario();

		F1.nome = "Qwerty Asdf";
		F1.cpf = "123456789";
		F1.tel = "40028922";
		F1.email = "Aquele@la.com";

		F1.Status();

		Funcionario F2 = new Funcionario();

		F2.nome = "Loren Ipsun";
		F2.cpf = "987654321";
		F2.tel = "123456789";
		F2.email = "Email@Esse.com";

		F2.Status();

	}

}
