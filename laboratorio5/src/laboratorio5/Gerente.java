package laboratorio5;

public class Gerente extends Funcionario {
	private double bonificacao;
	private String tipo;
	
	public Gerente(String nome, String telefone) {
		super(nome, telefone);
	}
	
	public void setBonificacao(double bonificacao) {
		this.bonificacao = bonificacao;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public double totalSalarioAnual() {
		return super.totalSalarioAnual() + this.bonificacao * 12;
	}
	
	public String toString() {
		String txt = "\nBonifica��o: " + Cadastro.formataMoeda(this.bonificacao) + " - Tipo: " + this.tipo;
		return super.toString() + txt;
	}

}
