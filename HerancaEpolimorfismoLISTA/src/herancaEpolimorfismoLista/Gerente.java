package herancaEpolimorfismoLista;

public class Gerente extends Funcionario {
	private double salario;
	private double bonificacao;
	
	Gerente(String nome, String sobrenome) {
		super(nome, sobrenome);
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void setBonificacao(double bonificacao) {
		this.bonificacao = bonificacao;
	}

	public double getSalario() {
		return this.salario;
	}

	public double getBonificacao() {
		return this.bonificacao;
	}
	
	public String toString() {
		return super.toString() + "\nSal�rio: " + this.getSalario() + "\nBonifica��o: " + this.getBonificacao();
	}
}
