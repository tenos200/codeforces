import java.util.Scanner;
public class team{
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[]args){
		int n = in.nextInt();
		int [][] nums = new int [n][3];
		int count = 0;
	
		for(int i = 0; i < nums.length; i++){
			for(int j = 0; j < nums[i].length; j++){
				nums[i][j] = in.nextInt();
			
			}
		
	}
		for(int k = 0; k < nums.length; k++){
			int add = 0;
			for(int l = 0; l < 3; l++){
				add = add + nums[k][l];
				if(add >= 2){
					count++;
				}

				

			}
			
			}
		System.out.println(count);

}
}
