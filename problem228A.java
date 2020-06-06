//Is your horseshoe on ther other hoof?
import java.util.Scanner;
import java.util.Arrays;

public class problem228A{

	static Scanner in = new Scanner(System.in);

	public static void main(String[]args){
		
		int count = 0;
		int [] shoes = new int[4];

		for(int i = 0; i < 4; i++){
		
			shoes[i] = in.nextInt();

		}
		Arrays.sort(shoes);

		for(int i = 1; i < shoes.length; i++){
		
			if(shoes[i] == shoes[i-1]){
			
				count++;
			
			}
		}
		System.out.println(count);
	}
}
