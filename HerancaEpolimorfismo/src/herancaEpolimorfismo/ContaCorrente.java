package herancaEpolimorfismo;

public class ContaCorrente extends Conta {
	private double taxa;
	
	ContaCorrente(int numero, Cliente dono) {
		super(numero, dono);
		this.taxa = 0.05;
	}
	
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
	public double getTaxa() {
		return this.taxa;
	}
	
	public void sacar(double valor) {
		super.sacar(valor);
		super.sacar(this.taxa);
	}
	
	public void depositar(double valor) {
		super.depositar(valor);
		super.sacar(this.taxa);
	}
	
	public void transferir(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.sacar(valor);
			destino.depositar(valor);
		}
	}
}
    
