programa
	
{	
	inclua biblioteca Util
	const inteiro LIMITE_DIAS = 30
	const inteiro LIMITE_TRANSACAO = 5
	const inteiro TOTAL_CONTAS = 39
	real movimento[LIMITE_DIAS][LIMITE_TRANSACAO]
	cadeia movimentoTransacao[LIMITE_DIAS][LIMITE_TRANSACAO], movimentoTipo[LIMITE_DIAS][LIMITE_TRANSACAO]
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
	
	cadeia cpf, numeroConta
	inteiro indiceConta = -1;
	inteiro dia = 1, indiceTransacao = 0
	real saldoEmprestimoEmpresa = 30000.0
	real saldoEmprestimoUniversitario = 10500.0
	real saldoEmpresa = 0.0	
	real saldoEspecial = 0.0
	real saldoUniversitario = 0.0
	real saldoCorrente = 0.0
	real saldoPoupanca = 0.0
	real totalLimite = 1000.0, valorLimite = 0.0
	inteiro dataAniversario, dataAniversarioDigitada
	funcao inicio(){
		
		//cadeia cpf = "227.300.338-23"
		//cadeia numeroConta = "G2024"

		inteiro opcao

		escreva("\nG2Bank")
		escreva("\nDigite seu cpf: ")
		leia(cpf)
		escreva("\nDigite sua conta: ")
		leia(numeroConta)
		//cpf = "227.300.338-23"
		//numeroConta = "G2024"
		dataAniversario = Util.sorteia(1, 31)

		para (inteiro i = 0; i < TOTAL_CONTAS; i++) {
			se (cadastroCpf[i] == cpf e numeroContaCliente[i] == numeroConta) {
				indiceConta = i;
			}
		}

		se (indiceConta == -1) {
			escreva("\nConta não encontrado na base")
			retorne
		}
		escreva("\nBem vindo ao Banco G2 ", cliente[indiceConta])

		faca{
			escreva("\nDia da transação: ", dia)
			escreva("\nEscolha a opcao")
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
			escreva("6 - EXTRATO CONSOLIDADO")
			pulaLinha()
			escreva("0 - SAIR")
			pulaLinha()
			leia(opcao)
			
			se (opcao == 1){
				contaPoupanca()
			}
			senao se (opcao == 2){
				contaCorrente ()}
			senao se (opcao == 3){
				contaEspecial()
			}
			senao se (opcao == 4) {
				contaEmpresa()
			}
			senao se (opcao == 5){
				contaUniversitaria()
			} senao se (opcao == 6) {
				mostrarExtratoConsolidado()
			}
		}enquanto(opcao != 0)
		mostrarExtratoConsolidado()
		escreva("\nPrograma finalizado! Volte sempre!")
	}
	
	funcao pulaLinha(){
		escreva("\n")
	}


	funcao inteiro menuPrincipal(){ // Função para o Menu Principal na Conta Especial
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
		escreva("0 - Sair")
		pulaLinha()
		leia(acessaTransacao)
		retorne acessaTransacao
	
	}

	funcao menuCompleto(){ // Função para exibição para cada transação na Conta Especial
		pulaLinha()
		escreva("NUMERO CONTA: " + numeroConta)
		pulaLinha()
		escreva("Saldo: " + saldoEspecial)
		pulaLinha()
		escreva("Valor do limite: " + totalLimite)
		pulaLinha()
		escreva("CPF: " + cpf)
		pulaLinha()
	}

	funcao transacaoCredito(){ //função para adicionar credito na Conta Especial
		pulaLinha()
		escreva("Digite o valor do Credito: ")
		pulaLinha()
		leia(movimento[dia - 1][indiceTransacao])
		saldoEspecial += movimento[dia - 1][indiceTransacao]
		apropriaMovimento("Especial", "C")
		indiceTransacao++
	}

	funcao contaEspecial() {
		caracter diaSeguinte
		inteiro acessaTransacao = -1
		caracter retiraLimite

		enquanto (indiceTransacao < LIMITE_TRANSACAO e acessaTransacao != 0){
			acessaTransacao = menuPrincipal()
			se (acessaTransacao == 0) {
				pare
			} senao se (acessaTransacao == 1) {
				transacaoCredito()
				menuCompleto()
			} senao se(acessaTransacao == 2){
				pulaLinha()
				escreva("Digite o valor do Debito: ")
				leia(movimento[dia - 1][indiceTransacao])
				se(movimento[dia - 1][indiceTransacao] <= (saldoEspecial + totalLimite) e saldoEspecial >= 0.0){
					saldoEspecial -= movimento[dia - 1][indiceTransacao]
					apropriaMovimento("Especial", "D")
					indiceTransacao++
					menuCompleto()
				} 
				senao se(saldoEspecial < 0.0) {
					pulaLinha()
					escreva("Seu saldo está negativo, Deseja retirar do limite? [S/N]")
					leia(retiraLimite)
					se(retiraLimite == 'S' ou retiraLimite == 's') {
						pulaLinha()
						escreva("Quanto deseja retirar do Limite?: ")
						leia(valorLimite)
						se (valorLimite < totalLimite) {
							totalLimite -= valorLimite
							saldoEspecial += valorLimite
							apropriaMovimento("Especial", "D")
							indiceTransacao++
						} senao {
							escreva("\nO limite informado é maior que o disponível")
							escreva("\nRetornando ao menu...")
						}
					}
				}
				senao{
					pulaLinha()
					escreva("O valor de debito é maior que a quantidade em saldo e o valor do Limite")
				}
			}
			senao se(acessaTransacao == 3){
				pulaLinha()
				escreva("O valor do saldo é R$ ", saldoEspecial)
			}
			senao se(acessaTransacao == 4){
				pulaLinha()
				escreva("O valor do Limite é R$ ", totalLimite)
			}
			senao {
				pulaLinha()
				escreva("Opção Invalida")
			}
			se (indiceTransacao == LIMITE_TRANSACAO) {
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
				dia++
				indiceTransacao = 0	
			}
		}
	}

	funcao contaEmpresa()
	{
		caracter continuar = 'S', realizarEmprestimo
		inteiro acessoTransacao

		enquanto(continuar == 's' ou continuar =='S' ou indiceTransacao < LIMITE_TRANSACAO) {
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
			escreva("Seu saldo atual é: R$ ", saldoEmpresa)
			se (acessoTransacao == 1){ // 1 - creditar
				real valor
				escreva("\nValor a ser creditado: R$ ")
				leia(valor)
				movimento[dia - 1][indiceTransacao] = valor // creditando valor no movimento[x]
				saldoEmpresa = saldoEmpresa + movimento[dia - 1][indiceTransacao] // creditando no saldo o valor do movimento[x]
				apropriaMovimento("Empresa", "C")
				indiceTransacao++ // aumentando índice de transação
				limpa()
			} senao se (acessoTransacao == 2) { // 2 - debitar
				real valor
				escreva("\nValor a ser debitado: R$ ")
				leia(valor)
				movimento[dia - 1][indiceTransacao] = -1 * valor // debitando valor do movimento[x] 
				saldoEmpresa = saldoEmpresa + movimento[dia - 1][indiceTransacao] //debitando do saldo o valor do movimento[x]
				apropriaMovimento("Empresa", "D")
				indiceTransacao++ // aumentando índice de transação
				limpa()
			} senao se (acessoTransacao == 3) { // 3 - mostrar saldo
				escreva("\nSeu saldo atual é de: R$ ", saldoEmpresa)
			} senao se (acessoTransacao == 4) { // 4 - realizar empréstimo
				escreva("\nSeu saldo atual é de R$ ", saldoEmpresa, ", deseja realizar um empréstimo? (S/N) ")
				leia(realizarEmprestimo)
				se(realizarEmprestimo == 's' ou realizarEmprestimo == 'S') {
					real retiradaEmprestimo = 0.0
					escreva("\nSeu saldo de empréstimo é de:R$ ", saldoEmprestimoEmpresa) // mostrando o saldo do empréstimo
					faca { // iniciando laço de repetição enquanto o valor a ser retirado é maior que o saldo disponível e se houver saldo disponível de empréstimo
						se (saldoEmprestimoEmpresa <= 0) { // se saldo do empréstimo for menor que zero, avisando o usuário e parando o laço
							escreva("\nSeu saldo está zerado")
							pare
						}
						escreva("\nQuanto deseja retirar? ")
						leia(retiradaEmprestimo)	
						se (retiradaEmprestimo <= saldoEmprestimoEmpresa) { // se a retirada do empréstimo for menor ou igual ao saldo disponível do empréstimo
							saldoEmprestimoEmpresa = saldoEmprestimoEmpresa - retiradaEmprestimo // realizando a retirada do empréstimo, debitando do saldo disponível
							saldoEmpresa = saldoEmpresa + retiradaEmprestimo // adicionando o valor a ser retirado no saldo da conta
							retiradaEmprestimo = 0.0 // zerando a retirada para sair do laço
							escreva("\nSeu saldo atual é de: R$ ", saldoEmpresa) // mostrar na tela o saldo da conta
							escreva("\nSeu saldo de empréstimo é de: R$ ", saldoEmprestimoEmpresa) // mostrar na tela o saldo disponível para empréstimo
						} senao {
							escreva("\nRetirada não permitida, saldo insuficiente") // não existe saldo disponível para empréstimo para a quantia da retirada
						}
					} enquanto (retiradaEmprestimo > saldoEmprestimoEmpresa e saldoEmprestimoEmpresa > 0)
				}
			} 
			se (indiceTransacao == LIMITE_TRANSACAO) { // se chegar no limite de transações por dia, mostrar o extrato
				
				escreva("\nSuas transações se esgotaram:")
				escreva("\nDeseja continuar? (S/N) ")
				leia(continuar)
				dia++
				indiceTransacao = 0 // zerar para trocar o dia e voltar ao laço de repetição
			}
		}

		escreva("\nCPF: ", cpf, "\nConta: ", numeroConta, "\nSaldo final: ", saldoEmpresa) // programa finalizado, mostrando dados ao usuário
	}

	funcao contaUniversitaria() {
		real debito=0.00, credito=0.00, emprestimo=0.00
		inteiro acessaTransacao
		caracter opcao
				    	
	    	//Menu
		enquanto (indiceTransacao < LIMITE_TRANSACAO) {   
		    	escreva("Digite uma das opções:")
		    	pulaLinha()
	        	escreva("1 - Crédito")
	        	pulaLinha()
	        	escreva("2 - Débito")
	        	pulaLinha()
	        	escreva("3 - Saldo")
	        	pulaLinha()
	        	escreva("4 - Empréstimo")
	        	pulaLinha()
	        	escreva("0 - Sair")
	        	pulaLinha()
   			leia(acessaTransacao)
   			pulaLinha()

     		se(acessaTransacao == 0) {
				pulaLinha()
				escreva("Obrigado por fazer parte do G2BANK")
				pulaLinha()
				pare
			} senao se(acessaTransacao == 1)
   			{
        			escreva("Quanto você quer depositar: ")
        			leia(credito)
        			pulaLinha()
        			pulaLinha()
        			escreva("------------------ Realizando Depósito: --------------- ")
              		pulaLinha()
              		escreva("Saldo anterior R$: ", saldoUniversitario)
              		saldoUniversitario = (saldoUniversitario + credito)
				movimento[dia - 1][indiceTransacao] = credito
				apropriaMovimento("Universitária", "C")
				indiceTransacao++
	        		pulaLinha()
        			escreva("Deposito realizado com sucesso! Seu novo saldo R$ ", saldoUniversitario)
        	     	pulaLinha()
        			escreva("------------------------------------------------------- ")
        			pulaLinha()
        			pulaLinha()
   			}
   			senao se(acessaTransacao == 2)
   			{
        			escreva("Quanto você quer sacar R$: ")
        			leia(debito)
   				se (saldoUniversitario-debito < 0) {
	        			escreva("Saldo Insuficiente! Seu saldo é de R$ ",saldoUniversitario)
	        			pulaLinha()
        				pulaLinha()
   				} senao {
	        			saldoUniversitario = (saldoUniversitario - debito)
	        			limpa()
	        			movimento[dia - 1][indiceTransacao] = -1 * debito
	        			apropriaMovimento("Universitária", "D")
	        			indiceTransacao++
	        			escreva("Saque efetuado com sucesso! seu novo saldo é R$ ", saldoUniversitario)
	        			pulaLinha()
        				pulaLinha()
        			}		
			}
   			senao se(acessaTransacao == 3) 
   			{
        			pulaLinha()
        			escreva("Saldo: R$ ",saldoUniversitario)
        			pulaLinha()
        			pulaLinha()
   			} senao se(acessaTransacao == 4) {
		        	escreva("Você tem o um limite de R$", saldoEmprestimoUniversitario, " pré aprovado!")
		        	pulaLinha()
		        	pulaLinha()
		   	     escreva("Quer realizar um empréstimo? S/N")
		   	     pulaLinha()
		   	     leia(opcao)

	   	     	se(opcao == 'S' ou opcao =='s') {
					pulaLinha()
					escreva("Digite valor do empréstimo: ")
					leia(emprestimo)
					se(emprestimo > saldoEmprestimoUniversitario) {
						escreva("Valor não Aprovado! Lembrando você tem apenas R$", saldoEmprestimoUniversitario, " pré aprovado")
						pulaLinha()
					}
					senao se(emprestimo <= saldoEmprestimoUniversitario) {
						saldoUniversitario = (saldoUniversitario + emprestimo)
						limpa()
						escreva("Empréstimo efetuado com sucesso! Seu novo saldo é: R$ ", saldoUniversitario)
						pulaLinha()
					     pulaLinha()
					}		
   	     		} senao se(opcao == 'N' ou opcao =='n') {	
	   	     		pulaLinha()
					escreva("Obrigado por fazer parte do B2BANK")
					pulaLinha()
					pulaLinha()
				}

			} 
		}
		se (indiceTransacao == LIMITE_TRANSACAO) {
			pulaLinha()
			escreva("Suas ", LIMITE_TRANSACAO, " movimentações diárias chegou ao limite! Por favor, retorne amanhã.")
			dia++
			indiceTransacao = 0
			pulaLinha()
			escreva("O saldo após as movimentações é de R$ ", saldoUniversitario)
		}
	}
	
	funcao contaPoupanca(){
		real debito,credito 
		inteiro acessaTransacao

		enquanto(indiceTransacao < LIMITE_TRANSACAO) {
			escreva("\nConta: ",numeroConta)
			escreva("\nCPF: ",cpf,"\n")
			escreva("\nDigite umas das opções:  ")
			escreva("\n1 - Crédito ")
			escreva("\n2 - Débito ")
			escreva("\n3 - Saldo ")
			escreva("\n4 - Data Aniversário ")
			escreva("\n0 - Sair conta\n")
			leia(acessaTransacao)
			se(acessaTransacao == 1){
				escreva("\nDigite o valor do Crédito: ")
				leia(credito)
				saldoPoupanca+=credito
				apropriaMovimento("Poupança", "C")
				indiceTransacao++
			}senao se(acessaTransacao == 2){
				escreva("\nDigite o valor do Débito: ")
				leia(debito)
				se(saldoPoupanca <= 0.0){
					escreva("Não é possível realizar o saque!\n")
				}senao se(saldoPoupanca >= debito){
					saldoPoupanca -= debito
					apropriaMovimento("Poupança", "D")
					indiceTransacao++
				}
			}senao se(acessaTransacao == 3){
				escreva("\nSaldo em conta:",saldoPoupanca,"\n")
			}senao se(acessaTransacao == 4){
				escreva("\nDigite o aniversário da conta: ")
				leia(dataAniversarioDigitada)
				se(dataAniversarioDigitada >= 1 e dataAniversarioDigitada <= 31){
					escreva("\nA data de Aniversário da conta é: ",dataAniversario)
					se(dataAniversario == dataAniversarioDigitada){
						se(saldoPoupanca > 0.0){
							saldoPoupanca = saldoPoupanca * 1.005
							escreva("\nSaldo atualizado\n")
							escreva("\nSaldo em conta:",saldoPoupanca,"\n")
						} 
					}senao{
						escreva("\nNão houve o reajuste e 0.5% no saldo!\n")
					}
				}
				
				
			}senao se(acessaTransacao == 0){
				pare
			}
			se (indiceTransacao == LIMITE_TRANSACAO) {
				escreva("\nConta: ",numeroConta)
				escreva("\nCPF: ",cpf,"\n")
				escreva("\nRealizado as ",LIMITE_TRANSACAO," movimentações do dia")
				escreva("\nSaldo restante no final das transações: R$",saldoPoupanca,"\n")
				indiceTransacao = 0
				dia++
			}
		}
	}

	funcao contaCorrente(){
		real debito,credito
		inteiro acessaTransacao
		inteiro numeroTalao , alteraNumero
		
		numeroTalao=Util.sorteia (1, 9000)
		alteraNumero=Util.sorteia(1, 9000)

		enquanto (indiceTransacao < LIMITE_TRANSACAO){
			escreva ("\nConta: ",numeroConta)
			escreva("\nCPF: ",cpf,"\n")
			escreva("\nDigite umas das opções:  ")
			escreva("\n1 - Crédito ")
			escreva("\n2 - Débito ")
			escreva("\n3 - Saldo "))
			escreva ("\n4 - Solicitar um novo talão")
			escreva ("\n5 - Alterar numeração de talão")
			escreva("\n0 - Sair")
			leia (acessaTransacao)

			se(acessaTransacao == 0) {
				pare
			} senao se(acessaTransacao == 1){
				escreva("\nDigite o valor do Crédito: ")
				leia(credito)
				saldoCorrente+=credito
				movimento[dia - 1][indiceTransacao] = credito
				apropriaMovimento("Corrente", "C")
				indiceTransacao++
			}senao se(acessaTransacao == 2){
				escreva("\nDigite o valor do Débito: ")
				leia(debito)
				se(saldoCorrente <= 0.0){
					escreva("Não é possível realizar o saque!\n")
				}senao se(saldoCorrente >= debito){
					saldoCorrente -= debito
					movimento[dia - 1][indiceTransacao] = -1 * debito
					apropriaMovimento("Corrente", "D")
					indiceTransacao++
				}
			}senao se(acessaTransacao == 3){
				escreva("\nSaldo em conta:",saldoCorrente, "\n")
			} senao se (acessaTransacao ==4){
				numeroTalao = Util.sorteia(1, 9000)
				escreva("solicitar um novo talão, numero do talão é: ", numeroTalao)
			} senao se(acessaTransacao==5){ 
				alteraNumero = Util.sorteia(1, 9000)
				escreva ("Número Alterado para: ", alteraNumero)
			}

			se (indiceTransacao == LIMITE_TRANSACAO) {
				limpa()
				escreva("\nConta: ",numeroConta)
				escreva("\nCPF: ",cpf,"\n")
				escreva("\nRealizado as ",LIMITE_TRANSACAO," movimentações do dia")
				escreva("\nSaldo restante no final das transações: R$",saldoCorrente,"\n")
				dia++
				indiceTransacao = 0
			}
		}
	}

	funcao apropriaMovimento(cadeia tipo, cadeia transacao) {
		movimentoTipo[dia - 1][indiceTransacao] = tipo
		movimentoTransacao[dia - 1][indiceTransacao] = transacao
	}

	funcao mostrarExtratoConsolidado() {
		escreva("\nExtrato consolidado")
		para (inteiro i = 0; i < LIMITE_DIAS; i++) {
			escreva("\nDia: ", i + 1)
			para (inteiro j = 0; j < LIMITE_TRANSACAO; j++) {
				se (movimento[i][j] > 0) {
					escreva("\nTipo conta: ", movimentoTipo[i][j], " | Valor: ", movimento[i][j], " - ", movimentoTransacao[i][j])
				}
			}
		}
	}

	
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 19243; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */