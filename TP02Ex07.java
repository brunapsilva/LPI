import java.util.Scanner;

//Aluno: Bruna de Paula Silva

/*Entrar via teclado com doze valores e armazen�-los em uma matriz de ordem 3x4. Ap�s a
digita��o dos valores solicitar uma constante multiplicativa, que dever� multiplicar cada
valor matriz e armazenar o resultado na pr�pria matriz, nas posi��es correspondentes.
*/

public class TP02Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int m[][] = new int[3][4];
		int mult = 0;
		
		for (int i=0; i < 3; i++) {
			
			for (int j=0; j < 4; j++) {
				System.out.println("Entre com o valor da posi��o m["+i+"]["+j+"] = ");
				m[i][j] = sc.nextInt();
			}
			
		  }
		
		System.out.println("Entre com a constante multiplicativa: ");
		mult = sc.nextInt();
		
		for (int i=0; i < 3; i++) {
			
			for (int j=0; j < 4; j++) {
				m[i][j] *=10;
				System.out.println("m["+i+"]["+j+"] = "+m[i][j]);
			}
			
		  }
		
		

		}

}
