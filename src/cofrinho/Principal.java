package cofrinho;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int opcao;
				
		Cofrinho cofrinho = new Cofrinho();
		
		Moeda moeda;
		int tipoMoeda;
		double valor;
		
		try {
			System.out.println("----------------------------------");
			System.out.println("|              Menu              |");
			System.out.println("----------------------------------");
			System.out.println("|          1 - Investir          |");
			System.out.println("|          2 - Sacar Valor       |");
			System.out.println("|          3 - Extrato           |");
			System.out.println("|  4 - Saldo Total em Reais(R$)  |");			
			System.out.println("|          0 - Sair              |");
			System.out.println("----------------------------------");
			System.out.println("");
			opcao=teclado.nextInt();
		
			// Fica no loop até o usuário encerrar
			while (opcao != 0) {
				switch(opcao) {
				
				// Investir / Inserir
				case 1:
					tipoMoeda = 0;
					while(tipoMoeda > 3 || tipoMoeda <= 0) {
						System.out.println("Qual será a moeda do seu aporte?");
						System.out.println("1 - Real");
						System.out.println("2 - Dólar");
						System.out.println("3 - Euro");
						System.out.println("");
						tipoMoeda = teclado.nextInt();
					}
					System.out.println("Qual o valor do aporte?");				
					valor = teclado.nextDouble();
					
					moeda = null;
					if(tipoMoeda==1) {
						moeda = new Real(valor);
					}
					else if (tipoMoeda==2) {
						moeda = new Dolar(valor);
					}
					else {
						moeda = new Euro(valor);
					}
					
					cofrinho.adicionar(moeda);
					System.out.println("Aporte realizado com sucesso!");
					System.out.println("");
					break;
					
				// Sacar / Remover
				case 2:
					tipoMoeda = 0;
					while(tipoMoeda > 3 || tipoMoeda <= 0) {
						System.out.println("De qual moeda será o saque?");
						System.out.println("1 - Real");
						System.out.println("2 - Dólar");
						System.out.println("3 - Euro");
						System.out.println("");
						tipoMoeda = teclado.nextInt();
					}

					System.out.println("Qual o valor do saque?");
					valor = teclado.nextDouble();
	
					moeda = null;
					if(tipoMoeda==1) {
						moeda = new Real(valor);
					}
					else if (tipoMoeda==2) {
						moeda = new Dolar(valor);
					}
					else {
						moeda = new Euro(valor);
					}
				
					cofrinho.remover(moeda);
					System.out.println("Saque realizado com sucesso!");
					System.out.println("");
					break;
					
				// Extrato / Listar
				case 3:
					cofrinho.listagemMoedas();
					break;
				
				// Converter	
				case 4:
					cofrinho.totalConvertido();
					break;
				default:
					System.out.println("Escolha uma opção válida!");
					System.out.println(""); // pular uma linha
					break;
				}
				
				System.out.println("");
				System.out.println("----------------------------------");
				System.out.println("|              Menu              |");
				System.out.println("----------------------------------");
				System.out.println("|          1 - Investir          |");
				System.out.println("|          2 - Sacar Valor       |");
				System.out.println("|          3 - Extrato           |");
				System.out.println("|  4 - Saldo Total em Reais(R$)  |");			
				System.out.println("|          0 - Sair              |");
				System.out.println("----------------------------------");
				System.out.println("");
				opcao=teclado.nextInt();
				
			}
		
		} finally {
			// Independentemente se houve erro ou não, ao sair do loop encerra o programa
			teclado.close();
			System.out.println("Programa Encerrado!");
		}	
	}

}
