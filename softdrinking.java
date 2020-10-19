import java.util.Scanner;

public class softdrinking {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), k = in.nextInt(), l = in.nextInt(), c = in.nextInt(),  d = in.nextInt(), p = in.nextInt(), nl = in.nextInt(), np = in.nextInt();
		 int cnt = (k*l) / nl;
		 int cnt1 = c * d;
		 int cnt2 = p / np;
		 int min1 = Math.min(cnt, cnt1);
		 int min_abs = Math.min(cnt2, min1);
		 System.out.println(min_abs / n);
 
	}
}
