programa
{
	
	funcao inicio()
	{
		const cadeia numeroConta = "G2", cpf = "12345678999"
		const inteiro TAMANHO = 10
		real saldoEmprestimo = 30000.0
		real saldo = 0.0
		caracter continuar = 'S', realizarEmprestimo

		escreva("\nCPF: ", cpf, "\nConta", numeroConta)
		
		enquanto(continuar == 's' ou continuar =='S') {
			continuar = 'N'
			real movimento[TAMANHO]
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
			para(inteiro x = 0; x < TAMANHO; x++) {
				caracter operacao;
				escreva("\nSeu saldo atual é de: R$ ", saldo)
				faca {
					escreva("\nCrédito ou Débito? (C/D): ")
					leia(operacao)
					se (operacao == 'c' ou operacao == 'C') {
						movimento[x] = creditar()
						saldo = saldo + movimento[x]
					} senao se (operacao == 'd' ou operacao == 'D') {
						movimento[x] = debitar()
						saldo = saldo + movimento[x]
					} senao {
						escreva("\nOperação inválida")
					}	
				} enquanto ((operacao <> 'c' ou operacao <> 'C') e (operacao <> 'd' ou operacao <> 'D'))
			}

			escreva("\nOperações realizadas")
			para (inteiro x = 0; x < TAMANHO; x++) {
				escreva("\nOperacao ", (x + 1), ": ", movimento[x])
			}
			
			escreva("\nSeu saldo é de R$ ", saldo)
			escreva("\nDeseja continuar? (S/N) ")
			leia(continuar)
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
 * @POSICAO-CURSOR = 365; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {retiradaEmprestimo, 20, 9, 18};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */