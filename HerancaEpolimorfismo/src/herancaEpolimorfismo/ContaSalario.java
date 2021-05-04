package herancaEpolimorfismo;

public class ContaSalario extends ContaCorrente {
	
	ContaSalario(int numero, Cliente dono) {
		super(numero, dono);
		this.setTaxa(0.01);
	}
	
}
    
