import java.util.Scanner;

public class specialpermutation {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
		int t = in.nextInt();
		
		for (int i = 0; i < t; i++) {

			int n = in.nextInt();
			
				if(n % 2 == 1) {

					for (int j = n; j > 0 ; j--) {

						if(j == (n / 2) + 1) {
							System.out.print(n / 2 + " ");
						}
						else if (j == n / 2) {
							System.out.print(n / 2 + 1 + " ");
						}
						else {
							System.out.print(j + " ");
						
						}
					}
					System.out.println();
				}
				else {

					for (int j = n; j > 0; j--) {
						System.out.print(j + " ");
					}
				}
		}
	}
}
