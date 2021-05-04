package laboratorio5;

public class Pessoa {
	private String nome;
	private String telefone;
	
	public Pessoa(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}
	
	public String toString() {
		return this.nome + " - Tel: " + this.telefone;
	}
}
