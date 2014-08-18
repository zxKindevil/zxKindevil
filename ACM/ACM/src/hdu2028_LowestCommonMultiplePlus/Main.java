package hdu2028_LowestCommonMultiplePlus;

import java.util.Scanner;

public class Main {
	
	public static void main(String arg[])
	{
		Scanner cin=new Scanner(System.in);
		int i;
		long n,a,b;
		
		while( cin.hasNext() ) //ѭ��һ��Ҫ��hasNext(),������.
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
	 * *���������������Լ����ŷ������㷨Euclid��շת�����
	 * @param a ����һ����
	 * @param b ���ڶ�����
	 * @return a��b�����Լ�� GCD(Greatest Common Divisor)
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
	 * *a��b����С������ LCM(lowest Common Multiple)
	 * @param a ����һ����
	 * @param b ���ڶ�����
	 * @return a��b����С������ LCM(lowest Common Multiple)
	 */
	public static long getLCM(long a,long b)
	{
		long ret=0;
		ret= a/Main.getGCD(a, b)*b;
		return ret;
	}
}
