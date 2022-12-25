package aniket;

import java.util.Scanner;

public interface SearchArray {
	
	public default int printElement()
	{
		return 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element to find:");
		int n = sc.nextInt();
		
		boolean flag = false;
		for (int i = 0; i<arr.length-1;i++)
		{
			if(n==arr[i])
			{
			flag = true;
			//System.out.println("value is present");
			}
		}
		if(flag==true) {
			System.out.println("is present");
		}
		else {
			System.out.println("not present");
		}

	}

}
