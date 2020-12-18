package banco;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class BancoTeste {

	public static final int TOTAL_CLIENTE = 40;
	public static int contaDigitada;
	public static int conta [] = new int [TOTAL_CLIENTE];
	public static String clientes[] = {"Allen de Lima Vieira", "André de Brito Silva da Costa","Bárbara Liboni Guerra",	
			"Beatriz Martins","Beymar Jhoel Acapa Lima","Breno Nogueira Botelho Noccioli",
			"Daniel Augusto Gomes Ferreira Filho","Danilo Mendes Ferreira","Danilo Pereira da Silva",
			"Davi Silva Vieira","Diego Vinicio da Silva Nascimento","Erick Costa Ferreira",
			"Ewerton Inacio Lima","FERNANDA AGAPITO","Fernanda Barbosa Ferraz","Francisco José Pires",
			"Gabriel Sérgio Nascimento Santos Gonçalves", "Gideão da Silva Idelfonso",
			"GILSON AMORIM DE MATOS","Guilherme Gonçalves da Silva","Gustavo Rabelo Teles",
			"HELOISA BEATRIZ DE OLIVEIRA COSTA","Igor Mateus Queiroz Gato","Isabel Emiko Yamakawa Oyama",
			"Jackeline Akemi de Moura","José Jorge Hauck Júnior","Juliana Santos André",
			"Kélven Cleiton de Araújo Brandão","Laís Lima Santos","Lucas anseloni barros",
			"Lucas Gonçalves da SIlva","luis felipe da silva","Luiz Felipe da Silva Magalhães",
			"Marcos Eduardo Gomes Gonçalves","Micaely da Silva Lima","Rafaela Oliveira Silva",
			"Tiago dos Santos Martins","Verônica Navarro Almenara","Vinicius Alves Miranda", "Gabriel Enrique Cabral Silva"};
	public static char genero [] = {'M','M','F','F','M','M','M','M','M','M','M','M','M','F','F','M','M','M','M','M','M','F','F','F','F','M','F',
			'M','F','M','M','M','M','M','F','F','M','F','M','M'};
	public static int tipo[] = new int[TOTAL_CLIENTE];
	public static double valor[] = new double[4];
	public static String nome;
	public static Scanner leia = new Scanner(System.in);
	public static double saldo[] = new double[TOTAL_CLIENTE];
	public static double saldoEmprestimo[] = new double[TOTAL_CLIENTE];
	public static int aniversario[] = new int[TOTAL_CLIENTE];
	
	
	public static void main(String[] args) {
		inicializarContas();
		while (true) {
			digitarConta(); 
			linha(50);
			saudacao();
			linha(50);
			if (tipo[contaDigitada] == 1) {
				contaPoupanca();
			} else if (tipo[contaDigitada] == 2) {
				contaCorrente();
			} else if (tipo[contaDigitada] == 3) {
				contaEspecial();
			} else if (tipo[contaDigitada] == 4) {
				contaEmpresarial();
			} else if (tipo[contaDigitada] == 5) {
				contaUniversitaria();
			}
		}
	}

	public static void contaPoupanca() {
		double credito = 0.0, debito = 0.0;
		int opcao;
		char continuar;
		
		int aniversarioDigitado;
		Scanner entrada = new Scanner(System.in);
		
		do {
			for (int transacao = 0; transacao < 10; transacao++) {
				System.out.println("Conta Poupança");
				System.out.println("Digite a opção de transação");
				System.out.println("1 - Crédito ");
				System.out.println("2 - Débito ");
				System.out.println("3 - Saldo ");
				System.out.println("4 - Aniversário ");
				System.out.println("0 - Sair");
				opcao = entrada.nextInt();

				if (opcao == 1) {
					System.out.println("Digite o valor a ser creditado");
					credito = entrada.nextDouble();
					saldo[contaDigitada] = saldo[contaDigitada] + credito;
					mostrarSaldo(saldo[contaDigitada]);
				} else if (opcao == 2) {
					if (saldo[contaDigitada] <= 0.0) {
						System.out.println("Não é possível realizar o saque!");
					} else if (saldo[contaDigitada] >= debito) {
						System.out.println("Digite o valor a ser debitado");
						debito = entrada.nextDouble();
						saldo[contaDigitada] -= debito;
						if (saldo[contaDigitada] < 0) {
							System.out.println(
									"Não é possível realizar este débito. O saldo final não pode ser negativo");
							saldo[contaDigitada] = saldo[contaDigitada] + debito;
						}
						mostrarSaldo(saldo[contaDigitada]);
					}				
				} else if (opcao == 3) {
					System.out.println("Saldo: R$ " + saldo[contaDigitada]);
				}else if(opcao == 4) {
					System.out.println("Digite o aniversário da conta");
					aniversarioDigitado = entrada.nextInt();
					if(aniversarioDigitado == aniversario[contaDigitada]) {
						saldo[contaDigitada] = saldo[contaDigitada] +(saldo[contaDigitada] * 0.05);
						System.out.print("\nO sistema atribuiu data de aniversário dia "+ aniversario[contaDigitada]+"\n\n");
						System.out.println("Saldo atualizado\n");
						System.out.print("Novo saldo ");
						mostrarSaldo(saldo[contaDigitada]);
						System.out.println();
					}else if(aniversarioDigitado != aniversario[contaDigitada]) {
						System.out.println("Não houve reajuste de 0.5% no saldo");
						System.out.print("\nO sistema atribuiu data de aniversário dia "+ aniversario[contaDigitada]+"\n\n");
					}	
				} else if (opcao == 0) {
					System.out.println("Encerrando acesso a conta");
					return;
				}

			}
			System.out
					.println("Você realizou todas as possíveis transações em Conta Poupança, deseja continuar? (S/N)");
			continuar = entrada.next().toUpperCase().charAt(0);
		} while (continuar == 'S');
	}
	
	public static void contaCorrente() {
		double saldo = 0.0, credito = 0.0, debito = 0.0;
		int opcao;
		char continuar;
		Scanner entrada = new Scanner(System.in);

		do {

			for (int transacao = 0; transacao < 10; transacao++) {
				System.out.println("Conta Corrente");
				System.out.println("Digite a opção de transação");
				System.out.println("1 - Crédito ");
				System.out.println("2 - Débito ");
				System.out.println("3 - Saldo ");
				System.out.println("0 - Sair");
				opcao = entrada.nextInt();

				if (opcao == 1) {
					System.out.println("Digite o valor a ser creditado");
					credito = entrada.nextDouble();
					saldo = saldo + credito;
					mostrarSaldo(saldo);
				} else if (opcao == 2) {
					if (saldo <= 0.0) {
						System.out.println("Não é possível realizar o saque!");
					} else if (saldo >= debito) {
						System.out.println("Digite o valor a ser debitado");
						debito = entrada.nextDouble();
						saldo -= debito;
						if (saldo < 0) {
							System.out.println(
									"Não é possível realizar este débito. O saldo final não pode ser negativo");
							saldo = saldo + debito;
						}
						mostrarSaldo(saldo);
					}
				} else if (opcao == 3) {
					System.out.println("Saldo: R$ " + saldo);
				} else if (opcao == 0) {
					System.out.println("Encerrando acesso a conta");
					return;
				}

			}
			System.out
					.println("Você realizou todas as possíveis transações em Conta Corrente, deseja continuar? (S/N)");
			continuar = entrada.next().toUpperCase().charAt(0);
		} while (continuar == 'S');

	}

	public static void contaEspecial() {
		double saldo = 0.0, credito = 0.0, debito = 0.0;
		int opcao;
		char continuar;
		Scanner entrada = new Scanner(System.in);

		do {
			for (int transacao = 0; transacao < 10; transacao++) {
				System.out.println("Conta Especial");
				System.out.println("Digite a opção de transação");
				System.out.println("1 - Crédito ");
				System.out.println("2 - Débito ");
				System.out.println("3 - Saldo ");
				System.out.println("0 - Sair");
				opcao = entrada.nextInt();

				if (opcao == 1) {
					System.out.println("Digite o valor a ser creditado");
					credito = entrada.nextDouble();
					saldo = saldo + credito;
					mostrarSaldo(saldo);
				} else if (opcao == 2) {
					if (saldo <= 0.0) {
						System.out.println("Não é possível realizar o saque!");
					} else if (saldo >= debito) {
						System.out.println("Digite o valor a ser debitado");
						debito = entrada.nextDouble();
						saldo -= debito;
						if (saldo < 0) {
							System.out.println(
									"Não é possível realizar este débito. O saldo final não pode ser negativo");
							saldo = saldo + debito;
						}
						mostrarSaldo(saldo);
					}
				} else if (opcao == 3) {
					System.out.println("Saldo: R$ " + saldo);
				} else if (opcao == 0) {
					System.out.println("Encerrando acesso a conta");
					return;
				}

			}
			System.out
					.println("Você realizou todas as possíveis transações em Conta Especial, deseja continuar? (S/N)");
			continuar = entrada.next().toUpperCase().charAt(0);
		} while (continuar == 'S');

	}

	public static void contaEmpresarial() {
		double credito = 0.0, debito = 0.0;
		int opcao;
		char continuar;

		do {
			for (int transacao = 0; transacao < 10; transacao++) {
				System.out.println("Conta Empresarial");
				System.out.println("Digite a opção de transação");
				System.out.println("1 - Crédito ");
				System.out.println("2 - Débito ");
				System.out.println("3 - Saldo ");
				System.out.println("4 - Solicitar Empréstimo ");
				System.out.println("0 - Sair");
				opcao = leia.nextInt();
				if (opcao == 1) {
					mostrarSaldo(saldo[contaDigitada]);
					perguntarEmprestimo();
					System.out.println("Digite o valor a ser creditado");
					credito = leia.nextDouble();
					saldo[contaDigitada] = saldo[contaDigitada] + credito;
					mostrarSaldo(saldo[contaDigitada]);
				} else if (opcao == 2) {
					perguntarEmprestimo();
					System.out.println("Digite o valor a ser debitado");
					debito = leia.nextDouble();
					if (saldo[contaDigitada] - debito <= 0.0 && (saldo[contaDigitada] - debito > saldoEmprestimo[contaDigitada])) {
						mostrarSaldo(saldo[contaDigitada]);
						System.out.println("Não é possível realizar o saque, seu saldo está negativo!");
					} else if (saldo[contaDigitada] - debito <= 0.0 && (saldo[contaDigitada] - debito <= saldoEmprestimo[contaDigitada])) {
						System.out.println("Seu saldo é insuficiente para esta transação");
						perguntarEmprestimo();
						if (saldo[contaDigitada] - debito < 0) {
							System.out.println("Não foi possível realizar o saque!");
							return;
						} else {
							saldo[contaDigitada] -= debito;
							mostrarSaldo(saldo[contaDigitada]);
						}
					} else {
						saldo[contaDigitada] -= debito;
						mostrarSaldo(saldo[contaDigitada]);
					}
				} else if (opcao == 3) {
					System.out.println("Saldo: R$ " + saldo[contaDigitada]);
				} else if (opcao == 4) {
					solicitarEmprestimo();
				} else if (opcao == 0) {
					System.out.println("Encerrando acesso a conta");
					return;
				}
			}
			System.out.println(
					"Você realizou todas as possíveis transações em Conta Empresarial, deseja continuar? (S/N)");
			continuar = leia.next().toUpperCase().charAt(0);
		} while (continuar == 'S');

	}
	

	public static void contaUniversitaria() {
		double saldo = 0.0, credito = 0.0, debito = 0.0;
		int opcao;
		char continuar;
		Scanner entrada = new Scanner(System.in);

		do {
			for (int transacao = 0; transacao < 10; transacao++) {
				System.out.println("Conta Universitaria");
				System.out.println("Digite a opção de transação");
				System.out.println("1 - Crédito ");
				System.out.println("2 - Débito ");
				System.out.println("3 - Saldo ");
				System.out.println("0 - Sair");
				opcao = entrada.nextInt();

				if (opcao == 1) {
					System.out.println("Digite o valor a ser creditado");
					credito = entrada.nextDouble();
					saldo = saldo + credito;
				} else if (opcao == 2) {
					if (saldo <= 0.0) {
						System.out.println("Não é possível realizar o saque!");
					} else if (saldo >= debito) {
						System.out.println("Digite o valor a ser debitado");
						debito = entrada.nextDouble();
						saldo -= debito;
						if (saldo < 0) {
							System.out.println(
									"Não é possível realizar este débito. O saldo final não pode ser negativo");
							saldo = saldo + debito;
						}
						mostrarSaldo(saldo);
					}
				} else if (opcao == 3) {
					System.out.println("Saldo: R$ " + saldo);
				} else if (opcao == 0) {
					System.out.println("Encerrando acesso a conta");
					return;
				}

			}
			System.out.println(
					"Você realizou todas as possíveis transações em Conta Universitaria, deseja continuar? (S/N)");
			continuar = entrada.next().toUpperCase().charAt(0);
		} while (continuar == 'S');

	}

	public static void linha(int tamanho) {
		for (int x = 0; x < tamanho; x++) {
			System.out.print("-");
		}
		System.out.println();
	}

	public static void mostrarSaldo(Double saldo) {
		System.out.println("Saldo: R$ " + saldo);
	}

	public static String opcaoGenero(char genero) {
		if (genero == 'M') {
			return "AAA";
		} else if (genero == 'F') {
			return "BBB";
		} else {
			return "CCC";
		}
	}
	
	private static void digitarConta() {
		while (true) {
			System.out.println("Digite o número da sua conta: ");
			contaDigitada = leia.nextInt();
			if (contaDigitada < 1 || contaDigitada > TOTAL_CLIENTE + 1) {
				System.out.println("Você não possui uma conta no banco");
			} else {
				contaDigitada -= 1;
				break;
			}
		}
	}
	
	public static void saudacao() {
		if (genero[contaDigitada] == 'M') {
			System.out.println("Bem vindo ao Banco G2! Sr. " + clientes[contaDigitada]);
		} else if (genero[contaDigitada] == 'F') {
			System.out.println("Bem vinda ao Banco G2! Sra. " + clientes[contaDigitada]);
		} else {
			System.out.println("Bem vindo(a) ao Banco G2! Sr(a). " + clientes[contaDigitada]);
		}
	}
	
	private static void inicializarContas() {
		for (int i = 0; i < TOTAL_CLIENTE; i++) {
			conta[i] = i;
//			tipo[i] = ThreadLocalRandom.current().nextInt(1, 6);
			tipo[i] = 4;
			saldo[i] = 0.0;
			if (tipo[i] == 1) {
				aniversario[i] = ThreadLocalRandom.current().nextInt(1, 31);
			}
			if (tipo[i] == 4) {
				saldoEmprestimo[i] = 10000;
			}
		}
	}
	
	private static void perguntarEmprestimo() {
		char opcao;
		if (saldoEmprestimo[contaDigitada] > 0) {
			System.out.println("Deseja realizar o empréstimo? (S/N)");
			opcao = leia.next().toUpperCase().charAt(0);
			if (opcao == 'S') {
				solicitarEmprestimo();
			}
		}
	}
	
	private static void solicitarEmprestimo() {
		double valorEmprestimo;
		if (saldoEmprestimo[contaDigitada] == 0) {
			System.out.println("Saldo do empréstimo zerado!");
			return;
		}
		do {
			System.out.println("Seu saldo atual de empréstimo é de: R$ " + saldoEmprestimo[contaDigitada]);
			System.out.println("Quanto deseja retirar do empréstimo?");
			valorEmprestimo = leia.nextDouble();
			if (valorEmprestimo > saldoEmprestimo[contaDigitada]) {
				System.out.println("Valor de empréstimo ultrapassou o saldo de empréstimo!");
			}
			if (valorEmprestimo < 0) {
				System.out.println("Valor de empréstimo não pode ser negativo!");
			} 
		} while(valorEmprestimo > saldoEmprestimo[contaDigitada] || valorEmprestimo < 0);
		saldoEmprestimo[contaDigitada] -= valorEmprestimo;
		saldo[contaDigitada] += valorEmprestimo;
		System.out.println("Saldo atual do empréstimo: R$ " + saldoEmprestimo[contaDigitada]);
		System.out.println("Saldo atual da conta: R$ " + saldo[contaDigitada]);
	}
}