package hdu2032_�������;

import java.util.*;

public class Main {

	/**����������
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
			//�Ӻ�����ǰ����һ������Ͳ�����Ϊǰ�������Ӱ����������
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
