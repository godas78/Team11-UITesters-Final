package OOPConceptpart1;

public class Car {

	int mod;
	int wheel;
	private Car obj;
	private static Car obj2;
	private static int div;
	
	public static void main(String[] args) {
		Car a = new Car(); //object
		Car b = new Car();
		Car c = new Car();
		
		Car obj = new Car();
		obj.division(30, 10);
		
		a.mod = 2015;
		a.wheel = 4;
		
		b.mod = 2016;
		b.wheel = 5;
		
		c.mod = 2017;
		c.wheel = 6;
		
		System.out.println(a.mod);
		System.out.println(a.wheel);
		System.out.println(b.mod);
		System.out.println(b.wheel);
		System.out.println(c.mod);
		System.out.println(c.wheel);
	}
	
	public void division(int x,int y) {
		System.out.println("division method");
		int d=x/y;
		System.out.println(d);
	}
}
