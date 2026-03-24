package task2;

import java.util.Scanner;

public class StudentGradeCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int subjects;
		int total=0;
	
		System.out.println("Enter number of subjects:");
		subjects = sc.nextInt();
		
		for(int i=1; i<=subjects; i++) {
			System.out.println("Enter marks for Subject " + i + ":");
			int marks = sc.nextInt();
			total = total + marks;
			
		}
		
		double avg = (double) total/subjects;
		String grade;
		
		if(avg >= 90) {
			grade = "A+";
		}else if(avg >= 80) {
			grade = "A";
			
		}else if(avg >= 70) {
			grade = "B";
			
		}else if (avg >= 60) {
			grade = "C";
		}else if(avg >= 50) {
			grade = "D";
		}else {
			grade = "Fail";
		}
		
		System.out.println("\n Total Marks: " +total);
		System.out.println(" Average Percentage: " + avg);
		System.out.println("Grade:" +grade);
		
		sc.close();

	}

}
