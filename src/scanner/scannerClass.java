package scanner;
import java.util.Scanner;

public class scannerClass {

	private static int i;

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int x;
		int [] num = new int[5];
		
		// set up System
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < num.length; i++){
			
			
			num[i] = scan.nextInt();
			//print the numbers from keyboard
			System.out.println("print the number here " + " " );
		}
			
			
		
		
		for(int j = 0; j<num.length; j++){
		 x = num[j]%2;
		 if(x!=0){
			System.out.println(num[j]);
			}
		}
		
	}
}
			
		
	
		
		
		

	


