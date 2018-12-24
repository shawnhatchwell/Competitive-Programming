import java.util.*;
import java.io.*;

/*
ID: shawn.h1
LANG: JAVA
PROB: milk2
*/
public class milk2 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		f = new BufferedReader(new FileReader("milk2.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("milk2.out")));
		
		int n=Integer.parseInt(f.readLine().trim());
		HashMap<Integer,Integer> a=new HashMap<Integer,Integer>();
		ArrayList<Integer> b= new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			StringTokenizer tk=new StringTokenizer(f.readLine());
			int s=Integer.parseInt(tk.nextToken());
			int e=Integer.parseInt(tk.nextToken());
			if(a.get(s)==null){
				a.put(s,e);
				b.add(s);
			}
			else if(a.get(s)<e){
				a.put(s,e);
			}
		}
		Collections.sort(b);
		int o=b.size();
		for(int i=0;i<o;i++){
			b.add(i*2+1,a.get(b.get(2*i)));
		}
		for(int i=1;i<b.size()-2;i+=2){
			if(b.get(i)>=b.get(i+1)){
					if(b.get(i)<b.get(i+2)){
						b.remove(i);
						b.remove(i);
						i-=2;
					}
					else{
						b.remove(i+1);
						b.remove(i+1);
						i-=2;
				}
			}
		}
		System.out.println(b);
		int[] in=new int[b.size()/2];
		int[] ni=new int[b.size()/2-1];
		for(int i=0;i<b.size();i+=2){
			in[i/2]=b.get(i+1)-b.get(i);
			if(i<b.size()-2)
				ni[i/2]=b.get(i+2)-b.get(i+1);
		}
		System.out.println();
		out.println(max(in)+" "+max(ni));
		out.close();
	}

	private static int max(int[] in) {
		// TODO Auto-generated method stub
		int m=0;
		for(int i=0;i<in.length;i++){
			if (in[i]>m)
				m=in[i];
		}
		return m;
	}
	
}