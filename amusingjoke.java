import java.util.Scanner;
import java.util.Arrays;

public class amusingjoke{

	static Scanner in = new Scanner(System.in);

	public static void main(String[]args){
		
		String res = "YES";  
		String a = in.nextLine();
		String b = in.nextLine();
		String c = in.nextLine();

		String d = a + b;
		char [] combine = d.toCharArray();
		char [] compare = c.toCharArray();

		Arrays.sort(combine);
		Arrays.sort(compare);

		if(d.length() == c.length()){
			for(int i = 0; i < c.length(); i++){
			
				if(combine[i] != compare[i]){
					res = "NO";
				}
			}
		}

		else{
			res = "NO";
		
		}
		System.out.println(res);
	}
}
