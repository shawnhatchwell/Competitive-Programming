import java.io.*;
import java.util.*;
public class slalom {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int t=kb.nextInt();
		for(int kk=0;kk<t;kk++){
			int n=kb.nextInt();
			double s=kb.nextInt();
			double y1[]=new double[n+1];
			double y2[]=new double[n+1];
			double dpy[]=new double[n+1];
			double dpd[]=new double[n+1];
			for(int i=0;i<n;i++){
				y1[i+1]=kb.nextInt();
				y2[i+1]=kb.nextInt();
			}
			dpy[0]=s;
			for(int i=1;i<=n;i++){
				for(int j=0;j<i;j++){
					double sy=dpy[j];
					double ey;
					//parallel
					if(sy>=y1[i]&&sy<=y2[i]){
						ey=sy;
					}
					//go down
					else if(sy<y1[i]){
						ey=y1[i];
					}
					//go up
					else{
						ey=y2[i];
					}
					dpd[i]=Integer.MAX_VALUE;
					boolean all=true;
					double slope=(ey-sy)/(i-j);
					System.out.println(slope);
					double curry=sy;
					for(int k=j+1;k<i;k++){
						curry+=slope;
						if(curry>y2[k]||curry<y1[k]){
							all=false;
							k=i;
						}
					}
					System.out.println(ey+" "+i+" "+j+" "+all);
					if(all&&dpd[i]>dpd[j]+dist(sy,ey,i,j)){
						dpd[i]=dpd[j]+dist(sy,ey,i,j);
						curry=sy;
						for(int k=j+1;k<=i;k++){
							curry+=slope;
							dpy[i]=curry;
						}
						
					
					}
				}
			}
			for(int i=0;i<n;i++){
				System.out.println(dpy[i]+" "+dpd[i]);
			}
			System.out.println(dpd[n]);
		}

	}

	private static double dist(double sy, double ey,double i,double j) {
		return Math.sqrt((sy-ey)*(sy-ey)+(i-j)*(i-j));
	}

}
