import java.util.Scanner;
public class boyorgirl{
	static Scanner in = new Scanner(System.in);
	public static void main(String[]args){
		
		int count = 0;
		String buffer = "";
		String s = in.next();

		for(int i = 0; i < s.length(); i++){
			if(!buffer.contains(String.valueOf(s.charAt(i)))){
				buffer += String.valueOf(s.charAt(i));
			}
		}
		
		if(buffer.length() % 2 == 0){
			System.out.println("CHAT WITH HER!");
			
		}
		if(buffer.length() % 2 == 1){
			System.out.println("IGNORE HIM!");
			
		}
	}
}
