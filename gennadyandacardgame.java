import java.util.Scanner;

public class gennadyandacardgame{

	public static void main(String[]args){

		Scanner in = new Scanner(System.in);

		String c = in.next();
		String ans = "NO";
		
		for(int i = 0; i < 5; i++){
			
			String comp = in.next();

				
			if(c.charAt(0) == comp.charAt(0) || c.charAt(1) == comp.charAt(1)){

				ans = "YES";
				
			}
		}

		System.out.println(ans);

	}
}
