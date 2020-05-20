package arrays;
import java.util.Scanner;
public class Problem2 {

	public static void main(String[] args) {
			Scanner sc=new Scanner (System.in);
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
				int i=n-2;
				int temp=a[n-1];
				for(i=n-2;i>=0;i--)
				{
					a[i+1]=a[i];            //right rotation
				}
				a[i+1]=temp;
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
//2 3 4 5 1 