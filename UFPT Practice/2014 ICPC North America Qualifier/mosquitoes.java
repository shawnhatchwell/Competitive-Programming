import java.util.*;
import java.io.*;
public class mosquitoes {

	public static void main(String[] args) throws IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(f.readLine());
		for(int kk=0;kk<n;kk++){
			f.readLine();
			StringTokenizer tk=new StringTokenizer(f.readLine());
			int m=Integer.parseInt(tk.nextToken());
			//System.out.println(m);
			double d=Double.parseDouble(tk.nextToken());
			double x[]=new double[m];
			double y[]=new double[m];
			for(int i=0;i<m;i++){
				tk=new StringTokenizer(f.readLine());
				x[i]=Double.parseDouble(tk.nextToken());
				y[i]=Double.parseDouble(tk.nextToken());
			}
			int max=1;
			for(int i=0;i<m;i++){
				for(int j=i+1;j<m;j++){
					double dist2=distance(x[i],y[i],x[j],y[j]);
					if(dist2<=d*d){
						//System.out.println(i+" "+j);
						double alpha=Math.atan2(y[j]-y[i], x[j]-x[i]);
						double theta=Math.atan2(Math.sqrt(d*d-dist2)/2,Math.sqrt(dist2)/2);
						double xcenter=x[i]+(d/2)*Math.cos(theta+alpha);
						double ycenter=y[i]+(d/2)*Math.sin(theta+alpha);
						//System.out.println(alpha+" "+theta+" "+xcenter+" "+ycenter);
						int count=0;
						for(int k=0;k<m;k++){
							//System.out.println(Math.sqrt(distance(xcenter,ycenter,x[k],y[k]))+" "+d/2);
							if(distance(xcenter,ycenter,x[k],y[k])<=(d*d)/4)
								count++;
						}
						max=Math.max(max, count);
						//System.out.println(count);
						
						xcenter=x[i]+(d/2)*Math.cos(theta-alpha);
						ycenter=y[i]+(d/2)*Math.sin(theta-alpha);
						//System.out.println(xcenter+" "+ycenter);
						count=0;
						for(int k=0;k<m;k++){
							//System.out.println(Math.sqrt(distance(xcenter,ycenter,x[k],y[k]))+" "+d/2);
							if(distance(xcenter,ycenter,x[k],y[k])<=d*d/4)
								count++;
						}
						max=Math.max(max, count);
						//System.out.println(count);
					}
				}
			}
			System.out.println(max);
		}
	}
	private static double distance(double x1, double y1, double x2, double y2) {
		return (x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
	}

}
