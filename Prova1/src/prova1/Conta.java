 package prova1;
 
import java.util.ArrayList;

public class Conta {
	
	private String nome;
	private double saldo;
	int mes;
	private ArrayList <Deposito> depositos = new ArrayList<Deposito>();
	private ArrayList <Saque> saques = new ArrayList<Saque>();
	
	Conta (String nome, int mes, double saldo) {
		this.nome = nome;
		this.saldo = saldo;
		this.mes = mes;
	}
	
	void adicionaDeposito(String descricao,  double valor) {
		depositos.add(new Deposito(descricao, valor));
	}
	
	void adicionaDeposito(String descricao, double valor, String cpf) {
		depositos.add(new DepositoIdentificado(descricao, valor, cpf));
	}
		
	double totalSaldo() {
		double total = saldo;
		for (int i=0;i<depositos.size();i++) {
			total = total + depositos.get(i).getValor();
		}
		return total;
	}
	
	double saldoRestante() {
		double valor = saldo;

		for (int i=0; i<depositos.size(); i++) {
			valor = valor + depositos.get(i).getValor();
		}

		for (int i=0; i<saques.size(); i++) {
			valor = valor - saques.get(i).getValor();
		}
		
		return valor;
	}
	
	boolean adicionaSaque(int dia, String descricao, double valor) {
		double saldo = saldoRestante();
		
		if (saldo >= valor) {
			saques.add(new Saque(descricao, valor, dia));
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		String dadosConta = nome + " - Mês : " + mes + "\n" + "Saldo : " + saldo + "\n";
		dadosConta = dadosConta + "Depositos : \n";
		for (int i=0;i<depositos.size();i++) {
			dadosConta = dadosConta + depositos.get(i) + "\n";
		}
		dadosConta = dadosConta + "Total DisponÌvel : " + totalSaldo()  + "\n";
		dadosConta = dadosConta + "Saques : \n";		
		for (int i=0; i<saques.size(); i++) {
			dadosConta = dadosConta + saques.get(i) + "\n";
		}
		dadosConta = dadosConta + "Saldo Restante : " + saldoRestante()  + "\n";
		return  dadosConta;
	}	
}
