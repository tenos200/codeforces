import java.util.Scanner;

public class policerecruits{

	static Scanner in = new Scanner(System.in);

	public static void main(String[]args){

		int n = in.nextInt();
		int cnt = 0;
		int rec = 0;
		

		for(int i = 0; i < n; i++){

			int a = in.nextInt();

			if(a == -1){

				if(rec > 0){
					rec--;
				}

				else{
					cnt++;
				}
			}

			else{
				rec = rec + a;
			
			}
		}

		System.out.println(cnt);
	
	}
}
