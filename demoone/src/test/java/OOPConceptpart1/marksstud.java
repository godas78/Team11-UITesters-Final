package OOPConceptpart1;
//java program to calculate sum & average of given 4 marks via constructor, if three or two marks only passed from main method, then keep the missing value(s) as 35) - Hint - multiple parameterized constructor 
public class marksstud {
	float math;
	float science;
	float history;
	float pe;
	float average;
	float total;
		
	public marksstud(float a,float b,float c,float d) {
		math=a;
		science=b;
		history=c;
		pe=d;
	}
	public marksstud(float a,float b,float c) {
		math=a;
		science=b;
		history=c;
		pe=35;
	}
	public marksstud(float a,float b) {
		math=a;
		science=b;
		history=35;
		pe=35;
	}
	public marksstud(float a) {
		math=a;
		science=35;
		history=35;
		pe=35;
	}
		
		void totalmarks() {
			total=math+science+history+pe;
		}
		void averagemarks() {
			average=(math+science+history+pe)/4;
		}
		
	public static void main(String[] args) {
		marksstud std = new marksstud(50.0f,50.0f,70.0f,85.0f);
		System.out.println("printing marks of stud");
		std.totalmarks();
		System.out.println("total= " + std.total);
		std.averagemarks();
		System.out.println("average= " + std.average);
		
	}

}
