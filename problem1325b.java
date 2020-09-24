import java.util.Scanner;
import java.util.HashSet;

public class problem1325b {


	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int t = in.nextInt();


		for (int i = 0; i < t; i++) {
			
			HashSet <Integer> s = new HashSet<Integer>();

			int n = in.nextInt();

			for (int j = 0; j < n; j++) {

				s.add(in.nextInt());
				
			}

			System.out.println(s.size());
			
		}
	}
}
