package banco.modelos.interfaces;

import java.util.List;

import banco.modelos.Conta;

public interface IBanco {

	void imprimirContas(List<Conta> listaDeContas);
	void imprimirClientes(List<Conta> listaDeContas);
}
