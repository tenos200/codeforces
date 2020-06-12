import java.util.Scanner;

public class foxandsnake{

	static Scanner in = new Scanner(System.in);

	public static void main(String[]args){
	
		int n = in.nextInt();
		int m = in.nextInt();

		for(int i = 1; i <= n; i++){

			if(i % 4 == 2){

				for(int j = 1; j < m; j++){

					System.out.print(".");
				}

				System.out.print("#\n");

			}

			else if(i % 4 == 0){

				System.out.print("#");

				for(int j = 1; j < m; j++){
					System.out.print(".");
				
				}
					System.out.print("\n");
			}

			else{

				for(int j = 1; j <= m; j++){

					System.out.print("#");
				
				}
					System.out.print("\n");

			}
		}
	}
}
