//Aluno: Bruna de Paula Silva
/* Entrar com dois valores via teclado, onde o segundo valor deverá ser maior que o primeiro.
 * Caso contrário solicitar novamente apenas o segundo valor. 
 */
import java.util.Scanner;

public class TP02Ex01 {
	
    public static void main (String[] args){
    	
    	//classe para leitura do teclado
        Scanner sc = new Scanner(System.in);
        
        int v1, v2;
        
        System.out.println("Entre com o primeiro valor: ");
        v1 = sc.nextInt();
        
        System.out.println("Entre com o segundo valor: ");
        
        do {
        	
            v2 = sc.nextInt();
            
        	if (v1 >= v2) {        		
            	System.out.println("O primeiro valor é maior ou igual. Digite o segundo valor novamente!");
            }        	
        }while (v2<v1);
        
        System.out.println("O segundo valor é maior!");
        
        
        
        
    }
}
