import java.util.Scanner;

public class maximumintable{

	public static void main(String[]args){

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int [][] ans = new int[n][n];
		
		for(int row = 0; row < n; row++){
			for(int col = 0; col < n; col++){
				
				if(row == 0){
					ans[row][col] = 1;
				}
				else if(col == 0){
					ans[row][col] = 1;
				}
				else{
					ans[row][col] = ans[row - 1][col] + ans[row][col - 1];
				}
			}
		}
		System.out.println(ans[n - 1][n - 1]);
	}
}
