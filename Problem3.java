//Starting with a 1-indexed array of zeros and a list of operations, for each operation add a value to each of the array element between two given indices, inclusive. Once all operations have been performed, return the maximum value in your array. 
//For example, the length of your array of zeros 
//
//
//
//. Your list of queries is as follows: 
//    a b k
//    1 5 3
//    4 8 7
//    6 9 1
//Add the values of 
//
//between the indices 
//
//and 
//
//inclusive:
//index->	 1 2 3  4  5 6 7 8 9 10
//	[0,0,0, 0, 0,0,0,0,0, 0]
//	[3,3,3, 3, 3,0,0,0,0, 0]
//	[3,3,3,10,10,7,7,7,0, 0]
//	[3,3,3,10,10,8,8,8,1, 0]
//The largest value is 
//
//after all operations are performed. 
package arrays;

public class Problem3 {

	public static void main(String[] args) {
		int [][]queries= {{1, 5, 3},
			    {4, 8, 7},
			    {6, 9, 1}};
		int n[]=new int[10];
		for(int i=0;i<queries.length;i++)
        {
            for(int j=queries[i][0];j<=queries[i][1];j++)
            {
                n[j-1]+=queries[i][2];
            }
        } 
		
		for(int i=0;i<10;i++)
		{
			System.out.print(n[i]+" ");
		}
		System.out.println();
		int max=Integer.MIN_VALUE;
		for(int i=0;i<10;i++)
		{
			max=Math.max(max, n[i]);
		}
		System.out.println("Max "+max);

	}

}
//3 3 3 10 10 8 8 8 1 0 
//Max 10
