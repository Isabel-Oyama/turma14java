programa
{
	inclua biblioteca Texto
	
	funcao inicio()
	{
		cadeia nome
		cadeia genero
		inteiro nota

		escreva("Digite seu nome: ")
		leia(nome)

		escreva("Digite seu genero M masculino, F feminino: ")
		leia(genero)
		genero = Texto.caixa_alta(genero)

		escreva("Digite sua nota: ")
		leia(nota)

		se(nota<5) {
			se(genero == "F"){
				escreva("Você foi reprovada")
			}senao{
				escreva("Você foi reprovado")
			}
		}
		senao {
			se(genero == "F"){
				escreva("Você foi aprovada")
			}senao{
				escreva("Você foi aprovado")
			}
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 437; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */