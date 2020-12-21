import java.util.Scanner;

public class dieroll {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		int y = in.nextInt();
		int w = in.nextInt();
		String [] outcomes = {"0/1", "1/1", "5/6", "2/3", "1/2", "1/3", "1/6"};
		int m = Math.max(y, w);

		System.out.println(outcomes[m]);

	}
}

