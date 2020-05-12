import java.util.Scanner;
public class team{
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[]args){
		int n = in.nextInt();
		int [][] nums = new int [n][3];
		int count = 0;
	
		for(int i = 0; i < n; i++){
			for(int j = 0; j < 3; j++){
				nums[i][j] = in.nextInt();
			
			}
		
	}
		for(int k = 0; k < n; k++){
			int add = 0;
			for(int l = 0; l < nums[k].length; l++){
				add = add + nums[k][l];
				if(add >= 2){
					count++;
					break;
				}

			}
			
			}
		System.out.println(count);

}
}
