package herancaEpolimorfismo;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class TestaConta {
	
	public static void main(String[] args) {
		int op;
		
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog("Escolha o exercício (1-Console ou 2-JOptionPane)"));

			if (op==1) {
				ex1();
			}
			else {
				ex2();
			}
		} while (op!=1 && op!=2);
	}  
	
	public static void ex1() {
		Conta cc = new ContaCorrente(1, new Cliente("Renato gomes Almeida", "(62) 97008452"));
		cc.depositar(20);
		System.out.println(cc);
		cc.sacar(600);
		System.out.println(cc + "\n");
		
		Conta cp = new ContaPoupanca(5, new Cliente("Angélica Lima de Castro", "(64) 934099933"));
		cp.sacar(600);
		System.out.println(cp);
		cp.depositar(200);
		System.out.println(cp);
		((ContaPoupanca) cp).atualizaSaldo(4);
		System.out.println(cp + "\n");
		
		ContaSalario cs = new ContaSalario(22, new Cliente("Helington Araujo Jorge", "(62) 93998748"));
		cs.depositar(900);
		System.out.println(cs);
		cs.sacar(cs.getSaldo() * 0.85);
		System.out.println(cs);
		cs.transferir(22, cp);
		System.out.println(cs);
	}
	
	public static void ex2() {
		Conta conta = null;
		ArrayList<Conta> contas = new ArrayList<Conta>();
		int tipoConta;
		int codigo;
		String nome, telefone;
		
		do {
			tipoConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo da Conta (1-Corrente: , 2-Salário:  ou 3-Poupança: )"));
			
			if (tipoConta!=0) {
				codigo    = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da Conta: "));
				nome      = JOptionPane.showInputDialog("Digite seu nome: ");
				telefone  = JOptionPane.showInputDialog("Digite seu telefone: ");
				
				switch (tipoConta) {
				case 1:
					conta = new ContaCorrente(codigo, new Cliente(nome, telefone));
					break;
				case 2:
					conta = new ContaSalario(codigo, new Cliente(nome, telefone));
					break;
				case 3:
					conta = new ContaPoupanca(codigo, new Cliente(nome, telefone));
					break;
				default:
					break;
				}
				
				contas.add(conta);
			}
			
		} while (tipoConta!=0);	
		
		for (int i=0; i<contas.size(); i++) {
			System.out.println(contas.get(i));
		}
	}
	
}
