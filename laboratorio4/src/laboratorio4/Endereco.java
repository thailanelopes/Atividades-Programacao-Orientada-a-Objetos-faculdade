package laboratorio4;

public class Endereco {
	String rua;
	int numero;
	String complemento;
	String bairro;
	String cidade;
	String estado;
	
	Endereco(String rua, int numero, String complemento, String bairro, String cidade, String estado) {
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	public String toString() {
		String txt = this.rua + ", " + this.numero + ", " + this.complemento + " - " + this.bairro + " - " + this.cidade + " - " + this.estado; 
		
		return txt;
	}

}
