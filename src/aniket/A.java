package aniket;
// check evene and odd element by interface with static method ??
public interface A {
	public static void printA(int[] arr)
	{
		int sum=0;
		int mul=1; // take 1 vale because 0 * anything provide 0
		for(int i=0;i<=arr.length-1;i++)
		{
			if(i%2==0)
			{
				sum=sum+arr[i];
				
			}
			else
			{
				mul=mul*arr[i];
			}
		}
		System.out.println("sum of evens:"+sum);
		System.out.println("mul of odds:"+mul);
	}

}
