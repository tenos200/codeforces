import java.util.Scanner;

public class problem1409A{

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();

		while (t-- > 0) {

			int cnt = 0;
			int a = in.nextInt();
			int b = in.nextInt();

			int abs = Math.abs(a - b);
			System.out.println( (abs+9) / 10);

		}
	}
}
