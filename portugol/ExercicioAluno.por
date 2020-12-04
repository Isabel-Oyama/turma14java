programa
{
	inclua biblioteca Texto
	
	funcao inicio()
	{
	cadeia alunos[] = {"Allen de Lima Vieira","André de Brito Silva da Costa","Bárbara Liboni Guerra","Beatriz Martins","Beymar Jhoel Acapa Lima",
	"Breno Nogueira Botelho Noccioli","Daniel Augusto Gomes Ferreira Filho","Danilo Mendes Ferreira","Danilo Pereira da Silva",
	"Davi Silva Vieira","Diego Vinicio da Silva Nascimento","Erick Costa Ferreira","Ewerton Inacio Lima","FERNANDA AGAPITO",
	"Fernanda Barbosa Ferraz","Francisco José Pires","Gabriel Sérgio Nascimento Santos Gonçalves","Gideão da Silva Idelfonso",
	"GILSON AMORIM DE MATOS","Guilherme Gonçalves da Silva","Gustavo Rabelo Teles","HELOISA BEATRIZ DE OLIVEIRA COSTA",
	"Igor Mateus Queiroz Gato","Isabel Emiko Yamakawa Oyama","Jackeline Akemi de Moura","José Jorge Hauck Júnior","Juliana Santos André",
	"Kélven Cleiton de Araújo Brandão","Laís Lima Santos","Lucas Anseloni Barros","Lucas Gonçalves da Silva","Luis felipe da silva",
	"Luiz Felipe da Silva Magalhães","Marcos Eduardo Gomes Gonçalves","Micaely da Silva Lima","Rafaela Oliveira Silva","Tiago dos Santos Martins",
	"Verônica Navarro Almena", "Vinicius de Alvez Miranda"}
		caracter generos[] = {'M','M','F','F','M','M','M','M','M','M','M','M','M','F','F','M','M','M','M','M','M','F','M','F','F','M','F','M','F','M','M','M','M','M','F','F','M','F','M'}
		cadeia matriculas[39]
		cadeia aluno, Sim, Nao
		inteiro nota;
		
		
		para (inteiro x=0; x< 39; x++)
		{
			matriculas[x] = "G2"+(x+1)
			se(x < 10) {
				matriculas[x] = "G2-0" + (x+1))
				escreva(matriculas[x])	
			}
			senao{
				matriculas[x] = "G2-" + (x+1)
				escreva(matriculas[x])
			}
			
		}
		para (inteiro x=0; x< 39; x++){
			escreva("\nmatricula:", matriculas[x], " - ",alunos[x])
		}
		
		escreva("\nEscolha um aluno pela matricula:" )
		leia(aluno)
		para (inteiro x=0; x<39; x++) 
		{
			se ( aluno == matriculas[x])
			{
				se( generos[x] == 'M')
				{
					escreva("\nO aluno escolhido foi : ", alunos[x])
					escreva("\nEscreva a nota do aluno ", alunos[x], ": ")
					leia(nota)
					se(nota <= 5){
						escreva("\nAluno reprovado")
					} senao se(nota > 5 e nota < 8){
						escreva("\nAluno de recuperação")
					} senao {
						escreva("\nAluno aprovado")
					}
					
				}
				senao
				{
					escreva("\nA aluna escolhida foi : ", alunos[x])
					escreva("\nEscreva a nota da aluna ", alunos[x], ": ")
					leia(nota)
					se(nota <= 5){
						escreva("\nAluna reprovada")
					} senao se(nota > 5 e nota < 8){
						escreva("\nAluna de recuperação")
					} senao {
						escreva("\nAluna aprovada")
					}
				}
				escreva("Nota: ", nota)
				
			}
		}
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2571; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */