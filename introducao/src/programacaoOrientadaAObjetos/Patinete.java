package programacaoOrientadaAObjetos;

public class Patinete {
	String cor, Material;
	boolean Eletrico;

	public void Status() {
		System.out.println("\nO patinete � de " + this.Material);
		System.out.println("A cor do patinete � " + this.cor);
		System.out.println("O patinete � eletrico? " + this.Eletrico);
	}
}
