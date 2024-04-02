package Java;

import org.apache.commons.io.FileUtils;

public class Even {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		
		
		try {
			System.out.println("my code");
			
			
			Thread.sleep(5000);
			
			
			throw new ArithmeticException("This is Explicitly we are throwing Exception");
			
			
			
			
			
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println(e.getStackTrace());
			
		}finally{
			
			System.out.println("finally block")
;			
		}
    }

}

