package gfg.array;


public class SubArrayWithGivenSum {

	public static void findSubArray(int arr[],int n,int s)
	{
		if(n==0)
			return ;
		if(n==1)
		{
			if(s==arr[0])
				System.out.println(0+","+0);
		}
		int i = 0;
		int j = 1;
		int sum=arr[0];
		while(j<n)
		{
			sum+=arr[j];
			if(sum>s)
			{
				while(sum>s&&i<j)
				{
					sum=sum-arr[i];
					i++;
				}
			}
			if(s==sum)
			{
				System.out.println("index : "+i+","+j);
				break;
			}
			else
			{
				j++;
			}
		}
	}
	public static void main(String[] args) {
		int arr[]= {1,4,20,3,10,5};
		int n = arr.length;
		findSubArray(arr, n, 33);
	}

}
