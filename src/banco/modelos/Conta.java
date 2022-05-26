package banco.modelos;

import banco.modelos.interfaces.IConta;

public abstract class Conta implements IConta {

	private static int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	private int agencia;
	private int numero;
	private double saldo;
	private String tipoConta;
	private Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	@Override
	public void sacar(double valor) {
		if(valor > 0) {
			this.saldo -= valor;
		}
	}

	@Override
	public void depositar(double valor) {
		if(valor > 0) {
			this.saldo += valor;
		}
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: R$%.2f", this.saldo));
		System.out.println();
	}

	@Override
	public String toString() {
		return "Conta [agencia = " + agencia + ", numero da conta = " + numero + ", tipo da conta = " + tipoConta + "]";
	}

	
}
