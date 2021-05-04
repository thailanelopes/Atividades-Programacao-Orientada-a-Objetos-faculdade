package laboratorio4;

public class Empregado {
	String nome;
	String matricula;
	Empresa empresa;
	
	Empregado(String nome, String matricula, Empresa empresa) {
		this.nome = nome;
		this.matricula = matricula;
		this.empresa = empresa;
	}
	
	public String toString() {
		String txt = "Empregado: " + this.nome + " (" + this.matricula + ")\n";
		txt = txt + this.empresa;
		
		return txt;
	}

}
