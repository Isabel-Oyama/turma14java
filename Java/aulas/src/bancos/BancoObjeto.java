package bancos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BancoObjeto {

	public static Scanner leia = new Scanner(System.in);

	public static void main(String args[]) {

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
				System.out.println("1 - Conta Poupan�a");
				System.out.println("2 - Conta Corrente");
				System.out.println("3 - Conta Especial");
				System.out.println("4 - Conta Empresa");
				System.out.println("5 - conta Universitaria");
				System.out.print("Digite o numero de sua op��o: ");
				char opconta = leia.next().charAt(0);
				numeroConta++;
				System.out.println("Digite o seu CPF:");
				String cpfConta = leia.next();
				switch (opconta) {
				case '1': {
					System.out.println("Digite a data de aniversario da conta: ");
					int dataAniversario = leia.nextInt();
					ContaPoupanca poupanca = new ContaPoupanca(numeroConta, cpfConta, dataAniversario);
					contas.add(poupanca);
				}
					break;

				case '2': {
					System.out.println("Digite a quantidade de tal�o de cheque: ");
					int numeroTalaoCheque = leia.nextInt();
					ContaCorrente corrente = new ContaCorrente(numeroConta, cpfConta);
					contas.add(corrente);
				}
					break;

				case '3': {
					System.out.println("Insira o limite do cliente: ");
					double valorLimite = leia.nextDouble();
					ContaEspecial especial = new ContaEspecial(numeroConta, cpfConta, valorLimite);
					especial.registraLimite();
					contas.add(especial);
				}
					break;

				case '4': {
					System.out.println("O valor do seu emprestimo �: R$ 10000");
					ContaEmpresarial empresarial = new ContaEmpresarial(numeroConta, cpfConta, 10000);
					contas.add(empresarial);
				}
					break;

				case '5': {
					System.out.println("Insira o limite do cliente: ");
					double valorLimite = leia.nextDouble();
					System.out.println("O valor do seu emprestimo �: R$ 1000");
					ContaUniversitaria universitaria = new ContaUniversitaria(numeroConta, cpfConta, valorLimite, 1000);
					universitaria.registraLimite();
					contas.add(universitaria);
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

					if (conta instanceof ContaUniversitaria) {
						menuContaUniversitaria((ContaUniversitaria) conta);
					} else if (conta instanceof ContaEspecial) {
						menuContaEspecial((ContaEspecial) conta);
					} else if (conta instanceof ContaPoupanca) {
						menuContaPoupanca((ContaPoupanca) conta);
					} else if (conta instanceof ContaEmpresarial) {
						menuContaEmpresarial((ContaEmpresarial) conta);
					} else if (conta instanceof ContaCorrente) {
						menuContaCorrente((ContaCorrente) conta);
					}

				} catch (Exception e) {
					System.out.println("Conta n�o encontrada!");
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

	private static void menuContaUniversitaria(ContaUniversitaria conta) {
		for (int i = 0; i < 10; i++) {
			System.out.println();
			System.out.println("Conta Universit�ria");
			System.out.println("Digite a op��o de transa��o");
			System.out.println("1 - Movimenta��o ");
			System.out.println("2 - Saldo ");
			System.out.println("3 - Empr�stimo Universit�rio");
			System.out.println("0 - Sair");
			int opcao = leia.nextInt();
			if (opcao == 1) {
				conta.mostrarSaldos();
				System.out.println("1 - Cr�dito ");
				System.out.println("2 - D�bito ");
				System.out.println("0 - Sair");
				opcao = leia.nextInt();
				if (opcao == 1) {
					System.out.println("Digite o valor a ser creditado");
					conta.devolverLimite(leia.nextDouble());
					conta.mostrarSaldos();
				} else if (opcao == 2) {
					System.out.println("Digite o valor a ser debitado");
					double valor = leia.nextDouble();
					if (conta.testarSaldo(valor)) {
						conta.debito(valor);
					} else {
						System.out.println("N�o foi poss�vel realizar o d�bito!");
					}
				} else if (opcao == 0) {
					return;
				}
			} else if (opcao == 2) {
				System.out.println("Saldo: R$ " + conta.getSaldo());
				System.out.println("Valor do Limite: R$ " + conta.getValorLimite());
			} else if (opcao == 3) {
				conta.perguntarEmprestimo();
			} else if (opcao == 0) {
				System.out.println("Encerrando acesso a conta");
				return;
			}
		}
	}

	private static void saudacao(Conta conta) {
		System.out.println("Seja bem vindo ao G2Bank!");
		System.out.printf("\nCPF: %s", conta.getCpf());
		System.out.printf("\nSeu saldo atual � de: R$ %.2f", conta.getSaldo());
	}

	private static void menuContaEspecial(ContaEspecial conta) {
		for (int i = 0; i < 10; i++) {
			System.out.println();
			System.out.println("Conta Especial");
			System.out.println("Digite a op��o de transa��o");
			System.out.println("1 - Movimenta��o ");
			System.out.println("2 - Saldo ");
			System.out.println("0 - Sair");
			int opcao = leia.nextInt();
			if (opcao == 1) {
				System.out.println("Saldo: R$ " + conta.getSaldo());
				System.out.println("Valor do Limite: R$ " + conta.getValorLimite());
				System.out.println("Limite Usado: R$ " + (conta.getValorCadastroLimite() - conta.getValorLimite()));
				System.out.println("Digite a op��o de transa��o");
				System.out.println("1 - Cr�dito ");
				System.out.println("2 - D�bito ");
				System.out.println("0 - Sair");
				opcao = leia.nextInt();
				if (opcao == 1) {
					System.out.println("Digite o valor a ser creditado");
					conta.devolverLimite(leia.nextDouble());
					System.out.println("Saldo: R$ " + conta.getSaldo());
					System.out.println("Valor do Limite: R$ " + conta.getValorLimite());
					System.out.println("Limite Usado: R$ " + (conta.getValorCadastroLimite() - conta.getValorLimite()));
				} else if (opcao == 2) {
					System.out.println("Digite o valor a ser debitado");
					double valor = leia.nextDouble();
					if (conta.testarSaldo(valor)) {
						conta.debito(valor);
					} else {
						System.out.println("N�o foi poss�vel realizar o d�bito!");
					}
					System.out.println("Saldo: R$ " + conta.getSaldo());
					System.out.println("Valor do Limite: R$ " + conta.getValorLimite());
					System.out.println("Limite Usado: R$ " + (conta.getValorCadastroLimite() - conta.getValorLimite()));
				} else if (opcao == 0) {
					return;
				}
			} else if (opcao == 2) {
				System.out.println("Saldo: R$ " + conta.getSaldo());
				System.out.println("Valor do Limite: R$ " + conta.getValorLimite());
			} else if (opcao == 0) {
				System.out.println("Encerrando acesso a conta");
				return;
			}

			/*
			 * System.out.println("\n1 - Movimento"); System.out.println("2 - Saldo");
			 * System.out.println("3 - Alterar Limite"); System.out.println("0 - Sair");
			 * System.out.println(); System.out.println("Digite a op��o:"); int opcao =
			 * leia.nextInt(); if (opcao == 1) { menuMovimento(conta); } else if(opcao == 2)
			 * { System.out.printf("\nSaldo Atual: R$ %.2f", conta.getSaldo()); } else if
			 * (opcao == 3) {
			 * System.out.println("\nDigite o valor do limite a ser alterado: "); double
			 * limite = leia.nextDouble(); conta.setValorLimite(limite); } else { return;
			 * 
			 * 
			 * 
			 * 
			 * }
			 */
		}
	}

	private static void menuContaCorrente(ContaCorrente conta) {
		for (int i = 0; i < 10; i++) {
			System.out.println("\n1 - Movimento");
			System.out.println("2 - Saldo");
			System.out.println("3 - Tal�o de cheque");
			System.out.println("0 - Sair");
			System.out.println();
			System.out.println("Digite a op��o:");
			int opcao = leia.nextInt();
			if (opcao == 1) {
				menuMovimento(conta);
			} else if (opcao == 2) {
				System.out.printf("\nSaldo Atual: R$ %.2f", conta.getSaldo());
			} else if (opcao == 3) {
				System.out.println("\nDigite o Tal�o: ");
				int talao = leia.nextInt();
				System.out.println("Digite o total de tal�es");
				int totalTalao = leia.nextInt();
				// conta.talao(talao, totalTalao);
			} else {
				return;
			}
		}
	}

	private static void menuContaPoupanca(ContaPoupanca conta) {
		for (int i = 0; i < 10; i++) {
			System.out.println("\n1 - Movimento");
			System.out.println("2 - Saldo");
			System.out.println("3 - Anivers�rio");
			System.out.println("0 - Sair");
			System.out.println();
			System.out.println("Digite a op��o:");
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
			System.out.println("\n1 - Movimento");
			System.out.println("2 - Saldo");
			System.out.println("3 - Empr�stimo");
			System.out.println("0 - Sair");
			System.out.println();
			System.out.println("Digite a op��o:");
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
			System.out.println("1 - Cr�dito");
			System.out.println("2 - D�bito");
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
				System.out.println("Saindo da movimenta��o...");
				break;
			}
		}
	}

}