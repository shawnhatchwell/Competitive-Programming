import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk=new StringTokenizer(f.readLine());
		int n=Integer.parseInt(tk.nextToken());
		int t=Integer.parseInt(tk.nextToken());
		int x[]=new int[n];
		int y[]=new int[n];
		int ti[]=new int[n];
		double act=0;
		double gps=0;
		for(int i=0;i<n;i++){
			tk=new StringTokenizer(f.readLine());
			x[i]=Integer.parseInt(tk.nextToken());
			y[i]=Integer.parseInt(tk.nextToken());
			ti[i]=Integer.parseInt(tk.nextToken());
			//System.out.println(ti[i]);
		}
		for(int i=1;i<n;i++){
			act+=Math.sqrt((x[i]-x[i-1])*(x[i]-x[i-1])+(y[i]-y[i-1])*(y[i]-y[i-1]));
		}
		
		int ind=0;
		//tack on extra at the end
		double x2[]=new double[ti[n-1]/t+1];
		double y2[]=new double[ti[n-1]/t+1];
		x2[0]=0;
		y2[0]=0;
		for(int i=1;i<x2.length;i++){
			int crt=t*i;
			
			for(int j=1;j<n;j++){
				//System.out.println(i+" this is i");
				//System.out.println(j+" "+(crt>ti[j]));
				//System.out.println(ti[j]);
				if(crt<ti[j]){
					ind=j-1;
					break;
				}
			}
			//System.out.println(ind);
			x2[i]=x[ind]+(x[ind+1]-x[ind])*((crt-ti[ind])/(double)(ti[ind+1]-ti[ind]));
			y2[i]=y[ind]+(y[ind+1]-y[ind])*((crt-ti[ind])/(double)(ti[ind+1]-ti[ind]));
			//System.out.println(x2[i]+" "+y2[i]);
		}
		//make sure to tack on extra
		for(int i=1;i<n;i++){
			gps+=Math.sqrt((x2[i]-x2[i-1])*(x2[i]-x2[i-1])+(y2[i]-y2[i-1])*(y2[i]-y2[i-1]));
		}
		gps+=Math.sqrt((x2[n-1]-x[n-1])*(x2[n-1]-x[n-1])+(y2[n-1]-y[n-1])*(y2[n-1]-y[n-1]));
		System.out.println((1-(gps/act))*100);
		
	}

}
