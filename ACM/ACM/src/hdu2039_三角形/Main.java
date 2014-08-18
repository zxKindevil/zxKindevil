package hdu2039_三角形;

import java.util.Scanner;

public class Main {

	/**给三边看是不是三角形
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int ni=cin.nextInt();
		while(ni!=0)
		{
			double ai=cin.nextDouble();
			double bi=cin.nextDouble();
			double ci=cin.nextDouble();
			Main.doZX(ai,bi,ci);
			
			ni--;
		}
	}
	
	public static void doZX(double ai,double bi,double ci)
	{
		boolean flagb=true;
		if( !(ai+bi>ci) ) flagb=false;
		if( !(ai+ci>bi) ) flagb=false;
		if( !(ci+bi>ai) ) flagb=false;
		if( !(ai-bi<ci) ) flagb=false;
		if( !(ai-ci<bi) ) flagb=false;
		if( !(ci-bi<ai) ) flagb=false;
		
		if(flagb) System.out.println("YES");
		else System.out.println("NO");
	}
}
