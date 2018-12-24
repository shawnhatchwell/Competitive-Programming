import java.util.*;
import java.io.*;

/*
ID: shawn.h1
LANG: JAVA
PROB: milk
*/
public class milk {
	
	public static void main(String[] args) throws IOException{
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		f = new BufferedReader(new FileReader("milk.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("milk.out")));
		
		StringTokenizer t=new StringTokenizer(f.readLine().trim());
		int m=Integer.parseInt(t.nextToken());
		int n=Integer.parseInt(t.nextToken());
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++){
			t=new StringTokenizer(f.readLine().trim());
			int a=Integer.parseInt(t.nextToken());
			int b=Integer.parseInt(t.nextToken());
			if(!pq.contains(a))
				pq.add(a);
			if(!hm.containsKey(a))
				hm.put(a, b);
			else
				hm.put(a, hm.get(a)+b);
		}
		int s=0;
		while(m>0){
			if(hm.get(pq.peek())<=m){
				System.out.println("Price/unit: "+pq.peek()+" Units: "+hm.get(pq.peek())+" Total price: "+hm.get(pq.peek())*pq.peek());
				m-=hm.get(pq.peek());
				s+=hm.get(pq.peek())*pq.poll();
				
			}
			else{
				System.out.println("Price/unit: "+pq.peek()+" Units: "+hm.get(pq.peek())+" Total price: "+hm.get(pq.peek())*pq.peek()+" Price taken: "+pq.peek()*m);
				s+=pq.peek()*m;
				m=0;
			}
			System.out.println("Spent: "+s+" Units left: "+m);
		}
		
		
		System.out.println(s);
		out.println(s);
		out.close();
	}
	
}