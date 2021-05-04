package laboratorio4;

public class Departamento {
	String nome;
	String sigla;
	
	public Departamento(String nome, String sigla) {
		this.nome = nome;
		this.sigla = sigla;
	}
	
	public String toString() {
		return this.nome +	" (" +	this.sigla + ")";
	}

}
