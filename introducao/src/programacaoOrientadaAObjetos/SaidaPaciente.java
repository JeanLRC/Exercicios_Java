package programacaoOrientadaAObjetos;

public class SaidaPaciente {
	public static void main(String[] args) {

		Paciente P1 = new Paciente();

		P1.nome = "Loren";
		P1.cpf = "12345678";
		P1.tratamento = "Pele";
		P1.custo = 5367;

		P1.Status();
	}

}
