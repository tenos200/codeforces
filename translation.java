import java.util.Scanner;

public class translation{
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[]args){
		
		String s = sc.next(), t = sc.next();
		String reverse = "";

		for(int i = t.length() - 1; i >= 0; i--){
			reverse = reverse + t.charAt(i);
		
		}
		
		if(s.equals(reverse)){
			System.out.println("YES");
		}
		
		else{
			System.out.println("NO");
		}
	}
}
