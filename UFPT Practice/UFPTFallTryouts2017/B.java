import java.util.*;
import java.io.*;
public class B {

	public static void main(String[] args) throws IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(f.readLine().trim());
		for(int k=1;k<=n;k++){
			StringTokenizer tk=new StringTokenizer(f.readLine());
			int h=Integer.parseInt(tk.nextToken());
			int l=Integer.parseInt(tk.nextToken());
			TreeMap<Integer,Integer> tmh=new TreeMap<Integer,Integer>();
			TreeMap<Integer,Integer> tml=new TreeMap<Integer,Integer>();
			int max=0;
			int sum=0;
			int ind[]=new int[h];
			for(int i=0;i<h;i++){
				tk=new StringTokenizer(f.readLine().trim());
				for(int j=0;j<l;j++){
					int o=Integer.parseInt(tk.nextToken());
					if(o!=-1){
						tmh.put(o, i);
						tml.put(o, j);
						max=Math.max(max,o);
					}
				}
			}
			for(int i=1;i<=max;i++){
				int h2=tmh.get(i);
				int l2=tml.get(i);
				sum+=20*Math.abs(h2)+5*Math.min(Math.abs(l2-ind[h2]),l-Math.abs(l2-ind[h2]));
				ind[h2]=l2;
				
			}
			System.out.println(sum);
		}
	}
}