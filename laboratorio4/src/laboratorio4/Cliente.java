package laboratorio4;

public class Cliente {
	String nome;
	String cpf;
	Endereco end;
	
	Cliente(String nome, String cpf, Endereco end) {
		this.nome = nome;
		this.cpf = cpf;
		this.end = end;
	}
	
	public String toString() {
		String txt = "Cliente: " + this.nome + " (" + this.cpf + ")\n";
		txt = txt + "Endereço: " + this.end + "\n";
		
		return txt;
	}
	
}


