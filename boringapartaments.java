import java.util.Scanner;

public class boringapartaments{

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		for (int i = 0; i < t; i++) {

			int n = in.nextInt();
			int cnt = 0;

			for (int j = 1; j <= 9; j++) {
				int sum = 0;
				for(int k = 1; k <= 4; k++) {
					sum = sum*10+j;
					cnt+=k;
					if(sum == n) {

						System.out.println(cnt);
					
					}
				}
			}
		}
	}
}
