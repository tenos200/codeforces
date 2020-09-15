import java.util.Scanner;

public class arraywithoddsum{

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();

		while (t-- > 0) {
			
			int cnt = 0;
			int even = 0;
			int odd = 0;
			int sum = 0;

			int n = in.nextInt();

			for (int i = 0; i < n; i++) {

				cnt = in.nextInt();
				sum+=cnt;

				if (cnt % 2 == 0) {

					even++;
				
				}

				else {

					odd++;
				
				}
			}

			if((sum % 2 != 0) || (even >= 1 && odd >=1)){
				System.out.println("YES");
			
			}

			else{

				System.out.println("NO");
			
			}
		}
	}
}
