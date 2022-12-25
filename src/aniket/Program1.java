package aniket;
import java.util.Scanner;
public class Program1 {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element to find:");
		int n = sc.nextInt();
		
		boolean flag = false;
		for (int i = 0; i< arr.length-1;i++)
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
