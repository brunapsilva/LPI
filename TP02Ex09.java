import java.util.Scanner;

//Aluno: Bruna de Paula Silva

/*Entrar com uma matriz de ordem MxN, onde a ordem tamb�m ser� escolhida pelo usu�rio,
sendo que no m�ximo 10x10. A matriz n�o precisa ser quadr�tica. Ap�s a digita��o dos
elementos, calcular e exibir a matriz transposta.
*/

public class TP02Ex09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int m,n;
		
		System.out.println("Entre com a quantidade de colunas da matriz: ");
		
		do {
			m = sc.nextInt();
			
			if (m > 10) {
				System.out.println("O valor precisa ser menor que 10. Tente novamente!");
			} 
		} while (m > 10);
		
        System.out.println("Entre com a quantidade de linhas da matriz: ");
		
		do {
			n = sc.nextInt();
			
			if (n > 10) {
				System.out.println("O valor precisa ser menor que 10. Tente novamente!");
			} 
		} while (n > 10);
		
		int matriz[][] = new int[m][n];
		
		for (int i=0; i < m; i++) {
			
			for (int j=0; j < n; j++) {
				System.out.println("Entre com o valor da posi��o matriz["+i+"]["+j+"] = ");
				matriz[i][j] = sc.nextInt();
			}
			
		  }
		
		for (int i=0; i < m; i++) {
			
			for (int j=0; j < n; j++) {
				System.out.println("matriz["+i+"]["+j+"] = "+matriz[i][j]);
			}
			
		  }			

		}

}
