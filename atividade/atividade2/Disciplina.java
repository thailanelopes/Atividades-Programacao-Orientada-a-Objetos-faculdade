package atividade2;

public class Disciplina {
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public String nome;
	public double peso;
	public double nota;
	public double limite;
	
	public Disciplina(String nome, double peso, double nota, double limite) {
		this.nome = nome;
		this.peso = peso;
		this.nota = nota;
		this.limite = limite;
	}
}
