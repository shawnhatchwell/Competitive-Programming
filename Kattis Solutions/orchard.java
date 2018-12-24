import java.util.*;
import java.io.*;

public class orchard {
	public static double roll(int r,int g,int b,int y,int s,int d){
		if(r+g+b+y==0){
			return 1;
		}
		else if(s==0){
			return 0;
		}
		else if(d==-1){
			System.out.println(r+" "+g+" "+b+" "+y+" "+s);
			double p=0;
			int c=0;
			if(r>0){
				p+=roll(r,g,b,y,s,0)/6;
				c++;
			}
			if(g>0){
				p+=roll(r,g,b,y,s,1)/6;
				c++;
			}
			if(b>0){
				p+=roll(r,g,b,y,s,2)/6;
				c++;
			}
			if(y>0){
				p+=roll(r,g,b,y,s,3)/6;
				c++;
			}
			p*=4/c;
			p+=roll(r,g,b,y,s,4)/6+roll(r,g,b,y,s,5)/6;
			return p;
		}
		else if(d==0){
			return roll(r-1,g,b,y,s,-1);
		}
		else if(d==1){
			return roll(r,g-1,b,y,s,-1);
		}
		else if(d==2){
			return roll(r,g,b-1,y,s,-1);
		}
		else if(d==3){
			return roll(r,g,b,y-1,s,-1);
		}
		else if(d==4){
			int m=Math.max(Math.max(r, g),Math.max(b, y));
			if(r==m){
				return roll(r-1,g,b,y,s,-1);
			}
			else if(g==m){
				return roll(r,g-1,b,y,s,-1);
			}
			else if(b==m){
				return roll(r,g,b-1,y,s,-1);
			}
			else{
				return roll(r,g,b,y-1,s,-1);
			}
		}
		else{
			return roll(r,g,b,y,s-1,-1);
		}
	}
	public static void main(String[] args) throws IOException{
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		
		
		StringTokenizer tk=new StringTokenizer(f.readLine().trim());
		int r=Integer.parseInt(tk.nextToken());
		int g=Integer.parseInt(tk.nextToken());
		int b=Integer.parseInt(tk.nextToken());
		int y=Integer.parseInt(tk.nextToken());
		int s=Integer.parseInt(tk.nextToken());
		
		System.out.println(roll(r,g,b,y,s,-1));
		System.out.println("done");
	}
	
}