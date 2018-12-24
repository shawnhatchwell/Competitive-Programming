import java.util.*;
import java.io.*;
public class cfr468d {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(f.readLine());
		StringTokenizer tk=new StringTokenizer(f.readLine());
		int[] a=new int[n];
		a[0]=-1;
		for(int i=1;i<n;i++){
			a[i]=Integer.parseInt(tk.nextToken())-1;
		}
		int level[]=new int[n];
		level[0]=0;
		int maxl=0;
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		hm.put(0,1);
		for(int i=1;i<n;i++){
			level[i]=level[a[i]]+1;
			if(!hm.containsKey(level[i])){
				hm.put(level[i],1);
			}
			else{
				hm.put(level[i],hm.get(level[i])+1);
			}
			
		}
		int count=0;
		for(int x:hm.keySet()){
			count+=hm.get(x)%2;
		}
		System.out.println(count);
		

	}

}
