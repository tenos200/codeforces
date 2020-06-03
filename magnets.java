import java.util.Scanner;

public class magnets{

	static Scanner in = new Scanner(System.in);

	public static void main(String[]args){


		int n = in.nextInt();
		int [] magnets = new int[n];
		int groups = 1;

		for(int i = 0; i < n; i++){
			
			magnets[i] = in.nextInt();
		
		}
		
		for(int i = 1; i < n; i++){
			
			if(magnets[i] != magnets[i-1]){
				
				groups++;	
			
			}
		}

		System.out.println(groups);
	}
}
