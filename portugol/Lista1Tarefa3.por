programa
{
	
	funcao inicio()
	{
		inteiro tempoSegundos, horas, minutos, segundos

		escreva("digite o tempo em segundos: ")
		leia(tempoSegundos)

		horas = (tempoSegundos / 3600)
		escreva("\nHora[s]: ", horas)
		minutos = ((tempoSegundos % 3600) / 60)
		escreva("\nMinuto[s]: ", minutos)
		segundos = ((tempoSegundos % 3600) % 60)
		escreva("\nSegundo[s]: ", segundos)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 375; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */