import java.util.*;
import java.io.*;

public class humancannonball2 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		
		
		int n=Integer.parseInt(f.readLine().trim());
		for(int i=0;i<n;i++){
			StringTokenizer tk=new StringTokenizer(f.readLine().trim());
			double v=Double.parseDouble(tk.nextToken());
			double th=Double.parseDouble(tk.nextToken());
			double x=Double.parseDouble(tk.nextToken());
			double h1=Double.parseDouble(tk.nextToken());
			double h2=Double.parseDouble(tk.nextToken());
			double t=x/(v*Math.cos(Math.toRadians(th)));
			double y=x*Math.tan(Math.toRadians(th))-.5*9.81*t*t;
			if(y-1>h1&&y+1<h2){
				System.out.println("Safe");
			}
			else{
				System.out.println("Not Safe");
			}
		}
	}
	
}