import java.util.Scanner;
import java.util.Arrays;

public class threepairwisemaximums {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();

		while (t-- > 0) {

			int [] a = new int[3];
			a[0] = in.nextInt();
			a[1]= in.nextInt();
			a[2]= in.nextInt();

			Arrays.sort(a);

			if ( a[1] != a[2]) {

				System.out.println("NO");
			}

			else {

				System.out.println("YES");
				System.out.println(a[0] +" " + a[0] + " " + a[2]);

			}

			
		}

	}
}
