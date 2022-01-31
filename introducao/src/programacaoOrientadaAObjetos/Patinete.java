package programacaoOrientadaAObjetos;

public class Patinete {
	String cor, Material;
	boolean Eletrico;

	public void Status() {
		System.out.println("\nO patinete é de " + this.Material);
		System.out.println("A cor do patinete é " + this.cor);
		System.out.println("O patinete é eletrico? " + this.Eletrico);
	}
}
