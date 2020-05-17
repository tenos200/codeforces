import java.util.Scanner;
import java.util.Arrays;

public class helpfulmaths{
	
	static Scanner in = new Scanner(System.in);

	public static void main(String[]args){


		String s = in.nextLine();
		s = s.replace("+","");
		
		char [] seq = s.toCharArray();
		
		Arrays.sort(seq);

		for(int i = 0; i < seq.length; i++){
			System.out.print(seq[i]);
			if(i == seq.length -1){
				continue;
			}
			System.out.print("+");
		}

		System.out.println();
	}
}
