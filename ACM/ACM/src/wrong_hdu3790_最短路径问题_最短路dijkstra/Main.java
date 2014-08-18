package wrong_hdu3790_最短路径问题_最短路dijkstra;
//Time Limit Exceed!
import java.util.Scanner;

public class Main {
	static int n,m;
	static int G[][];
	static int C[][];
	static int dist[];
	static boolean S[];
	static int start,end;
	static int INF=0xffffff;
	static int cost[];
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		n=cin.nextInt();
		m=cin.nextInt();
		
		G=new int[n+1][n+1];
		dist=new int[n+1];
		S=new boolean[n+1];
		C=new int[n+1][n+1];
		cost=new int[n+1];
		
		while(n!=0 && m!=0)
		{
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=n;j++)
				{
					if(i==j) G[i][j]=0;
					else G[i][j]=INF;
					C[i][j]=0;
				}
			}
			
			for(int i=0;i<m;i++)
			{
				int aint=cin.nextInt();
				int bint=cin.nextInt();
				int cint=cin.nextInt();
				int dint=cin.nextInt();
				
				if(G[aint][bint]>cint)
				{
					G[aint][bint]=G[bint][aint]=cint;
					C[aint][bint]=C[bint][aint]=dint;
				}
			}
			
			start=cin.nextInt();
			end=cin.nextInt();
			
			Main.doDijkstra(start);
			
			System.out.println(dist[end]+" "+cost[end]);
			
			n=cin.nextInt();
			m=cin.nextInt();
		}
	}
	
	public static void doDijkstra(int s)
	{
		for(int i=1;i<=n;i++)
		{
			dist[i]=INF;
			S[i]=false;
			cost[i]=0;
		}
		
		dist[s]=0;
		S[s]=true;
		
		for(int i=1;i<=n;i++)
		{
			int u=s;
			int mind=INF;
			
			for(int h=1;h<=n;h++)
			{
				if(!S[h] && dist[h]<mind) //problem
				{
					mind=dist[h];
					u=h;
				}
			}
			
			S[u]=true;
			
			for(int j=1;j<=n;j++)
			{
				if(S[j]) continue;
				
				if(dist[u]+G[u][j]<dist[j])
				{
					dist[j]=dist[u]+G[u][j];
					cost[j]=cost[u]+C[u][j];
				
				}else if(dist[u]+G[u][j] == dist[j] && cost[u]+C[u][j] < cost[j]) //找最小费用
	            {
	                cost[j]=cost[u]+C[u][j];
	            }

			}
		}
	}
}
