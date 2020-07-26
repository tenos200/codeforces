import java.util.Scanner;

public class bachgoldproblem{

	public static void main(String[]args){

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		System.out.println(n / 2);

		while(n > 3){

			System.out.print(2 + " ");
			n -= 2;
		}
		System.out.println(n);
	}
}
