import java.util.*;
import java.io.*;

public class measurement2 {
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
		f = new BufferedReader(new FileReader("measurement.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("measurement.out")));
		
		StringTokenizer st=new StringTokenizer(f.readLine());
		int n=Integer.parseInt(st.nextToken());
		int g=Integer.parseInt(st.nextToken());
		PriorityQueue<day> pq=new PriorityQueue<day>();
		TreeMap<Integer,Integer> tm=new TreeMap<Integer,Integer>();
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
		
		while(!pq.isEmpty()){
			boolean change=false;
			while(true){
				day d=pq.poll();
				if(tm.get(d.num)==max){
					change=true;
				}
				tm.put(d.num,tm.get(d.num)+d.milk);
				if(tm.get(d.num)>=max){
					change=true;
					max=tm.get(d.num);
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
	
}