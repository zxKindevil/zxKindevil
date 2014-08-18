package hdu2032_杨辉三角;

import java.util.*;

public class Main {

	/**输出杨辉三角
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		while(cin.hasNext())
		{
			int n=cin.nextInt();
			Main.doOutput(n);
			System.out.println();
		}
	}
	
	public static void doOutput(int n)
	{
		int i;
		int[] aryint= new int[30];
		for(i=0;i<n;i++)
		{
			aryint[0]=aryint[i]=1;
			//从后面向前算用一个数组就不会因为前面的数字影响后面的数字
			for(int j=i-1;j>0;j--)
			{
				aryint[j]=aryint[j-1]+aryint[j];
			}
			for(int j=0;j<i;j++)
			{
				System.out.print(aryint[j]+" ");
			}
			System.out.print(aryint[i]);
			System.out.println();
		}
	}
}
