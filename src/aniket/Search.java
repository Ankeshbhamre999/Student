package aniket;
// search array element by using interface with static method ??
public interface Search {
 
	public static int printArray(int arr[],int key)
	{
	
		for (int i = 0; i<=arr.length;i++)
		{
			if(arr[i] == key)
			{
				return i; // if value is present return the value 
			
			}
			else
			{
				System.out.println("value is not present ");
				break;
			}
		}
		return key;

	
		
	}
}
