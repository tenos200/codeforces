import java.util.Scanner;

public class combinationlock {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int cnt = 0;
		int n = in.nextInt();

		String s1 = in.next();
		String s2 = in.next();

		for (int i = 0; i < n; i++) {

			int n1 = Character.getNumericValue(s1.charAt(i));
			int n2 = Character.getNumericValue(s2.charAt(i));

			cnt += Math.min(Math.abs(n1 - n2), 10 - Math.abs(n1 - n2));

		}

		System.out.println(cnt);

	}
}
