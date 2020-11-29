programa
{
	
	funcao inicio()
	{
		inteiro anos
		inteiro meses
		inteiro dias
		inteiro diasEntrada
		inteiro restoDias
		

		escreva("idade em dias ")
		leia(diasEntrada)
		
		anos = diasEntrada/365
		restoDias = diasEntrada%365

		meses = restoDias/30
		dias = restoDias%30

		escreva("\nidade em anos " + anos)
		escreva("\nidade em meses " + meses)
		escreva("\nidade em dias " + dias)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 276; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */