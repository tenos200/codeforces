import java.util.Scanner;

public class presents{
	
	static Scanner in = new Scanner(System.in);

	public static void main(String[]args){
		
		int n = in.nextInt();
		int [] nums = new int[n];

		for(int i = 0; i < n; i++){

			nums[i] = in.nextInt();
		
		}
	
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				
				if(nums[j]-1 == i){

					System.out.print((j+1)+" ");
					break;
				
				}
			}
		}
	}
}
