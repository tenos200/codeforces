import java.util.Scanner;
import java.util.HashSet;

public class problem1385 { 

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int t = in.nextInt();	

		while (t -- > 0) {
			
			int n = in.nextInt();
			HashSet <Integer> nums = new HashSet<Integer>();
			for (int i = 0; i < n*2; i++) {
				int a = in.nextInt();
				
				if(!nums.contains(a)) { 
					System.out.print(a + " ");
				}
				nums.add(a);
			}
				System.out.println();
		}
	}
}
