import java.util.Scanner;

public class iloveusername{

	static Scanner in = new Scanner(System.in);
	
	public static void main(String[]args){
	
		int t = in.nextInt();
		int [] contests = new int[t];
		int cnt = 0;
		
		for(int i = 0; i < t; i++){
			
			contests[i] = in.nextInt();

		}
		int max = contests[0];
		int min = contests[0];


		for(int i = 0; i < contests.length; i++){

			if(contests[i] > max){
				max = contests[i];
				cnt++;
			}
			
			if(contests[i] < min){
				min = contests[i];
				cnt++;
			
			}
		}
		
		System.out.println(cnt);

	}
}
