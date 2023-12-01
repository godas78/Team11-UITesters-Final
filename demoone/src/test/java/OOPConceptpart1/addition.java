package OOPConceptpart1;

public class addition {
	float a;
	float b;
	float output;

	//with input, without output
	//with input, with output - return
	//without input, with output-return
	//without input, without output
	
	void addNumber1(float num1, float num2) {
		output = num1+num2;
		System.out.println("output from method 1 is : "+output);
	}
	
	float addNumber2(float num1, float num2) {
		output = num1+num2;
		return output;
	}
	float addNumber3() {
		output = a+b;
		return output;
	}
	void addNumber4() {
		output = a+b;
		System.out.println("out form method 4 is :"+output);
	}
	
		
	public static void main(String[] args) {
		addition obj = new addition();
		obj.addNumber1(10,20);
		
		float output2 = obj.addNumber2(30,40);
		System.out.println("output from method2 is :"+output2);
		
		obj.a=50;
		obj.b=60;
		float output3=obj.addNumber3();
		System.out.println("output from method3 is :"+output3);
		
		obj.a=70;
		obj.b=80;
		obj.addNumber4();
	}

}
