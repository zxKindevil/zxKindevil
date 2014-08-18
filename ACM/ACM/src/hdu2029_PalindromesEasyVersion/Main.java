package hdu2029_PalindromesEasyVersion;

import java.util.*;

public class Main {
	public static void main(String arg[])
	{
		Scanner cin=new Scanner(System.in);
		int n;
		n=cin.nextInt();
		while(n!=0)
		{
			String str=cin.next();
			if(Main.isPalindrome(str))
			{
				System.out.println("yes");
			}
			else{
				System.out.println("no");
			}
			n--;
		}
	}
	
	public static boolean isPalindrome(String str)
	{
		boolean ret=true;
		int i;
		
		for(i=0;i<str.length()/2;i++)
		{
			if(str.charAt(i)!=str.charAt(str.length()-1-i)) ret=false;
		}
		
		return ret;
	}
}
