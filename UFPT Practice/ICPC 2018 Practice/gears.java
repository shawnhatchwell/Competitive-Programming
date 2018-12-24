import java.util.*;
import java.io.*;
public class gears {

	public static void main(String[] args) throws IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		int cases=Integer.parseInt(f.readLine());
		for(int kk=0;kk<cases;kk++){
			int n=Integer.parseInt(f.readLine());
			int p[]=new int[n];
			int q[]=new int[n];
			int max=0;
			for(int i=0;i<n;i++){
				StringTokenizer tk=new StringTokenizer(f.readLine());
				p[i]=Integer.parseInt(tk.nextToken());
				q[i]=Integer.parseInt(tk.nextToken());
				if(p[i]>p[max]){
					max=i;
				}
			}
			long ans=q[max];
			double lim=Math.pow(10,18);
			boolean b=false;
			while(ans<=lim&&ans>=0){
				b=true;
				for(int i=0;i<n;i++){
					if(ans%p[i]!=q[i]){
						b=false;
						i=n;
					}
				}
				if(b){
					break;
				}
				else{
					ans+=p[max];
				}
				System.out.println(ans);
			}
			System.out.println(b?ans:"Impossible");
		}
		
	}
}
