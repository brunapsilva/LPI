import java.util.Scanner;

//Aluno: Bruna de Paula Silva

/*Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a
digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada
valor matriz e armazenar o resultado em outra matriz de mesma ordem, nas posições
correspondentes. Exibir as matrizes na tela, sob a forma matricial, ou seja, linhas por
colunas.
*/

public class TP02Ex08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int m1[][] = new int[3][4];
		int m2[][] = new int[3][4];
		int mult = 0;
		
		for (int i=0; i < 3; i++) {
			
			for (int j=0; j < 4; j++) {
				System.out.println("Entre com o valor da posição m1["+i+"]["+j+"] = ");
				m1[i][j] = sc.nextInt();
			}
			
		  }
		
		System.out.println("Entre com a constante multiplicativa: ");
		mult = sc.nextInt();
		
		for (int i=0; i < 3; i++) {
			
			for (int j=0; j < 4; j++) {
				m2[i][j] = m1[i][j]*10;
				System.out.println("m2["+i+"]["+j+"] = "+m2[i][j]);
			}
			
		  }
		
		

		}

}
