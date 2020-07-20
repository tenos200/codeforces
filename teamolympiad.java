import java.util.Scanner;
import java.util.ArrayList;

public class teamolympiad{

	public static void main(String[]args){
	
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		ArrayList <Integer> prog = new ArrayList<Integer>();
		ArrayList <Integer> math = new ArrayList<Integer>();
		ArrayList <Integer> pe = new ArrayList<Integer>();

		for(int i = 0; i < n; i++){
			int t = in.nextInt();

			if(t == 1){
				prog.add(i+1);
			}
			
			if(t == 2){
				math.add(i+1);
			}
			
			if(t == 3){
				pe.add(i+1);
			}
		}

		int teams = Math.min(Math.min(prog.size(), math.size()), pe.size());
		System.out.println(teams);

		for(int i = 0; i < teams; i++){
			System.out.println(prog.get(i)+ " " + math.get(i)+ " " + pe.get(i));

		}
	}
}
