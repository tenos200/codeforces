import java.util.*;

public class cardsforfriends {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
		int t = in.nextInt();
		int check;

		for(int i = 0; i < t; i++) {
			check = 1;

			int w = in.nextInt(), h = in.nextInt(), n = in.nextInt();

			while(w % 2 == 0) {

				w/=2;
				check *=2;
			}
			
			while(h % 2 == 0) {

				h/=2;
				check *=2;
			}
			if(check >= n) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}
}
