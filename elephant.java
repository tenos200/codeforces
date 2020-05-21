import java.util.Scanner;
public class elephant{
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[]args){

		int x = in.nextInt();
		int [] steps = {5, 4, 3, 2, 1};
		int count = 0;	

		for(int i = 0; i < steps.length; i++){
			
			if(x >= steps[i]){
				
				count = count + (x / steps[i]);
				x = x % steps[i];
			}
		}
		System.out.println(count);
	}
}
