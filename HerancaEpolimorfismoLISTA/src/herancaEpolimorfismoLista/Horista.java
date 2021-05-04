package herancaEpolimorfismoLista;

public class Horista extends Funcionario {
	private double qtdHoras;
	private double vrHora;
	
	Horista(String nome, String sobrenome) {
		super(nome, sobrenome);
	}
	
	public void setQtdHoras(double qtdHoras) {
		this.qtdHoras = qtdHoras;
	}
	
	public void setVrHora(double vrHora) {
		this.vrHora = vrHora;
	}

	public double getQtdHoras() {
		return this.qtdHoras;
	}

	public double getVrHora() {
		return this.vrHora;
	}

	public double getVrTotal() {
		return this.qtdHoras * this.vrHora;
	}
	
	public String toString() {
		return super.toString() + "\nQtd Horas: " + this.getQtdHoras() + "\nVr Hora: " + this.getVrHora() + "\nVr Total: " + this.getVrTotal();
	}
}
