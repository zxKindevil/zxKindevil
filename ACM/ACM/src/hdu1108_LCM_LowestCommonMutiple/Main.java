package hdu1108_LCM_LowestCommonMutiple;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int a,b;
		while(cin.hasNext())
		{
			a=cin.nextInt();
			b=cin.nextInt();
			System.out.println(Main.getLCM(a, b));
		}
	}
	/**
	 * *���������������Լ����ŷ������㷨Euclid��շת�����
	 * @param a ����һ����
	 * @param b ���ڶ�����
	 * @return a��b�����Լ�� GCD(Greatest Common Divisor)
	 */
	public static int getGCD(int a,int b)
	{
		int ret=0;
		int r=0;
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
	public static int getLCM(int a,int b)
	{
		int ret=0;
		ret= a*b/Main.getGCD(a, b);
		return ret;
	}
}
