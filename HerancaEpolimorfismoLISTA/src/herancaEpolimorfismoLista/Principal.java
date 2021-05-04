package herancaEpolimorfismoLista;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Funcionario> funcs = new ArrayList<Funcionario>();
		Administrador adm; 
		Gerente ger; 
		Comissionado com; 
		Horista hor; 
		int i;
		double v = 0.10;
		
		for (i=0; i<5; i++) {
			adm = new Administrador("ADMINISTRADOR", Integer.toString(i+1));
			adm.setSalario(1000);
			
			funcs.add(adm);
		}
		
		for (i=0; i<1; i++) {
			ger = new Gerente("GERENTE", Integer.toString(i+1));
			ger.setSalario(1500 * (1 + v));
			ger.setBonificacao(400);

			funcs.add(ger);
		}
		
		for (i=0; i<3; i++) {
			com = new Comissionado("COMISSIONADO", Integer.toString(i+1));
			com.setSalario(900 * (1 + v));
			com.setTotalVendas(30000);
			com.setPercentualComissao(1.5);

			funcs.add(com);
		}
		
		v = 0.15;
		for (i=0; i<2; i++) {
			hor = new Horista("HORISTA", Integer.toString(i+1));
			hor.setQtdHoras(12 * 20);
			hor.setVrHora(8 * (1 + v));

			v = 0.10;

			funcs.add(hor);
		}
		
		
		for (i=0; i<funcs.size(); i++) {
			System.out.println(funcs.get(i)+"\n");
		}
		
	}

}
