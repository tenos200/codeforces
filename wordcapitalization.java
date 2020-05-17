import java.util.Scanner;
public class wordcapitalization{
	static Scanner in = new Scanner(System.in);

	public static void main(String[]args){
		String s = in.nextLine();
		String res = "";
		
		char [] word = new char[s.length()];
		word = s.toCharArray();

		for(int i = 0; i < word.length; i++){
			if(i == 0){
				 res = res + Character.toUpperCase(word[0]);
			}

			else{
				res = res + word[i];
			}
		}

		System.out.println(res);
	}
}
