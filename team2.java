import java.util.Scanner;
public class team2{
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[]args){

		int count = 0;
		int n = in.nextInt();
		for(int i = 0; i < n; i++){
			int p = in.nextInt(), v = in.nextInt(), t = in.nextInt();

			if(p+v+t >= 2){
				count++;
			
			}
		}
		System.out.println(count);

	
	
	}
}


