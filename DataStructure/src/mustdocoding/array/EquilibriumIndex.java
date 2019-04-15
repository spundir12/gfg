/*
https://www.geeksforgeeks.org/equilibrium-index-of-an-array/
 
Equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.
For example, in an array A:

Example :

Input : A[] = {-7, 1, 5, 2, -4, 3, 0}
Output : 3
3 is an equilibrium index, because:
A[0] + A[1] + A[2]  =  A[4] + A[5] + A[6]

Write a function int equilibrium(int[] arr, int n); that given a sequence arr[] of size n, 
returns an equilibrium index (if any) or -1 if no equilibrium indexes exist.

*/
package mustdocoding.array;

public class EquilibriumIndex {

	public static int getEquilibriumIndex(int arr[],int n)
    {
	  //create two arr one is having sum from left to right
	  // another arr is having sum from right to left
	 // the index where both array has same value is called equilibrium index
       int a1[]=new int[n];
       int a2[]=new int[n];
       int s1=0;
       int s2=0;
       for(int i=0,j=n-1;i<n;i++,j--)
       {
           s1+=arr[i];
           a1[i]=s1;
           
           s2+=arr[j];
           a2[j]=s2;
       }
       for(int i=0;i<n;i++)
       {
           if(a1[i]==a2[i])
               return i+1;
       }
       return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
