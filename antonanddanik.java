import java.util.Scanner;

public class antonanddanik{
	
	static Scanner in = new Scanner(System.in);

	public static void main(String[]args){

		int A = 0;
		int D = 0;

		int n = in.nextInt();
		String s = in.next();
		
		for(int i = 0; i < n; i++){
			
			if(s.charAt(i) == 'A'){
				A++;
			}
			
			if(s.charAt(i) == 'D'){
				D++;
			}
		}

		if(A > D){
			System.out.println("Anton");
		
		}

		if(D > A){
			System.out.println("Danik");
		
		}

		if (A == D){
			System.out.println("Friendship");
		
		}
	}
}
