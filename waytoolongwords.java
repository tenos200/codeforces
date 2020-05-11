import java.util.Scanner;
public class waytoolongwords{

	static Scanner in = new Scanner(System.in);
	public static void main (String[]args){

		int t, c = 0;
		String s;
		t = in.nextInt();

		for(int i = 0; i < t; i++){

			s = in.next();
		

			if(s.length() > 10){
				c = s.length() - 2;
				System.out.print(s.charAt(0));
				System.out.print(c);
				System.out.println(s.charAt(s.length()-1));

			
			}
		
		else{
			System.out.println(s);
		
		
		}
		}
		}
		
		}
		
	


