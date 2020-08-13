import java.util.Scanner;
import java.util.Arrays;

public class removesmallest{

	public static void main(String[]args){

		Scanner in = new Scanner(System.in);
	
		int t = in.nextInt();

		while(t-- > 0){

			String ans = "YES";

			int n = in.nextInt();
			int [] a = new int[n];

			for(int i = 0; i < n; i++){
				
				a[i] = in.nextInt();

			}

			Arrays.sort(a);

			for(int i = 1; i < n; i++){

				if(a[i] - a[i - 1] > 1){
					ans = "NO";

				}
			}

			System.out.println(ans);
		
		}
	}
}
