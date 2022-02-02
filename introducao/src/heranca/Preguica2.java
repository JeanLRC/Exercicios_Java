package heranca;

public class Preguica2 extends Animal2 {
	String escArv;

	public String getEscArv() {
		return escArv;
	}

	public void setEscArv(String escArv) {
		this.escArv = escArv;
	}

	@Override
	public void emitirSom() {
		System.out.println("A preguiça faz:  A gente vai morrer");
	}
}
