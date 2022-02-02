package heranca;

public class Cachorro2 extends Animal2 {
	String corre;

	public String getCorre() {
		return corre;
	}

	public void setCorre(String corre) {
		this.corre = corre;
	}

	@Override
	public void emitirSom() {
		System.out.println("O cachorro late");
	}
}
