package prova1;

public class DepositoIdentificado extends Deposito {
	private String cpf;
	
	DepositoIdentificado(String descricao, double valor, String cpf) {
		super(descricao, valor);
		this.cpf = cpf;
	}
	
	public String toString() {
		return super.toString() + " - " + this.cpf;
	}

}
