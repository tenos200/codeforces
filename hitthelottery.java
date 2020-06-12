import java.util.Scanner;

public class hitthelottery{

	static Scanner in = new Scanner(System.in);

	public static void main(String[]args){
	
		int n = in.nextInt();
		int count = 0;

		while(n > 0){
		
			if(n >= 100){
			
				n = n - 100;
				count++;
			}

			else if(n >= 20){
				n = n - 20;
				count++;
			}
		
			else if(n >= 10){
				n = n - 10;
				count++;
			}
			
			else if(n >= 5){
				n = n - 5;
				count++;
			}

			else{
				n--;
				count++;
			}
		}
		System.out.println(count);
	}
}
