package arrays;
import java.util.*;
public class TwoDimArray {

	public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			int rows=sc.nextInt();
			int colms=sc.nextInt();
			int a[][]=new int[rows][colms];
			int b[][]=new int [rows][colms];
			int sum[][]=new int[rows][colms];
			for(int i=0;i<rows;i++)
			{
				for(int j=0;j<colms;j++)
				{
					a[i][j]=sc.nextInt();
				}
			}
			for(int i=0;i<rows;i++)
			{
				for(int j=0;j<colms;j++)
				{
					b[i][j]=sc.nextInt();
				}
			}
			
			for(int i=0;i<rows;i++)
			{
				for(int j=0;j<colms;j++)
				{
					sum[i][j]=a[i][j]+b[i][j];
				}
			}
			System.out.println("SUM");
			for(int i=0;i<rows;i++)
			{
				for(int j=0;j<colms;j++)
				{
					System.out.print(sum[i][j]+" ");
				}
				System.out.println();
			}
	}

}
//3
//3
//1
//2
//3
//4
//5
//6
//7
//8
//9
//1
//2
//3
//4
//5
//6
//7
//8
//9
//SUM
//2 4 6 
//8 10 12 
//14 16 18 
