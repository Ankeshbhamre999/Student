package aniket;
import java.util.Scanner;
public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true)
		{
		System.out.println("Enter value");
		long n = sc.nextLong();
		int j = 0;
		long sum = 0;
		for (int i = 1 ; i<=n/2; i++)
		{
			
			if(n%i==0)
			{
				sum = sum+i;
				j = (int) (n%i);
				j++;
				
			}
		
			
		}
	

		if(sum==n)
		{
			System.out.println(n);
			System.out.println(sum);
			System.out.println("its perfect number");
		}
		else
		{
			System.out.println("not");
		}
		}
	}

}
