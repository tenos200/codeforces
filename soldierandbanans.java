import java.util.Scanner;
public class soldierandbanans{
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[]args){
		int k = in.nextInt(), n = in.nextInt(), w = in.nextInt();
		int cost = 0;

		for(int i = 1; i < w + 1; i++){
			cost += k * i;
		
		}
		if(cost - n <= 0){
		System.out.println(0);
		
		}
		else{
		System.out.println(cost - n);
		}
	}
}
