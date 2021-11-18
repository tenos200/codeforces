import java.util.Scanner;

public class problem1520A {
		
	static Scanner in = new Scanner(System.in);

	public static void main(String[]args) {

		int t = in.nextInt();

		for(int i = 0; i < t; i++) {

			int n = in.nextInt();
			String s = in.next();
			boolean res = false;

			for(char c = 'A'; c <= 'Z'; c++) {
				int first = n;
				int last = -1;

				for(int j = 0; j < n; j++) {
					if(s.charAt(j) == c) {
						first = Math.min(first, j);
						last = Math.max(last, j);

					}

				}
				for(int j = first; j <= last; j++) {
					if(s.charAt(j) != c) {
						res = true;
						break;
					}

				}

			}
			if(res) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
		}

	}

}
