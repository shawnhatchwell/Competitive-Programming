import java.util.*;
import java.io.*;
public class e {

	public static void main(String[] args) throws IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk=new StringTokenizer(f.readLine());
		int n=Integer.parseInt(tk.nextToken());
		int k=Integer.parseInt(tk.nextToken());
		PriorityQueue<String> pq=new PriorityQueue<String>();
		for(int i=0;i<n;i++){
			pq.add(f.readLine());
			
		}
		HashMap<String,Integer> ord=new HashMap<String,Integer>();
		int ind=0;
		while(!pq.isEmpty()){
			ord.put(pq.poll(),ind);
			ind++;
		}
		ArrayList<String> subtract=new ArrayList<String>();
		String s=f.readLine();
		long pos=0;
		long thingsDone=0;
		while(!s.equals("")){
			for(int i=0;i<s.length();i++){
				if(ord.containsKey(s.substring(0, i+1))){
					String pre=s.substring(0, i+1);
					s=s.substring(i+1);
					subtract.add(pre);
					Collections.sort(subtract);
					pos*=(n-thingsDone);
					thingsDone++;
					pos%=1000000007;
					pos+=ord.get(pre)-subtract.indexOf(pre);
					
					
					pos%=1000000007;
					i=-1;
					
					//System.out.println(pos);
					
				}
			}
		}
		
		System.out.println(pos+1);
		
	}

}
