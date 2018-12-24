import java.util.*;
import java.io.*;

/*
ID: shawn.h1
LANG: JAVA
PROB: maxcross
*/
public class maxcross {
	public static int r(int[] a,int k,int in){
		for(int i=0;i<a.length;i++){
			if(a[i]>k){
				return in;
			}
		}
		int a2[]=new int[a.length-1];
		for(int i=0;i<a2.length;i++){
			a2[i]=a[i]+a[i+1];
		}
		return r(a2,k,in+1);
	}
	public static void main(String[] args) throws IOException{
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		f = new BufferedReader(new FileReader("maxcross.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("maxcross.out")));
		
		StringTokenizer tk =new StringTokenizer(f.readLine().trim());
		int n=Integer.parseInt(tk.nextToken());
		int k=Integer.parseInt(tk.nextToken());
		int b=Integer.parseInt(tk.nextToken());
		
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		for(int i=0;i<b;i++){
			pq.add(Integer.parseInt(f.readLine().trim()));
		}
		
		int p=0;
		int q=0;
		int a[]=new int[b+1];
		for(int i=0;i<b;i++){
			q=pq.poll();
			a[i]=q-p;
			p=q;
		}
		a[a.length-1]=n+1-q;
		
		
		
		//System.out.println(r(a,k,0));
		out.println(r(a,k,0));
		out.close();
	}
	
}
