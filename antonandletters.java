import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class antonandletters{

	static Scanner in = new Scanner(System.in);

	public static void main(String[]args){
	
		String s = in.nextLine();
		Set <Character> set = new HashSet<>();

		for(int i = 0; i < s.length(); i++){

			
			char c = s.charAt(i);
			if(c >= 97 && c <= 122){
				
				set.add(s.charAt(i));
			}
		}
		System.out.println(set.size());


	}
}
