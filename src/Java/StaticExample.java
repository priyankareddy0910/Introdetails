package Java;

public class StaticExample {
	
	
	static int a =10;  //static variable
	
	int b = 20;  // non-static variable 
	
	
  static void m1() {  //static method
	  
	  System.out.println("sttaic method");
	  
	  
	  
  }
  
  void m2() {
	  
	  System.out.println("non sttaic method");
	  
	 
  }
  
  
  void m3() {  //non statoc method 
	  
	  System.out.println(a);
	  System.out.println(b);
	  
	  m1();
	  
	  m2();
	  
  }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//static methods can access static stuff directly
		
		System.out.println(a); //static 
		
		m1(); //static 
		
		//m2(); //non -static  
		
		
		
		//System.out.println(b);
		
		
//		static methods can access non-static stuff through object
		
		
		
		StaticExample newobj = new StaticExample();
		
		newobj.m2();
		newobj.m3();
		newobj.m1();
		
		System.out.println(newobj.b);
		
		
		
		
		

	}

}
