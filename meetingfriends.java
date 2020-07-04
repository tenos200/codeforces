import java.util.Scanner;
import java.util.Arrays;

public class meetingfriends{

	static Scanner in = new Scanner(System.in);

	public static void main(String[]args){

		int [] h = new int[3];
		int x1 = in.nextInt(), x2 = in.nextInt(), x3 = in.nextInt();
		h[0] = x1;
		h[1] = x2;
		h[2] = x3;

		Arrays.sort(h);
		int num = h[1] - h[0] + h[2] - h[1];

		System.out.println(num);
	
	}
}
