programa
{
	inclua biblioteca Util --> u
	
	funcao inicio()
	{
		inteiro N1[4][6], N2[4][6], M1[4][6], M2[4][6]

		para(inteiro i = 0; i < 4; i++) {
			para (inteiro j = 0; j < 6; j++) {
				N1[i][j]=u.sorteia(3,4)
				N2[i][j]=u.sorteia(1,2)
			}
		}

		para(inteiro i = 0; i < 4; i++) {
			para (inteiro j = 0; j < 6; j++) {
				M1[i][j] = N1[i][j] + N2[i][j]
				M2[i][j] = N1[i][j] - N2[i][j]
			}
		}

		escreva("M1: \n")
		para(inteiro i = 0; i < 4; i++) {
			para (inteiro j = 0; j < 6; j++) {
				escreva(M1[i][j] + " ")
			}
			escreva("\n")
		}

		escreva("\n")
		escreva("M2: \n")
		para(inteiro i = 0; i < 4; i++) {
			para (inteiro j = 0; j < 6; j++) {
				escreva(M2[i][j] + " ")
			}
			escreva("\n")
		}

	
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 251; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */