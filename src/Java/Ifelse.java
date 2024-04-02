package Java;

public class Ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        try{
        	
        	System.out.println(10/0);
            System.out.println("hey");
            System.out.println("hi");
            
        }
        catch(ArithmeticException ae){
            
        }
        System.out.println("rest of the code");
    }
}

