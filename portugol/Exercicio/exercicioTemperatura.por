programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real celsius,fahrenheit
		
		escreva("Escreva a temperatura em celsius ")
		leia (celsius)
		fahrenheit = ((celsius * 1.8) + 32)
		escreva("A temperatura em Fahrenheit é: ", Matematica.arredondar(fahrenheit, 2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 281; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */