package atividade2;

import java.util.ArrayList;

public class Aluno extends Pessoa {
	public int matricula;
	public ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	public Aluno(String nome, int matricula) {
		super(nome);
		this.matricula = matricula;
	}
	
	public double calculaMedia() {
		double media = 0;		
		double notas = 0;
		double pesos = 0;
		
		for (int i=0; i<disciplinas.size(); i++) {
			notas += disciplinas.get(i).nota * disciplinas.get(i).peso;
			pesos += disciplinas.get(i).peso;
		}
		
		if (pesos != 0) {
			media = notas/pesos;
		}
		
		return media;
	}
	
	public boolean aprovado(){
		double resultado = calculaMedia();
		boolean aprovado = true;
		
		for (int i=0; i<disciplinas.size(); i++) {
			if (disciplinas.get(i).nota < disciplinas.get(i).limite) {
				aprovado = false;
			}
		}
		
		if ( resultado >= 6 && aprovado == true ) {
			return true;
		}else {
			return false;
		}
	}
	
	public String toString() {
		String resultado = "Aluno: "
	+nome+
	"  Média Geral: "
	+calculaMedia()+
	"  Situação: ";
		if ( aprovado() == true) {
			resultado = resultado + "Aprovado";
		} else {
			resultado = resultado + "Reprovado";
		}
		
		return resultado;
	}
}
