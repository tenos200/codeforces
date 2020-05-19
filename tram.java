import java.util.Scanner;
public class tram{
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[]args){

		int stops = in.nextInt();
		int res = 0, tram = 0, entering, exiting;

		for(int i = 0; i < stops; i++){
			exiting = in.nextInt();
			entering = in.nextInt();
			tram = tram - exiting;
			tram = tram + entering;
			if (tram > res){
				res = tram;
			}
		}

	System.out.println(res);
	}
}
