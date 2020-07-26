import java.util.Scanner;
import java.lang.Math;

public class minimalsquare{

	public static void main(String[]args){

		Scanner in = new Scanner(System.in);

		int t = in.nextInt();

		while(t-->0){

			int a = in.nextInt(), b = in.nextInt();
			int min = Math.min(a, b);
			int max = Math.max(a, b);
			int ans = Math.max(min * 2, max);

			System.out.println(ans*ans);
		}
	}
}
