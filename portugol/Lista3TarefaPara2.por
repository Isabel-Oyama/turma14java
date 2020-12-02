programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		
		/*
		 * 1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
		 * coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:
		a) média do salário da população;
		b) média do número de filhos;
		c) maior salário;
		d) percentual de pessoas com salário até R$100,00.
		 *
		 */
		 //variaveis
		const inteiro HABITANTES=20
		
		 real salario = 0.0
		 real numeroFilhos = 0, totalFilhos = 0
		 real mediaSalarios = 0.0, mediaNumeroFilhos = 0.0
		 real maiorSalario = 0.0, percentualPessoas100 = 0.0, totalSalarios=0.0
		 real conta100=0.00
		
		 para (inteiro habitantes = 1 ; habitantes <= HABITANTES; habitantes++)
		 {
		 	escreva("Digite o salario do habitante: ")
		 	leia(salario)
		 	escreva("Digite o numero de filhos do habitante: ")
		 	leia(numeroFilhos)
			//processamentos
			totalSalarios = totalSalarios + salario
			totalFilhos = totalFilhos + numeroFilhos
			se (maiorSalario < salario)
			{
				maiorSalario = salario	
			}
			se (salario <=100) {
				conta100++
			}
		 	
		 }
		 mediaSalarios = mat.arredondar((totalSalarios / HABITANTES),2)
		 mediaNumeroFilhos = totalFilhos / HABITANTES
		 percentualPessoas100 = (conta100 / HABITANTES)*100
		
		 //saidas
		 escreva("\nMédia de Salarios: ", mediaSalarios)
		 escreva("\nMedia de filhos: ", mediaNumeroFilhos)
		 escreva("\nMaior Salario: ", maiorSalario)
		 escreva("\nPercentual de pessoas com salário até R$100,00 : ", percentualPessoas100,"%")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1102; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */