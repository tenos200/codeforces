import java.util.Scanner;

public class shortsubstrings{

	static Scanner in = new Scanner(System.in);

	public static void main(String[]args){


		int t = in.nextInt();

		for(int i = 0; i < t; i++){
			
			String b = in.next();
			String a = b.substring(0 , 2);

			

			for(int j = 3; j < b.length(); j+=2){
			
				a = a + b.charAt(j);
			}

			System.out.println(a);
		}
	}
}
