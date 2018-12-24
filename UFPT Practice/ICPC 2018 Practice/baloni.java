import java.util.*;
import java.io.*;
public class baloni {

	public static void main(String[] args) throws IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(f.readLine());
		StringTokenizer tk=new StringTokenizer(f.readLine());
		
		/*HashSet<Long> hs=new HashSet<Long>();
		for(int i=0;i<n;i++){
			hs.add((long)i+Long.parseLong(tk.nextToken()));
		}
		System.out.println(hs.size());
		*/
		
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		
		for(int i=0;i<n;i++){
			int a=Integer.parseInt(tk.nextToken());
			remove(hm,a);
			add(hm,a-1);
		}
		int count=0;
		for(int a:hm.keySet()){
			count+=hm.get(a);
		}
		System.out.println(count);
	}
	private static void remove(HashMap<Integer, Integer> hm, int a) {
		if(hm.containsKey(a)){
			int n=hm.get(a)-1;
			if(n==0)
				hm.remove(a);
			else
				hm.put(a, n);
		}
		
	}
	private static void add(HashMap<Integer, Integer> hm, int i) {
		if(hm.containsKey(i)){
			hm.put(i,hm.get(i)+1);
		}
		else{
			hm.put(i,1);
		}
		
	}

	
	
}
