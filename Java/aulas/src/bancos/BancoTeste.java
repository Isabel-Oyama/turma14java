package bancos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BancoTeste {

	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		char op;// visivel em todo o programa - escopo
		char saida;
		int numeroConta = 0; // escopo global
		List<Conta> contas = new ArrayList<>();

		System.out.println("BANCO G2Bank");
		do {
			System.out.println("1 - Abertura de conta: ");
			System.out.println("2 - Acesso a uma conta existente: ");
			System.out.println("3 - Sair: ");
			op = leia.next().charAt(0);
			if (op == '1') {
				System.out.println("1 - Conta Poupança");
				System.out.println("2 - Conta Corrente");
				System.out.println("3 - Conta Especial");
				System.out.println("4 - Conta Empresa");
				System.out.println("5 - conta Universitaria");
				System.out.print("Digite o numero de sua opção: ");
				char opconta = leia.next().charAt(0);
				numeroConta++;
				System.out.println("Digite o seu CPF:");
				String cpfConta = leia.next();
				switch (opconta) {
				case '1': {
					System.out.print("Digite a data de aniversario da conta: ");
					int dataAniversario = leia.nextInt();
					ContaPoupanca poupanca = new ContaPoupanca(numeroConta, cpfConta, dataAniversario);
					contas.add(poupanca);
					System.out.println("Numero da conta criada: " + numeroConta++);
				}
					break;

				case '2': {
					System.out.print("Digite a quantidade de talão de cheque: ");
					int numeroTalaoCheque = leia.nextInt();
					ContaCorrente corrente = new ContaCorrente(numeroConta, cpfConta);
					contas.add(corrente);
					System.out.println("Numero da conta criada: " + numeroConta++);
				}
					break;

				case '3': {
					System.out.print("Insira o valor do Limite do Cliente: R$ ");
					double valorLimite = leia.nextDouble();
					ContaEspecial especial = new ContaEspecial(numeroConta, cpfConta, valorLimite);
					especial.registraLimite();
					contas.add(especial);
					System.out.println("Numero da conta criada: " + numeroConta++);
				}
					break;

				case '4': {
					System.out.print("Insira o valor do emprestimo disponivel: R$ ");
					double valorEmprestimo = leia.nextDouble();
					ContaEmpresarial empresarial = new ContaEmpresarial(numeroConta, cpfConta, valorEmprestimo);
					contas.add(empresarial);
					System.out.println("Numero da conta criada: " + numeroConta++);
				
				}
					break;

				case '5': {
					System.out.println("WIP");
				}
					break;
				}

			} else if (op == '2') {
				System.out.println("Digite o numero da conta");
				numeroConta = leia.nextInt();
				Conta conta = null;
				try {
					conta = contas.get(numeroConta - 1);

					saudacao(conta);

					if (conta instanceof ContaEspecial) {
						menuContaEspecial((ContaEspecial) conta);
					} else if (conta instanceof ContaPoupanca) {
						menuContaPoupanca((ContaPoupanca) conta);
					} else if (conta instanceof ContaEmpresarial) {
						menuContaEmpresarial((ContaEmpresarial) conta);
					} else if (conta instanceof ContaCorrente) {
						menuContaCorrente((ContaCorrente) conta);
					} 

				} catch (Exception e) {
					System.out.println("Conta não encontrada!");
				}
			} else {

			}
			System.out.println("Continua S/N");
			saida = leia.next().toUpperCase().charAt(0);
			if (saida == 'N') {
				break;
			}

		} while (true);

	}


	private static void saudacao(Conta conta) {
		System.out.println("Seja bem vindo ao G2Bank!");
		System.out.printf("\nCPF: %s", conta.getCpf());
		System.out.printf("\nSeu saldo atual é de: R$ %.2f", conta.getSaldo());
	}

	private static void menuContaEspecial(ContaEspecial conta) {
		for (int i = 0; i < 10; i++) {
			System.out.println();
			System.out.println("Conta Especial Nº " + conta.getNumeroConta());
			System.out.println("Digite a opção de transação");
			System.out.println("1 - Movimentação ");
			System.out.println("2 - Saldo ");
			System.out.println("0 - Sair");
			int opcao = leia.nextInt();
			if (opcao == 1) {
				System.out.println("Saldo: R$ " + conta.getSaldo());
				System.out.println("Valor do Limite: R$ " + conta.getValorLimite());
				System.out.println("Limite Usado: R$ " + (conta.getValorCadastroLimite() - conta.getValorLimite()));
				System.out.println("Digite a opção de transação");
				System.out.println("1 - Crédito ");
				System.out.println("2 - Débito ");
				System.out.println("0 - Sair");
				opcao = leia.nextInt();
						if(opcao == 1) {
							System.out.println("Digite o valor a ser creditado");
							conta.devolverLimite(leia.nextDouble());
							System.out.println("Saldo: R$ " + conta.getSaldo());
							System.out.println("Valor do Limite: R$ " + conta.getValorLimite());
							System.out.println("Limite Usado: R$ " + (conta.getValorCadastroLimite() - conta.getValorLimite()));
						}
						else if(opcao == 2) {
							System.out.println("Digite o valor a ser debitado");
							conta.debito(leia.nextDouble()); 
							System.out.println("Saldo: R$ " + conta.getSaldo());
							System.out.println("Valor do Limite: R$ " + conta.getValorLimite());
							System.out.println("Limite Usado: R$ " + (conta.getValorCadastroLimite() - conta.getValorLimite()));	
						}
						else if (opcao == 0) {
							return;
						}
			}
			else if (opcao == 2) {
				System.out.println("Saldo: R$ " + conta.getSaldo());
				System.out.println("Valor do Limite: R$ " + conta.getValorLimite());
			} 
			else if (opcao == 0) {
				System.out.println("Encerrando acesso a conta");
				return;
			}
		}
	}

	private static void menuContaCorrente(ContaCorrente conta) {
		for (int i = 0; i < 10; i++) {
			System.out.println();
			System.out.println("Conta Corrente Nº " + conta.getNumeroConta());
			System.out.println("\n1 - Movimento");
			System.out.println("2 - Saldo");
			System.out.println("3 - Talão de cheque");
			System.out.println("0 - Sair");
			System.out.println();
			System.out.println("Digite a opção:");
			int opcao = leia.nextInt();
			if (opcao == 1) {
				menuMovimento(conta);
			} else if (opcao == 2) {
				System.out.printf("\nSaldo Atual: R$ %.2f", conta.getSaldo());
			} else if (opcao == 3) {
				System.out.println("\nDigite o Talão: ");
				int talao = leia.nextInt();
				System.out.println("Digite o total de talões");
				int totalTalao = leia.nextInt();
				//conta.talao(talao, totalTalao);
			} else {
				return;
			}
		}
	}

	private static void menuContaPoupanca(ContaPoupanca conta) {
		for (int i = 0; i < 10; i++) {
			System.out.println();
			System.out.println("Conta Poupança Nº " + conta.getNumeroConta());
			System.out.println("\n1 - Movimento");
			System.out.println("2 - Saldo");
			System.out.println("3 - Aniversário");
			System.out.println("0 - Sair");
			System.out.println();
			System.out.println("Digite a opção:");
			int opcao = leia.nextInt();
			if (opcao == 1) {
				menuMovimento(conta);
			} else if (opcao == 2) {
				System.out.printf("\nSaldo Atual: R$ %.2f", conta.getSaldo());
			} else if (opcao == 3) {
				System.out.println("\nDigite a data de hoje");
				int data = leia.nextInt();
				conta.correcaoPoupanca(data);
				System.out.printf("\nSaldo atual: R$ %.2f", conta.getSaldo());
			} else {
				return;
			}
		}
	}

	private static void menuContaEmpresarial(ContaEmpresarial conta) {
		for (int i = 0; i < 10; i++) {
			System.out.println();
			System.out.println("Conta Empresa Nº " + conta.getNumeroConta());
			System.out.println("\n1 - Movimento");
			System.out.println("2 - Saldo");
			System.out.println("3 - Empréstimo");
			System.out.println("0 - Sair");
			System.out.println();
			System.out.println("Digite a opção:");
			int opcao = leia.nextInt();
			if (opcao == 1) {
				menuMovimento(conta);
			} else if (opcao == 2) {
				conta.mostrarSaldos();
			} else if (opcao == 3) {
				conta.perguntarEmprestimo();
			} else {
				return;
			}
		}
	}

	private static void menuMovimento(Conta conta) {
		for (int i = 0; i < 10; i++) {
			System.out.println("\nMovimento");
			System.out.println("1 - Crédito");
			System.out.println("2 - Débito");
			System.out.println("0 - Sair");
			int opcaoMovimento = leia.nextInt();
			if (opcaoMovimento == 1) {
				System.out.println("\nQuanto deseja creditar: ");
				double valorCredito = leia.nextDouble();
				conta.credito(valorCredito);
				System.out.printf("Saldo atual: R$ %.2f", conta.getSaldo());
			} else if (opcaoMovimento == 2) {
				System.out.println("\nQuanto deseja debitar: ");
				double valorDebito = leia.nextDouble();
				if (conta.testarSaldo(valorDebito)) {
					conta.debito(valorDebito);
				} else {
					System.out.println("Saldo insuficiente!");
				}
				System.out.printf("Saldo atual: R$ %.2f", conta.getSaldo());
			} else {
				System.out.println("Saindo da movimentação...");
				break;
			}
		}
	}

}