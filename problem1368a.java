import java.util.*;

public class problem1368a {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int t = in.nextInt();

		for (int i = 0; i < t; i++) {

			int cnt = 0;

			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();

			while(a+b <= n) {
			
				if(a>b) {
					b+=a;
				} else {
				
					a+=b;
				}
				cnt++;

			}
			cnt++;

			System.out.println(cnt);
		}
	}

}
