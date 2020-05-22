import java.util.Scanner;
public class queueattheschool{
	static Scanner in = new Scanner(System.in);

	public static void main(String[]args){
	
		int n = in.nextInt(), t = in.nextInt();
		String s = in.next();
		String res = "";
		char [] que = new char[s.length()];
		que = s.toCharArray();

		for(int j = 0; j < t; j++){ 
			
			for(int i = 0; i < n-1; i++){
				
				if(que[i] == 'B' && que[i+1] == 'G'){
					
					que[i] = 'G';
					que[i + 1] = 'B';
					i++;
				}
			}
		}

		res = String.copyValueOf(que);

		System.out.println(res);
	}
}
