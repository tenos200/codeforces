import java.util.Scanner;

public class learnfrommath{

	static Scanner in = new Scanner(System.in);

	public static void main(String[]args){

	
		int n = in.nextInt();

		if(n % 2 == 1){
			System.out.println((9) + " " + (n-9));
		
		}

		else{
			System.out.println((8) + " " + (n-8));
		
		}
	}
}
