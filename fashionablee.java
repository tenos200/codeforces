import java.util.Scanner;

public class fashionablee {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int t = in.nextInt();

		while (t-- > 0) {

			int n = in.nextInt();

			if (n % 4 == 0) {

				System.out.println("YES");
				
			}

			else { 

				System.out.println("NO");
			}
		}
	}
}
