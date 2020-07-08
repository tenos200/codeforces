import java.util.Scanner;

public class mishkaandgame{

	static Scanner in = new Scanner(System.in);

	public static void main(String[]args){
	
		int m = 0;
		int c = 0;

		int n = in.nextInt();

		for(int i = 0; i < n; i++){
			int m_dice= in.nextInt();
			int c_dice= in.nextInt();

			if(m_dice > c_dice){
				m++;
			}
			
			if(c_dice > m_dice){
				c++;
			}
		}
		
		if(m > c){
			System.out.println("Mishka");
		
		}
		
		if(c > m){
			System.out.println("Chris");
		
		}
		
		if(c == m){
			System.out.println("Friendship is magic!^^");
		
		}
	}
}
