import java.util.Scanner;

public class beautifulyear{
	
	static Scanner in = new Scanner(System.in);

	public static void main(String[]args){

		int y = in.nextInt();

		while(true){
			y++;

			int a = y / 1000;
			int b = y / 100 % 10;
			int c = y / 10 % 10;
			int d = y % 10;
			
			if(a != b && a != c && a != d && b != c && b != d && c != d){
				break;
			
			} 
		}
	
		System.out.println(y);
	
	}
}
