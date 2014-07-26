package scanner;
//try catch class
public class tryCatch {
	//main class
	public static void main(String[] args) {
	// surround with try catch
		try {
			int x[] = new int [4];
			
			//print out the member1.
			//System.out.print("Find the member 1: " + x[6]); 
			System.out.println("Find the memeber 1: " + x[2]);
			// there is a problem.
			System.out.println("Let me find out! ");
		} catch (ArrayIndexOutOfBoundsException e) {
			
			e.printStackTrace();
		}
		finally
		
		//print final message:
		{
			System.out.println("My program is working: ");
		}
		
		
		
	
	
	
	
	
	}
}
	
		
		
		
	
	


	


