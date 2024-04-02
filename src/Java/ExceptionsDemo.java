package Java;

import java.util.Scanner;

public class ExceptionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 //Scanner sc = new Scanner(System.in);
	 
	// System.out.println("Enter a Number:");
	 
	 //int num = sc.nextInt();
	 
	// String s =null;
	 
	 //System.out.println(s.length()); //
	 
	 try {
		 
		 //String s =null;
		 
		 System.out.println(100/0);
		 
		 
		 }catch(Exception e ) {
		
		 e.printStackTrace();
		 
		 System.out.println("you have entered invalid inout");
		 }
	 
		System.out.println("Program is completed");
		
		System.out.println("Program is Exited");
		
		
	}

}
