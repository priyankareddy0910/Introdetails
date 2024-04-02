package Java;

public class DataConvertionMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="10";
		
		String s1="20";
		
		System.out.println(s+s1);
		
		System.out.println(Integer.parseInt(s)+Integer.parseInt(s1));
		
		
		//string -double 
		
		String a ="150.15";
		
		String b ="130.20";
		
		
		double s6 = Double.parseDouble(a);
		
		double s9 = Double.parseDouble(b);
		
		System.out.println(s6+s9);
		
		//int , double , char , boolean  --- String 
		
		
		int h =10;
		
		double d=15.5;
		
		char  f ='a';
		boolean g =false;
		
		System.out.println(String.valueOf(h));
		
		String.valueOf(d);

		String.valueOf(f);

		String.valueOf(g);

		
		
		
		

	}

}
