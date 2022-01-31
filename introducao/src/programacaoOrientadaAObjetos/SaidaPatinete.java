package programacaoOrientadaAObjetos;

public class SaidaPatinete {

	public static void main(String[] args) {

		Patinete P1 = new Patinete();

		P1.Material = "Plastico";
		P1.cor = "Rosa";
		P1.Eletrico = false;

		P1.Status();
		
		Patinete P2 = new Patinete();
		
		P2.cor= "Prata";
		P2.Material= "Metal";
		P2.Eletrico= true;
		
		P2.Status();
	}

}
