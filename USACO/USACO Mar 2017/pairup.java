import java.util.*;
import java.io.*;

public class pairup {
	
	public static void main(String[] args) throws IOException{
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		f = new BufferedReader(new FileReader("pairup.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("pairup.out")));
		
		int n=Integer.parseInt(f.readLine().trim());
		TreeMap<Integer, Integer> pq=new TreeMap<Integer, Integer>();
		int m=0;
		for(int i=0;i<n;i++){
			StringTokenizer st=new StringTokenizer(f.readLine());
			int x=Integer.parseInt(st.nextToken());
			int y=Integer.parseInt(st.nextToken());
			m+=x;
			if(!pq.containsKey(y)) pq.put(y,x);
			else pq.put(y, x+pq.get(y));
		}
		int max=0;
		while(!pq.isEmpty()){
			max=Math.max(pq.firstKey()+pq.lastKey(), max);
			if(pq.get(pq.firstKey())>pq.get(pq.lastKey())){
				pq.put(pq.firstKey(),pq.get(pq.firstKey())-pq.get(pq.lastKey()));
				pq.remove(pq.lastKey());
			}
			else if(pq.get(pq.firstKey())<pq.get(pq.lastKey())){
				pq.put(pq.lastKey(),pq.get(pq.lastKey())-pq.get(pq.firstKey()));
				pq.remove(pq.firstKey());
			}
			else{
				if(pq.lastKey()==pq.firstKey()){
					pq.remove(pq.firstKey());
				}
				else{
					pq.remove(pq.firstKey());
					pq.remove(pq.lastKey());
				}
			}
		}
		
		//System.out.println(max);
		out.println(max);
		out.close();
	}
	
}
