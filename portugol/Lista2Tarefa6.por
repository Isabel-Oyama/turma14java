programa
{
	
	funcao inicio()
	{
		inteiro infantilA
		inteiro infantilB
		inteiro juvenilA
		inteiro juvenilB
		inteiro adulto
		inteiro idade

		escreva("Digite a idade do nadador(ra): ")
		leia(idade)

		se(idade >= 5 e idade <=7){
			escreva("infantilA")
		}
		senao se(idade >= 8 e idade <=11){
			escreva("infantilB")
		}
		senao se (idade >= 12 e idade <=13){
			escreva("juvenilA")
		}
		senao se (idade >=14 e idade<=17){
			escreva("juvenilB")
		}
		senao se (idade>18){
			escreva("adulto")
		}
		senao{
			escreva("Idade inválida")
		}
		
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 550; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */