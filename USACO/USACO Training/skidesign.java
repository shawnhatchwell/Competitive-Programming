import java.util.*;
import java.io.*;

/*
ID: shawn.h1
LANG: JAVA
PROB: skidesign
*/
public class skidesign {
	
	public static void main(String[] args) throws IOException{
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		f = new BufferedReader(new FileReader("skidesign.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("skidesign.out")));
		
		int n=Integer.parseInt(f.readLine().trim());
		int ht[]=new int[n];
		for(int i=0;i<n;i++)
			ht[i]=Integer.parseInt(f.readLine().trim());
		int mn=Integer.MAX_VALUE;
		for(int i=0;i<=83;i++){
			int ct=0;
			for(int j=0;j<ht.length;j++){
				if(ht[j]<i)
					ct+=(i-ht[j])*(i-ht[j]);
				else if(ht[j]>i+17)
					ct+=(ht[j]-(i+17))*(ht[j]-(i+17));
			}
			
			if(ct<mn)
				mn=ct;
		}
		System.out.println(mn);
		out.println(mn);
		out.close();
	}
	
}