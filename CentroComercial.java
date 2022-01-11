
public class CentroComercial extends Thread {
	
	public CentroComercial() {
		
	}
	
	public CentroComercial(int numAdultosTotales, int numNinyosTotales ) {
		this.numAdultosTotales=numAdultosTotales;
		this.numNinyosTotales=numNinyosTotales;
	}
	
	private int numAdultosTotales;
	private int numNinyosTotales;
	private int limiteAfluenciaTotal;
	private int contador;
	
	
	public void run() {
		
		try {
			sleep((int) Math.floor(Math.random()*1000));
			
			while (true)
		
		if (limiteAfluenciaTotal<500 && limiteAfluenciaTotal==contador)  {
			
			
			numAdultosTotales=(int) Math.floor(Math.random()*5); // número aleatorio adultos 
			
			numNinyosTotales=(int) Math.floor(Math.random()*5); // número aleatorio de niños 
			
			contador=numNinyosTotales+numAdultosTotales;
			
			limiteAfluenciaTotal=limiteAfluenciaTotal+contador;
			
			System.out.println("han entrado "+ numAdultosTotales + " adultos y "+numNinyosTotales+" niños");
			
			System.out.println("Afono actual "+ limiteAfluenciaTotal );
			
			numAdultosTotales=(int) Math.floor(Math.random()*5); // número aleatorio adultos 
			
			numNinyosTotales=(int) Math.floor(Math.random()*5); // número aleatorio de niños 
			
			contador=numNinyosTotales+numAdultosTotales;
			
			limiteAfluenciaTotal=limiteAfluenciaTotal-contador;
			
			System.out.println("han salido "+ numAdultosTotales + " adultos y "+numNinyosTotales+" niños");
			
			System.out.println("Afono actual "+ limiteAfluenciaTotal );
			
			
		} 
		
		
		} catch (InterruptedException e) {
		
		e.printStackTrace();
	}

}
}
