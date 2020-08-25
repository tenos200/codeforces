import java.util.Scanner;

public class vanyaandcubes {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int cnt = 0;
		int	h = 0;
		int n = in.nextInt();

		while (cnt <= n) {

			h++;
			cnt += (h*(h+1)) / 2;
			
		}
		System.out.println(h-1);
	}
}
