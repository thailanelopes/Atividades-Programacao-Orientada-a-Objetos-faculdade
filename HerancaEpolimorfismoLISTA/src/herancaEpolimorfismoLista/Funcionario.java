
package herancaEpolimorfismoLista;

public class Funcionario {
	private String nome;
	private String sobrenome;
	
	Funcionario(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	public String toString() {
		return "Funcion�rio: " + this.nome + " " + this.sobrenome;
	}
}
