package programacaoOrientadaAObjetos;

public class Paciente {
	String nome, cpf, tratamento;
	double custo;

	public void Status() {
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
		System.out.println("O tratamento feito foi de: " + this.tratamento);
		System.out.println("Custo total do tratamento: R$" + this.custo);
	}
}
