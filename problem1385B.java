import java.util.Scanner;
import java.util.Arrays;

public class problem1385B{

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();

		while(t-- > 0){

			int n = in.nextInt();
			int [] a = new int[n*2];  	

			for (int i = 0; i < n*2; i++) {

				a[i] = in.nextInt(); 
				
			}

			Arrays.sort(a); 

		} 


	}
}

