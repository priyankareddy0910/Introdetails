package Java;

public class MethodOverloading {
	
	int x,y,z;
	
	double d;
	
	void sum() {
		
		x=10;
		y=20;
		
		System.out.println(x+y);
		
		
	}
	
	//2
	void sum(int a, int b ) {
		
		x=a;
		y=b;
		
		System.out.println(x+y);
		
		}
	

	void sum(int a, double  b) {
		
		x=a;
		d=b;
		
		System.out.println(x+y);
		
		
	}
	
	void sum(double  b , int a ) {
		
		x=a;
		d=b;
		
		System.out.println(x+d);
		
		
		
		
}
	
	public static void main(String[] args) {
		
		MethodOverloading newobj = new MethodOverloading();
		
		newobj.sum();
		newobj.sum(10.5,9);
		newobj.sum(10, 20);
		
		
		
		
		
		
	}
	
	
	
	
	

}
