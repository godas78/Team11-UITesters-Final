package OOPConceptpart1;

public class fibonacci {

	public static void main(String[] args) {
		int total=9;
		int a=0;
		int b=1;
		for(int i=0;i<=total;i++) {
			System.out.println(a+ ",");
			int sum=a+b;
			a=b;
			b=sum;
		}
		
		
	}

}
