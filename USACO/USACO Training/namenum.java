import java.util.*;
import java.io.*;

/*
ID: shawn.h1
LANG: JAVA
PROB: namenum
*/
public class namenum {
	public static HashMap<Integer, String> hm=new HashMap<Integer,String>();
	public static PriorityQueue<String> pq=new PriorityQueue<String>();
	public static PriorityQueue<String> tx=new PriorityQueue<String>();
	public static BufferedReader d;
	public static void fill(String s,int i,String s2) throws IOException{
		if(i==s.length()){
			for(String a:tx)
				if(s2.equals(a)){
					pq.add(s2);
					break;
				}
		}
		
		else if(i>11){
			boolean b=false;
			for(String a:tx){
				if(a.contains(s2)){
					b=true;
					break;
				}
			}
			if(b){
				String x=hm.get(Integer.parseInt(s.substring(i,i+1)));
				fill(s,i+1,s2+x.charAt(0));
				fill(s,i+1,s2+x.charAt(1));
				fill(s,i+1,s2+x.charAt(2));
			}
		}
		
		else{
			String x=hm.get(Integer.parseInt(s.substring(i,i+1)));
			fill(s,i+1,s2+x.charAt(0));
			fill(s,i+1,s2+x.charAt(1));
			fill(s,i+1,s2+x.charAt(2));
		}
	}
	public static void main(String[] args) throws IOException{
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		f = new BufferedReader(new FileReader("namenum.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("namenum.out")));
		
		String n=f.readLine().trim();
		hm.put(2,"ABC");
		hm.put(3,"DEF");
		hm.put(4,"GHI");
		hm.put(5,"JKL");
		hm.put(6,"MNO");
		hm.put(7,"PRS");
		hm.put(8,"TUV");
		hm.put(9,"WXY");
		
		String li;
		d=new BufferedReader(new FileReader("dict.txt"));
		while((li=d.readLine()).charAt(0)!=hm.get(Integer.parseInt(n.substring(0,1))).charAt(0))
		tx.add(li);
		while((li=d.readLine()).charAt(0)==hm.get(Integer.parseInt(n.substring(0,1))).charAt(0))
			tx.add(li);
		if(n.equals(""))
		fill(n,0,"");
		
		if(pq.isEmpty()){
			out.println("NONE");
		}
		else
			for(String a:pq){
				System.out.println(a);
				out.println(a);
			}
		out.close();
	}
	
}