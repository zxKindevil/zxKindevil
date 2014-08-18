package Google2015_01B_Super2048;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int testcase=cin.nextInt();
		while(0!=testcase)
		{
			int n=cin.nextInt();
			String dir=cin.next();
			rec=new int[n][n];
			for(int i=0;i<n;i++)
			{
				for(int ii=0;ii<n;ii++) 
					rec[i][ii]=cin.nextInt();
			}
			Main.doZX(rec, n, dir.charAt(0));
		}
	}
	
	static int[][] rec;
	
	static public void doZX(int[][] rec,int n,char dir)
	{
		System.out.println(dir);
		int [][] ret=new int[n][n];
		if('u'==dir)
		{
			for(int i=0;i<n;i++)
			{
				for(int ii=0;ii<n;ii++)
				{
					int temp=0;
					for(int iii=ii;iii<n;iii++)
					{
						if(rec[iii][i]==0) continue;
						
						if(0==temp)
						{
							temp=rec[iii][i];
							rec[iii][i]=0;
						}
						else
						{
							if(temp==rec[iii][i])
							{
								rec[iii][i]=0;
								temp*=2;
								break;
							}
							else break;
						}
					}
					ret[ii][i]=temp;
					if(0==temp)
					{
						for(;ii<n;ii++)
						{
							ret[ii][i]=0;
						}
					}
				}
			}
		}
		if('d'==dir)
		{
			for(int i=n-1;i>=0;i--)
			{
				for(int ii=n-1;ii>=0;ii--)
				{
					int temp=0;
					for(int iii=ii;iii>=0;iii--)
					{
						if(rec[iii][i]==0) continue;
						
						if(0==temp)
						{
							temp=rec[iii][i];
							rec[iii][i]=0;
						}
						else
						{
							if(temp==rec[iii][i])
							{
								rec[iii][i]=0;
								temp*=2;
								break;
							}
							else break;
						}
					}
					ret[ii][i]=temp;
					if(0==temp)
					{
						for(;ii>=0;ii--)
						{
							ret[ii][i]=0;
						}
					}
				}
			}
		}
		if('l'==dir)
		{
			for(int i=0;i<n;i++)
			{
				for(int ii=0;ii<n;ii++)
				{
					int temp=0;
					for(int iii=ii;iii<n;iii++)
					{
						if(rec[i][iii]==0) continue;
						
						if(0==temp)
						{
							temp=rec[i][iii];
							rec[i][iii]=0;
						}
						else
						{
							if(temp==rec[i][iii])
							{
								rec[i][iii]=0;
								temp*=2;
								break;
							}
							else break;
						}
					}
					ret[i][ii]=temp;
					if(0==temp)
					{
						for(;ii<n;ii++)
						{
							ret[i][ii]=0;
						}
					}
				}
			}
		}
		if('r'==dir)
		{
			for(int i=n-1;i>=0;i--)
			{
				for(int ii=n-1;ii>=0;ii--)
				{
					int temp=0;
					for(int iii=ii;iii>=0;iii--)
					{
						if(rec[i][iii]==0) continue;
						
						if(0==temp)
						{
							temp=rec[i][iii];
							rec[i][iii]=0;
						}
						else
						{
							if(temp==rec[i][iii])
							{
								rec[i][iii]=0;
								temp*=2;
								break;
							}
							else break;
						}
					}
					ret[i][ii]=temp;
					if(0==temp)
					{
						for(;ii>=0;ii--)
						{
							ret[i][ii]=0;
						}
					}
				}
			}
		}
		
		for(int i=0;i<n;i++)
		{
			for(int ii=0;ii<n;ii++)
			{
				System.out.print(ret[i][ii]+" ");
			}
			System.out.println();
		}
	}
}
