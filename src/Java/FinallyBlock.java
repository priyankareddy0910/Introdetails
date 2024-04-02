package Java;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println("Program is started");
		
		System.out.println("Program is inprogress");
		
		
		//String s="Welcome";
		
		//System.out.println(10/0);
		try {
			//System.out.println(s.length());
			
			System.out.println(10/0);
			
			
		}catch(ArithmeticException e ){
			
			System.out.println("Exception occured");
			
			System.out.println(10/0);
			
	}
		finally {
			
			System.out.println("Entered finbally block");
			
		}
		
		System.out.println("Program is completed");

	}

}
