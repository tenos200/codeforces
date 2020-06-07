import java.util.Scanner;

public class pangram{

	static Scanner in = new Scanner(System.in);

	public static void main(String[]args){
	
		int count = 0;
		int n = in.nextInt();
		String s = in.next().toLowerCase();

		for(char ch = 'a'; ch <='z'; ch++){
		
			if(s.contains(String.valueOf(ch))){
			
				count++;
			}
		}

		if(count == 26){
			System.out.println("YES");
		
		}

		else{
			System.out.println("NO");
		}
		}
	}
