import java.util.Scanner;

public class vanyaandfence{

	static Scanner in = new Scanner(System.in);

	public static void main(String[]args){
		
		int n = in.nextInt(), h = in.nextInt();
		int res = 0;

		for(int i = 0; i < n; i++){
			
			int f = in.nextInt();
			
			if(f <= h){
				res++;
			
			
			}

			else{
			res = res + 2;	
			
			}
		}
		System.out.println(res);
	}
}
