import java.util.Scanner;

//Aluno: Bruna de Paula Silva

/*Entrar via teclado com dez valores positivos. Consistir a digita��o e enviar mensagem de
erro, se necess�rio. Ap�s a digita��o, exibir:
  a. O maior valor;
  b. A soma dos valores;
  c. A m�dia aritm�tica dos valores.
*/

public class TP02Ex02 {
	 

	public static void main(String[] args) {
		
		//classe para leitura do teclado
		Scanner sc = new Scanner (System.in);
		float[] num = new float[10];
		float maior, soma;
		float media;
		int x;
		
		for (int i=0; i < 10; i++) {
			x = i+1;
			System.out.println("Entre com o "+ x +"� numero: ");
			num[i] = sc.nextInt();			
		}
		
		maior = 0;
		soma = 0;
		
		for (int i=0; i < 10; i++) {
			if(maior < num[i]) {
				maior = num[i];
			}
			soma += num[i];
		}
		
		media = (soma/10);
		
		
		
		System.out.println("O maior valor �: "+maior);
		System.out.println("A soma de todos os itens �: "+soma);
		System.out.println("A m�dia �: " + media);

	}

}

