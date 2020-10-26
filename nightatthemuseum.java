import java.util.Scanner;

public class nightatthemuseum {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int cnt = 0;
		int length = 26;
		String s = in.next();
		char [] c = s.toCharArray();
		char tmp = 'a';

		for (int i = 0; i < c.length; i++) {

			cnt += Math.min(Math.abs(c[i] - tmp), length - Math.abs(c[i] - tmp));
			tmp = c[i];

		}
		
		System.out.println(cnt);

	}
}
