
public class SpiralWalkThrough {
		static int a = 0;
		static int b = 1; //initial values, start to move right
		
		
		
	public static void main(String[] args) {

		int m = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[1]);
		int[][] ha = new int[m][n];
		int i = 0;
		int j = 0; // startingpoint, upper left

		boolean z = true;

		while (z) {
			if ((i+a>m-1||j+b>n-1) || (i+a<0||j+b<0) || ha[i + a][j + b] == 7  ) {
				/* 
				 * EXPLAINATION: if the next step, wether direction may be, is larger
				 * than the max m-1 or n-1, also lower than 0, then swap the direction.
				 * Also, if the next entry has the value of 7, then swap the direction 
				 * */
				switchDirection();
				if (ha[i+a][j+b]==7) { 
					/*
					 * simple abbruch condition (dont wanna say the evil word)
					 */
					z=!z;
				}
			}
			
			ha[i][j]=7;
			/*
			 * set the current postion as visited
			 */
			
			i += a; //add direction values, for example 0 and 1 to go right
			j += b;
			
			
			for (int c=0; c<m; c++ ) { //Ammount of Rows
				for (int d=0; d<n; d++) { //Ammount of Collums
					if(d==n-1) { //if we have reached the last element
						System.out.printf("%d%n", ha[c][d]);
					}
					else { System.out.printf("%d ",ha[c][d]);
					}
				}
				
			}
			System.out.println("--------------------------------------");

		}
		


		// System.out.println(ha[0][2]);

	}

	static void switchDirection() {
		if (a==0 && b==1) { //self explaining
			a=1;
			b=0;
		}
		else if (a==1&&b==0) { //movedown
			a=0;
			b=-1;
		}
		else if (a==0&&b==-1) {
			a=-1;
			b=0;
		}
		else if (a==-1&&b==0) {
			a=0;
			b=1;
		}
	}

}
