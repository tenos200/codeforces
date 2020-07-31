import java.util.Scanner;

public class requiredremainder{

	public static void main(String[]args){

		Scanner in = new Scanner(System.in);

		int t = in.nextInt();

		while(t --> 0){

			int res = 0;

			int x = in.nextInt(), y = in.nextInt(), n = in.nextInt();

			if(n - n % x + y <= n){
				res = n - n % x + y;
			}
			else{
				res = (n - n % x - (x - y));
			}
			System.out.println(res);
		}
	}
}
