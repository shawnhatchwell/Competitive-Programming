import java.util.*;
import java.io.*;

/*
ID: shawn.h1
LANG: JAVA
PROB: crypt1
*/
public class crypt1 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		f = new BufferedReader(new FileReader("crypt1.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("crypt1.out")));
		
		int n=Integer.parseInt(f.readLine().trim());
		int ni[]=new int[n];
		String ns[]=new String[n];
		String st=f.readLine().trim();
		StringTokenizer tk=new StringTokenizer(st);
		for(int i=0;i<n;i++){
			String s=tk.nextToken();
			ni[i]=Integer.parseInt(s);
		}
		int count=0;
		for(int a=0;a<n;a++){
			for(int b=0;b<n;b++){
				for(int c=0;c<n;c++){
					for(int d=0;d<n;d++){
						for(int e=0;e<n;e++){
							int abc=ni[a]*100+ni[b]*10+ni[c];
							int de=ni[d]*10+ni[e];
							String p1=""+(abc*ni[d]);
							String p2=""+(abc*ni[e]);
							String sm=""+(abc*de);	
							boolean bo=true;
							if(abc*ni[d]>999)
								bo=false;
							if(abc*ni[e]>999)
								bo=false;
							for(int i=0;i<p1.length();i++){
								if(!st.contains(""+p1.charAt(i))){
									bo=false;
								}
							}
							for(int i=0;i<p2.length();i++){
								if(!st.contains(""+p2.charAt(i))){
									bo=false;
								}
							}
							for(int i=0;i<sm.length();i++){
								if(!st.contains(""+sm.charAt(i))){
									bo=false;
								}
							}
							if(bo){
								count++;
								//System.out.println(ni[a]+" "+ni[b]+" "+ni[c]+" "+ni[d]+" "+ni[e]);
							}
						}
					}
				}
			}
		}
		
		System.out.println(count);
		out.println(count);
		out.close();
	}
	
}
