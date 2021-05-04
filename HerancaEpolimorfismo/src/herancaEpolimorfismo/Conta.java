package herancaEpolimorfismo;

import java.text.DecimalFormat;

public abstract class Conta {
	protected int numero;
	protected Cliente dono;
	protected double saldo;
	
	Conta (int numero, Cliente dono) {
		this.numero = numero;
		this.dono = dono;
		this.saldo = 0;
	}
	
	public void sacar(double valor) {
		saldo = saldo - valor;
	}
	
	public void depositar(double valor) {
		saldo = saldo + valor;
	}
	
	public abstract void transferir(double valor, Conta destino);
	
	public void setSaldo(double valor) {
		saldo = valor;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public String toString() {
		DecimalFormat def = new DecimalFormat("#0.00");
		
		String txt = "Numero: " + this.numero + "  Cliente: " + dono.getNome() + " - ";
		txt = txt + dono.getTelefone() + " Saldo: " + def.format(saldo); 
		
		return txt;
	}
}