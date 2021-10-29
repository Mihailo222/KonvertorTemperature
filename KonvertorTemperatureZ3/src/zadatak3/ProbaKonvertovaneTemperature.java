package zadatak3;

public class ProbaKonvertovaneTemperature {
	
	
	public static void main(String[] args) {
		KonvertorTemperature kt = new KonvertorTemperature();
		
		double tempF;
		tempF=kt.konvertujUFaranhajte(0);
		System.out.println(tempF+" F");
		
		double tempC;
		tempC=kt.KonvertujUCelzijus(0);
		System.out.println(tempC+" C");
		
		
		System.out.println("Agr. stanje vode je:" +kt.vratiAgregatnoStanje(-5));
	}

	
	

}
