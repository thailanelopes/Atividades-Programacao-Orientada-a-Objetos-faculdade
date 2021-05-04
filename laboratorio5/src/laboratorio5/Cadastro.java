package laboratorio5;

import java.util.ArrayList;
import java.text.NumberFormat;

public class Cadastro {
	public static String formataMoeda(double valor) {
		return NumberFormat.getCurrencyInstance().format(valor);
	}
	
	public static void main(String[] args) {
		Caixa funcCaixa = new Caixa("Amanda Vieira Lelis", "(62) 99985-2547");
		funcCaixa.setHorario("08:00-18:00");
		funcCaixa.setSalario(1500);
		funcCaixa.aumentoDeSalario(10);
		System.out.println(funcCaixa + "\nRecebimento anual: " + formataMoeda(funcCaixa.totalSalarioAnual()) +"\n");

		Gerente funcGerente = new Gerente("Alice Santos", "(62) 99918-9267");
		funcGerente.setSalario(3000);
		funcGerente.setBonificacao(500);
		funcGerente.setTipo("PJ");
		funcGerente.aumentoDeSalario(20);
		System.out.println(funcGerente + "\nRecebimento anual: " + formataMoeda(funcGerente.totalSalarioAnual()) +"\n");
		

		Cliente cliente1 = new Cliente("Cristian Cardoso", "(62) 99922-2788", 22, "066666666");
		System.out.println("\n" + cliente1 + "\n");

		Cliente cliente2 = new Cliente("Thailane Lopes Dutra", "(62) 98133-1322", 23, "70399518193");
		System.out.println(cliente2 + "\n");

		Cliente cliente3 = new Cliente("Amanda Sousa", "(64) 97777-7777", 30, "022222222");
		cliente3.desativar();
		System.out.println(cliente3 + "\n");
		
		

		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		
		Cliente c = new Cliente("Cristian Cardoso", "(62) 99922-2788", 22, "066666666");
		clientes.add(c);
		
		c = new Cliente("Thailane Lopes Dutra", "(62) 98133-1322", 23, "70399518193");
		clientes.add(c);
		
		c = new Cliente("Amanda Sousa", "(64) 97777-7777", 30, "022222222");
		c.desativar();
		clientes.add(c);
		
		for (int i=0; i<clientes.size(); i++) {
			System.out.println(clientes.get(i));
		}
		
	
	}
}
