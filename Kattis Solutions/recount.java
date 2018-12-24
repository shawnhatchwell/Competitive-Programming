import java.util.*;
import java.io.*;

public class recount {
	
	public static void main(String[] args) throws IOException{
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		
		String n=f.readLine().trim();
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		ArrayDeque<String> ad=new ArrayDeque<String>();
		while(!n.equals("***")){
			if(hm.containsKey(n)){
				hm.put(n, hm.get(n)+1);
			}
			else{
				hm.put(n, 1);
				ad.add(n);
			}
			
			
			n=f.readLine().trim();
		}
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
		int s=ad.size();
		int max=0;
		String maxn="";
		for(int i=0;i<s;i++){
			String m=ad.pollFirst();
			if(hm.get(m)>max){
				max=hm.get(m);
				maxn=m;
			}
			pq.add(hm.get(m));
			ad.addLast(m);
		}
		int m=pq.poll();
		if(m==pq.peek()){
			System.out.println("Runoff!");
		}
		else{
			System.out.println(maxn);
		}
	}
	
}