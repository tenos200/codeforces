import java.util.Scanner;

public class bustoudayland {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int index =-1;
		int n = in.nextInt();
		String [] a = new String[n];

		for (int i = 0; i < n; i++) {

			a[i] = in.next();
			
		}


		for (int i = 0; i < n; i++) {
			
			if (a[i].indexOf("OO")!= -1) {

				index = i;
				break;
			}
		}

		if(index == -1) {

			System.out.println("NO");
		
		}

		else {

			System.out.println("YES");

			for (int i = 0; i < n; i++) {
				
				if (i == index) {

					System.out.println(a[i].replaceFirst("OO", "++"));
				}
				
				else {

					System.out.println(a[i]);
				}
			}
		}
	}
}
