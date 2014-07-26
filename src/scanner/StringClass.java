package scanner;

public class StringClass {

	private static final CharSequence String = null;
	public static void main(String[] args) {
		String a, b, c, d, e, s,m;
		CharSequence n;
		int t, l, x, y; 
		
		// TODO Auto-generated method stub
		//declare variables and assign to them
		String str1 = "This is my first mission for computer learning.";
		String str2 = ("I have to go a long distance which is really hard for me.");
		String str3 = ("I can try my best little by little. ");
		String str4 = ("I need a lot of help from my group. ");
		String tortoise =("Anwara, you look like a tortoise who is moving too slow. ");
		String glue = ("Don't worry, just stick with it like a glue.Evetually, you will be there.");
		char data[] = {'m','o','r','n','i','n','g'};
		 // make string from data array.
	     String str = new String(data);
	     
	     System.out.println( data);
	
		System.out.println("Print Original String " + str1);
		//use string.length to find the length of str1
		System.out.println("The length of the String 1 is " + str1.length());
		//use concatenation
		b = str2.concat(str4);
		
		System.out.println(b);
		//use toLowerCase system from java library
		c = str4.toLowerCase();
		System.out.println( "print string 4 with all lower case " + c );
		//use toUPPERCLASS
		d = str1.toUpperCase();
		System.out.println(d);
		//find substring by using API
		a  = str1.substring(2, 28);
		
		System.out.println(a);
		//use replace method
		m = str1.replace(str1, tortoise);
		System.out.println(m);
		//use replaceAll method
		e = str2.replaceAll(str2,glue );
		System.out.println(e);
		// using substring method
		s = glue.substring(11);
		System.out.println("print subtring from just to it " + s );
		//using subsequence method
		n = str4.subSequence(7, 20);
		System.out.println(n);
		//using compare to method to compare with two String 
		x = str3.compareTo(str1);
		System.out.println(x);
		//using indexOf method 
        l = str3.indexOf("String str4 is " + str4);
        System.out.println(l);
        
        

		
		
	
		
		 
		
		
		

		

}
	
}
	
	

