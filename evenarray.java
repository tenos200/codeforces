import java.util.Scanner;

public class evenarray{

	public static void main(String[]args){

		Scanner in = new Scanner(System.in);

		int t = in.nextInt();

		while(t --> 0){
		
			int n = in.nextInt();
			int a = 0, b = 0;

			for(int i = 0; i < n; i++){
			
				int x = in.nextInt();

				if(x % 2 != i % 2){
					
					if (i % 2 == 0){
						a++;
					}
					
					else{
						b++;	
					}
				}
			}

			if(a != b){
		
				System.out.println(-1);
			}
			else{
			
				System.out.println(a);
			}
		}
	}
}
