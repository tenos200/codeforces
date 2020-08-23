import java.util.Scanner;

public class giftsfixing {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int t = in.nextInt();

		while(t-- > 0) {

			int n = in.nextInt();
			int [] a = new int[n];
			int [] b = new int[n];

			for (int i = 0; i < n; i++) {

				a[i] = in.nextInt();
				
			}
			
			for (int i = 0; i < n; i++) {

				b[i] = in.nextInt();
				
			}
			
			int minA = a[0];
			int minB = b[0];

			for(int i:a) minA = Math.min(minA, i);
			for(int i:b) minB = Math.min(minB, i);

			long ans = 0;

			for (int i = 0; i < n; i++) {

				ans += Math.max(a[i] - minA, b[i] - minB);
				
			}
			System.out.println(ans);
		}
	}
}
