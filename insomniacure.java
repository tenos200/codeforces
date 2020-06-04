import java.util.Scanner;

public class insomniacure{
	
	static Scanner in = new Scanner(System.in);

	public static void main(String[]args){
	
		int k = in.nextInt(), l = in.nextInt(),  m = in.nextInt(), n = in.nextInt(), d = in.nextInt();
		int res = 0;

		for(int i = 1; i <= d; i++){
		
			if((i % k == 0) || (i % l == 0) || (i % m == 0) || (i % n == 0)){

				res++;
			}
		}
		System.out.println(res);
	}
}
