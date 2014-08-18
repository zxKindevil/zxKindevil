package hdu2035_A的B次方;

import java.util.*;

public class Main {

	/**计算A的次方，只要后3位就每次MOD1000
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
