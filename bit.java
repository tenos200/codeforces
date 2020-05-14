import java.util.*;

public class bit{
	static Scanner in = new Scanner(System.in);
	public static void main(String[]args){
	int x = 0;
	int n = in.nextInt();
	
	for(int i = 0; i < n; i++){
		String s = in.next();
		String [] arr = s.split("X");
		for(int j = 0; j < arr.length; j++){
			if(arr[j].equals("++")){
				x++;
			
			}
			if(arr[j].equals("--")){
				x--;
			
			}
		
		}

	}
	System.out.println(x);
	}

}
