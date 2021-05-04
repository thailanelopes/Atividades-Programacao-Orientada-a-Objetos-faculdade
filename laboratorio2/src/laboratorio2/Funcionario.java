package laboratorio2;

public class Funcionario {
	private String cpf;
	private String matricula;
	private String nome;
	private String cargo;
	private double salario;
	private String departamento;
	
	

	public Funcionario(String nome, String cpf, String matricula){
		this.nome = nome;
		this.cpf = cpf;
		this.matricula = matricula;
		
		
	}
	
	

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void aumentoDeSalario(double percentual) {
		this.salario = this.salario * (1 + percentual / 100);
		
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public String toString() {
		return "Matricula: " + matricula + 
				"CPF: " + cpf + 
				"Nome: " + nome + 
				"Cargo: " + cargo + 
				"departamento: " + departamento + ".";
	}

}
