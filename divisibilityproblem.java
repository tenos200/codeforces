import java.util.Scanner;

public class divisibilityproblem{

	static Scanner in = new Scanner(System.in);

	public static void main(String[]args){

		int n = in.nextInt();

		for(int i = 0; i < n; i++){

			int a = in.nextInt();
			int b = in.nextInt();

			if(a % b == 0){
				System.out.println(0);
			}

			else{
				System.out.println(b - a % b);
			
			}
		}
		}
	}
