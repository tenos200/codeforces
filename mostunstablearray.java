import java.util.Scanner;

public class mostunstablearray{

	public static void main(String[]args){
	
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();

		while(t-->0){

			int n = in.nextInt();
			int m = in.nextInt();
			System.out.println(Math.min(2, n - 1) * m);
		}
	}
}
