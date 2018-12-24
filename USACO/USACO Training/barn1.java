import java.util.*;
import java.io.*;

/*
ID: shawn.h1
LANG: JAVA
PROB: barn1
*/
public class barn1 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		f = new BufferedReader(new FileReader("barn1.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("barn1.out")));
		
		StringTokenizer t=new StringTokenizer(f.readLine().trim());
		int m=Integer.parseInt(t.nextToken());
		int s=Integer.parseInt(t.nextToken());
		int c=Integer.parseInt(t.nextToken());
		
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		int[] cc=new int[c];
		for(int i=0;i<c;i++){
			int n=Integer.parseInt(f.readLine().trim());
			pq.add(n);
		}
		for(int i=0;i<c;i++){
			cc[i]=pq.poll();
		}
		
		pq=new PriorityQueue<Integer>();
		int max=cc[c-1]-cc[0]+1;
		System.out.println(max);
		for(int i=0;i<c-1;i++){
			pq.add(cc[i+1]-cc[i]);
		}
		ArrayList<Integer> a=new ArrayList<Integer>();
		for(int i:pq){
			a.add(i);
		}
		Collections.sort(a);
		if(m>=c){
			max=c;
		}
		else{
			for(int i=0;i<m-1;i++){
				max-=(a.get(a.size()-1)-1);
				a.remove(a.size()-1);
			}
		}
		/*
		for(int i=0;i<m-1;i++){
			max-=pq.poll();
		}
		*/
		
		System.out.println(max);
		out.println(max);
		out.close();
	}
	
}