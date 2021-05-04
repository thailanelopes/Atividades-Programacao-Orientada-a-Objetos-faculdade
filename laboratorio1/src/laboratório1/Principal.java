package laboratório1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Produto prod1 = new Produto();
		System.out.println("Informe o nome do produto: ");
		prod1.nome = sc.nextLine();
		System.out.println("Informe o tipo do produto: ");
		prod1.tipo = sc.nextLine();
		System.out.println("Informe o valor do produto: ");
		prod1.valor = sc.nextDouble();
		System.out.println("Informe a quantidade: ");
		prod1.quantidade = sc.nextInt();

		Produto prod2 = new Produto();
		
		System.out.println("Informe o nome do produto: ");
		prod2.nome = sc.nextLine();
		System.out.println("Informe o tipo do produto: ");
		prod2.tipo = sc.nextLine();
		System.out.println("Informe o valor do produto: ");
		prod2.valor = sc.nextDouble();
		System.out.println("Informe a quantidade: ");
		prod2.quantidade = sc.nextInt();

		System.out.println("Primero produto : ");
		System.out.println(prod1.verificar());
		
		System.out.println("Segundo produto : ");
		System.out.println(prod1.verificar());

		System.out.println("Solicitado 10 Primeiro produto: ");
		prod1.venda(20);
		System.out.println(prod1.verificar());
		System.out.println("Solicitado 5 do Primeiro produto: ");
		prod1.venda(10);
		System.out.println(prod1.verificar());
		System.out.println("Solicitado 15 valor atualizado");
		prod2.venda(8);
		System.out.println(prod2.verificar());

		System.out.println("Consultar se são equivalentes");

		if (prod1.equals(prod2))
			System.out.println("Equivalentes");
		else
			System.out.println("Diferentes");

		sc.close();

	}

}
