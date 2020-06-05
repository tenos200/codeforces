import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class iwannabetheguy{

	static Scanner in = new Scanner(System.in);

	public static void main(String[]args){
	
		Set <Integer> nums = new HashSet <Integer>();
		int n = in.nextInt();
		int p = in.nextInt();
		
		for(int i = 0; i < p; i++){
			
			nums.add(in.nextInt());

		}
		
		int q = in.nextInt();
		
		for(int i = 0; i < q; i++){
			
			nums.add(in.nextInt());
			
		}

		if(nums.size() == n){
		
			System.out.println("I become the guy.");
		}

		else{
		
			System.out.println("Oh, my keyboard!");
		
		}
		}
	}
