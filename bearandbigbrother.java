import java.util.Scanner;
public class bearandbigbrother{
	static Scanner in = new Scanner(System.in);
	public static void main(String[]args){
	
	int a = in.nextInt();
	int b = in.nextInt();
	int res = 0;

	while(a <= b){
		a = a * 3;
		b = b * 2;
		res++;
		
		if(a > b){
			break;
		}
	}

	System.out.println(res);

	}
}
