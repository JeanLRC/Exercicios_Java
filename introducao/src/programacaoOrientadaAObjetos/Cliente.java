package programacaoOrientadaAObjetos;

public class Cliente {
	String nome, endereco, email, telefone, cpf;
	int  idade;

	public void Status() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Email: " + this.email);
		System.out.println("Telefone: " + this.telefone);
		System.out.println("Endereço: " + this.endereco);

	}

}
