package laboratorio4;

import java.util.ArrayList;

public class Curso {
	String nome;
	String sigla;
	int duracao;
	ArrayList<Departamento> deptos = new ArrayList<Departamento>();
        Departamento depto;
	
	public Curso(String nome, String sigla, int duracao) {
		this.nome = nome;
		this.sigla = sigla;
		this.duracao = duracao;
	}
	
	public Curso(String nome, String sigla, int duracao, Departamento depto) {
		this.nome = nome;
		this.sigla = sigla;
		this.duracao = duracao;
		this.deptos.add(depto);
		this.depto = depto;
	}
	
	
	void setDepto(Departamento depto) {
		this.depto = depto;
	}
	
	public String toString1() {
		return "Cursando " + this.nome + " (" +	this.sigla + ")" + " - " + depto;
	}
	
	
	void setDeptos(Departamento depto) {
		this.deptos.add(depto);
	}
	
	public String toString() {
		String txt = "Cursando: " + this.nome + " (" + this.sigla + ")" + "\n";
		txt = txt + "Departamentos: \n";
		for(int i=0; i<deptos.size(); i++) {
			txt = txt + deptos.get(i) + "\n";
		}

		return txt;
	}

}
