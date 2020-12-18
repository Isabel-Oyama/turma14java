programa
{
	
	funcao inicio()
	{
		inteiro intervalo1 = 0, intervalo2 = 0, intervalo3 = 0, intervalo4 = 0, numero
		faca {
			escreva("Digite um número de 0 a 100: ")
			leia(numero)
			se(numero >= 0 e numero <= 25) {
				intervalo1++
			} senao se (numero >= 26 e numero <= 50) {
				intervalo2++
			} senao se (numero >= 51 e numero <= 75) {
				intervalo3++
			} senao se (numero >= 76 e numero <= 100) {
				intervalo4++
			} senao se (numero > 100) {
				escreva("\nNúmero maior que 100")
			}
		} enquanto(numero >= 0)

		escreva("\nNúmeros no intervalo 1: " + intervalo1)
		escreva("\nNúmeros no intervalo 2: " + intervalo2)
		escreva("\nNúmeros no intervalo 3: " + intervalo3)
		escreva("\nNúmeros no intervalo 4: " + intervalo4)
	}0

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 164; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */