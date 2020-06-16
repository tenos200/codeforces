import java.util.Scanner;
import java.lang.Math;

public class vasyathehipster{

	static Scanner in = new Scanner(System.in);

	public static void main(String[]args){
	
		int a = in.nextInt();
		int b = in.nextInt();
		
		System.out.println(Math.min(a, b) + " " + ((Math.max(a, b) - Math.min(a, b)) / 2));
	}
}
