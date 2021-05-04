package laboratorio4;

public class Aluno {
	String nome;
	String matricula;
	int ano;
  	Curso curso;
  	
  	public Aluno(String nome, String matricula, int ano) {
  		this.nome = nome;
  		this.matricula = matricula;
  		this.ano = ano;  		
  	}
  	
  	public Aluno(String nome, String matricula, int ano, Curso curso) {
  		this.nome = nome;
  		this.matricula = matricula;
  		this.ano = ano;  		
  		this.curso = curso;
  	}
  	
  	void setCurso(Curso curso) {
  		this.curso = curso;
  	}
  	
  	public String toString() {
		String txt = "Aluno: " + this.nome + " (" + this.matricula + ")" + "\n";
		txt = txt + curso;

		return txt;
  	}

}
