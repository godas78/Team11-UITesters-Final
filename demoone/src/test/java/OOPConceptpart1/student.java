package OOPConceptpart1;

public class student {
	
	float math;
	float science;
	float history;
	float biology;
	float total;
	float average;
	
	void totalmarks() {
		total = math+science+history+biology;
		System.out.println("student total marks :" + total);
	}
	
	void averagemarks() {
			average = total/4;
			System.out.println("averagemarks is :" + average);
	}
		
	public static void main(String[] args) {
	student std1 = new student();
		std1.math=90.5f;
		std1.science=80;
		std1.history=70;
		std1.biology=90;
		
		std1.totalmarks();
		std1.averagemarks();
	student std2 = new student();
		std2.math=60;
		std2.science=85;
		std2.history=75;
		std2.biology=99;
		
		std2.totalmarks();
		std2.averagemarks();
		
	student std3 = new student();
		std3.math=65;
		std3.science=80;
		std3.history=77;
		std3.biology=99;
		
		std3.totalmarks();
		std3.averagemarks();
		
	student std4 = new student();
		std4.math=61;
		std4.science=88;
		std4.history=77;
		std4.biology=99;
		
		std4.totalmarks();
		std4.averagemarks();

	}

}
