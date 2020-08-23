import java.util.Scanner;

public class problem1311A {
	 
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();
		
		while (t-->0) {

			int a = in.nextInt();
			int b = in.nextInt();
			
			if (a == b) {

				System.out.println(0);

			}

			else if ((a > b && (a - b) % 2 == 0) || (b > a) && (b - a) % 2 == 1) {
				System.out.println(1);
			}

			else {

				System.out.println(2);
			
			}
			
		}

	}
}
