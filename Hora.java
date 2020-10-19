
import java.util.Scanner;


public class Hora {

	//classe para leitura do teclado
    static Scanner sc = new Scanner(System.in);
    
    // Área Variaveis
    static int hr, min, seg;
    
    // Construtor classe HORA()
    
    public static void Hora() {
    	
    	int h , m, s;
    	
    	System.out.println("Entre com o valor das Horas:");
    	h = sc.nextInt();
    	
    	do {
    		
    		if ((h < 0) || (h > 23)) {
    			System.out.println("Valor incorreto, digite novamente!");
    			h = sc.nextInt();
    		}    		    
    	} while ((h < 0) || (h > 23));
    	
    	System.out.println("Entre com o valor dos Minutos:");
    	m = sc.nextInt();
    	
    	do {
    		if (m < 0 || m > 59) {
    			System.out.println("Valor incorreto, digite novamente!");
    			m = sc.nextInt();
    		}
    	} while(m < 0 || m > 59);
    	
    	System.out.println("Entre com o valor dos Segundos:");
    	s = sc.nextInt();
    	
    	do {
    		if (s < 0 || s > 59) {
    			System.out.println("Valor incorreto, digite novamente!");
    			s = sc.nextInt();
    		}
    	} while(s < 0 || s > 59);
    	
    	hr = h;
    	min = m;
    	seg = s;    
    }

    // Construtor classe HORA(h,m,s)
    public static void Hora(int h, int m, int s) {
    	hr = h;
    	min = m;
    	seg = s;
    }
    
    public static void setHor(int h) {
    	hr = h;
    }

    public static void setMin(int m) {
    	min = m;    	
    }

    public static void setSeg(int s) {
    	seg = s;    	
    }
    
    public static void setHor() {
    	
    	int h;
    	
    	System.out.println("Entre com o valor das Horas:");
    	h = sc.nextInt();
    	
    	do {
    		if (h < 0 || h > 24) {
    			System.out.println("Valor incorreto, digite novamente!");
    			h = sc.nextInt();
    		}
    	} while(h < 0 || h > 24);
    	
    	hr = h;
    	
    }

    public static void setMin() {
    	
    	int m;
    	
    	System.out.println("Entre com o valor dos Minutos:");
    	m = sc.nextInt();
    	
    	do {
    		if (m < 0 || m > 59) {
    			System.out.println("Valor incorreto, digite novamente!");
    			m = sc.nextInt();
    		}
    	} while(m < 0 || m > 59);
    	
    	min = m;
    	
    }

    public static void setSeg() {
    	
    	int s;
    	
    	System.out.println("Entre com o valor dos Segundos:");
    	s = sc.nextInt();
    	
    	do {
    		if (s < 0 || s > 59) {
    			System.out.println("Valor incorreto, digite novamente!");
    			s = sc.nextInt();
    		}
    	} while(s < 0 || s > 59);
    }

	public static int getHr() {
		return hr;
	}

	public static int getMin() {
		return min;
	}

	public static int getSeg() {
		return seg;
	}
    
    public static String getHora1() {
    	
    	String hora;
    	String h,m,s;
    	
    	if (hr < 10) {
    		h = "0"+ Integer.toString(hr);    		
    	} else if (hr > 0){
    		h = Integer.toString(hr);
    	} else {
    		h = "00";
    	}
    	
    	if (min < 10) {
    		m = "0"+ Integer.toString(min);    		
    	} else if (min > 0){
    		m = Integer.toString(min);
    	} else {
    		m = "00";
    	}
    	
    	if (seg < 10) {
    		s = "0"+ Integer.toString(seg);    		
    	} else if (seg > 0){
    		s = Integer.toString(seg);
    	} else {
    		s = "00";
    	}
    	    	
    	hora = h +":"+m+":"+s;
    	
    	return hora;
    }
    
    public static String getHora2() {
    	
    	String h,m,s, fim, hCompleta;
    	int qtdHora;
    	
    	if (hr > 12) {    		
    		qtdHora = hr - 12;
    		fim = "PM";    		
    	} else  if (hr > 0){    		
    		qtdHora = hr;
    		fim = "AM";
    	} else {
    		qtdHora = 12;
    		fim = "AM";
    	}
    	
    	if (qtdHora < 10) {
    		h = "0"+ Integer.toString(qtdHora);    		
    	} else if (qtdHora > 0){
    		h = Integer.toString(qtdHora);
    	} else {
    		h = "00";
    	}
    	
    	if (min < 10) {
    		m = "0"+ Integer.toString(min);    		
    	} else if (min > 0){
    		m = Integer.toString(min);
    	} else {
    		m = "00";
    	}
    	
    	if (seg < 10) {
    		s = "0"+ Integer.toString(seg);    		
    	} else if (seg > 0){
    		s = Integer.toString(seg);
    	} else {
    		s = "00";
    	}
    	
    	hCompleta = h+":"+m+":"+s+" "+fim;
    	return hCompleta;
    }
    
    public static int getSegundos() {
    	
    	int segundos;
    	
    	segundos = seg+(min*60)+(hr*3600);
    	
    	return segundos;
    }

}
