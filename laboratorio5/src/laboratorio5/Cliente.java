package laboratorio5;

public class Cliente extends Pessoa {
	private int idade;
	private String cpf;
	private char status;
	
	public Cliente(String nome, String telefone, int idade, String cpf) {
		super(nome, telefone);
		
		this.idade = idade;
		this.cpf = cpf;
		this.status = 'A';
	}
	
	public void desativar() {
		this.status = this.status=='A' ? 'I' : this.status;
	}
	
	public String toString() {
		String txt = " - " + this.idade + " anos - CPF: " + this.cpf + " - " + (this.status == 'A' ? "ativo" : "inativo");
		return super.toString() + txt;
	}
}
