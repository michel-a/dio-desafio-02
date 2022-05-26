package banco;

import java.util.ArrayList;
import java.util.List;

import banco.modelos.Banco;
import banco.modelos.Cliente;
import banco.modelos.Conta;
import banco.modelos.ContaCorrente;
import banco.modelos.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		Cliente cliente01 = new Cliente();
		cliente01.setNome("Michel");
		
		Cliente cliente02 = new Cliente();
		cliente02.setNome("Luana");

		Cliente cliente03 = new Cliente();
		cliente03.setNome("Bianca");
		
		Conta cc = new ContaCorrente(cliente01);
		Conta poupanca01 = new ContaPoupanca(cliente02);
		Conta poupanca02 = new ContaPoupanca(cliente03);
		
		cc.depositar(100.0);
		cc.transferir(22, poupanca01);
		cc.transferir(8, poupanca02);

		cc.imprimirExtrato();
		poupanca01.imprimirExtrato();
		poupanca02.imprimirExtrato();
		
		Banco banco = new Banco();
		List<Conta> listaDeContas = new ArrayList<>();
		listaDeContas.add(cc);
		listaDeContas.add(poupanca01);
		listaDeContas.add(poupanca02);
		
		banco.setContas(listaDeContas);
		banco.imprimirContas(listaDeContas);
		banco.imprimirClientes(listaDeContas);
	}

}
