programa
{
	
	funcao inicio()
	{
		cadeia C //codigo do funcionario
		inteiro N //numero de horas
		inteiro E //tempo excedido
		inteiro horasTrabalhadasNormal

		const inteiro SALARIO_POR_HORAS = 10 
		const inteiro SALARIO_HORAS_EXCEDIDAS = 20
		const inteiro LIMITE_HORAS = 50

		escreva("Digite o código do funcionário: ")
		leia(C)
		
		escreva("Escreva o número de horas trabalhadas: ")
		leia(N)

		se(N > LIMITE_HORAS){
			E = N - LIMITE_HORAS
			horasTrabalhadasNormal = LIMITE_HORAS
		} senao {
			E = 0
			horasTrabalhadasNormal = N	 
		}
		escreva("\nSalário Total: " + ((horasTrabalhadasNormal * SALARIO_POR_HORAS) + (E * SALARIO_HORAS_EXCEDIDAS)))
		escreva("\nSalário excedente: " + E * SALARIO_HORAS_EXCEDIDAS)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 41; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */