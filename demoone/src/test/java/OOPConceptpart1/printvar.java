package OOPConceptpart1;

public class printvar {
	
	float a=20;
	float b=30;
	
	void printvar1() {
		
		System.out.println("the value of a in method 1 is :"+a);
		System.out.println("the value of a in method 1 is :"+b);
		}
	void printvar2() {
		
		float a=100;
		float b=200;
		
		///System.out.println("the value of a in method 2 is :"+a);
		//System.out.println("the value of a in method 2 is :"+b);
		
		System.out.println("the value of a in method 2 is :"+this.a);
		System.out.println("the value of a in method 2 is :"+this.b);
		}

	public static void main(String[] args) {
		
		printvar obj = new printvar();
		printvar obj1 = new printvar();
		obj.printvar1();
		//obj.printvar2();
		obj1.printvar2();
	}

}
