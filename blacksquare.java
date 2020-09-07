import java.util.Scanner;

public class blacksquare { 

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int [] n = new int[4];
		int cnt = 0;

		for (int i = 0; i < 4; i++) {

			n[i] = in.nextInt();
			
		}

		String s = in.next();

		char [] s2 = s.toCharArray();

		for (int i = 0; i < s2.length; i++) {

			if (s2[i] == '1') {

				cnt+= n[0];
				
			}
			
			if (s2[i] == '2') {

				cnt+= n[1];
				
			}
			
			if (s2[i] == '3') {

				cnt+= n[2];
				
			}
			
			if (s2[i] == '4') {

				cnt+= n[3];
				
			}
		}

		System.out.println(cnt);

	}
}
