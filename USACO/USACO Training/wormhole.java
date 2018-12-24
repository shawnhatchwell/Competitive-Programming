import java.util.*;
import java.io.*;

/*
ID: shawn.h1
LANG: JAVA
PROB: wormhole
*/
public class wormhole implements Comparable{
	public int xx;
	public int yy;
	public static HashMap<Integer,Integer> nx;
	public static int count;
	public static int n;
	public wormhole(int x, int y){
		xx=x;
		yy=y;
	}
	public static int tot(int a){
		int prod=1;
		for(int i=a;i>0;i-=2){
			prod*=(i-1);
		}
		return prod;
	}
	public int getX(){return xx;}
	public int getY(){return yy;}
	public static void main(String[] args) throws IOException{
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		f = new BufferedReader(new FileReader("wormhole.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("wormhole.out")));
		
		n=Integer.parseInt(f.readLine().trim());
		TreeSet<wormhole> pq= new TreeSet<wormhole>();
		for(int i=0;i<n;i++){
			StringTokenizer tk=new StringTokenizer(f.readLine().trim());
			int a=Integer.parseInt(tk.nextToken());
			int b=Integer.parseInt(tk.nextToken());
			////System.out.println(a+" "+b);
			pq.add(new wormhole(a,b));
		}
		wormhole cr[]=new wormhole[n];
		for(int i=0;i<n;i++){
			////System.out.println(pq.peek().getX()+" "+pq.peek().getY());
			cr[i]=pq.pollFirst();
		}
		
		nx=new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++){
			if(i==n-1||cr[i].getY()!=cr[i+1].getY()){
				nx.put(i,-1);
				
			}
			else
				nx.put(i,i+1);
		}
		TreeSet<String> pq2= new TreeSet<String>();
		for(int i=0;i<n;i++){
			pq2.add(Integer.toString(i,36));
		}
		loop("",pq2);
		
		//System.out.println(count);
		out.println(count);
		out.close();
	}
	public int compareTo(Object arg0) {
		if(yy<((wormhole)arg0).getY())
			return -1;
		if(yy>((wormhole)arg0).getY())
			return 1;
		if(xx<((wormhole)arg0).getX())
			return -1;
		if(xx>((wormhole)arg0).getX())
			return 1;
		return 0;
	}
	public static void loop(String s, TreeSet<String> pq){
		if(pq.isEmpty()){
		   //can also use boolean
			//System.out.println(s);
			for(int i=0;i<n;i++){
				
				int q=i;
				String t="";
				
				while(!(q==-1||(t.contains(Integer.toString(q,36))&&t.indexOf(Integer.toString(q,36))!=t.lastIndexOf(Integer.toString(q,36))))){
					t+=Integer.toString(q,36);
					//System.out.println(q+"/"+t+"LEADS TO");
					int r=s.indexOf(Integer.toString(q,36));
					if(r%2==0)
						q=Integer.parseInt(s.substring(r+1,r+2),36);
					else
						q=Integer.parseInt(s.substring(r-1,r),36);
					t+=Integer.toString(q,36);
					//System.out.println(q+"/"+t+"IS BEHIND...");
					q=nx.get(q);
				}
				
				if(q!=-1){
					count++;
					i=n;
					//System.out.println(count+"YES LOOP");
				}
				else{
					//System.out.println(q+"NO LOOP");
				}
			}
		}
		else{
			TreeSet<String> pq3=new TreeSet<String>();
			s+=pq.pollFirst();
		    for(int i=0;i<pq.size();i++){
		    	//System.out.println(pq.size());
		    	for(int j=0;j<i;j++){
		    		pq3.add(pq.pollFirst());
		    	}
		    	//System.out.println(pq.size());
		    	String u=pq.pollFirst();
		    	//System.out.println(pq.size());
		    	for(int j=0;j<i;j++){
		    		pq.add(pq3.pollFirst());
		    	}
		    	//System.out.println(pq.size()+"RECURSE");
		    	loop(s+u,pq);
		    	pq.add(u);
		    	//System.out.println(pq.size()+"NEXT INT");
		    }
		    pq.add(s.substring(s.length()-1));
		    s=s.substring(0,s.length()-1);
		}
	}
}
