import java.util.*;
import java.io.*;
public class j {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(f.readLine());
		int x[]=new int[n+2];
		int y[]=new int[n+2];
		for(int i=0;i<n+2;i++){
			StringTokenizer tk=new StringTokenizer(f.readLine());
			x[i]=Integer.parseInt(tk.nextToken());
			y[i]=Integer.parseInt(tk.nextToken());
		}
		int adj[][]=new int[n+2][n+2];
		for(int i=0;i<n+2;i++){
			for(int j=0;j<i;j++){
				adj[i][j]=(x[i]-x[j])*(x[i]-x[j])+(y[i]-y[j])*(y[i]-y[j]);
				adj[j][i]=adj[i][j];
			}
		}
		
		int curr=n;
		int end=n+1;
		boolean visited[]=new boolean[n+2];
		int dist[]=new int[n+2];
		Arrays.fill(dist, Integer.MAX_VALUE);
		dist[curr]=0;
		boolean b=false;
		while(curr!=end){
			for(int i=0;i<n+2;i++){
				dist[i]=Math.min(dist[i], dist[curr]+adj[curr][i]);
			}
			visited[curr]=true;
			int min=Integer.MAX_VALUE;
			for(int i=0;i<n+2;i++){
				if(!visited[i]){
					if(dist[i]<min){
						min=dist[i];
						curr=i;
					}
				}
			}
			if(curr!=0&&curr!=n+1){
				System.out.println(curr);
				b=true;
			}
		}
		if(!b){
			System.out.println("-");
		}

	}

}
