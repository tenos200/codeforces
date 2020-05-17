import java.util.Scanner;
public class stonesonthetable{
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[]args){
		int c = 0;
		int n = in.nextInt();
		String s = in.next();
		char [] nums = new char[s.length()];
		nums = s.toCharArray();


		for(int i = 0; i < nums.length -1; i++){
			if(nums[i] == nums[i+1]){
				c++;
			}

		
		}
		System.out.println(c);
	

	}
}
