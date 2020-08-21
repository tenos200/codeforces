import java.util.Scanner;

public class collectingcoins {
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int t = in.nextInt();

		while(t--> 0) {
			
			int s = 0;
			int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), n = in.nextInt();
			int max = Math.max(a, Math.max(b, c));
			s = a + b + c + n;

			if(s % 3 == 0 && s / 3 >= max) {

				System.out.println("YES");
			
			}

			else{
			
				System.out.println("NO");

			}
		}
	}
}
