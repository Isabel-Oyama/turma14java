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
		inteiro indiceTransacao = 0
		real movimento[TAMANHO]

		enquanto(continuar == 's' ou continuar =='S' ou indiceTransacao < TAMANHO) {
			continuar = 'N'
			escreva("\nConta: ", numeroConta, " Dia: ", dia, "\nCPF: ", cpf)
			escreva("\nDigite umas das opções:  ")
			escreva("\n1 - Crédito ")
			escreva("\n2 - Débito ")
			escreva("\n3 - Saldo ")
			escreva("\n4 - Empréstimo ")
			escreva("\n0 - Sair \n")
			leia(acessoTransacao)

			se (acessoTransacao == 0) {
				pare
			}
			escreva("Seu saldo atual é: R$ ", saldo)
			se (acessoTransacao == 1){
				movimento[indiceTransacao] = creditar()
				saldo = saldo + movimento[indiceTransacao]
				indiceTransacao++
				limpa()
			} senao se (acessoTransacao == 2) {
				movimento[indiceTransacao] = debitar()
				saldo = saldo + movimento[indiceTransacao]
				indiceTransacao++
				limpa()
			} senao se (acessoTransacao == 3) {
				escreva("\nSeu saldo atual é de: R$ ", saldo)
			} senao se (acessoTransacao == 4) {
				escreva("\nSeu saldo atual é de R$ ", saldo, ", deseja realizar um empréstimo? (S/N) ")
				leia(realizarEmprestimo)
				se(realizarEmprestimo == 's' ou realizarEmprestimo == 'S') {
					real retiradaEmprestimo = 0.0
					escreva("\nSeu saldo de empréstimo é de:R$ ", saldoEmprestimo)
					faca {
						se (saldoEmprestimo <= 0) {
							escreva("\nSeu saldo está zerado")
							pare
						}
						escreva("\nQuanto deseja retirar? ")
						leia(retiradaEmprestimo)	
						se (retiradaEmprestimo <= saldoEmprestimo) {
							saldoEmprestimo = saldoEmprestimo - retiradaEmprestimo
							saldo = saldo + retiradaEmprestimo
							retiradaEmprestimo = 0.0
							escreva("\nSeu saldo atual é de: R$ ", saldo)
							escreva("\nSeu saldo de empréstimo é de: R$ ", saldoEmprestimo)
						} senao {
							escreva("\nRetirada não permitida, saldo insuficiente")
						}
					} enquanto (retiradaEmprestimo > saldoEmprestimo e saldoEmprestimo > 0)
				}
			} 
			se (indiceTransacao == 10) {
				escreva("\nOperações realizadas:")
				para (inteiro x = 0; x < TAMANHO; x++) {
					escreva("\nOperacao ", (x + 1), ": ", movimento[x])
				}
				
				escreva("\nDeseja continuar? (S/N) ")
				leia(continuar)
				dia++
				indiceTransacao = 0
			}
		}

		escreva("\nCPF: ", cpf, "\nConta: ", numeroConta, "\nSaldo final: ", saldo)
	}

	funcao real creditar() {
		real valor
		escreva("\nValor a ser creditado: R$ ")
		leia(valor)
		retorne valor
	}

	funcao real debitar() {
		real valor
		escreva("\nValor a ser debitado: R$ ")
		leia(valor)
		se (valor < 0) {
			retorne valor
		} senao {
			retorne -1 * valor 
		}
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1634; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */