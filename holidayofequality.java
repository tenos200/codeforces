import java.util.Scanner;

public class holidayofequality{

	static Scanner in = new Scanner(System.in);

	public static void main(String[]args){
	
		int n = in.nextInt();
		int [] nums = new int[n];
		int max = 0;
		int cnt = 0;

		for(int i = 0; i < n; i++){
			nums[i] = in.nextInt();
			int cur = nums[i];
			
			if(cur > max){
				max = cur;
			}
		}

		for(int i = 0; i < n; i++){
			cnt = cnt + (max - nums[i]);
		
		}

		System.out.println(cnt);

	
	}
}
