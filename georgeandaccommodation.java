import java.util.Scanner;

public class georgeandaccommodation{
	
	static Scanner in = new Scanner(System.in);

	public static void main(String [] args){

		int count = 0;
		int n = in.nextInt();

		for(int i = 0; i < n; i++){
			
			int p  = in.nextInt();
			int q = in.nextInt();
			
			if(q - p >= 2){
				count++;
			}

		}

		System.out.println(count);
	
	}
}
