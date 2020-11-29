programa
{
	
	funcao inicio()
	{
		inteiro tempoDuracao, horas, minutos, segundos, restoHoras

		escreva("Escreva tempo em segundos ")
		leia(tempoDuracao)

		horas = tempoDuracao / 3600
		restoHoras = tempoDuracao % 3600
		minutos = restoHoras / 60
		segundos = restoHoras % 60

		escreva("\nhoras: " + horas + "\nminutos: " + minutos + "\nsegundos: " + segundos)
		
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 367; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */