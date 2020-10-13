import java.util.Scanner;

public class lcmproblem {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();

		for (int i = 0; i < t; i++) {

			int l = in.nextInt();
			int r = in.nextInt();

			if(l*2 > r) {

				System.out.println("-1 -1");
			
			}
			else {

				System.out.println(l+ " " +l*2);
			
			}
		}
	}
}
