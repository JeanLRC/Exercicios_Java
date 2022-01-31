package programacaoOrientadaAObjetos;

public class Banco {
	String banco, conta, agencia, nome, cpf;

	public void Status() {
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Banco: " + this.banco);
		System.out.println("Agencia: " + this.agencia);
		System.out.println("Conta: " + this.conta);
	}
}
