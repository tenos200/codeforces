import java.util.Scanner;

public class insearchofaneasyproblem{

	static Scanner in = new Scanner(System.in);

	public static void main(String[]args){
		

		int n = in.nextInt();
		int res = 0;

		for(int i = 0; i < n; i++){
			int p = in.nextInt();
			
				res = res + p;
			}
		
		if(res > 0){
			System.out.println("HARD");
		
		}
		else{
			System.out.println("EASY");
		}	
		}
	}
