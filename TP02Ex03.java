import java.util.Scanner;

//Aluno: Bruna de Paula Silva

/*Entrar via teclado com �N� valores quaisquer. O valor �N� (que representa a quantidade de
  n�meros) ser� digitado, dever� ser positivo, por�m menor que vinte. Caso a quantidade n�o
  satisfa�a a restri��o, enviar mensagem de erro e solicitar o valor novamente. Ap�s a
  digita��o dos �N� valores, exibir:
  a. O maior valor;
  b. O menor valor;
  c. A soma dos valores;
  d. A m�dia aritm�tica dos valores;
  e. A porcentagem de valores que s�o positivos;
  f. A porcentagem de valores negativos;
*/

public class TP02Ex03 {

	public static void main(String[] args) {
		
	do {
		//classe para leitura do teclado
				Scanner sc = new Scanner (System.in);
				
				int n;
				float maior, soma, menor, pos, neg, percp, percn;
				float media;
				int x;
				String op;
				
				System.out.println("Entre com a quantidade de valores: ");
				
				do {
					n = sc.nextInt();
					
					if (n > 20) {
						System.out.println("O valor precisa ser menor que 20. Tente novamente!");
					} 
				} while (n > 20);
				
				float[] num = new float[n];
				
				for (int i=0; i < n; i++) {
					x = i+1;
					System.out.println("Entre com o "+ x +"� numero: ");
					num[i] = sc.nextInt();			
				}
				
				maior = 0;
				menor = num[1];
				soma = 0;
				neg = 0;
				pos = 0;
				
				for (int i=0; i < 10; i++) {
					if(maior < num[i]) {
						maior = num[i];
					}
					if(menor > num[i]) {
						menor = num[i];
					}
					soma += num[i];
					if (num[i] < 0) {
						neg ++;
					} else {
						pos ++;
					}
				}
				
				media = (soma/n);
				percp = (100*pos)/n;
				percn = (100*neg)/n;
				
				System.out.println("O maior valor �: "+maior);
				System.out.println("O menor valor �: "+menor);
				System.out.println("A soma de todos os itens �: "+soma);
				System.out.println("A m�dia �: " + media);
				System.out.println("A porcentagem de negativos foi: "+ percn +"%");
				System.out.println("A porcentagem de positivos foi: "+ percp +"%");
				
				System.out.println("Deseja reiniciar o processo? S/N");
				
				do {
					op = sc.next();
					if (op != "N" && op != "S") {
						System.out.println("Op��o errada. Tente novamente!");
					}
					}while (op != "N" && op != "S");
				}	
		
	}		
		

