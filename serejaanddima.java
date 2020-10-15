import java.util.Scanner;
import java.util.Arrays;

public class serejaanddima {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int s = 0; 
		int d = 0;
		int t = in.nextInt();
		int [] a = new int[t];

		for (int i = 0; i < t; i++) {

			a[i] = in.nextInt();
			
		}

		int l = 0, r = t - 1, i = 0;
		
		while(l <= r) {

			int pick = 0;

			if(a[l] > a[r]) {

				pick = a[l];
				l++;
			
			}
			else {
				
				pick = a[r];
				r--;
			
			}

			if(i % 2 == 0) {

				s += pick;
			
			}

			else {
				d += pick;
			
			}

			i++;	
		
		}

		System.out.println(s + " " + d);

	}
}
