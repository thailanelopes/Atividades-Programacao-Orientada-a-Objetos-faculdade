package herancaEpolimorfismo;

public class Cliente {
	private String nome;
	private String telefone;
	
	Cliente(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getTelefone() {
		return this.telefone;
	}
	
	public String toString() {
		return "Nome: " + this.nome + " Telefone: " + this.telefone;
	}
}
    
