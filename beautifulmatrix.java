import java.util.Scanner;
import java.lang.Math;

public class beautifulmatrix{
	static Scanner in = new Scanner(System.in);
	public static void main(String[]args){

		int [][] matrix = new int[5][5];
		int moves = 0;
		
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5; j++){
				matrix[i][j] = in.nextInt();
				
				if(matrix[i][j] == 1){
					moves += Math.abs(i-2) + Math.abs(j-2);
					break;

			}
		}
	}
		
	System.out.println(moves);
	

	}
}
