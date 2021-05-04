package herancaEpolimorfismoLista;

public class Administrador extends Funcionario {
	private double salario;
	
	Administrador(String nome, String sobrenome) {
		super(nome, sobrenome);
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getSalario() {
		return this.salario;
	}
	
	public String toString() {
		return super.toString() + "\nSalário: " + this.getSalario();
	}
}
