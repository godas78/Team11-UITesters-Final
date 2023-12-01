package OOPConceptpart1;

import java.util.Scanner;

public class calculatorwithscanner {
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
		
		Scanner sc = new Scanner(System.in);
		
		calculatorwithscanner obj1 = new calculatorwithscanner();
		System.out.println("please enter input1");
		obj1.input1=sc.nextFloat();
		
		System.out.println("please enter input2");
		obj1.input2=sc.nextFloat();
		
		
		obj1.addition();
		obj1.subtraction();
		obj1.multiplication();
		obj1.division();	
		

	}

}
