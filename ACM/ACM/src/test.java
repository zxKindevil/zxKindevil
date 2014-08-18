
public class test {
	public static void main(String args[])
	{
		
		int num=0x0011;
		System.out.println(num);
		
		int i;
		char aa='!';
		for(i=0;i<8;i++)
		{
			int a=1;
			int temp=aa&a;
			aa>>=1;
			System.out.println(temp);
		}
	}
}
