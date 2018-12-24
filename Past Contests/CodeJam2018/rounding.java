import java.util.*;
import java.io.*;
public class rounding {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(f.readLine());
		for(int kk=1;kk<=t;kk++){
			StringTokenizer tk=new StringTokenizer(f.readLine());
			int n=Integer.parseInt(tk.nextToken());
			int l=Integer.parseInt(tk.nextToken());
			int a[]=new int[l];
			tk=new StringTokenizer(f.readLine());
			for(int i=0;i<l;i++){
				a[i]=Integer.parseInt(tk.nextToken());
			}
			int left[]=new int[l];
			HashMap<Integer,Integer> past=new HashMap<Integer,Integer>();
			if(100%n==0) System.out.println(100);
			else{
				for(int i=0;i<l;i++){
					if(past.containsKey(a[i])){
						left[i]=past.get(a[i]);
					}
					else{
						int count=0;
						int half=(n+1)/2;
						int mod=100%n;
						int percent=mod*a[i];
						while(percent<half){
							//System.out.println(i+" "+percent+" "+count);
							percent=(percent+mod)%n;
							count++;
							//if(count>n) break;
						}
						left[i]=count;
						past.put(a[i],count);
					}
				}
				int rest=0;
				int half=(n+1)/2;
				int mod=100%n;
				int percent=0;
				while(percent<half){
					percent=(percent+mod)%n;
					rest++;
				}
				int extra=n-l;
				for(int i=0;i<l;i++){
					if(left[i]<=rest&&extra>=left[i]){
						extra-=left[i];
						a[i]+=left[i];
					}
				}
				int remainder=extra%rest;
				int per=extra/rest;
				int finalpercent=0;
				for(int i=0;i<l;i++){
					finalpercent+=(int)Math.round((100.0*a[i])/n);
					System.out.println(i+" "+ finalpercent);
				}
				finalpercent+=rest*(int)Math.round((100.0*per)/n);
				System.out.println(finalpercent);
				finalpercent+=rest*(int)Math.round((100.0*remainder)/n);
				System.out.println(finalpercent);
			}
		}
	}

}
