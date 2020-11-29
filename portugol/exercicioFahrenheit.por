programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real celsius,fahrenheit
		
		escreva("Escreva a temperatura em fahrenheit ")
		leia (fahrenheit)
		celsius = ((fahrenheit -32) * 5/9)
		escreva("A temperatura em celsius é: ", Matematica.arredondar(celsius, 2), " ºC")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 287; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */