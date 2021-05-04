package laboratório1;

public class Produto {
	String nome;
	String tipo;
	int codigo;
	int quantidade;
	double valor;
	static int contador = 0;
	
	Produto(){
		contador++;
		this.codigo = contador;
	}
	
	Produto(String nome, int quantidade, String tipo, double valor){
		contador++;
		this.nome = nome;
		this.quantidade = quantidade;
		this.tipo = tipo;
		this.valor = valor;
		
	}
	
	void vendido(int quant){
		if (this.quantidade >= quant) {
			quantidade = quantidade - quant;
			double valorTotal = valor * quant;
			System.out.println("Total da venda : " + valorTotal);
		}
		else
			System.out.println("Não há quantidade disponível em estoque ");
	}
	void venda(int quant) {
		 quantidade = quantidade + quant;
	}
	
	void venda(int quant, double valoratual) {
		quantidade = quantidade + quant;
		valor = valoratual;
		
	}
	
	String verificar(){
		return "Codigo: "+ codigo + 
				"Nome: "+ nome +
				"Tipo: " +tipo +
				"Quantidade: " + quantidade +
				"Valor: " + valor;
	}
	
	void adicionar(String nome, String tipo, int quantidade, double valor) {
		this.nome = nome;
		this.tipo = tipo;
		this.quantidade = quantidade;
		this.valor = valor;
	}
	
	boolean result(Produto prod1) {
		if (this.nome.equals(prod1.nome)&& this.tipo.equals(prod1.tipo))
			return true;
		else return false;
	}
}