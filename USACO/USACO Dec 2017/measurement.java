import java.util.*;
import java.io.*;

public class measurement {
	static class day implements Comparable{
		int day;
		int num;
		int milk;
		day(int d,int n,int m){
			day=d;num=n;milk=m;
		}
		public int compareTo(Object arg0) {
			if(day<((day)arg0).day) return -1;
			if(day>((day)arg0).day) return 1;
			return 0;
		}
	}
	public static void main(String[] args) throws IOException{
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		//f = new BufferedReader(new FileReader("measurement.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("measurement.out")));
		
		StringTokenizer st=new StringTokenizer(f.readLine());
		int n=Integer.parseInt(st.nextToken());
		int g=Integer.parseInt(st.nextToken());
		PriorityQueue<day> pq=new PriorityQueue<day>();
		HashMap<Integer,Integer> tm=new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++){
			st=new StringTokenizer(f.readLine());
			int d=Integer.parseInt(st.nextToken());
			int num=Integer.parseInt(st.nextToken());
			String m=st.nextToken();
			if(m.charAt(0)=='+') m=m.substring(1);
			int milk=Integer.parseInt(m);
			pq.add(new day(d,num,milk));
			tm.put(num,g);
		}
		
		int count=0;
		int max=g;
		
		TreeMap<Integer,Integer> vals=new TreeMap<Integer,Integer>();
		vals.put(g,tm.size());
		
		while(!pq.isEmpty()){
			boolean change=false;
			while(true){
				day d=pq.poll();
				if(tm.get(d.num)==max){
					change=true;
				}
				swap(vals,tm.get(d.num),tm.get(d.num)+d.milk);
				tm.put(d.num,tm.get(d.num)+d.milk);
				if(tm.get(d.num)>=max){
					change=true;
					max=tm.get(d.num);
				}
				//change hashmap, add treemap
				else if(!tm.containsValue(max)){
					change=true;
					max=vals.ceilingKey(0);
				}
				
				if(pq.isEmpty()||d.day!=pq.peek().day){
					break;
				}
			}
			if(change){
				count++;
			}
			
		}
		
		
		//System.out.println(count);
		out.println(count);
		out.close();
	}
	private static void swap(TreeMap<Integer, Integer> vals, int a, int b) {
		vals.replace(a, vals.get(a)-1);
		if(vals.get(a)==0) vals.remove(a);
		if(vals.containsKey(b)) vals.replace(b, vals.get(b)+1);
		else vals.put(b, 1);
		
	}
	
}