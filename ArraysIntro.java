package arrays;

import java.util.Scanner;

public class ArraysIntro {

	public static void main(String[] args) {

		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter the number of students");
		int n=sc.nextInt();
		int marks[]=new int[n];
		System.out.println("Enter the marks");
		for(int i=0;i<marks.length;i++)
		{
			marks[i]=sc.nextInt();
		}
		int avg=0;
		for(int i=0;i<marks.length;i++)
		{
			avg+=marks[i];
		}
		System.out.println("Avg of students marks is: "+(double)avg/(double)n);

	}

}
//Enter the number of students
//5
//Enter the marks
//12
//23
//45
//56
//78
//Avg of students marks is: 42.8
