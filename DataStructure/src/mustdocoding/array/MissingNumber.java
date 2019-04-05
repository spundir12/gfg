/*
 * https://www.geeksforgeeks.org/find-the-missing-number/
 * Find the Missing Number
You are given a list of n-1 integers and these integers are in the range of 1 to n. There are no duplicates in list.
One of the integers is missing in the list. Write an efficient code to find the missing integer.
I/P    [1, 2, 4, ,6, 3, 7, 8]
O/P    5
 */
package mustdocoding.array;

public class MissingNumber {

	
	//this logic may not work in large value
	// overflow chance in large value 
	public static int findMissingNumber(int arr[],int n)
	{
		int missNum=0;
		//sum of number from 1 to n is n*(n+1)/2;
		// given that one number is missed then total number is (n+1).
		//so sum of tatal number is (n+1)(n+1+1)/2;
		int ts = (n+1)*(n+2)/2;
		
		//subtract all element from ts and then remaining value is result
		for(int i=0;i<n;i++)
		{
			ts-=arr[i];
		}
		return ts;
	}
	
	//use XOR
	public static int findMissingNumberUsingXOR(int arr[],int n)
	{
		int missNum=0;
		int ts=0;
		for(int i=1;i<=n+1;i++)
		{
			ts^=i;
			System.out.print(ts+" ");
		}
		System.out.println();
		for(int i=0;i<n;i++)
		{
			missNum^=arr[i];
			System.out.print(missNum+" ");
		}
		System.out.println();
		return ts^missNum;
	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,4,5,6}; //{1,2,4,5};
		int n = arr.length;
		System.out.println(findMissingNumber(arr, n));
		System.out.println(findMissingNumberUsingXOR(arr, n));
		
	}

}
