import java.util.*;
import java.io.*;

public class jumper {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int cases=Integer.parseInt(bf.readLine());
		for(int kk=0;kk<cases;kk++){
			StringTokenizer st=new StringTokenizer(bf.readLine());
			int n=Integer.parseInt(st.nextToken());
			int p=Integer.parseInt(st.nextToken());
			int s=Integer.parseInt(st.nextToken());
			int g=Integer.parseInt(st.nextToken());
			int[][] adj=new int[n][n];
			boolean v[]=new boolean[n];
			ArrayDeque<Integer> dq=new ArrayDeque<Integer>();
			for(int i=0;i<n;i++){
				st=new StringTokenizer(bf.readLine());
				for(int j=0;j<n;j++){
					adj[i][j]=Integer.parseInt(st.nextToken());
				}
			}
			dq.add(s);
			while(!dq.isEmpty()&&!dq.contains(g)){
				int cur=dq.poll();
				v[cur]=true;
				for(int i=0;i<n;i++){
					if(adj[cur][i]<=p&&v[i]==false){
						dq.add(i);
					}
				}
			}
			if(dq.contains(g)) System.out.println("EASY");
			else System.out.println("IMPOSSIBLE");
		}

	}

}
