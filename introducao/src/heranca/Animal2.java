package heranca;

public class Animal2 {

	private String nome;
	private int idade;

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

	public void emitirSom() {
		System.out.println("Som Genérico...");
	}

	public void status() {
		System.out.println(this.getNome());
		System.out.println(this.getIdade());
	}

}
