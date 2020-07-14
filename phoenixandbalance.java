import java.util.Scanner;
import java.lang.Math;

public class phoenixandbalance{

	static Scanner in = new Scanner(System.in);

	public static void main(String[]args){
		


		int t = in.nextInt();


		while(t-->0){
			
			int sum_p1 = 0;
			int sum_p2 = 0;	
			
			int n = in.nextInt();

			sum_p1 = (int) Math.pow(2 , n);

			for(int i = 1; i < n/2; i++){

				sum_p1 += (int) Math.pow(2, i);

			}
			
			for(int i = n/2; i < n; i++){

				sum_p2 += (int) Math.pow(2, i);
				

			}

			System.out.println(Math.abs(sum_p1 - sum_p2));
		
		}
	}
}
