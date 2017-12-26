//import java.util.Random;

//import java.util.Random;
public class Simulation {

	public static void main(String[] args) {
		Winter W = new Winter(20);
		Winter B = new Winter(50);
		simuliere(W);
		simuliere(B);
		checkSameResult(B,W);
		//System.out.println(W.equals(B)); 
	}
	
	public static void checkSameResult(Winter Vgl, Winter Mit) {
		if (Vgl.gleicherZustand(Mit)) { //removed the true check
			System.out.println("Both objects are equal!");
		}
		else {System.out.println("The objects are not equal!");}
	}
	
	public static void simuliere(Winter W) {
			while(W.getAktuellerTag()<=W.getDauerDesWinters()) {//for (int i=1; i<=20; i++) { //while mit aktuellerTag
			System.out.println("Heutiger Tag: " +W.getAktuellerTag());
			W.einTagVergeht();	
			
			
			W.blume1.waechst();
			W.blume2.waechst();
			W.blume3.waechst();
			W.blume4.waechst();
			W.blume5.waechst();
			
			if (W.maus.istHatGefressen()) {
				W.maus.schlaeft();
			}
			
			if (W.maus.istHungrig() && W.maus.hatLustZuEssen()) {
				if (W.blume1.getZustand()==1 || W.blume1.getZustand()==2) {
					W.blume1.wirdGefressen(); W.maus.hatGefressen();
				}
				else if (W.blume2.getZustand()==1||W.blume2.getZustand()==2) {
					W.blume2.wirdGefressen(); W.maus.hatGefressen();
				}
				else if (W.blume3.getZustand()==1||W.blume3.getZustand()==2) {
					W.blume3.wirdGefressen(); W.maus.hatGefressen();
				}
				else if (W.blume4.getZustand()==1||W.blume4.getZustand()==2) {
					W.blume4.wirdGefressen(); W.maus.hatGefressen();
				}
				else if (W.blume5.getZustand()==1||W.blume5.getZustand()==2) {
					W.blume5.wirdGefressen(); W.maus.hatGefressen();
				}
				else {W.maus.mausVerhungert();}
			}
			
			
			//Random z = new Random();
			//int x = z.nextInt(10);	
			W.maus.mausWirdHungrig();
			
			
			
			
				String formated = ",Wachstum: %d\n";
				System.out.printf("Blume1:"); W.blume1.gibStatusAus(); System.out.printf(formated,W.blume1.gibGroeseZurueck());
				System.out.printf("Blume2:"); W.blume2.gibStatusAus(); System.out.printf(formated,W.blume2.gibGroeseZurueck());
				System.out.printf("Blume3:"); W.blume3.gibStatusAus(); System.out.printf(formated,W.blume3.gibGroeseZurueck());
				System.out.printf("Blume4:"); W.blume4.gibStatusAus(); System.out.printf(formated,W.blume4.gibGroeseZurueck());
				System.out.printf("Blume5:"); W.blume5.gibStatusAus(); System.out.printf(formated,W.blume5.gibGroeseZurueck());
				System.out.printf("Wuehlmaus:"); W.maus.gibStatusAus();
				System.out.println("---------------------------------");
			
			
			
		}

	}
	
	
	
	
	
	
	
	
	
	

}
