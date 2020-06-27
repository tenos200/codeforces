import java.util.Scanner;

public class newyearandhurry{

	static Scanner in = new Scanner(System.in);

	public static void main(String[]args){
	
		int time = 240;
		int count = 0;
		
		int n = in.nextInt();
		int k = in.nextInt();

		for(int i = 1; i <= n; i++){

			if(time - (5 * i) >= k){
				time = time - 5 * i;
				count++;
			}
		}
		
		System.out.println(count);
	
	}
}
