package demoone;

public class Arrayconcept {

	public static void main(String[] args) {
		int i[] = new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
				
		System.out.println(i[2]);
		System.out.println(i[1]);
		System.out.println(i.length);
		
		for(int j=0;j<1;j++){
		System.out.println(i[j]);
		}
		for(int j=0;j<i.length;j++){
			System.out.println(i[j]);
			}
	}

}
