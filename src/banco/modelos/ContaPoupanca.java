package banco.modelos;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		setTipoConta("Conta Poupanca");
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato " + getTipoConta() + " ===");
		imprimirInfosComuns();
	}

}
