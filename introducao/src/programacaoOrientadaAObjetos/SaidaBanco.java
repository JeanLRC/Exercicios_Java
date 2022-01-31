/*
 *	 6) Crie uma classe conta bancaria e apresente os atributos e métodos
		referentes esta classe, em seguida crie um objeto conta bancaria, defina
		as instancias deste objeto e apresente as informações deste objeto no console.
 */

package programacaoOrientadaAObjetos;

public class SaidaBanco {

	public static void main(String[] args) {
		
		Banco B1 =new Banco();
		
		B1.nome="Qwerty";
		B1.cpf="123456789";
		B1.banco="Itta";
		B1.agencia="12335";
		B1.conta="1234";
		
		B1.Status();

	}

}
