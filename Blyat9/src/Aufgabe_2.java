import java.util.Scanner;
public class Aufgabe_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String row = sc.nextLine(); //we want to scan in the entire line, not just tokens
		System.out.println(row); //just to check if we misssed something
		sc.close(); //close the scanner to proceed
		int closeat=0; //the amount of chars we can substract from the max length to stop
		int longestStreak=0; //placeholder for the longest streak
		int counter = 0; //counter which will be reduced to 0 every new streak
		int secCounter=0; //counter for the ammount of comparisms needed
		
		
		for (int i = 0; (i<row.length() && row.charAt(i)==' ' ) || i<row.length()-closeat; i++) { 
			/*First, check if i is within the bounds, then if the current char is empty.
			 * Second, if we dont have a whitespace, then we can stop searching at a certain point.
		 */
			if (row.charAt(i) == ' ') { 
				/* if we have found a whitespace, increase the three variables */
				counter++;
				secCounter++;
				closeat++;
			}
			else {	
			/* after a series or at the beginning, check if the latest counter is higher than
			the current longest streak */
				if (counter>longestStreak) {
					longestStreak=counter;
					secCounter++;
					counter=0; 
					/* reset after a series*/
				}
				else { counter=0;} 
				/* reset, without setting value to longeststreak*/
			}
			
			
			
		}
		System.out.printf("Longest Streak is:%d%nComparismcounter:%d",longestStreak,secCounter);
		
		
		
		

	}

}
