import java.util.Scanner;

public class brainsphotos{

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); 

		String ans = "#Black&White"; 
		int n = in.nextInt(); 
		int n2 = in.nextInt(); 

		for (int i = 0; i < n*n2; i++) {

			String s = in.next();

			if (s.equals("C") || s.equals("M") || s.equals("Y")) {

				ans = "#Color"; 
				
			}
		}

		System.out.println(ans);

	}
} 
