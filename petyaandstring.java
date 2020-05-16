import java.util.Scanner;
public class petyaandstring{
	static Scanner in = new Scanner(System.in);
	public static void main(String []args){

			String nums = in.next().toLowerCase(), nums2 = in.next().toLowerCase();
			
			 int count = nums.compareTo(nums2);
			 int count2 = nums.compareTo(nums);

			 if(count == count2){
				 System.out.println("0");
			 
			 }
			 if(count < count2){
				 System.out.println("-1");
			 
			 
			 }
			 if(count > count2){
				 System.out.println("1");
			 
			 
			 }
	}
}
