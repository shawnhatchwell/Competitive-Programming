import java.util.*;
import java.io.*;
public class humancannonball {
	
	public static void main(String[] args) throws IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk=new StringTokenizer(f.readLine());
		double ax=Double.parseDouble(tk.nextToken());
		double ay=Double.parseDouble(tk.nextToken());
		tk=new StringTokenizer(f.readLine());
		double bx=Double.parseDouble(tk.nextToken());
		double by=Double.parseDouble(tk.nextToken());
		int n=Integer.parseInt(f.readLine());
		double x[]=new double[n];
		double y[]=new double[n];
		for(int i=0;i<n;i++){
			tk=new StringTokenizer(f.readLine());
			x[i]=Double.parseDouble(tk.nextToken());
			y[i]=Double.parseDouble(tk.nextToken());
		}
		double adj[][]=new double[n+2][n+2];
		for(int i=0;i<n;i++){
			adj[0][i+1]=distance(ax,ay,x[i],y[i])/5;
		}
		adj[0][n+1]=distance(ax,ay,bx,by)/5;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				double dist=distance(x[i], y[i],x[j],y[j]);
				adj[i+1][j+1]=Math.min(dist/5,2+Math.abs(dist-50)/5);
				adj[j+1][i+1]=adj[i+1][j+1];
			}
		}
		for(int i=0;i<n;i++){
			double dist=distance(x[i], y[i],bx,by);
			adj[i+1][n+1]=Math.min(dist/5,2+Math.abs(dist-50)/5);
		}
		double dist[]=new double[n+2];
		boolean visited[]=new boolean[n+2];
		int curr=0;
		Arrays.fill(dist, Double.MAX_VALUE);
		dist[0]=0;
		while(curr!=n+1){
			visited[curr]=true;
			double min=Double.MAX_VALUE;
			int ind=-1;
			for(int i=0;i<n+2;i++){
				if(!visited[i]){
					dist[i]=Math.min(dist[i], dist[curr]+adj[curr][i]);
					if(dist[i]<min){
						min=dist[i];
						ind=i;
					}
				}
			}
			curr=ind;
		}
		System.out.println(dist[n+1]);
		
	}
	private static double distance(double x1, double y1, double x2, double y2) {
		return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
	}

}
