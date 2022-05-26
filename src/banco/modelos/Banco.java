package banco.modelos;

import java.util.List;

import banco.modelos.interfaces.IBanco;

public class Banco implements IBanco {

	private String nome;
	private List<Conta> contas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	@Override
	public void imprimirContas(List<Conta> listaDeContas) {
		System.out.println("====     Lista de Contas Criadas     ====");
		for(Conta conta : listaDeContas) { 
			System.out.println(conta);
		}
		System.out.println();
	}

	@Override
	public void imprimirClientes(List<Conta> listaDeContas) {
		System.out.println("===    Lista de Clientes do Banco    ===");
		for(Conta conta : listaDeContas) { 
			System.out.println("Nome: " + conta.getCliente().getNome() + ", tipo de conta: " + conta.getTipoConta());
		}
		System.out.println();
	}
	
}
