import java.util.Scanner;
import java.util.Arrays;

public class restoringthreenumbers{

	static Scanner in = new Scanner(System.in);

	public static void main(String[]args){
		
		int [] nums = new int[4];

		for(int i = 0; i < 4; i++){
		
			nums[i] = in.nextInt();
		}
		
		Arrays.sort(nums);

		int x4 = nums[3];

		for(int i = 0; i < nums.length - 1; i++){
			System.out.println(x4 - nums[i]);
		
		}
	}
}
