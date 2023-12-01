package OOPConceptpart1;

public class leapyear {

	public static void main(String[] args) {
		int i;
		for(i=2000;i<=2100;i++) {
			if(i%4==0) {
				System.out.println("This is a leapyear:" +i);
			}
			else {
				System.out.println("This is not a leapyear:" +i);
			}
		}

	}

}
