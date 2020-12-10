package lista4;

import java.util.concurrent.ThreadLocalRandom;

public class Tarefa3 {

	public static void main(String[] args) {
		
		int N1[][] = new int [4][6];
		int N2[][] = new int [4][6];
		int M1[][] = new int [4][6];
		int M2[][] = new int [4][6];
		
		for(int i=0 ; i<4; i++) {
			for(int j=0 ; j<4; j++) {
				N1[i][j] = ThreadLocalRandom.current().nextInt(3, 4);
				N2[i][j] = ThreadLocalRandom.current().nextInt(1, 2);
			}
		}
		for(int i=0 ; i<4 ; i++) {
			for(int j=0 ; j<6 ; j++) {
				M1[i][j] = N1[i][j] + N2[i][j];
				M2[i][j] = N1[i][j] - N2[i][j];
			}
		}
		System.out.println("M1: ");
		for(int i = 0 ; i<4 ; i++) {
			for(int j=0 ; j<6 ; j++){
				System.out.print(M1[i][j] + " ");
			}
			
		}
		System.out.println("M2: ");
		for(int i = 0 ; i<4 ; i++) {
			for(int j=0 ; j<6 ; j++){
				System.out.print(M2[i][j] + " ");
			}
			
		}
		
		
	}

}
