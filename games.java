import java.util.Scanner;

public class games{

	static Scanner in = new Scanner(System.in);

	public static void main(String[]args){
	
		int n = in.nextInt();
		int ans = 0;
		int [] home = new int[n];
		int [] away = new int[n];
		
		for(int i = 0; i < n; i++){
			home[i] = in.nextInt();
			away[i] = in.nextInt();
		
		}

		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){

				if(home[i] == away[j]){
					ans++;
				}
			}
		}

		System.out.println(ans);
		
		}
	}
