import java.util.Scanner;

public class choosingteams{

	static Scanner in = new Scanner(System.in);

	public static void main(String[]args){
	
		int n = in.nextInt(), k = in.nextInt();
		int cnt = 0;

		for(int i = 0; i < n; i++){
			
			int p = in.nextInt();
			
			if(5 - p >= k){
				cnt++;
			}
		}

		System.out.println(cnt / 3);

	}
}
