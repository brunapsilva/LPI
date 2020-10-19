
import java.util.Scanner;
import java.text.DateFormat;
import java.util.Date;

public class Data {
	
	//classe para leitura do teclado
	static Scanner sc = new Scanner(System.in);
    
    // Área Variaveis
	static int dia, mes, ano;
    
// Construtor classe DATA()
    
    public static void Data() {
    	
    	int d , m, a;
    	boolean op;
    	
    	System.out.println("Entre com o valor do Dia:");
    	d = sc.nextInt();
    	
    	do {
    		
    		if((d<1)||(d>31)) {
    			System.out.println("Valor do Dia inválido. Digite o dia novamente!");
    	    	d = sc.nextInt();
    		} 
    	}while ((d<1)||(d>31));
    	
    	System.out.println("Entre com o valor do Mês:");
    	m = sc.nextInt();
    	
    	do {
    		if ((m<1)||(m>12)) {
    			System.out.println("Valor do Mês inválido. Digite o mês novamente!");
    	    	m = sc.nextInt();
    		} 
    	}while ((m<1)||(m>12));
    	
    	do {
    		if ((m == 4) || (m == 6) || (m == 9) || (m == 11) ) {
    			
    			if (d == 31) {
    				System.out.println("Dia e/ou mês inválido! ");
    				System.out.println("Digite o valor do Dia novamente: ");
        			d = sc.nextInt();
    				System.out.println("Digite o valor do Mês novamente: ");
        			m = sc.nextInt();
    			} else {
    				if ((m ==2) && (d>29)) {
    					System.out.println("Dia e/ou mês inválido! ");
        				System.out.println("Digite o valor do Dia novamente: ");
            			d = sc.nextInt();
        				System.out.println("Digite o valor do Mês novamente: ");
            			m = sc.nextInt();
    				}else {
    					op = true;
    				}
    			}    			
    		}
    	} while(op = false);
    	
    	op = false;
    	    	
    	System.out.println("Entre com o valor do Ano:");
    	a = sc.nextInt();
    	
    	do {
    		if (a<1) {
    			System.out.println("Ano inválido! Digite novamente: ");
    			a = sc.nextInt();    		
    		} else {
    			//verificar bissexto
    			if ((d == 29)&&(m==2)) {    				   				
    				if (bissexto(a) == false) {
    					System.out.println("Ano inválido! Digite novamente: ");
            			a = sc.nextInt();
    				} else {
    					op = true;
    				    }    			
    			    } else {
    				op = true;
    			    }    				
    			}		
    	}while (op = false);
    	
    	dia = d;
    	mes = m;
    	ano = a;    
    }

    public static void Data(int d, int m, int a) {
    	dia = d;
    	mes = m;
    	ano = a;
    }


    public static void entraDia(int d) {
    	dia = d;	
    }

    public static void entraMes(int m) {
    	mes = m;
    }

    public static void entraAno(int a) {
    	ano = a;
    }
    
    public static void entraDia() {
    	
    	int d;
    	
    	System.out.println("Entre com o valor do Dia:");
    	d = sc.nextInt();
    	
    	do {
    		if((d<1)||(d>31)) {
    			System.out.println("Valor Inválido. Tente novamente:");
    	    	d = sc.nextInt();
    		} 
    	} while ((d<1)||(d>31));
    	
    	dia = d;    	
    }  
    
    public static void entraMes() {
    	int m;
    	
    	System.out.println("Entre com o valor do Mês:");
    	m = sc.nextInt();
    	
    	do {
    		if((m<1)||(m>12)) {
    			System.out.println("Valor Inválido. Tente novamente:");
    	    	m = sc.nextInt();
    		} 
    	} while ((m<1)||(m>12));
    	
    	mes = m;
    }    	
      
    public static void entraAno() {
    	int a;
    	
    	System.out.println("Entre com o valor do Ano:");
    	a = sc.nextInt();
    	
    	do {
    		if(a<1) {
    			System.out.println("Valor Inválido. Tente novamente:");
    	    	a = sc.nextInt();
    		} 
    	} while (a<1);
    	
    	ano = a;
    }
    
    public static int retDia() {
    	return dia;
    }
    
    public static int retMes() {
    	return mes;
    }
    
    public static int retAno() {
    	return ano;
    }
    
    public static String mostra1() {
    	String data;
    	String d, m, a;
    	
    	// adiciona 0 à esquerda nos dias menores que 10
    	if (dia < 10) {
    		d = '0' + Integer.toString(dia);
    	} else {
    		d = Integer.toString(dia);
    	}
    	
    	// adiciona o 0 a esquerca em meses menores que 10
    	if (mes < 10) {
    		m = "0" + Integer.toString(mes);
    	} else {
    		m = Integer.toString(mes);
    	}
    	
    	// adiciona o 0 a esquerda em anos menores que 1000
    	if (ano < 10) {
    		a = "000" + Integer.toString(ano);
    	} else if (ano < 100) {
    		a = "00" + Integer.toString(ano);
    	} else if (ano < 1000) {
    		a = "0" + Integer.toString(ano);
    	} else {
    		a = Integer.toString(ano);
    	}
    	    	
    	// concatena os dias, meses e anos no formato dd/mm/aaaa
    	data = d + '/' + m + '/' + a;
    	
    	return data;
    }

    public static String mostra2() {
    	String data;
    	String d = null, m = null, a = null;
    	
    	// adiciona 0 à esquerda nos dias menores que 10
    	if (dia < 10) {
    		d = '0' + Integer.toString(dia);
    	} else {
    		d = Integer.toString(dia);
    	}
    	
    	switch(mes) {
    	    case 1:
   		    m = "Janeiro";
    	    break;
    	  case 2:
   		    m = "Fevereiro";
    	    break;
    	  case 3:
    		m = "Março";
      	    break;
      	  case 4:
      		m = "Abril";
      	    break;
    	  case 5:
    		m = "Maio";
      	    break;
      	  case 6:
      		m = "Junho";
      	    break;
    	  case 7:
    		m = "Julho";
      	    break;
      	  case 8:
      		m = "Agosto";
      	    break;
      	  case 9:
      		m = "Setembro";
       	    break;
       	  case 10:
       		m = "Outubro";
       	    break;
      	  case 11:
      		m = "Novembro";
       	    break;
       	  case 12:
       		m = "Dezembro";
       	    break;
    	}
    	
    	// adiciona o 0 a esquerda em anos menores que 1000
    	if (ano < 10) {
    		a = "000" + Integer.toString(ano);
    	} else if (ano < 100) {
    		a = "00" + Integer.toString(ano);
    	} else if (ano < 1000) {
    		a = "0" + Integer.toString(ano);
    	} else {
    		a = Integer.toString(ano);
    	}
    	    	
    	// concatena os dias, meses e anos no formato dd/mm/aaaa
    	data = d + "/" + m + "/" + a;
    	
    	return data;    	
    }
        
    public static boolean bissexto() {
    	
    	// se o ano for maior que 400
        if(ano % 400 == 0){
            return true;
        // se o ano for menor que 400
        } else if((ano % 4 == 0) && (ano % 100 != 0)){
            return true;
        } else{
            return false;
        }
    }
    
    public static boolean bissexto(int a) {
    	
    	// se o ano for maior que 400
        if(a % 400 == 0){
            return true;
        // se o ano for menor que 400
        } else if((a % 4 == 0) && (a % 100 != 0)){
            return true;
        } else{
            return false;
        }
    }

    public static int diasTrancorridos() {
    	 int dt = 0;
    	 
    	 switch(mes -1) {
 	        case 1:
		      dt = dia + 31;
 	          break;
      	    case 2:
      	      dt = dia + 59;
 	          break;
 	        case 3:
 	          dt = dia + 90;
   	          break;
   	        case 4:
   		      dt = dia + 120;
   	          break;
 	        case 5:
 		      dt = dia + 151;
   	          break;
   	        case 6:
   		      dt = dia + 181;
   	          break;
 	        case 7:
 		      dt = dia + 212;
   	          break;
   	        case 8:
   		      dt = dia + 243;
   	          break;
   	        case 9:
   		      dt = dia + 273;
    	      break;
    	    case 10:
    		  dt = dia + 304;
    	      break;
   	        case 11:
   		      dt = dia + 334;
    	      break;    	    
  	        default:
  	          dt = dia;   	    
 	}
    	 
    	 if ((mes >= 2) && (bissexto(ano) == true)) {
    		 dt++;
    	 }  	 
    	 
    	 return dt;
     }
     
    public static void apresentaDataAtual() {
    	Date data = new Date();
 		
    	DateFormat dff = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(dff.format(data));
        
 		
     }
}
    
    
    