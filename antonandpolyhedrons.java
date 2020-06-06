import java.util.Scanner;

public class antonandpolyhedrons{

	static Scanner in = new Scanner(System.in);

	public static void main(String[]args){
	
		int n = in.nextInt();
		int count = 0;

		for(int i = 0; i < n; i++){
		
			String s = in.next();

			if(s.equals("Tetrahedron")){
				count = count + 4; 
			
			}
			
			if(s.equals("Cube")){
				count = count + 6; 
			
			}
		
			if(s.equals("Octahedron")){
				count = count + 8; 
			
			}
			
			if(s.equals("Dodecahedron")){
				count = count + 12; 
			
			}
			
			if(s.equals("Icosahedron")){
				count = count + 20; 
			
			}
		}
	System.out.println(count);
	}
}
