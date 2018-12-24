import java.util.*;
import java.io.*;

/*
ID: shawn.h1
LANG: JAVA
PROB: ariprog
*/
public class ariprog implements Comparable{
	public int xx;
	public int yy;
	public ariprog(int x, int y){
		xx=x;
		yy=y;
	}
	public int compareTo(Object arg0) {
		if(yy<((ariprog)arg0).getY())
			return -1;
		if(yy>((ariprog)arg0).getY())
			return 1;
		if(xx<((ariprog)arg0).getX())
			return -1;
		if(xx>((ariprog)arg0).getX())
			return 1;
		return 0;
	}
	public int getX(){return xx;}
	public int getY(){return yy;}
	public String toString(){return xx+" "+yy;}
	public static void main(String[] args) throws IOException{
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		f = new BufferedReader(new FileReader("ariprog.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ariprog.out")));
		
		int n=Integer.parseInt(f.readLine().trim());
		int m=Integer.parseInt(f.readLine().trim());
		long x=System.currentTimeMillis();
		TreeSet<Integer> ts=new TreeSet<Integer>();
		for(int p=0;p<=m;p++){
			for(int q=0;q<=p;q++){
				ts.add(((p*p)+(q*q)));
			}
		}
		System.out.println(System.currentTimeMillis()-x);
		int[] ar=new int[ts.size()];
		int s=ts.size();
		System.out.println(s+"size");
		for(int i=0;i<s;i++){
			ar[i]=ts.pollFirst();
		}
		System.out.println(System.currentTimeMillis()-x);
		for(int i=0;i<ar.length;i++){
			ts.add(ar[i]);
		}
		System.out.println(System.currentTimeMillis()-x);
		int d=2*m*m-ts.first();
		//System.out.println(d);
		TreeSet<ariprog> ap=new TreeSet<ariprog>();
		boolean ans=true;
		for(int i=0;i<ar.length-n+1;i++){
			for(int j=1;j<ar.length-i-n+2&&ar[i+j]-ar[i]<d/(n-1)+1;j++){
				int c=ar[i+j]-ar[i];
				boolean b=true;
				for(int k=2;k<n;k++){
					if(!ts.contains(ar[i]+c*k)){
						b=false;
						k=n;
					}
				}
				if(b){
					ans=false;
					ap.add(new ariprog(ar[i],c));
					
				}
			}
		}
		if(ans){
			out.println("NONE");
		}
		int e=ap.size();
		for(int i=0;i<e;i++){
			out.println(ap.pollFirst());
		}
		System.out.println(System.currentTimeMillis()-x);
		out.close();
	}
	
}