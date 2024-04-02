package Java;

class Prathyusha {
	   static void m1() {
	        System.out.println("m1 method");
	    }
	}
	    class child extends Prathyusha {
	        static void m1() {
	            System.out.println("m2 mwthod");
	        }

	    public static void main (String[] args) {
	        child newobj = new child();
	        newobj.m1();
	    }
	    
	    }
	    //output m1 method



