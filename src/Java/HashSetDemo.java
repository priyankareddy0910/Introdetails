package Java;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet myset= new HashSet();
		
		
		
		myset.add(100);
	
		
		myset.add("welcome");
		
		myset.add(100);
		
		
		
		myset.add(10.5);
		
		myset.add(9.5);
		

		myset.add(null);
		
		myset.add(null);
		
		
		
		System.out.println(myset.size());
		
		myset.remove(10.5);
		
		System.out.println("After removing"+myset);
		
		
		for(Object x:myset) {
			
			System.out.println(x);
			
			
		}
		
		
		
		

	}

}
