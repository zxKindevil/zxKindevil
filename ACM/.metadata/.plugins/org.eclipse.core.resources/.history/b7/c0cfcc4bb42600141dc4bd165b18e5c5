package X001_LowestCommonMultiple_LCM;

import java.util.Scanner;

public class Main {

	/**
	 * test
	 */
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int a,b;
		
		while(cin.hasNext())
		{
			
			a=cin.nextInt();
			b=cin.nextInt();
			
			System.out.println( Main.getGCD(a,b) );
			System.out.println( Main.getLCM(a,b) );
		}
		
	}
	/**
	 * *返回两个数的最大公约数，欧几里得算法Euclid，辗转相除法
	 * @param a ：第一个数
	 * @param b ：第二个数
	 * @return a，b的最大公约数 GCD(Greatest Common Divisor)
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
	 * *a，b的最小公倍数 LCM(lowest Common Multiple)
	 * @param a ：第一个数
	 * @param b ：第二个数
	 * @return a，b的最小公倍数 LCM(lowest Common Multiple)
	 */
	public static int getLCM(int a,int b)
	{
		int ret=0;
		ret= a*b/Main.getGCD(a, b); //求最小公倍数 (a*b)/GCD(a,b)
		return ret;
	}
}
