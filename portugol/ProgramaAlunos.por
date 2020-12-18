programa
{
	inclua biblioteca Util
	inclua biblioteca Texto
	
	funcao inicio()
	{
		cadeia alunos[] = {"Allen de Lima Vieira","André de Brito Silva da Costa","Bárbara Liboni Guerra","Beatriz Martins","Beymar Jhoel Acapa Lima",
	"Breno Nogueira Botelho Noccioli","Daniel Augusto Gomes Ferreira Filho","Danilo Mendes Ferreira","Danilo Pereira da Silva",
	"Davi Silva Vieira","Diego Vinicio da Silva Nascimento","Erick Costa Ferreira","Ewerton Inacio Lima","Fernanda Agapito",
	"Fernanda Barbosa Ferraz","Francisco José Pires","Gabriel Sérgio Nascimento Santos Gonçalves","Gideão da Silva Idelfonso",
	"Gilson Amorim de Matos","Guilherme Gonçalves da Silva","Gustavo Rabelo Teles","Heloisa Beatriz de Oliveira Costa",
	"Igor Mateus Queiroz Gato","Isabel Emiko Yamakawa Oyama","Jackeline Akemi de Moura","José Jorge Hauck Júnior","Juliana Santos André",
	"Kélven Cleiton de Araújo Brandão","Laís Lima Santos","Lucas Anseloni Barros","Lucas Gonçalves da Silva","Luis felipe da silva",
	"Luiz Felipe da Silva Magalhães","Marcos Eduardo Gomes Gonçalves","Micaely da Silva Lima","Rafaela Oliveira Silva","Tiago dos Santos Martins",
	"Verônica Navarro Almena", "Vinicius de Alvez Miranda"}
		caracter generos[] = {'M','M','F','F','M','M','M','M','M','M','M','M','M','F','F','M','M','M','M','M','M','F','M',
		'F','F','M','F','M','F','M','M','M','M','M','F','F','M','F','M'}
		cadeia matriculas[39], matricula
		cadeia aluno, Sim, Nao
		inteiro menu, cadastrar = 1
		inteiro notas[39]
		para (inteiro x=0; x< 39; x++)
		{
			se((x+1) >= 10) {
				matriculas[x] = "G2-" + (x+1))
				
			}
			senao{
				matriculas[x] = "G2-0" + (x+1)
				
			}
			
			
		}
		para (inteiro x=0; x< 39; x++){
			escreva("\nmatricula:", matriculas[x], " - ",alunos[x])
		}
		escreva("\nDigite a matricula: ")
		leia(matricula)
		para(inteiro x=0; x<39; x++){
			se(matriculas[x] == matricula) {
				escreva("\nDigite a nota do aluno: ")
				leia(notas[x])	
				
			}		
		}
		faca {
			escreva("\n1 - HOMENS")
			escreva("\n2 - MULHERES")
			escreva("\n3 - Aprovados/Aprovadas")
			escreva("\n4 - Reprovados/Reprovadas")
			escreva("\n5 - Procurar por nota")
			escreva("\n0 - Sair\n")
			leia(menu)

			se (menu == 0) {
				pare
			} senao se (menu == 1) {
				listaHomens(alunos, generos, matriculas, notas)
			} senao se (menu == 2) {
				listaMulheres(alunos, generos, matriculas, notas)
			} senao se (menu == 3) {
				listaAprovados(alunos, generos, matriculas, notas)
			} senao se (menu ==4 ) {
				listaReprovados(alunos, generos, matriculas, notas)
			} senao se (menu == 5) {
				listaFiltrados(alunos, generos, matriculas, notas)
			}
			
		} enquanto (menu <> 0)
		
		escreva("\nPrograma finalizado")
	}

	funcao listaHomens(cadeia alunos[], caracter generos[], cadeia matriculas[], inteiro notas[]) {
		escreva("\nLista de Homens")
		para (inteiro x = 0; x < 39; x++) {
			se (generos[x] == 'M' ou generos[x] == 'm') {
				se (aprovado(notas[x], generos[x]) == "APROVADO") {
					escreva("\n", alunos[x], " | Nota: ", notas[x], " | APROVADO" )
				} senao {
					escreva("\n", alunos[x], " | Nota: ", notas[x], " | REPROVADO")
				}
			}
		}
	}

	funcao listaMulheres(cadeia alunos[], caracter generos[], cadeia matriculas[], inteiro notas[]) {
		escreva("\nLista de Mulheres")
		para (inteiro x = 0; x < 39; x++) {
			se (generos[x] == 'F' ou generos[x] == 'f') {
				se (aprovado(notas[x], generos[x]) == "APROVADA") {
					escreva("\n", alunos[x], " | Nota: ", notas[x], " | APROVADA" )
				} senao {
					escreva("\n", alunos[x], " | Nota: ", notas[x], " | REPROVADA")
				}
			}
		}
	}

	funcao listaAprovados(cadeia alunos[], caracter generos[], cadeia matriculas[], inteiro notas[]) {
		escreva("\nLista de Aprovados")
		para (inteiro x = 0; x < 39; x++) {
			se (generos[x] == 'M' ou generos[x] == 'm') {
				se (aprovado(notas[x], generos[x]) == "APROVADO") {
					escreva("\n", alunos[x], " | Nota: ", notas[x], " | APROVADO" )
				}
			} senao {
				se (aprovado(notas[x], generos[x]) == "APROVADA") {
					escreva("\n", alunos[x], " | Nota: ", notas[x], " | APROVADA" )
				}
			}
		}
	}

	funcao listaReprovados(cadeia alunos[], caracter generos[], cadeia matriculas[], inteiro notas[]) {
		escreva("\nLista de Reprovados")
		para (inteiro x = 0; x < 39; x++) {
			se (generos[x] == 'M' ou generos[x] == 'm') {
				se (aprovado(notas[x], generos[x]) == "REPROVADO") {
					escreva("\n", alunos[x], " | Nota: ", notas[x], " | REPROVADO")
				}
			} senao {
				se (aprovado(notas[x], generos[x]) == "REPROVADA") {
					escreva("\n", alunos[x], " | Nota: ", notas[x], " | REPROVADA")
				}
			}
		}
	}

	funcao listaFiltrados(cadeia alunos[], caracter generos[], cadeia matriculas[], inteiro notas[]) {
		inteiro menu
		inteiro notaFiltro
		escreva("\nLista por filtro")
		escreva("\n1 - Nota maior de")
		escreva("\n2 - Nota menor de\n")
		leia(menu)
		limpa()
		escreva("\nDigite a nota: ")
		leia(notaFiltro)
		se (menu == 1) {
			para (inteiro x = 0; x < 39; x++) {
				se (notas[x] >= notaFiltro) {
					se (generos[x] == 'M' ou generos[x] == 'm') {
						se (aprovado(notas[x], generos[x]) == "APROVADO") {
							escreva("\n", alunos[x], " | Nota: ", notas[x], " | APROVADO" )
						} senao {
							escreva("\n", alunos[x], " | Nota: ", notas[x], " | REPROVADO")
						}
					} senao {
						se (aprovado(notas[x], generos[x]) == "APROVADA") {
							escreva("\n", alunos[x], " | Nota: ", notas[x], " | APROVADA" )
						} senao {
							escreva("\n", alunos[x], " | Nota: ", notas[x], " | REPROVADA")
						}
					}
				} 
				senao{
					escreva("\nNotas não encontrada")
					pare
				}
			}
			
		} senao {
			para (inteiro x = 0; x < 39; x++) {
				se (notas[x] <= notaFiltro) {
					se (generos[x] == 'M' ou generos[x] == 'm') {
						se (aprovado(notas[x], generos[x]) == "APROVADO") {
							escreva("\n", alunos[x], " | Nota: ", notas[x], " | APROVADO" )
						} senao {
							escreva("\n", alunos[x], " | Nota: ", notas[x], " | REPROVADO")
						}
					} senao {
						se (aprovado(notas[x], generos[x]) == "APROVADA") {
							escreva("\n", alunos[x], " | Nota: ", notas[x], " | APROVADA" )
						} senao {
							escreva("\n", alunos[x], " | Nota: ", notas[x], " | REPROVADA")
						}
					}
				}
			}
		}
		
	}

	funcao cadeia aprovado(inteiro nota, caracter genero) {
		se (genero == 'M' ou genero == 'm') {
			se (nota <= 5) {
				retorne "REPROVADO"
			} senao {
				retorne "APROVADO"
			}
		} senao {
			se (nota <= 5) {
				retorne "REPROVADA"
			} senao {
				retorne "APROVADA"
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1399; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */