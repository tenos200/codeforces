import java.util.Scanner;
public class nextround{
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[]args){
	int n = in.nextInt();
	int m = in.nextInt();
	int count = 0;
	


	for(int i = 0; i < n; i++){
		int l = in.nextInt();
		System.out.println(l);
		
		if(l > m){
			count++;
		}
	
	}
	System.out.println(count);

	}


}
