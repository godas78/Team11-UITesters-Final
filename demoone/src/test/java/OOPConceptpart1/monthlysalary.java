package OOPConceptpart1;

public class monthlysalary {
	
	float basic;
	float boa;
	float bonus;
	float PF;
	float MG; //monthly gross
	float YG; //yearly gross
	float YT; //yearly tax
	float MT; //monthly tax
	float THS; //take home salary on existing tax rate
	float NTHS; //take home salary on new tax rate
		
	public monthlysalary(float b,float b0,float b1) {
		basic = b;
		boa = b0;
		bonus = b1;
	}
	public monthlysalary(float b,float b0) {
		basic = b;
		boa = b0;
		bonus = 4000;
	}
	public monthlysalary(float b) {
		basic = b;
		boa = 17000;
		bonus = 4000;
	}
	void takehomesal() {
		PF= (basic *12)/100;
		MG = (basic+boa+bonus)-PF;
		YG=MG*12;
		if(YG<=250000) {
			THS=MG;
			//NTHS=MG;
		}
		else if((YG>250000)&&(YG<=500000)) {
			
			YT=(YG*5)/100;
			MT=YT/12;
			THS=MG-MT;
		}	
		else if ((YG>500000)&&(YG<=750000)) {
			YT=(YG*20)/100;
			MT=YT/12;
			THS=MG-MT;
	
			YT=(YG*10)/100;
			MT=YT/12;
			NTHS=MG-MT;			
		}
		else if ((YG>750000)&&(YG<=100000)) {
			YT=(YG*20)/100;
			MT=YT/12;
			THS=MG-MT;
	
			YT=(YG*15)/100;
			MT=YT/12;
			NTHS=MG-MT;			
		}	
		else if ((YG>100000)&&(YG<=125000)) {
			YT=(YG*30)/100;
			MT=YT/12;
			THS=MG-MT;
	
			YT=(YG*20)/100;
			MT=YT/12;
			NTHS=MG-MT;			
		}	
		else if ((YG>125000)&&(YG<=150000)) {
			YT=(YG*30)/100;
			MT=YT/12;
			THS=MG-MT;
	
			YT=(YG*25)/100;
			MT=YT/12;
			NTHS=MG-MT;			
		}	
		else {
			YT=(YG*30)/100;
			MT=YT/12;
			THS=MG-MT;
			NTHS=MG-MT;			
		}	
	}

	public static void main(String[] args) {
		monthlysalary emp1 = new monthlysalary(5000.0f,5000.0f,2000.0f);
		System.out.println("salary details for emp1");
		emp1.takehomesal();
		System.out.println("PF of salary :"+emp1.PF);
		System.out.println("Monthly gross :"+emp1.MG);
		System.out.println("Yearly gross :"+emp1.YG);
		System.out.println("monthly salary with existing taxrate :"+emp1.THS);
		System.out.println("monthly salary with new taxrate :"+emp1.NTHS);
		System.out.println();
		monthlysalary emp2 = new monthlysalary(10000.0f,7000.0f,2500.0f);
		System.out.println("salary details for emp2");
		emp2.takehomesal();
		System.out.println("PF of salary :"+emp2.PF);
		System.out.println("Monthly gross :"+emp2.MG);
		System.out.println("Yearly gross :"+emp2.YG);
		System.out.println("monthly salary with existing taxrate :"+emp2.THS);
		System.out.println("monthly salary with new taxrate :"+emp2.NTHS);
		System.out.println();
		monthlysalary emp3 = new monthlysalary(12000.0f,9000.0f,3000.0f);
		System.out.println("salary details for emp3");
		emp3.takehomesal();
		System.out.println("PF of salary :"+emp3.PF);
		System.out.println("Monthly gross :"+emp3.MG);
		System.out.println("Yearly gross :"+emp3.YG);
		System.out.println("monthly salary with existing taxrate :"+emp3.THS);
		System.out.println("monthly salary with new taxrate :"+emp3.NTHS);
		System.out.println();
		monthlysalary emp4 = new monthlysalary(15000.0f,10000.0f,3500.0f);
		System.out.println("salary details for emp4");
		emp4.takehomesal();
		System.out.println("PF of salary :"+emp4.PF);
		System.out.println("Monthly gross :"+emp4.MG);
		System.out.println("Yearly gross :"+emp4.YG);
		System.out.println("monthly salary with existing taxrate :"+emp4.THS);
		System.out.println("monthly salary with new taxrate :"+emp4.NTHS);
		System.out.println();
		monthlysalary emp5 = new monthlysalary(25000.0f);
		System.out.println("salary details for emp5");
		emp5.takehomesal();
		System.out.println("PF of salary :"+emp5.PF);
		System.out.println("Monthly gross :"+emp5.MG);
		System.out.println("Yearly gross :"+emp5.YG);
		System.out.println("monthly salary with existing taxrate :"+emp5.THS);
		System.out.println("monthly salary with new taxrate :"+emp5.NTHS);
	}
	

}
