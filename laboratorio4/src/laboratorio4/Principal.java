package laboratorio4;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	
	public static void exercicio1() {
		ArrayList<Musica> musicas = new ArrayList<Musica>();
		Compositor jovemMaka = new Compositor("Makalister", "Brasileiro");
		
		Musica m = new Musica("Preciso Me Encontrar", 1999, "Samba", new Compositor("Cartola", "Brasileiro"));
		musicas.add(m);
		
		m = new Musica("Exercício de Elogios a Mulheres Que Amei", 2016, "Hip-Hop/Rap", jovemMaka);
		musicas.add(m);
		
		m = new Musica("Amores Perros", 2016, "Hip-Hop/Rap", jovemMaka);
		musicas.add(m);
	
		m = new Musica("O Tempo Nos Parece Mais Pesado Que o Físico", 2016, "Hip-Hop/Rap");
		m.setCompositores(jovemMaka);
		musicas.add(m);
		

        for (int i=0; i<musicas.size(); i++) {
            System.out.println(musicas.get(i));
        }		
	}

	
	public static void exercicio2() {
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		Departamento inf = new Departamento("Instituto de Informática", "INF");
		Curso si = new Curso("Sistemas de Informação", "SI", 5, inf); 
		
		
		Aluno a = new Aluno("Alana verissimo", "201812333", 2017, si);
		alunos.add(a);
		
		a = new Aluno("Thailane  Lopes Dutra", "201810133", 2018);
		a.setCurso(si);
		alunos.add(a);

		a = new Aluno("Beatriz Lopes Dutra", "20202364", 2020, new Curso("Ciências Sociais", "CS", 2, new Departamento("Instituto das humanidades", "FCHF")));
		alunos.add(a);
		
		
        for (int i=0; i<alunos.size(); i++) {
            System.out.println(alunos.get(i));
        }		
	}

	
	public static void exercicio3() {
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		
		Cliente a = new Cliente("Alana verissimo", "038899555", new Endereco("C-131", 0, "QD 262-1 LT 09", "Jardim América", "Goiânia", "Goiás"));
		clientes.add(a);
	
		a = new Cliente("Thailane  Lopes Dutra", "333335555", new Endereco("Q-24", 22, "lote 2", "Vila itatiaia", "Goiânia", "Goiás"));
		clientes.add(a);
		
		
        for (int i=0; i<clientes.size(); i++) {
            System.out.println(clientes.get(i));
        }		
	}

	
	public static void exercicio4() {
		ArrayList<Empregado> empregados = new ArrayList<Empregado>();
		
		Empregado e = new Empregado("Thailane  Lopes Dutra", "333335555", new Empresa("Ministério Publico", "88332580002885", new Endereco("R-23", 24, "Qd. A 06, Lts. 15/24", "Jardim Goiás", "Goiânia", "Goiás")));
		empregados.add(e);
		
		
        for (int i=0; i<empregados.size(); i++) {
            System.out.println(empregados.get(i));
        }		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int op = 0;
		
		String menu = "Digite a opção do menu: \n" 
				+ "[1] - Exercício Músicas\n"
				+ "[2] - Exercício Alunos\n"
				+ "[3] - Exercício Clientes\n"
				+ "[4] - Exercício Empregado\n";
		
		System.out.println(menu);
		
		op = sc.nextInt();
		
		switch (op) {
			case 1:
				exercicio1();
				break;
			case 2:
				exercicio2();
				break;
			case 3:
				exercicio3();
				break;
			case 4:
				exercicio4();
				break;
			default:
				System.out.println("Opção inválida!");
				
				
				sc.close();
		}
		
	}
	
	

}