package hdu2031_����ת��;

import java.util.Scanner;

public class Main {

	/**��һ�����ֽ��н���ת�� ���� Integer.toString(i,radix) ����Դ��
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner cin=new Scanner(System.in);
		while(cin.hasNext())
		{
			int i=cin.nextInt();
			int radix=cin.nextInt();
			System.out.println(Integer.toString(i, radix).toUpperCase() );
	
		}
	}

}
