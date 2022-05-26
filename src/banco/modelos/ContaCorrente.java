package banco.modelos;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
		setTipoConta("Conta Corrente");
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato " + getTipoConta() + "  ===");
		imprimirInfosComuns();
	}

}
