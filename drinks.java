import java.util.Scanner;

public class drinks{

	static Scanner in = new Scanner(System.in);

	public static void main(String[]args){
	
		int n = in.nextInt();
		double res = 0;

		for(int i = 0; i < n; i++){
			
			double drinks = in.nextDouble();

			res = res + (drinks / n);
		
		}

		System.out.println(res);
	
	}
}
