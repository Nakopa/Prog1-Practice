//import java.util.Random;
public class Winter {
	// den ganzen dreck in simulation #tagvergeht#taghochzaehlen
	Blume blume1 = new Blume(); // alles wie hier
	Blume blume2 = new Blume();
	Blume blume3 = new Blume();
	Blume blume4 = new Blume();
	Blume blume5 = new Blume();
	Wuehlmaus maus = new Wuehlmaus(0.5); // chance von 50% zb
	private int aktuellerTag = 1;
	private int dauerDesWinters;
	
	//test
	
	//a few more line to add here and there
	
	
	
	
	
	
	Winter(){}
	
	Winter(int x){
		dauerDesWinters = x;
	}
	
	int getDauerDesWinters() {
		return dauerDesWinters;
	}
	
	
	
	
	int getAktuellerTag() { /** getter erschaffen **/
		return aktuellerTag;
	}
	
	void setAktuellerTag(int wert) { /** setter erschaffen **/
		aktuellerTag = wert;
	}

	// Winter(){}

	void einTagVergeht() {
		aktuellerTag++;
	}

	boolean gleicherZustand(Winter Mit) {
		return (blume1.gleicherZustand(Mit.blume1) && blume2.gleicherZustand(Mit.blume2)
				&& blume3.gleicherZustand(Mit.blume3) && blume4.gleicherZustand(Mit.blume4)
				&& blume5.gleicherZustand(Mit.blume5) && maus.gleicherZustand(Mit.maus));
	}

	// Status();

}
