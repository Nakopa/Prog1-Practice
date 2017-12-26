import java.util.Random;

//import java.util.Random;
public class Wuehlmaus {
	// Wuehlmaus(){}
	private enum zustaende {
		VERHUNGERT, SCHLAFEN, HUNGRIG, HATGEFRESSEN
	}

	/*
	 * final private int VERHUNGERT = 1; final private int SCHLAFEN = 2; final
	 * private int HUNGRIG = 3; final private int HATGEFRESSEN = 4;
	 */
	private zustaende zustand = zustaende.SCHLAFEN;
	private double x;

	Wuehlmaus() { //do literally nothing lol
	}

	Wuehlmaus(double chance) { //Construktor for a chance. 
		x = chance;
	}

	boolean hatLustZuEssen() { //getter
		double y = Math.random();
		return (y <= this.x);
	}

	void gibStatusAus() { //getter
		switch (zustand) {
		case VERHUNGERT:
			System.out.printf(" ist Verhungert\n");
			break;
		case SCHLAFEN:
			System.out.printf(" ist am Schlafen\n");
			break;
		case HUNGRIG:
			System.out.printf(" ist Hungrig\n");
			break;
		case HATGEFRESSEN:
			System.out.printf(" hat Gefressen\n");
			break;
		}
	}

	boolean gleicherZustand(Wuehlmaus maus) { //getter
		return this.zustand == maus.zustand;
	}

	zustaende getZustand() { // getter
		return zustand;
	}

	boolean istHungrig() { //getter
		return this.zustand == zustaende.HUNGRIG;
	}

	boolean istHatGefressen() { //getter
		return zustand == zustaende.HATGEFRESSEN;
	}
	
	
	
	

	void setZustand(zustaende zustand) { // setter bzw unn�tiger setter
		this.zustand = zustand;
	}

	void schlaeft() { //setter
		zustand = zustaende.SCHLAFEN;
	}
	
	void mausVerhungert() { //setter
		zustand = zustaende.VERHUNGERT;
	}
	
	void hatGefressen() { //setter
		zustand = zustaende.HATGEFRESSEN;
	}
	
	void mausWirdHungrig() { //setter
		Random r = new Random();
		int y = r.nextInt(9);
		if (y == 1) {
			zustand = zustaende.HUNGRIG;
		}
	}



}
