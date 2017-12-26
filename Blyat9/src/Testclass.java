import java.util.logging.Level;
import java.util.logging.Logger;

public class Testclass {

	public static void main(String[] args) {
		Winter W = new Winter(20);
		Winter B = W;
		Logger Lg = Logger.getLogger("ayy");
		Lg.log(Level.FINE, Boolean.toString(W.equals(B))); //also wirklich nur, wenn es das gleiche objekt ist
		System.out.println(W.getClass());
		//Lg.
		//lg und xd

	}

}
