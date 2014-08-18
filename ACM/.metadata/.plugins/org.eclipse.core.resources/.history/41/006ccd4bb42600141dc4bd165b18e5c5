package X002_Dijkstra;

import java.util.Scanner;

public class Main {
	static int n;
	static int[][] G;
	static boolean S[];
	static int[] dist;
	static int INF=99999999;
	
	/**
	 * Dijkstra Test
	 * */
	public static void main(String args[])
	{
		Scanner cin=new Scanner(System.in);
		n=cin.nextInt();
		G=new int[n+1][n+1];
		S=new boolean[n+1];
		dist=new int[n+1];
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++) G[i][j]=cin.nextInt();
		}
		
		dijstra(1);
		
		for(int i=1;i<=n;i++)
		{
			System.out.println(dist[i]);
		}
	}
	
	/**
	 * Dijkstra
	 * @param s :出发结点
	 * */
	public static void dijstra(int s)
	{
		for(int i=1;i<=n;i++)
		{
			dist[i]=G[s][i];
			S[i]=false;
		}
		
		dist[s]=0;
		S[s]=true;
		
		
		for(int x=1;x<=n;x++)
		{
			int mindist=INF;
			int u=s;
			for(int i=1;i<=n;i++)
			{
				if(!S[i] && dist[i]<mindist)
				{
					u=i;
					mindist=dist[i];
				}
			}
			S[u]=true;
			for(int i=1;i<=n;i++)
			{
				if(S[i]) continue;
				if(dist[u]+G[u][i]<dist[i])
				{
					dist[i]=dist[u]+G[u][i];
				}
			}
		}
	}
}
