/*
 * https://www.geeksforgeeks.org/sort-an-array-of-0s-1s-and-2s/
 * 
 * Given an array A of size N containing 0s, 1s, and 2s; you need to sort the array in ascending order.
 * 
 Input :  {0, 1, 2, 0, 1, 2}
 Output : {0, 0, 1, 1, 2, 2}

 Input :  {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1}
 
 Output : {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2}
 https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s/0
 */

package mustdocoding.array;

import java.util.Arrays;

public class SortArrayOf012 {

	/*
	 * solution: there are various way to solve this problem
	 * simply use sorting technique 
	 * 
	 * in this sorting method we are swapping between zero and non-zero number
	 * all zero should come first and then all non-zero should appear.
	 * After that we will do same for one and two. 
	 */
	public static void sort(int arr[],int n)
	{
		int i=0;
		int j=n-1;
		while(i<j)
		{
			if(arr[i]==0 && arr[j]!=0)
			{
				i++;
				j--;
			}
			else if(arr[i]!=0 && arr[j]==0)
			{
				int t=arr[i];
				arr[i]=arr[j];
				arr[j]=t;
				i++;
				j--;
			}
			else if(arr[i]==0)
				i++;
			else 
				j--;
				
		}
		j=n-1;
		while(i<j)
		{
			if(arr[i]==0)
				i++;
			else if(arr[i]==1 && arr[j]!=1)
			{
				i++;
				j--;
			}
			else if(arr[i]!=1 && arr[j]==1)
			{
				int t=arr[i];
				arr[i]=arr[j];
				arr[j]=t;
				i++;
				j--;
			}
			else if(arr[i]==1)
				i++;
			else 
				j--;
		}
	}
	public static void main(String[] args) {
		int arr[]={0, 0, 1, 0, 0, 0, 1, 2};
				//{0, 1, 2, 0, 1, 2};//{0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		sort(arr,arr.length);
		System.out.println(Arrays.toString(arr));
	}

}
