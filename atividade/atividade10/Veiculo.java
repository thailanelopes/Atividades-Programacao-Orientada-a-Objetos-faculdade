package atividade10;

public class Veiculo implements Modelo {
	private int placa;
	private Empregado responsavel;
	
	public Veiculo(int placa, Empregado responsavel){
		this.placa = placa;
		this.responsavel = responsavel;
	}
	
	public void imprimir() {
		System.out.println(this.toString());
	}
	
	public String toString() {
		return responsavel+"  Veiculo: " +placa;
	}

	public int getPlaca() {
		return placa;
	}

	public void setPlaca(int placa) {
		this.placa = placa;
	}

	public Empregado getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Empregado responsavel) {
		this.responsavel = responsavel;
	}
}
