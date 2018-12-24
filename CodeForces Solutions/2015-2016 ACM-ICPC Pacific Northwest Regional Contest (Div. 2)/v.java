import java.util.*;
import java.io.*;
public class v {

	public static void main(String[] args) throws IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(f.readLine());
		int x[]=new int[n];
		int y[]=new int[n];
		int r[]=new int[n];
		for(int i=0;i<n;i++){
			StringTokenizer tk=new StringTokenizer(f.readLine());
			x[i]=Integer.parseInt(tk.nextToken());
			y[i]=Integer.parseInt(tk.nextToken());
			r[i]=Integer.parseInt(tk.nextToken());
		}
		boolean adj[][]=new boolean[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				adj[i][j]=(x[i]-x[j])*(x[i]-x[j])+(y[i]-y[j])*(y[i]-y[j])<=(r[i]+r[j])*(r[i]+r[j]);
			}
		}
		for(int k=0;k<n;k++){
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					if(adj[i][k]&&adj[k][j]){
						adj[i][j]=true;
					}
				}
			}
		}
		if(!adj[0][n-1]){
			System.out.println("The input gear cannot move.");
		}
		else{
			int a=r[0];
			int b=r[n-1];
			while()
		}
		
	}

}