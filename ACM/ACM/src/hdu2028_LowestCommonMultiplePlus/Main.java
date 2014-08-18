package hdu2028_LowestCommonMultiplePlus;

import java.util.Scanner;

public class Main {
	
	public static void main(String arg[])
	{
		Scanner cin=new Scanner(System.in);
		int i;
		long n,a,b;
		
		while( cin.hasNext() ) //循环一定要用hasNext(),被坑死.
		{
			n=cin.nextLong();
			
			a=cin.nextInt();
			for(i=1;i<n;i++)
			{
				b=cin.nextInt();
				a=Main.getLCM(a, b);
			}
			System.out.println(a);
		}
	}
	
	/**
	 * *返回两个数的最大公约数，欧几里得算法Euclid，辗转相除法
	 * @param a ：第一个数
	 * @param b ：第二个数
	 * @return a，b的最大公约数 GCD(Greatest Common Divisor)
	 */
	public static long getGCD(long a,long b)
	{
		if(a<b)
		{
			long temp=a;
			a=b;
			b=temp;
		}
		
		long ret=0;
		long r=0;
		do{
			r=a%b;
			a=b;
			b=r;
		}while(r!=0);
		ret=a;
		
		return ret;
	}
	
	/**
	 * *a，b的最小公倍数 LCM(lowest Common Multiple)
	 * @param a ：第一个数
	 * @param b ：第二个数
	 * @return a，b的最小公倍数 LCM(lowest Common Multiple)
	 */
	public static long getLCM(long a,long b)
	{
		long ret=0;
		ret= a/Main.getGCD(a, b)*b;
		return ret;
	}
}
