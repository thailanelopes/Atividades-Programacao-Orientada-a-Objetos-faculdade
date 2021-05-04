package herancaEpolimorfismoLista;

public class Comissionado extends Funcionario {
	private double salario;
	private double totalVendas;
	private double percentualComissao;
	
	Comissionado(String nome, String sobrenome) {
		super(nome, sobrenome);
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}
	
	public void setPercentualComissao(double percentualComissao) {
		this.percentualComissao = percentualComissao;
	}

	public double getSalario() {
		return this.salario;
	}

	public double getTotalVendas() {
		return this.totalVendas;
	}

	public double getPercentualComissao() {
		return this.percentualComissao;
	}

	public double getValorComissao() {
		return this.totalVendas * this.percentualComissao / 100;
	}
	
	public String toString() {
		return super.toString() + "\nSalário: " + this.getSalario() + "\nTotal de Vendas: " + this.getTotalVendas() + "\nComissão: " + this.getValorComissao();
	}
}
