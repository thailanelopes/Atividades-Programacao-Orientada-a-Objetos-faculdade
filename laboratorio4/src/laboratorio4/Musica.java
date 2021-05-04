package laboratorio4;

import java.util.ArrayList;

public class Musica {
	String nome;
	int ano;
	String tipo;
	ArrayList<Compositor> compositores = new ArrayList<Compositor>();
	
	
	Musica(String nome, int ano, String tipo) {
		this.nome = nome;
		this.ano = ano;
		this.tipo = tipo;
	}
	
	Musica(String nome, int ano, String tipo, Compositor compositor) {
		this.nome = nome;
		this.ano = ano;
		this.tipo = tipo;
		this.setCompositores(compositor);
	}

	void setCompositores(Compositor compositor) {
		this.compositores.add(compositor);
	}
	
	public String toString() {
		String txt = this.nome + ", " +	this.ano + ", " + this.tipo + "\n";
		txt = txt +	"Compositores: \n";
		
		for(int i=0; i<compositores.size(); i++) {
			txt = txt + compositores.get(i) + "\n";
		};
		
		return txt;
	}

}
