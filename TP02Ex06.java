import java.util.Scanner;

//Aluno: Bruna de Paula Silva

/*Armazenar seis nomes em uma matriz de ordem 2x3. Apresentar os nomes na tela.
*/

public class TP02Ex06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		String m[][] = { {"João","Luiz","Maria" }, {"Clara","Paulo","Bruna"}};
		
		for (int i=0; i < 2; i++) {
			
			for (int j=0; j < 3; j++) {
				System.out.println("m["+i+"]["+j+"] =" + m[i][j]);
			}
			
		  }

		}

}
