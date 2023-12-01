package OOPConceptpart1;

import java.util.Scanner;

public class studentmarks {
	
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
	
		Scanner sc = new Scanner(System.in);
			
		studentmarks std1=new studentmarks();
	
		System.out.println("please enter math");
		std1.math=sc.nextFloat();
		System.out.println("please enter science");
		std1.science=sc.nextFloat();
		System.out.println("please enter history");
		std1.history=sc.nextFloat();
		System.out.println("please enter biology");
		std1.biology=sc.nextFloat();
						
		std1.totalmarks();
		std1.averagemarks();
	
	}

}
