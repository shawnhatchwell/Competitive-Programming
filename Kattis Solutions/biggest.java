import java.util.*;
import java.io.*;

public class biggest {
	
	public static void main(String[] args) throws IOException{
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		
		
		int n=Integer.parseInt(f.readLine().trim());
		for(int i=0;i<n;i++){
			StringTokenizer tk=new StringTokenizer(f.readLine().trim());
			int r=Integer.parseInt(tk.nextToken());
			int p=Integer.parseInt(tk.nextToken());
			int d=Integer.parseInt(tk.nextToken());
			int m=Integer.parseInt(tk.nextToken());
			int s=Integer.parseInt(tk.nextToken());
			double th=d+m/60+s/3600;
			double rt=th/360;
			double a=Math.PI*r*r;
			if(rt*p>=1){
				System.out.println(a*rt);
			}
			else{
				double lo=1-rt*p;
				System.out.println(a*Math.max(rt,lo));
			}
		}
	}
	
}