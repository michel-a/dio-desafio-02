package banco.modelos.interfaces;

import banco.modelos.Conta;

public interface IConta {

	void sacar(double valor);
	void depositar(double valor);
	void transferir(double valor, Conta contaDestino);
	void imprimirExtrato();
}
