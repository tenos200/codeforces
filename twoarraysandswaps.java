import java.util.Scanner;
import java.util.Arrays;

public class twoarraysandswaps{
	
	public static void main(String[]args){
	
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();

		while(t-- > 0){


			int sum = 0;

			int n = in.nextInt();
			int k = in.nextInt();

			int [] a = new int[n];
			int [] b = new int[n];


			for(int i = 0; i < n; i++){

				a[i] = in.nextInt();

			}

			for(int i = 0; i < n; i++){

				b[i] = in.nextInt();

			}

			Arrays.sort(a);
			Arrays.sort(b);
			int cnt = 1;

			for(int i = 0; i < k; i++){

				if(a[i] < b[b.length - cnt]){
					
					a[i] = b[b.length - cnt];
				}
				cnt++;
			}
			
			for(int i = 0; i < a.length; i++){
				sum += a[i];
			}

			System.out.println(sum);
		}
	}
}
