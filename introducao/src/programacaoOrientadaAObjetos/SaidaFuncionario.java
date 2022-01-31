/*
 * 4) Crie uma classe funcionário e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto funcionário, defina as
instancias deste objeto e apresente as informações deste objeto no
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
