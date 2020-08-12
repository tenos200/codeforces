import java.util.Scanner;

public class parklighting{

	public static void main(String[]args){

		Scanner in = new Scanner(System.in);

		int t = in.nextInt();

		while(t-->0){

			int rows = in.nextInt();
			int columns = in.nextInt();

			System.out.println((rows * columns + 1) / 2);
		
		}
	}
}
