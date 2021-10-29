package zadatak3;

public class KonvertorTemperature {
	/* Napraviti staticku konstantu APSOLUTNA NULA C u ovom paketu koja ima vrednost -273.15
		(STATIC, FINAL, staticke konstante ) I APSOLUTNA NULA C sa vrednoscu -459, 67
		konstanta-ima unapred datu vrednost koja se ne moze menjati
		static-ona se inicijalizuje samo 1-na pocetku izvrsavanja, to je varijabla koja pripada klasi, ne objektu*/
	
		
		static final double APSOLUTNA_NULA_C = -273.15;
		static final double APSOLUTNA_NULA_F=-459.67; 
	
	
	
	
	
	/* Napravi  metodu KonvertujUFarahajte koja kao  parametar dobija parametar iznos temperature u celzijusima(realni broj), ova metoda proverava 
	  da li je uneta temperatura jednaka ili veca od apsolutne nule za celzijusovu skalu, i ako jeste, pretvara je u temperaturu izrazemu 
	  u faranhajtima i vraca kao rezultat. Ako nije, metoda vraca vrednost -1000 ispisuje na ekranu "GRESKA". Konverzija se vrsi po formuli 
	  TF=TC*9/5+32 (IF KLAUZULA I OPERATORI POREDJANJA VREDNOSTI, RETURN NAREDBA I PREKIDANJE IZVRSAVANJA METODE
	 */
	
	  double konvertujUFaranhajte(double Celzijus) {
		  
		  if(Celzijus>=APSOLUTNA_NULA_C) {
		  
			  double tf=Celzijus*9/5+32;  // mogli smo i samo da napisemo return tf=..., znaci samo dole, ne i ovde
			  return tf;
	  	
		  }else {
		 
		  System.out.println("GRESKA");
		  return -1000; // mora return da ide poslednja instrukcija, jer se posle return nista sto je posle  ne izvrsava
	     
		  }
		  // uvek sta god iskucas, idi na save all
	  
	}
	  
	  
	  double KonvertujUCelzijus(double farahajt) {
		  if(farahajt>=APSOLUTNA_NULA_F) {
			  return(farahajt-32)*5/9; //moze ovako jer se sa farahajtom nista vise ne radi
		  }
			  System.out.println("GRESKA");
			  return -1000; // moze i bez else grane, znaci ako postoji return, svakako se prekida izvrsavanje i sve ispod je else bez else
		  }
	  
	  /*metodu koja vraca agregatno stanje vode pomocu NABROJIVOG TIPA(ako je temperatura niza od o celzijusa, onda metoda vraca
	   da je voda u cvrstom a.stanju(AgregatnoStanje.CVRSTO); ako je od 0 do 100 celzijusa, onda vraca tecno(AgregatnoStanje.TECNO), a
	   ako je temperatura vise od 100, tada  metoda vraca gasovito(AgregatnoStanje.GASOVITO)
	   ****ELSE KLAUZULA, SLOZENI USLOVI, LOGICKI OPERATORI AND, OR, NOT, SVAKI LOGICKI USLOV SE MOZE NAPISATI NA VISE NACINA****
	   */
	  
	   AgregatnoStanje vratiAgregatnoStanje(double tc) { //povratna vrednost nam je AgregatnoStanje, a double tc je ulazni parametar
		 
		   
		   
		   
		  /* 
		   
		   
		   if(tc>=0&&tc<100) {
			   return AgregatnoStanje.TECNO;
		   }
		   
		   if(tc<0) {
			   return AgregatnoStanje.CVRSTO;
		   }
		   
		   if(tc>=0) {
			   return AgregatnoStanje.GAS;
		   }
		   
		   /*kompsjler se buni, jer on ne zna da smo mi pobrojali ceo interval i trazi da vratimo neko agregatno stanje u slucaj da 
		   vrati nesto, zato if nije najbolji pristup
		   */
		   
		/*    return AgregatnoStanje.GAS;
		   
		   
		   
		   
		   */
		   
		   
		   
		   
		   
		   // KORISTIMO IF ELSE
		   
		   if(tc<0)
			   return AgregatnoStanje.CVRSTO;
		   else if(tc>=0 && tc<100) // ako nije ovo gore if, znaci u suprotnom proveri da li je tc izmedju 0 i 100, a ako ne, vrati tecno
			   return AgregatnoStanje.TECNO;
		   else
			   return AgregatnoStanje.GAS; //vrati gas ako nije ni jedno ni drugo
		   
		   //ovako kompajler zna da ako ovaj if nije tacan, proverava se sledeci, pa sledeci...
		   
		     
	   }
	  
}

