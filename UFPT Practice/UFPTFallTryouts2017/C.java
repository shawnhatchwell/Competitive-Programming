import java.util.*;
import java.io.*;
public class C {

	public static void main(String[] args) throws IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(f.readLine().trim());
		int e=Integer.parseInt(f.readLine().trim())-1;
		int t=Integer.parseInt(f.readLine().trim());
		int m=Integer.parseInt(f.readLine().trim());
		int[][]adj=new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i!=j)
					adj[i][j]=-1;
			}
		}
		for(int i=0;i<m;i++){
			StringTokenizer tk=new StringTokenizer(f.readLine().trim());
			int a=Integer.parseInt(tk.nextToken())-1;
			int b=Integer.parseInt(tk.nextToken())-1;
			int c=Integer.parseInt(tk.nextToken());
			adj[a][b]=c;
		}
		for(int k=0;k<n;k++){
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					if(adj[i][k]!=-1&&adj[k][j]!=-1){
						if(adj[i][j]==-1){
							adj[i][j]=adj[i][k]+adj[k][j];
						}
						else{
							adj[i][j]=Math.min(adj[i][j], adj[i][k]+adj[k][j]);
						}
					}
					
				}
			}
		}
		int sum=0;
		for(int i=0;i<n;i++){
			if(adj[i][e]<=t){
				sum++;
			}
		}
		System.out.println(sum);
		/*
		ArrayDeque<Integer> a=new ArrayDeque<Integer>();
		a.add(e);
		HashMap<Integer,Integer>tl=new HashMap<Integer,Integer>();
		tl.put(e,t);
		HashSet<Integer>used=new HashSet<Integer>();
		used.add(e);
		while(!a.isEmpty()){
			int cur=a.pollFirst();
			for(int i=0;i<n;i++){
				//System.out.println(tl.get(cur));
				//System.out.println(adj[i][cur]);
				if(adj[i][cur]!=-1&&!used.contains(i)&&tl.get(cur)-adj[i][cur]>=0){
					//System.out.println(a);
					a.add(i);
					if(tl.containsKey(i)){
						tl.put(i,tl.get(cur)-adj[i][cur]);m
					}
					else{
						
					}
					tl.put(i,tl.get(cur)-adj[i][cur]);
				}
			}
			used.add(i);
		}
		System.out.println();
		*/
		
	}

}