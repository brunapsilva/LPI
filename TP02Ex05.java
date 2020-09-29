import java.util.Scanner;

//Aluno: Bruna de Paula Silva

/*Armazenar seis valores em uma matriz de ordem 3x2. Apresentar os valores na tela.
*/

public class TP02Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int m[][] = { {1,2 }, {3,4}, {5,6}};
		
		for (int i=0; i < 3; i++) {
			
			for (int j=0; j < 2; j++) {
				System.out.println("m["+i+"]["+j+"] =" + m[i][j]);
			}
			
		  }

		}
	
}