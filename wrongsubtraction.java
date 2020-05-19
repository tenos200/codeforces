import java.util.Scanner;
public class wrongsubtraction{
	
	static Scanner in = new Scanner(System.in);

	public static void main (String[]args){
		int n = in.nextInt();
		int k = in.nextInt();

		for(int i = 0; i < k; i++){

			if(n % 10 == 0){
				n = n / 10;
			}
			else{
			n--;
			}
		}
		
		System.out.println(n);
		
	}
}
