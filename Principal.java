public class Principal {

	public static void main(String[] args) {
		
		Hora.Hora();
		
		System.out.println("Hora Digitada: " + Hora.getHr() + " h");
		System.out.println("Minuto Digitado: " + Hora.getMin() + " m");
		System.out.println("Segundo Digitado: " + Hora.getSeg() + " s");
		
		Hora.Hora(0,0,15);
		
		System.out.println("Hora Digitada: " + Hora.getHr() + " h");
		System.out.println("Minuto Digitado: " + Hora.getMin() + " m");
		System.out.println("Segundo Digitado: " + Hora.getSeg() + " s");
		
		
		System.out.println(Hora.getHora1());
		
		Hora.setHor();
		Hora.setMin();
		Hora.setSeg();
		
		System.out.println(Hora.getHora2());
		
		Hora.setHor(13);
		Hora.setMin(25);
		Hora.setSeg(50);
		System.out.println(Hora.getSegundos());
		
		Data.Data();
		
		System.out.println("Dia Digitado: " + Data.retDia());
		System.out.println("Mês Digitado: " + Data.retMes());
		System.out.println("Ano Digitado: " + Data.retAno());
		
		Data.Data(30, 12, 1988);
		
		System.out.println("Data Formatada: " + Data.mostra1());
		
		Data.entraDia();
		Data.entraMes();
		Data.entraAno();
		
		System.out.println("Mês por Extenso: " + Data.mostra2());		
		System.out.println("É Bissexto? " + Data.bissexto());
		
		Data.entraDia(15);
		Data.entraMes(04);
		Data.entraAno(2020);
		System.out.println("Dias Transcorridos: " + Data.diasTrancorridos());	
		Data.apresentaDataAtual();	
			
		

	}

}
