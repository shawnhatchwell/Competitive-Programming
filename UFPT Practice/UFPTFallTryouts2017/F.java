import java.util.*;
import java.io.*;
public class F {

	public static void main(String[] args) throws IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		int q=Integer.parseInt(f.readLine().trim());
		for(int k=1;k<=q;k++){
			String blank=f.readLine();
			StringTokenizer tk=new StringTokenizer(f.readLine().trim());
			int n=Integer.parseInt(tk.nextToken());
			int m=Integer.parseInt(tk.nextToken());
			tk=new StringTokenizer(f.readLine().trim());
			int a[]=new int[n];
			for(int i=0;i<n;i++){
				a[i]=Integer.parseInt(tk.nextToken());
			}
			boolean[][] adj=new boolean[n][n];
			System.out.println(n);
			for(int i=0;i<m;i++){
				tk=new StringTokenizer(f.readLine().trim());
				int u=Integer.parseInt(tk.nextToken());
				int v=Integer.parseInt(tk.nextToken());
				System.out.println(u+" "+v);
				adj[u][v]=true;
			}
			boolean b=true;
			int cur=0;
			int sum=0;
			while(b){
				sum+=a[cur];
				b=false;
				int max=0;
				int next=cur;
				for(int i=0;i<n;i++){
					if(adj[cur][i]){
						b=true;
						int temp=max;
						max=Math.max(max, i);
						if(temp!=max){
							next=i;
						}
					}
				}
				cur=next;
			}
			System.out.println("Case "+k+": "+sum+" "+cur);
		}
		
		
	}

}