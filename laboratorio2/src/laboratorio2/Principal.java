package laboratorio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList <Funcionario> listaFuncionarios = new ArrayList<Funcionario>();
		
		Funcionario func1 = new Funcionario("Amanda Vieira Lelis", "00053232397", "001");
		func1.setSalario(2000);
	    func1.aumentoDeSalario(30);
	    listaFuncionarios.add(func1);
	    listaFuncionarios.get(0);
	    
	    
	    
		
	    Funcionario func2 = new Funcionario("Geovane Bastos", "00053232397", "001");
		func1.setSalario(1000);
	    func1.aumentoDeSalario(30);
	    listaFuncionarios.add(func2);
	    listaFuncionarios.get(1);
	    
	    
		sc.close();

	}

	
	}


