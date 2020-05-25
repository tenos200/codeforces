import java.util.Scanner;
public class nearlyluckynumber{
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[]args){
		long n = in.nextLong();
		int count = 0;

		while(n != 0){
			
			if(n % 10 == 4 || n % 10 == 7){
				count++;
			
			}	
			
			n /= 10;

			}

		if(count == 4 || count == 7){

			System.out.println("YES");
		
		}
		
		else{

			System.out.println("NO");
		}
		}
	}
