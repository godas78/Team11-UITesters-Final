package demoone;

public class ifelseconcept {
	public static void main(String[] args) {
	
		int a = 20;
		int b = 10;
		
		if(b<a) {
			System.out.println("b is less than a");
		}
		else {
			System.out.println("a is less than b");
		}
		
		int c =40;
		int d =30;
		if(c==d) {
			System.out.println("c and d are equal");
		}
		else {
			System.out.println("c and d are not equal");
		}
		
		//write a logic to find out the highest number
		
		int a1 = 500;
		int b1 = 400;
		int c1 = 300;
		
		if(a1>b1 & a1>c1) {
			System.out.println("a1 is the greatest");
		}
		else if(b1>c1) {
			System.out.println("b1 is the greatest");
		}
		else {
			System.out.println("c1 is the greatest");
		}
	}
}
