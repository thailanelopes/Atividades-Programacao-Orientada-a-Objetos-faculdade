package laboratorio5;

public class Funcionario extends Pessoa {
	private String cpf;
	private String matricula;
	private double salario;
	
	public Funcionario(String nome, String telefone) {
		super(nome, telefone);
	}
	
	public void setCPF(String cpf) {
		this.cpf = cpf;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void aumentoDeSalario(double percentual) {
		this.salario = this.salario * (1 + percentual / 100);
	}
	
	public double totalSalarioAnual() {
		return this.salario * 12;
	}
	
	public String toString() {
		String txt = " - CPF: " + this.cpf + " - Matr�cula: " + this.matricula;
		txt = txt + "\nSal�rio: " + Cadastro.formataMoeda(this.salario);
		return super.toString() + txt;
	}
}
