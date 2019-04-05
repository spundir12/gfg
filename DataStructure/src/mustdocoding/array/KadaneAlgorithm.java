/*
 * Largest Sum Contiguous Subarray
Write an efficient program to find the sum of contiguous sub-array within a one-dimensional array of numbers which has the largest sum.
or 
Given an array arr of N integers. Find the contiguous sub-array with maximum sum.
 Input
 2
 5
 1 2 3 -2 5
 4
 -1 -2 -3 -4
 Output
 9
-1

 https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
*/
package mustdocoding.array;

public class KadaneAlgorithm {
	  public static int kadane(int arr[],int n)
	     {
	         int max=arr[0];
	         int currMax = arr[0];
	         for(int i=1;i<n;i++)
	         {
	             max=Math.max(max,currMax);
	             if(currMax+arr[i] > arr[i])
	             {
	                 currMax=currMax+arr[i];
	             }
	             else{
	                 currMax = arr[i];
	             }
	         }
	         max=Math.max(max,currMax);
	         return max;
	     }
	public static void main(String args[])
	{
		int [] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
		int n = arr.length;
		System.out.println(kadane(arr, n));
	}
}
