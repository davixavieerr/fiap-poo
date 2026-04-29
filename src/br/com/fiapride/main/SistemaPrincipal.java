package br.com.fiapride.main;

import br.com.fiapride.model.Passageiro;
import br.com.fiapride.model.Oculos;

public class SistemaPrincipal {

	public static void main(String[] args) {
		Oculos meuOculos = new Oculos();
		
		meuOculos.estaLimpo = false;
		meuOculos.hastesAbertas = false;
		
		System.out.println("--- Testando meu Óculos ---");
		meuOculos.abrirFecharOculos();
		meuOculos.limparOculos();
		
		meuOculos.limparOculos();
		
		System.out.println("\n===================================\n");
		
		Passageiro passageiro1 = new Passageiro("Ana Silva", "222");
		System.out.println("Regarga passageiro 1");
		passageiro1.adicionarSaldo(50.0);
		
		Passageiro passageiro2 = new Passageiro("Carlos Souza", "333");
		System.out.println("Regarga passageiro 2");
		passageiro2.adicionarSaldo(12.5);
		
		System.out.println("--- Sistema FiapRide ---");
		System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$" + passageiro1.saldo + " | CPF: " + passageiro1.cpf);
		System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$ " + passageiro2.saldo + " | CPF: " + passageiro2.cpf);
			
		System.out.println("Pagando viagem do passageiro 1");
		passageiro1.pagarViagem(20);
		System.out.println("Pagando viagem do passageiro 1");
		passageiro1.pagarViagem(20);
	}

}
