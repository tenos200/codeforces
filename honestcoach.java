import java.util.Scanner;
import java.util.Arrays;

public class honestcoach{

	public static void main(String[]args){

		Scanner in = new Scanner(System.in);

		int t = in.nextInt();

		while(t --> 0){
			
			int n = in.nextInt();
			int [] a = new int[n];

			for(int i = 0; i < n; i++){

				a[i] = in.nextInt();

			}

			Arrays.sort(a);

			int res = a[n - 1];

			for(int i = 0; i < n; i++){
				for(int j = 1 + i; j < n; j++){
					res = Math.min(res, a[j] - a[i]);
				
				}
			}
			System.out.println(res);
		}
	}
}
