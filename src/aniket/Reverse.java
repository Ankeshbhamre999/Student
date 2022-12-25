package aniket;
//program for reverse element using interface with static method
public interface Reverse {

	public static void  elementReverse(int[]arr)
	{
		for (int i = arr.length-1; i>=0; i--)
		{
			System.out.println(arr[i]);
			
			
		}
		
	}
}
