package OOPConceptpart1;
import java.util.Scanner;

public class daysofweekwiths {
	static int day;
	private static Scanner sc;
	
		public static void main(String[] args) {
	
			System.out.println("please enter a number");
			sc = new Scanner(System.in);
			daysofweekwiths.day=sc.nextInt();
			
		switch(day) {
		case 1:{
			System.out.println("Today is Monday");
			break;
		}
		case 2:{
			System.out.println("Today is Tuesday");
			break;
		}
		case 3:{
			System.out.println("Today is Wednesday");
			break;
		}
		case 4:{
			System.out.println("Today is Thursday");
			break;
		}
		case 5:{
			System.out.println("Today is Friday");
			break;
		}
		case 6:{
			System.out.println("Today is Saturday");
			break;
		}
		case 7:{
			System.out.println("Today is Sunday");
			break;
		}
		}
	}

}