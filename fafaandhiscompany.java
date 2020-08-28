import java.util.Scanner;

public class fafaandhiscompany {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int cnt = 0;
		int n = in.nextInt();

		for (int i = 1; i < n; i++) {

			if (n % i == 0) {
				cnt++;
			}
			
		}

		System.out.println(cnt);
		
	}
}
