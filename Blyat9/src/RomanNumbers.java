import java.util.Scanner;

public class RomanNumbers {
	static int i = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int NormalIN = sc.nextInt();
		int NormalOUT = 0;
		String RomanIN = sc.next();
		String RomanOUT = "";
		sc.close();

		// Time to make a roman number\\
		StringBuilder bld = new StringBuilder();
		for (i = 1000; i > 0; switchi()) {
			while (NormalIN % i != NormalIN) {
				NormalIN -= i;
				bld.append(RomanOUT + addRCharakter());
			}
		}
		System.out.println(bld.toString());

		// Time to make a normal numer\\

		for (int c = 0; c < RomanIN.length(); c++) {
			NormalOUT += convertToNormal(RomanIN.charAt(c));
		}
		System.out.println(NormalOUT);

	}

	static void switchi() {
		switch (i) {
		case 1000:
			i = 500;
			break;
		case 500:
			i = 100;
			break;
		case 100:
			i = 50;
			break;
		case 50:
			i = 10;
			break;
		case 10:
			i = 5;
			break;
		case 5:
			i = 1;
			break;
		case 1:
			i = 0;
			break;
		default:
			break;
		}
	}

	static String addRCharakter() {
		switch (i) {
		case 1000:
			return "M";
		case 500:
			return "D";
		case 100:
			return "C";
		case 50:
			return "L";
		case 10:
			return "X";
		case 5:
			return "V";
		case 1:
			return "I";
		default:
			return "";
		}
	}

	static int convertToNormal(char a) {
		switch (a) {
		case 'M':
			return 1000;
		case 'D':
			return 500;
		case 'C':
			return 100;
		case 'L':
			return 50;
		case 'X':
			return 10;
		case 'V':
			return 5;
		case 'I':
			return 1;
		default:
			return 0;
		}
	}

}
