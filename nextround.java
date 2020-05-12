import java.util.Scanner;
public class nextround{
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[]args){
	int n = in.nextInt(), m = in.nextInt();
	int [] list = new int[n];
	int count = 0;
	

	for(int i = 0; i < n; i++){
	
		list[i] = in.nextInt();
	}

	for(int i = 0; i < n; i++){
		
		if(list[i] > 0 && list [i] >= list[m-1]){
			count++;
		}
	}
	System.out.println(count);

	}


}
