programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real peso, altura, imc

		escreva("\nDigite sua altura (cm): ")
		leia(altura)

		escreva("\nDigite seu peso (kg): ")
		leia(peso)

		imc = calcularImc(peso, (altura / 100))
		escreva("\nSeu IMC é de: ", imc)
		se (imc < 18.5) {
			escreva("\nAbaixo do peso")
		} senao se (imc >= 18.5 e imc < 25.0) {
			escreva("\nPeso normal")
		} senao se (imc >= 25 e imc < 30) {
			escreva("\nAcima do peso")
		} senao {
			escreva("\nObeso")
		}
	}
	
	funcao real calcularImc(real peso, real altura){
		real imc = peso/Matematica.potencia(altura,2.0)
		retorne Matematica.arredondar(imc, 2)
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 178; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */