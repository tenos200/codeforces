import java.util.*;

public class floornumber {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		int t = in.nextInt();
		
		for (int i = 0; i < t; i++) {

			int n = in.nextInt();
			int x = in.nextInt();

			if(n <= 2) {
				System.out.println(1);

			}
			else {

				System.out.println(((n-3)/x) + 2);
			
			}
			
		}
		
	}

}
