import java.util.Scanner;

public class ultrafastmathematician{

	 static Scanner in = new Scanner(System.in);
	 
	 public static void main(String[]args){

		 String one = in.nextLine();
		 String two = in.nextLine();

		 int n = one.length();

		 for(int i = 0; i < n; i++){
		 
			 char a = one.charAt(i);
			 char b = two.charAt(i);

			 if((a == '0' && b == '0') || (a == '1' && b == '1')){	 

				 System.out.print("0");
			 
			 }
			 else{
			 
				 System.out.print("1");

			 }
		 }
	 }
}
