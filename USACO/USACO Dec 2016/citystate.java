import java.util.*;
import java.io.*;

public class citystate {
	
	public static void main(String[] args) throws IOException{
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		//f = new BufferedReader(new FileReader("citystate.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("citystate.out")));
		
		int n=Integer.parseInt(f.readLine().trim());
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		ArrayDeque<String> ad=new ArrayDeque<String>();
		for(int i=0;i<n;i++){
			StringTokenizer st=new StringTokenizer(f.readLine().trim());
			String c=st.nextToken();
			String s=st.nextToken();
			String k=c.substring(0,2)+s;
			if(hm.containsKey(k)){
				hm.put(k, hm.get(k)+1);
			}
			else{
				hm.put(k, 1);
				ad.add(k);
			}
		}
		
		int sum=0;
		int q=ad.size();
		for(int i=0;i<q;i++){
			String a=ad.poll();
			if(a.equals(a.substring(2)+a.substring(0,2))){
				sum+=hm.get(a)-1;
			}
			else if(hm.containsKey(a.substring(2)+a.substring(0,2))){
				sum+=hm.get(a)*hm.get(a.substring(2)+a.substring(0,2));
			}
		}
		
		//System.out.println(sum/2);
		out.println(sum/2);
		out.close();
	}
	
}
