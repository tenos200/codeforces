import java.util.Scanner;

/* Because of the triangle inequality theorem one can determine "The sum of the lengths of any two sides of a triangle is greater than the length of the third side" 
 *
 * Because of this we can conclude that
 *
 * x + y >= z
 * x + z >= y
 * z + y >= x*/

public class ichihimeandtriangle {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int t = in.nextInt();

		while (t-- > 0) {

			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			int d = in.nextInt();


			System.out.println(b + " " + c + " " + c);

			
		}
	}
}
