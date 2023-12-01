package OOPConceptpart1;

public class primenumber {
	public static boolean isprime(int n) {
		if(n<2)
		{
			return false;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
			
	}
	
	public static void main(String[] args) {
		for (int i=2;i<=30;i++) {
			if (isprime(i)) {
				System.out.println(i +" is a prime number");
			}
		}

	}

}
