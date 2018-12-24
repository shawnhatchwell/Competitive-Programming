import java.util.*;
import java.io.*;

/*
ID: shawn.h1
LANG: JAVA
PROB: combo
*/
public class combo {
	
	public static void main(String[] args) throws IOException{
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		f = new BufferedReader(new FileReader("combo.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("combo.out")));
		
		int n=Integer.parseInt(f.readLine().trim());
		StringTokenizer tk=new StringTokenizer(f.readLine().trim());
		int a=Integer.parseInt(tk.nextToken());
		int b=Integer.parseInt(tk.nextToken());
		int c=Integer.parseInt(tk.nextToken());
		tk=new StringTokenizer(f.readLine().trim());
		int d=Integer.parseInt(tk.nextToken());
		int e=Integer.parseInt(tk.nextToken());
		int g=Integer.parseInt(tk.nextToken());
		int o1=0,o2=0,o3=0;
		
		
		if(Math.abs(a-d)<5||n-Math.abs(a-d)<5){
			o1=5-Math.min(Math.abs(a-d), n-Math.abs(a-d));
		}
		if(Math.abs(b-e)<5||n-Math.abs(b-e)<5){
			o2=5-Math.min(Math.abs(b-e), n-Math.abs(b-e));
		}
		if(Math.abs(c-g)<5||n-Math.abs(c-g)<5){
			o3=5-Math.min(Math.abs(c-g), n-Math.abs(c-g));
		}
		int sum=250-o1*o2*o3;
		
		
		if(sum>n*n*n)
			sum=n*n*n;
		
		System.out.println(sum);
		out.println(sum);
		out.close();
	}
}