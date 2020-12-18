programa
{
	
	funcao inicio(){
		cadeia cliente[] = {"Allen de Lima Vieira","André de Brito Silva da Costa","Bárbara Liboni Guerra","Beatriz Martins","Beymar Jhoel Acapa Lima",
	"Breno Nogueira Botelho Noccioli","Daniel Augusto Gomes Ferreira Filho","Danilo Mendes Ferreira","Danilo Pereira da Silva",
	"Davi Silva Vieira","Diego Vinicio da Silva Nascimento","Erick Costa Ferreira","Ewerton Inacio Lima","Fernanda Agapito",
	"Fernanda Barbosa Ferraz","Francisco José Pires","Gabriel Sérgio Nascimento Santos Gonçalves","Gideão da Silva Idelfonso",
	"Gilson Amorim de Matos","Guilherme Gonçalves da Silva","Gustavo Rabelo Teles","Heloisa Beatriz de Oliveira Costa",
	"Igor Mateus Queiroz Gato","Isabel Emiko Yamakawa Oyama","Jackeline Akemi de Moura","José Jorge Hauck Júnior","Juliana Santos André",
	"Kélven Cleiton de Araújo Brandão","Laís Lima Santos","Lucas Anseloni Barros","Lucas Gonçalves da Silva","Luis felipe da silva",
	"Luiz Felipe da Silva Magalhães","Marcos Eduardo Gomes Gonçalves","Micaely da Silva Lima","Rafaela Oliveira Silva","Tiago dos Santos Martins",
	"Verônica Navarro Almena", "Vinicius de Alvez Miranda"}
		cadeia cadastroCpf[] = {"596.291.728-60","805.239.528-30","981.343.858-42",	
		"518.801.928-02","270.834.278-95","945.106.218-17","847.371.618-37",
		"024.044.158-32","220.601.118-20","753.747.358-70","886.512.898-47",
		"751.783.548-34","430.759.658-71","314.838.718-00","547.115.268-97",
		"509.807.848-24","254.391.468-49","488.028.768-78","581.003.048-31",
		"585.596.588-07","092.305.128-77","247.245.758-83","736.342.958-80",
		"227.300.338-23","306.378.968-23","432.797.538-99","709.836.768-01",
		"362.646.268-48","222.559.668-91","527.265.688-15","540.043.108-90",
		"668.927.078-58","391.120.958-42","375.139.488-52","394.415.678-17",
		"317.844.108-53","459.737.658-57","590.060.028-95","773.324.008-55"}
		cadeia numeroContaCliente[] = {"G2001","G2002","G2003",
		"G2004","G2005","G2006","G2007",
		"G2008","G2009","G2010","G2011",
		"G2012","G2013","G2014","G2015",
		"G2016","G2017","G2018","G2019",
		"G2020","G2021","G2022","G2023",
		"G2024","G2025","G2026","G2027",
		"G2028","G2029","G2030","G2031",
		"G2032","G2033","G2034","G2035",
		"G2036","G2037","G2038","G2039"}
		
		inteiro opcao = 1
		const inteiro MOVIMENTOS = 5
		inteiro acessaTransacao
		const inteiro MOVIMENTO = 5
		real transacao[5] 
		cadeia transacaoTag[5]
		real saldo = 0.0, real totalLimite = 1000.0, valorLimite = 0.0
		cadeia cpf = "227.300.338-23"
		cadeia numeroConta = "G2024"
		caracter retiraLimite = ' '
		caracter diaSeguinte = ' '
		inteiro dia = 0

		faca{
			escreva("Escolha as opcao")
			pulaLinha()
			escreva("1 - CONTA POUPANÇA")
			pulaLinha()
			escreva("2 - CONTA CORRENTE")
			pulaLinha()
			escreva("3 - CONTA ESPECIAL")
			pulaLinha()
			escreva("4 - CONTA EMPRESA")
			pulaLinha()
			escreva("5 - CONTA UNIVERSITÁRIA")
			pulaLinha()
			escreva("0 - SAIR")
			pulaLinha()
			leia(opcao)
			
			se (opcao == 1){}
			senao se (opcao == 2){}
			senao se (opcao == 3){
				faca{
					dia = dia++
					para (inteiro i = 0; i < MOVIMENTO; i++){
						acessaTransacao = menuPrincipal(dia, numeroConta, cpf)
				
						se(acessaTransacao == 1) {
							saldo = transacaoCredito(transacao, i, saldo)
							transacaoTag[i] = "Creditado:\t\t"
							menuCompleto(numeroConta, saldo, totalLimite, cpf)
						}
				
						senao se(acessaTransacao == 2){
							pulaLinha()
							escreva("Digite o valor do Debito: ")
							leia(transacao[i])
							se(transacao[i] <= (saldo + totalLimite) e saldo >= 0.0){
								saldo -= transacao[i]
								transacaoTag[i] = "Debitado:\t\t"
								menuCompleto(numeroConta, saldo, totalLimite, cpf)
						
							}
							senao se(saldo < 0.0){
								pulaLinha()
								escreva("Seu saldo está negativo, Deseja retirar do limite? [S/N]")
								leia(retiraLimite)
								se(retiraLimite == 'S' ou retiraLimite == 's') {
									pulaLinha()
									escreva("Quanto deseja retirar do Limite?: ")
									leia(valorLimite)
									totalLimite -= valorLimite
									saldo += valorLimite
									transacaoTag[i] = "Limite Solicitado:\t"
								}
							}
					
			
							senao{
								pulaLinha()
								escreva("O valor de debito é maior que a quantidade em saldo e o valor do Limite")
							}
						}
						senao se(acessaTransacao == 3){
							pulaLinha()
							escreva("O valor do saldo é R$ ", saldo)
						}
						senao se(acessaTransacao == 4){
							pulaLinha()
							escreva("O valor do Limite é R$ ", totalLimite)
						}
						senao {
							pulaLinha()
							escreva("Opção Invalida")
						}
					}
			
					pulaLinha()
					pulaLinha()
					escreva("Suas transações se esgotaram, deseja sair[S/N] ")
					leia(diaSeguinte)
					enquanto(diaSeguinte != 'N' e diaSeguinte != 'n' e diaSeguinte !='S' e diaSeguinte != 's'){
						pulaLinha()
						escreva("Opção Invalida, tente novamente")
						pulaLinha()
						escreva("Suas transações se esgotaram, deseja sair[S/N] ")
						leia(diaSeguinte)
					}
				}enquanto(diaSeguinte == 'N')
			}
			senao se (opcao == 4) {
				contaEmpresa()
			}
			senao se (opcao == 5){}
		}enquanto(opcao != 0)
	}
	
	funcao pulaLinha(){
			escreva("\n")
	}


	funcao inteiro menuPrincipal(inteiro dia,cadeia numeroConta,cadeia cpf){ // Função para o Menu Principal
		inteiro acessaTransacao

		pulaLinha()
		pulaLinha()
		escreva("NUMERO CONTA: " + numeroConta + " Dia:" + dia)
		pulaLinha()
		escreva("CPF: " + cpf)
		pulaLinha()
		pulaLinha()
		escreva("Digite uma das opçoes")
		pulaLinha()
		escreva("1 - Credito")
		pulaLinha()
		escreva("2 - Debito")
		pulaLinha()
		escreva("3 - Saldo")
		pulaLinha()
		escreva("4 - Valor do Limite")
		pulaLinha()
		leia(acessaTransacao)
		retorne acessaTransacao
	
	}

	funcao menuCompleto(cadeia numeroConta, real saldo, real totalLimite, cadeia cpf){ // Função para exibição para cada transação
		pulaLinha()
		escreva("NUMERO CONTA: " + numeroConta)
		pulaLinha()
		escreva("Saldo: " + saldo)
		pulaLinha()
		escreva("Valor do limite: " + totalLimite)
		pulaLinha()
		escreva("CPF: " + cpf)
		pulaLinha()
	}

	funcao real transacaoCredito(real transacao[],inteiro i, real saldo){ //função para adicionar credito
		pulaLinha()
		escreva("Digite o valor do Credito: ")
		pulaLinha()
		leia(transacao[i])
		saldo += transacao[i]
		retorne saldo
	}


	funcao extratoTransacoes(inteiro MOVIMENTO, real transacao[], cadeia transacaoTag[], real saldo){ //Função para o Extrato de Transações
		
		pulaLinha() 
		escreva("Extrado de transações:")
		pulaLinha()
		para(inteiro i = 0; i < MOVIMENTO; i++){
			
			se(transacao[i] != 0 e transacaoTag[i] != "null"){
			escreva( (i+1) + "º " + transacaoTag[i] + "[R$ " + transacao[i] + "]")
			pulaLinha()
			}
		}
		pulaLinha()
		escreva("Saldo:\t\t\t" + "[R$ " + saldo + "]")
	
	}

	funcao contaEmpresa()
	{
		const cadeia numeroConta = "G2Bank", cpf = "123.456.789-99"
		const inteiro TAMANHO = 10
		real saldoEmprestimo = 30000.0
		real saldo = 0.0, debito, credito
		caracter continuar = 'S', realizarEmprestimo
		inteiro acessoTransacao, dia = 1 
		inteiro x = 0
		real movimento[TAMANHO]

		enquanto(continuar == 's' ou continuar =='S' ou x < TAMANHO) {
			continuar = 'N'
			
			escreva("\nConta: ", numeroConta, " Dia: ", dia, "\nCPF: ", cpf)
			escreva("\nDigite umas das opções:  ")
			escreva("\n1 - Crédito ")
			escreva("\n2 - Débito ")
			escreva("\n3 - Saldo ")
			escreva("\n4 - Empréstimo ")
			escreva("\n0 - Sair \n")
			
			leia(acessoTransacao)

			se (acessoTransacao == 0) { // 0 - parar programa
				pare
			}
			escreva("Seu saldo atual é: R$ ", saldo)
			se (acessoTransacao == 1){ // 1 - creditar
				real valor
				escreva("\nValor a ser creditado: R$ ")
				leia(valor)
				movimento[x] = valor // creditando valor no movimento[x]
				saldo = saldo + movimento[x] // creditando no saldo o valor do movimento[x]
				x++ // aumentando índice de transação
				limpa()
			} senao se (acessoTransacao == 2) { // 2 - debitar
				real valor
				escreva("\nValor a ser debitado: R$ ")
				leia(valor)
				movimento[x] = -1 * valor // debitando valor do movimento[x] 
				saldo = saldo + movimento[x] //debitando do saldo o valor do movimento[x]
				x++ // aumentando índice de transação
				limpa()
			} senao se (acessoTransacao == 3) { // 3 - mostrar saldo
				escreva("\nSeu saldo atual é de: R$ ", saldo)
			} senao se (acessoTransacao == 4) { // 4 - realizar empréstimo
				escreva("\nSeu saldo atual é de R$ ", saldo, ", deseja realizar um empréstimo? (S/N) ")
				leia(realizarEmprestimo)
				se(realizarEmprestimo == 's' ou realizarEmprestimo == 'S') {
					real retiradaEmprestimo = 0.0
					escreva("\nSeu saldo de empréstimo é de:R$ ", saldoEmprestimo) // mostrando o saldo do empréstimo
					faca { // iniciando laço de repetição enquanto o valor a ser retirado é maior que o saldo disponível e se houver saldo disponível de empréstimo
						se (saldoEmprestimo <= 0) { // se saldo do empréstimo for menor que zero, avisando o usuário e parando o laço
							escreva("\nSeu saldo está zerado")
							pare
						}
						escreva("\nQuanto deseja retirar? ")
						leia(retiradaEmprestimo)	
						se (retiradaEmprestimo <= saldoEmprestimo) { // se a retirada do empréstimo for menor ou igual ao saldo disponível do empréstimo
							saldoEmprestimo = saldoEmprestimo - retiradaEmprestimo // realizando a retirada do empréstimo, debitando do saldo disponível
							saldo = saldo + retiradaEmprestimo // adicionando o valor a ser retirado no saldo da conta
							retiradaEmprestimo = 0.0 // zerando a retirada para sair do laço
							escreva("\nSeu saldo atual é de: R$ ", saldo) // mostrar na tela o saldo da conta
							escreva("\nSeu saldo de empréstimo é de: R$ ", saldoEmprestimo) // mostrar na tela o saldo disponível para empréstimo
						} senao {
							escreva("\nRetirada não permitida, saldo insuficiente") // não existe saldo disponível para empréstimo para a quantia da retirada
						}
					} enquanto (retiradaEmprestimo > saldoEmprestimo e saldoEmprestimo > 0)
				}
			} 
			se (x == 10) { // se chegar no limite de transações por dia, mostrar o extrato
				escreva("\nOperações realizadas:")
				para (inteiro i = 0; i < TAMANHO; i++) {
					escreva("\nOperacao ", (i + 1), ": ", movimento[i]) // mostrar todos os dados gravados no vetor movimento[x]
				}
				
				escreva("\nDeseja continuar? (S/N) ")
				leia(continuar)
				dia++
				x = 0 // zerar para trocar o dia e voltar ao laço de repetição
			}
		}

		escreva("\nCPF: ", cpf, "\nConta: ", numeroConta, "\nSaldo final: ", saldo) // programa finalizado, mostrando dados ao usuário
	}
		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 3017; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */