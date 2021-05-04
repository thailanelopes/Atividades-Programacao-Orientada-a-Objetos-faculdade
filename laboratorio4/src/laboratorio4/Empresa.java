package laboratorio4;

public class Empresa {
	String razao;
	String cnpj;
	Endereco endereco;
	
	Empresa(String razao, String cnpj, Endereco endereco) {
		this.razao = razao;
		this.cnpj = cnpj;
		this.endereco = endereco;
	}
	
	public String toString() {
		String txt = "Empresa: " + this.razao + " (" + this.cnpj + ")\n";
		txt = txt + "Endereço: " + this.endereco + "\n";
		
		return txt;
	}

}
