package prova1;

public class Saque {
	private String descricao;
	private double valor;
	private int dia;
	
	Saque(String descricao, double valor, int dia){
		this.descricao = descricao;
		this.valor = valor;
		this.dia = dia;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public double getValor() {
		return this.valor;
	}
	
	public int getDia() {
		return this.dia;
	}
	
	public String toString() {
		return this.dia + " - " + this.descricao + " - " + this.valor;
	}

}
