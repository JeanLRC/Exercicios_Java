package programacaoOrientadaAObjetos;

public class Aviao {
	int qtdTurb, qtdA, qtdFunc;
	String modelo;

	public void Status() {
		System.out.println("Modelo do Avião: "+modelo);
		System.out.println("Quantidade de assentos: "+qtdA);
		System.out.println("Quantidade de turbinas: "+qtdTurb);
		System.out.println("Quantidade de Funcionarios: "+qtdFunc);

	}
}
