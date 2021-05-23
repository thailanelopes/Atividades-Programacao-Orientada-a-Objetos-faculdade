package atividade10;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		Empregado empregado1 = new Empregado("1", "Gabriela", 22);
		Empregado empregado2 = new Empregado("2", "Renata", 24);
		Veiculo moto = new Veiculo(7456, empregado1);
		Veiculo carro = new Veiculo(6203, empregado2);
		
		ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
		veiculos.add(carro);
		veiculos.add(moto);
		
		
		empregado1.setCodigo("3");
		empregado2.setNome("Carlos");
		moto.setPlaca(6203);
		carro.setPlaca(2500);
		
		
		for (int i=0; i<veiculos.size(); i++) {
			System.out.println( veiculos.get(i) );
		}
		
			
		for (int i=0; i<veiculos.size(); i++) {
			veiculos.get(i).imprimir();
		}
	}
}
