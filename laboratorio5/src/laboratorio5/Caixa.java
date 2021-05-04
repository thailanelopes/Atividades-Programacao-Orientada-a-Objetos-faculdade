package laboratorio5;

public class Caixa extends Funcionario {
	private String horario;
	
	public Caixa(String nome, String telefone) {
		super(nome, telefone);
	}
	
	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	public String toString() {
		String txt = "\nHor�rio: " + this.horario;
		return super.toString() + txt;
	}

}
