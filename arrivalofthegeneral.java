import java.util.Scanner;

public class arrivalofthegeneral{

	static Scanner in = new Scanner(System.in);

	public static void main(String[]args){
	

	int max = 0;	
	int min = 1000;
	int max_index = 0;
	int min_index = 0;
	
	int n = in.nextInt();
	int [] nums = new int[n];

	for(int i = 0; i < n; i++){
	
		nums[i] = in.nextInt();
	
	}
	
	
	for(int i = 0; i < n; i++){

		if(nums[i] > max){
			 max = nums[i];
			 max_index = i;
		}
	}
	
	for(int i = 0; i < n; i++){
		

		if(nums[i] <= min){
			min = nums[i];
			min_index = i;
		}
	}
	
	if(max_index > min_index){
		System.out.println((max_index - 1) + (n-min_index) - 1);
	
	}
	
	else{
		
		System.out.println((max_index - 1) + (n - min_index));
	
	}
	}
}
