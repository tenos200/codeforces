import java.util.Scanner;
import java.util.ArrayList;

public class sumofroundnumbers{

	static Scanner in = new Scanner(System.in);

	public static void main(String[]args){
	
		int t = in.nextInt();
		
		for(int i = 0; i < t; i++){
			int power = 1;
			ArrayList <Integer> nums = new ArrayList <Integer>();
			int n = in.nextInt();
		
			while(n > 0){

				if(n % 10 > 0){
					nums.add((n % 10) * power);
				}
				n/=10;
				power*=10;
			
			}

			System.out.println(nums.size());
			for(int j = 0; j < nums.size(); j++){
				System.out.print(nums.get(j) + " ");
			}
				System.out.println();
			
		}
	}
}
