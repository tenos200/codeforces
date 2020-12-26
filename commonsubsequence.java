import java.util.*;

public class commonsubsequence {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		int t = in.nextInt();

		for (int i = 0; i < t; i++) {

			int n = in.nextInt();
			int m = in.nextInt();
			boolean print = true;

			int [] b = new int[m];
			Set <Integer> compare = new HashSet<>();

			for (int j = 0; j < n; j++) {
				
				compare.add(in.nextInt());

			}
			
			for (int j = 0; j < b.length; j++) {
				
				b[j] = in.nextInt();
			}

			for (int bi : b) {
				if(compare.contains(bi)) {
					System.out.println("YES");
					System.out.println(1 + " " + bi);
					print = false;
					break;
				}
			}
			if(print) {
				System.out.println("NO");
			
			}

		}
			
	}
}
