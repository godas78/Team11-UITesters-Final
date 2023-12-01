package OOPConceptpart1;

public class calculator {
	float input1;
	float input2;
	float output;
	
	void addition() {
		output = input1+input2;
		System.out.println("addition out is :" + output);
	}
	void subtraction() {
		output = input1-input2;
		System.out.println("subtraction out is :" + output);
	}
	void multiplication() {
		output = input1*input2;
		System.out.println("multiplication out is :" + output);
	}
	void division() {
		output = input1/input2;
		System.out.println("Division out is :" + output);
	}
		
	public static void main(String[] args) {
		calculator obj1 = new calculator();
		obj1.input1=100;
		obj1.input2=200;
		
		obj1.addition();
		obj1.subtraction();
		obj1.multiplication();
		obj1.division();	
		

	}

}
