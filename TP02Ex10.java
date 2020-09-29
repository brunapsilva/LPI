import java.util.Scanner;

//Aluno: Bruna de Paula Silva

/*Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário,
sendo que no máximo será de ordem 10 e quadrática. Após a digitação dos elementos,
calcular e exibir a matriz inversa. Exibir as matrizes na tela, sob a forma matricial (linhas x
colunas).
*/

public class TP02Ex10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int m;
		
		System.out.println("Entre com a ordem da matriz: ");
		
		do {
			m = sc.nextInt();
			
			if (m > 10) {
				System.out.println("O valor precisa ser menor que 10. Tente novamente!");
			} 
		} while (m > 10);		
      
		
		int matriz[][] = new int[m][m];
		
		for (int i=0; i < m; i++) {
			
			for (int j=0; j < m; j++) {
				System.out.println("Entre com o valor da posição matriz["+i+"]["+j+"] = ");
				matriz[i][j] = sc.nextInt();
			}
			
		  }
		
		for (int i=m-1; i > -1; i--) {
			
			for (int j=m-1; j > -1; j--) {
				System.out.println("matriz["+i+"]["+j+"] = "+matriz[i][j]);
			}
			
		  }			

		}

}
