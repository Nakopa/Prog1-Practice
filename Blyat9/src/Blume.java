
public class Blume {
	
private static final int WAECHST = 1;
private static final int BLUEHT = 2;
private static final int GEFRESSEN = 3;
private int zustand = WAECHST;
private int groesse=0;
	//Blume(){}


	int getZustand() {
		return this.zustand;
	}
	
	void wirdGefressen(){
		zustand = GEFRESSEN;
	}
	
	void waechst() {
		if (groesse == 15 && zustand==WAECHST) {
			zustand = BLUEHT;
		}
		else if (zustand==WAECHST&&groesse<=14) {
			groesse++;
		}
		
	}
	 void gibStatusAus() {
		 switch (zustand) {
		 case 1: System.out.printf(" ist am wachsen"); break;
		 case 2: System.out.printf(" blueht"); break;
		 case 3: System.out.printf(" wurde gefressen"); break;
		 default: break;
		 }
		
	}
	 
	 boolean gleicherZustand(Blume Z) {
		 return this.zustand==Z.zustand;
		 
	 }
	 
	 int gibGroeseZurueck() {
		 return groesse;
	 }
	 
	 
	
	
}
