import java.util.Scanner;

public class calculatingfunction{

	static Scanner in = new Scanner(System.in);

	public static void main(String[]args){
	
		long n = in.nextLong();
		long res;
		

		if(n % 2 == 0){
		
			res = n / 2;
		
		}
		
		else{

			res = (-1) * (n / 2 + 1);
		
		}

		System.out.println(res);
	}
}
