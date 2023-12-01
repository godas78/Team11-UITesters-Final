package OOPConceptpart1;

public class factorslist {

	public static void main(String[] args) {
		int n=12;
		int c=0;
		System.out.println("The below are the different factors of the number");
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.print(i+"\t");
				c++;
			}
		}
		System.out.println();		
		System.out.println("The total number of factors:"+c);
	}

}
