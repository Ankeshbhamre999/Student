package aniket;

public interface FirstLetter {
	
	public default  void  CheckString(String s)
	{
		
		String [] arr = s.split(" ");
		for (int i = 0 ; i<=arr.length-1; i++)
		{
			String s1 = arr[i];
			
		for (int j =1 ; j<=s1.length()-1; j++)
		{
			char ch = s1.charAt(i);
			
		
		System.out.println((char)(ch-32));
		break;
//		System.out.print(ch);
//		  s= s.substring(1, arr.length() - 1);
	
		
	}
		}
		
	}}
