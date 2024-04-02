package Java;

public class ReversetheNumbers {
	
	
	public static void main(String[] args) {
	
	//swapping two numbers
	
	int num=1234;
	
int rev = 0;

while(num!=0) {
	
	rev=rev*10+num%10;//0=0+1234%10 = 4  4=4+123%10 = 43
	
	num=num/10; //1234/10 = 123  // 123/10 - 12
	
	
	
}
	
System.out.println(rev);
	


StringBuffer newobj = new StringBuffer(String.valueOf(num));

newobj.reverse();

}
	
}


