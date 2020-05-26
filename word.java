import java.util.Scanner;

public class word{
	
	static Scanner in = new Scanner(System.in);

	public static void main(String [] args){
	
		String s = in.nextLine();
		int upper = 0;	
		int lower = 0;	

		
		for(int i = 0; i < s.length(); i++){
			char c = s.charAt(i);

			if(c >= 65 && c <= 90){
				upper++;
			}
			else{
				lower++;
			}
		}


		if(upper > lower){
			System.out.println(s.toUpperCase());
		
		}
		else{
			System.out.println(s.toLowerCase());
		}
	}
}
