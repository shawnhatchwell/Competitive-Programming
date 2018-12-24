import java.util.*;
import java.io.*;

public class kitten {
	
	public static void main(String[] args) throws IOException{
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		
		
		int n=Integer.parseInt(f.readLine().trim());
		String s=f.readLine().trim();
		HashMap<Integer, Integer> hm=new HashMap<Integer,Integer>();
		while(!s.equals("-1")){
			StringTokenizer tk=new StringTokenizer(s);
			int k=Integer.parseInt(tk.nextToken());
			while(tk.hasMoreTokens()){
				hm.put(Integer.parseInt(tk.nextToken()),k);
			}
			s=f.readLine().trim();
		}
		while(hm.containsKey(n)){
			System.out.print(n+" ");
			n=hm.get(n);
		}
		System.out.println(n);
	}
	
}