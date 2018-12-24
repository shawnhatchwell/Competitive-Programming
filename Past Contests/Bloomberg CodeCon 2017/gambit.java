import java.util.*;
import java.io.*;
public class gambit {
	public static boolean visited[];
	public static boolean adjList[][];
	public static ArrayDeque<Integer> ts;
	public static int n;
	public static int nodes[];
	public static String names[];
	public static HashMap<String,Integer> hm;
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		String lib=kb.next();
		n=Integer.parseInt(kb.next());
		String names[]=new String[n];
		nodes=new int[n];
		
		hm=new HashMap<String,Integer>();
		String adj[][]=new String[n][];
		visited=new boolean[n];
		adjList=new boolean[n][n];
		ts=new ArrayDeque<Integer>();
		
		int start=0;
		ArrayList<String> al=new ArrayList<String>();
		ArrayList<String> al2=new ArrayList<String>();
		for(int i=0;i<n;i++){
			names[i]=kb.next();
			hm.put(names[i],i);
			nodes[i]=Integer.parseInt(kb.next());
			adj[i]=new String[nodes[i]];
			for(int j=0;j<nodes[i];j++){
				adj[i][j]=kb.next();
				adjList[i][j]=true;
			}
			if(names[i].equals(lib)){
				start=i;
			}
		}
		
		dfs2(start);
		
		
		
		
		/*for(int i=0;i<n;i++){
			if(!visited[i]){
				dfs2(i);
			}
		}
		for(int i=0;i<n;i++){
			System.out.println(names[ts.removeLast()]);
		}*/
		
		
		
	}
	private static int indexOf(String curr) {
		
		return 0;
	}
	public static void dfs2(int u){
		if(nodes[u]!=0)
		for(int j=0;j<nodes[u];j++){
				dfs2(hm.get(names[j]));
		}
		else{
			for(int i=0;i<nodes;i++)
			ts.addLast(u);
		}
		
	}

}
