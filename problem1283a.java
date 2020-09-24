import java.util.Scanner;

public class problem1283a {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int t = in.nextInt();

		while (t -- > 0) {

			int h = in.nextInt();
			int m = in.nextInt();
			System.out.println(1440 - ((h * 60) + m));
			
		}
	}
}
