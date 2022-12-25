package aniket;

public interface  Check {
	public  static void printCheck(int[] arr)
	{ int sum=0;
	int mul=1;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(i%2==0)
			{
				sum=sum+arr[i];
				System.out.println(sum);
			}
			else
			{
				mul=mul*arr[i];
			}
		}
		
	}

}
class Interface1
{
	public static void main(String[] args)
	{
	  int[] arr= {5,2,8,1,7,6,3,4,5};
		Check.printCheck(arr);
	}
}
