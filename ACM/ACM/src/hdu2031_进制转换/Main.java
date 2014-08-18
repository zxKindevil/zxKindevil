package hdu2031_进制转换;

import java.util.Scanner;

public class Main {

	/**对一个数字进行进制转换 看看 Integer.toString(i,radix) 函数源码
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner cin=new Scanner(System.in);
		while(cin.hasNext())
		{
			int i=cin.nextInt();
			int radix=cin.nextInt();
			System.out.println(Integer.toString(i, radix).toUpperCase() );
	
		}
	}

}
