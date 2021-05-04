package herancaEpolimorfismo;

public class ContaPoupanca extends Conta {
	
	ContaPoupanca(int numero, Cliente dono) {
		super(numero, dono);
	}
	
	public void atualizaSaldo(double percentual) {
		this.saldo = this.saldo * (1 + percentual / 100);
	}
	
	public void transferir(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.sacar(valor);
			destino.depositar(valor);
		}
	}
}
    
