package hdu2035_A��B�η�;

import java.util.*;

public class Main {

	/**����A�Ĵη���ֻҪ��3λ��ÿ��MOD1000
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int ai=cin.nextInt(),bi=cin.nextInt();
		while( (ai!=0&&bi!=0) )
		{
			Main.doZX(ai, bi);
			
			ai=cin.nextInt();
			bi=cin.nextInt();
		}
	}
	
	public static void doZX(int ai,int bi)
	{
		int ansi=1;
		for(int i=0;i<bi;i++)
		{
			ansi*=ai;
			ansi%=1000;
		}
		System.out.println(ansi);
	}
}
