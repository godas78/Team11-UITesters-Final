package OOPConceptpart1;
//decimal to binary
public class conversion {
	 int decimal=100;
	 
	void binary() {
		int temp=decimal;
		String binary="";
		while(decimal>0) {
			int r=decimal%2;
			binary=r+binary;
			decimal=decimal/2;
			}
		System.out.println("Binary for decimal number :" +temp +"  is  " +binary);
	}
	void octal() {
		int decimal=100;
		int octal = 0;
		int temp = decimal;
		int i=1;
		while(decimal!=0) {
			int r=decimal%8;
			octal=r*i+octal;
			i=i*10;
			decimal=decimal/8;
		}
		System.out.println("Octal for decimal number :"  +temp +"  is " +octal);
	}
	
	void hexadecimal() {
		int decimal=168;
		int temp = decimal;
		String hexadecimal="";
		char[]hexa= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		while(decimal!=0) {
			int r=decimal%16;
			hexadecimal=hexa[r]+hexadecimal;
			decimal=decimal/16;
		}		
		System.out.println("Octal for decimal number :"  +temp +"  is " +hexadecimal);
	}
	
	
	public static void main(String[] args) {
		conversion obj=new conversion();
		obj.binary();
		obj.octal();
		obj.hexadecimal();		
			
		}

	}

