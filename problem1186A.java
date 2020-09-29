import java.util.Scanner;

public class problem1186A {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int m = in.nextInt();
		int k = in.nextInt();

		if((m - n  >= 0) && (k - n >= 0)) {

			System.out.println("YES");
		}

		else {
			System.out.println("NO");
		
		}
	}
}
