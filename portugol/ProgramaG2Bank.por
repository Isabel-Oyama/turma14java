programa
{
	
	funcao inicio()
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
			/*
			 * ########################################################################
			 * ################################ MENU ##################################
			 * ########################################################################
			 */
			escreva("\nConta: ", numeroConta, " Dia: ", dia, "\nCPF: ", cpf)
			escreva("\nDigite umas das opções:  ")
			escreva("\n1 - Crédito ")
			escreva("\n2 - Débito ")
			escreva("\n3 - Saldo ")
			escreva("\n4 - Empréstimo ")
			escreva("\n0 - Sair \n")
			/*
			 * ########################################################################
			 * ################################ MENU ##################################
			 * ########################################################################
			 */
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
 * @POSICAO-CURSOR = 3732; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */