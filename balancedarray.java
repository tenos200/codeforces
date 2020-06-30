import java.util.Scanner;

public class balancedarray{

	static Scanner in = new Scanner(System.in);

	public static void main(String[]args){
		
		int t = in.nextInt();

		for(int i = 0; i < t; i++){
		
			int n = in.nextInt();
			
			if(n % 4 != 0){
			
				System.out.println("NO");
			
			}
			
			else{

				System.out.println("YES");

				for(int j = 1; j <= n / 2; j++){
					
					System.out.print(j * 2 + " ");
				
				}
				
				for(int k = 1; k < n / 2; k++){

					System.out.print((k * 2) - 1 + " ");
				
				}

				System.out.print(3 * (n / 2) - 1);
				System.out.println();
			
			}
		}
	}
}
