import java.util.Scanner;
public class dominopiling{
	static Scanner in = new Scanner(System.in);
	public static void main(String[]args){

		int p = 2;

		int m = in.nextInt(), n = in.nextInt();
		int res = m * n / p;

		System.out.println(res);



	
	}

}
