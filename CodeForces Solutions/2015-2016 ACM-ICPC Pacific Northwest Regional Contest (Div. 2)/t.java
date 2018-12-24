import java.util.*;
import java.io.*;
public class t {

	public static void main(String[] args) throws IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk=new StringTokenizer(f.readLine());
		PriorityQueue<Integer>pq=new PriorityQueue<Integer>();
		pq.add(Integer.parseInt(tk.nextToken()));
		pq.add(Integer.parseInt(tk.nextToken()));
		pq.add(Integer.parseInt(tk.nextToken()));
		int a=pq.poll();
		int b=pq.poll();
		int c=pq.poll();
		tk=new StringTokenizer(f.readLine());
		pq.add(Integer.parseInt(tk.nextToken()));
		pq.add(Integer.parseInt(tk.nextToken()));
		pq.add(Integer.parseInt(tk.nextToken()));
		int d=pq.poll();
		int e=pq.poll();
		int g=pq.poll();
		HashSet<Integer> hm=new HashSet<Integer>();
		hm.add(a);
		hm.add(b);
		hm.add(c);
		hm.add(d);
		hm.add(e);
		hm.add(g);
		System.out.println((hm.size()==3&&a*a+b*b==c*c&&d*d+e*e==g*g)?"YES":"NO");
	}
}