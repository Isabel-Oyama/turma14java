programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		caracter tipo
		real raio, base, altura, area 
		const real pi = 3.14

		escreva("1 - Circulo\n")
		escreva("2 - Triangulo\n")
		escreva("3 - Retangulo\n")
		escreva("\nDigite o numero que você desejada: ")
		leia(tipo)

		escolha (tipo) {
			caso '1': 
				escreva("Digite o raio: ")
				leia(raio)
				area = pi * Matematica.arredondar(Matematica.potencia(raio,2),2))
				escreva("A área do círculo é: ",area, " cm²")
				pare
			caso '2':
				escreva("Olá, digite a base do retângulo ")
				leia (base)
				escreva ("Olá, digite a altura do retângulo: ")
				leia (altura)
				area = (base*altura)
				escreva ("A área do retângulo é: ", area, "º")
				pare
			caso '3':
				escreva("Digite o valor da base: ")
				leia(base)
				escreva("Digite o valor da altura: ")
				leia(altura)
				area = (base*altura) / 2
				escreva("A area do triangulo é:" + area) 
				pare
			caso contrario:
				escreva("\nFim de programa")
		}
	}
}
 funcao void calcularAreaTriangulo(inteiro base,inteiro altura)
 escreva(

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1071; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */