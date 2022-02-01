package heranca;

public class Animal {

	private String nome;
	private int idade;
	private String emiteSom;

	public String getEmiteSom() {
		return emiteSom;
	}

	public void setEmiteSom(String emiteSom) {
		this.emiteSom = emiteSom;
	}

	public void emitirSom() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void Status() {
		System.out.println("O nome do animal é "+this.getNome());
		System.out.println("Tem "+this.getIdade()+" anos!");
		System.out.println("O som que ele faz é: "+this.getEmiteSom());
	}

}
