/*
A left rotation operation on an array of size shifts each of the array's elements unit to the left. For example, if left rotations are performed on array , 
then the array would become Given an array of integers and a number, , perform left rotations on the array. Then print the updated array as 
a single line of space-separated integers.
Input Format
The first line contains two space-separated integers denoting the respective values of 

(the number of integers) and 

(the number of left rotations you must perform). 
The second line contains 

space-separated integers describing the respective elements of the array's initial state.

*/


package arrays;
import java.util.*;
public class Problem1 {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n,d;
			n=sc.nextInt();
			d=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			while(d>0)
			{
				int temp=a[0];
				int i=0;
				for(i=0;i<n-1;i++)
				{
					a[i]=a[i+1];                                    //left rotation
				}
				a[i]=temp;
				d--;
			}
			
			for(int i=0;i<n;i++)
			{
				System.out.print(a[i]+" ");
			}
			

	}

}


//5
//4
//1
//2
//3
//4
//5
//5 1 2 3 4 