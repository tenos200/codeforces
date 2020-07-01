import java.util.Scanner;

public class buyashovel{

	static Scanner in = new Scanner(System.in);

	public static void main(String[]args){
	
		int k = in.nextInt();
		int r = in.nextInt();
		

		for(int i = 1; i < 100; i++){

			if(k * i % 10 == 0){
				System.out.println(i);
				break;
			
			}
			
			if(k * i % 10 == r){
				System.out.println(i);
				break;
			}
		}

	}
}
