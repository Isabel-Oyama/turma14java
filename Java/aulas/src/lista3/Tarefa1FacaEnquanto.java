package lista3;

public class Tarefa1FacaEnquanto {

	public static void main(String[] args) {
		
		int contagem = 233;
		
		do {
			if (contagem >= 300 && contagem <= 400) {
				contagem += 3;
			}else {
				contagem += 5;
			}
			System.out.println(contagem);
		} while (contagem <= 456);
	
		}
	}


