import java.util.*;
import java.io.*;

public class triangleornaments {
	
	public static void main(String[] args) throws IOException{
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		
		
		int n=Integer.parseInt(f.readLine().trim());
		double s=0;
		for(int i=0;i<n;i++){
			StringTokenizer tk=new StringTokenizer(f.readLine().trim());
			int a=Integer.parseInt(tk.nextToken());
			int b=Integer.parseInt(tk.nextToken());
			int c=Integer.parseInt(tk.nextToken());
			double d=Math.sqrt(.5*b*b+.5*a*a-.25*c*c);
			int q=Math.min(a, b);
			double num=.25*c*c+d*d-q*q;
			double den=c*d;
			double th=Math.acos(num/den);
			double x=c*Math.sin(th);
			s+=x;
		}
		
		System.out.println(s);
	}
	
}