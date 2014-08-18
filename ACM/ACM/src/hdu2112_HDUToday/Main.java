package hdu2112_HDUToday;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	static int n;
	static int G[][];
	static int dist[];
	static boolean S[];
	static int start,end;
	static int INF=0xffffff;
	static int count=1;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		
		G=new int[n+1][n+1];
		dist=new int[n+1];
		S=new boolean[n+1];
		Map<Integer,String> map=new HashMap<Integer,String>();
		
		while(n!=-1)
		{
			String temstr=cin.next();
			String temastr=cin.next();
			int t=n;
			if(temstr.equals(temastr)) t=1;
			map.put(1, temstr );
			map.put(t, temastr );
			
			for(int i=0;i<=n;i++)
				for(int j=0;j<=n;j++) if(i==j) G[i][j]=0; else G[i][j]=INF;
			
			for(int i=0;i<n;i++)
			{
				String astr=cin.next();
				String bstr=cin.next();
				int aint=Main.getKey(astr, map);
				int bint=Main.getKey(bstr, map);
				int cint=cin.nextInt();
				if(G[aint][bint]>cint) G[aint][bint]=G[bint][aint]=cint;
			}
			/*
			for(int key:map.keySet())
			{
				System.out.println(map.get(key));
			}*/
			
			
			/*
			for(int i[]:G)
			{
				for(int j:i)
				{
					System.out.print(j+" ");
				}
				System.out.println();
			}*/
			//System.out.println("n:"+n);
			
			Main.doDijkstra(1,n);
			
			if(INF==dist[t]) System.out.println(-1);
			else System.out.println(dist[t]);
			
			n=cin.nextInt();
		}
	}
	
	public static int getKey(String str,Map<Integer,String> map)
	{
		
		
		int ret=0;
		if(!map.containsValue(str))
		{
			map.put(++count, str);
			return count;
		}
		for(int key:map.keySet())
		{
			if(map.get(key).equals(str) )
			{
				ret=key;
				break;
			}
		}
		return ret;
	}
	
	/**
	 * @param 起始结点
	 * */
	public static void doDijkstra(int s,int n)
	{
		
		for(int i=1;i<=n;i++)
		{
			dist[i]=G[s][i];
			S[i]=false;
		}
		dist[s]=0;
		S[s]=true;
		
		//System.out.println(n);
		
		for(int x=1;x<=n;x++)
		{
			//System.out.println("Go here 01");
			//System.out.println("go here");
			int u=s;
			int mind=INF;
			for(int i=1;i<=n;i++)
			{
				if(!S[i] && dist[i]<mind)
				{
					mind=dist[i];
					u=i;
				}
			}
			S[u]=true;
			for(int i=1;i<=n;i++)
			{
				if(S[i]) continue;
				if(dist[u]+G[u][i]<dist[i])
				{
					dist[i]=dist[u]+G[u][i];
					//System.out.printf("dist[%d]=%d",i,dist[i]);
				}
			}
		}
	}
}
