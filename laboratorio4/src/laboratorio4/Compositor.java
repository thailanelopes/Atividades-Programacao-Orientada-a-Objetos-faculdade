package laboratorio4;

public class Compositor {
	String nome;
	String nacionalidade;
	
	Compositor(String nome, String nacionalidade) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
	}
	
	public String toString() {
		return this.nome +	" - " +	this.nacionalidade;
	}

}
