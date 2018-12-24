import java.util.*;
import java.io.*;
public class d {
	public static int gcd(int a,int b){
		if(b==0) return a;
		if(a==0) return b;
		if(a==b) return a;
		return gcd(b,a%b);
	}
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int a[]=new int[n];
		int start=Integer.MAX_VALUE;
		int si=-1;
		int end=0;
		int ei=-1;
		for(int i=0;i<n;i++){
			a[i]=kb.nextInt();
			if(a[i]<start){
				si=i;
				start=a[i];
			}
			if(a[i]>end){
				ei=i;
				end=a[i];
			}
		}
		int adj[][]=new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<i;j++){
				adj[i][j]=gcd(a[i],a[j]);
				adj[j][i]=adj[i][j];
			}
		}
		int flow[]=new int[n];
		Arrays.fill(flow, -1);
		flow[si]=Integer.MAX_VALUE;
		boolean[] done=new boolean[n];
		ArrayDeque<Integer> list=new ArrayDeque<Integer>();
		list.add(si);
		while(!list.isEmpty()){
			for(int i=0;i<n;i++){
				if(!done[i]&&adj[si][i]>1){
					d[i]=Math.min(d[i], d[si]+adj[si][i]);
				}
			}
			d[si]=done;
			for(int i=0;i<n;i++){
				if(!done[i]&&adj[si][i]>1){
					d[i]=Math.min(d[i], d[si]+adj[si][i]);
				}
			}
		}
		System.out.println(d[ei]);
	}

}
