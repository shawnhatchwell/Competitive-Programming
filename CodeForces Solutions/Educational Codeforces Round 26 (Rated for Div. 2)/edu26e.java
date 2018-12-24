import java.io.*;
import java.util.*;

public class edu26e {

	public static void main(String[] args) throws IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk=new StringTokenizer(f.readLine());
		long a=Integer.parseInt(tk.nextToken());
		long b=Integer.parseInt(tk.nextToken());
		long count=0;
		
		while(a>=1&&b>=1){
			TreeSet<Long> ts=new TreeSet<Long>();
			for(int i=1;i<=Math.sqrt(a);i++){
				if(a%i==0){
					ts.add((long) i);
					ts.add(a/i);
				}
			}
			long min=a%b;
			long maxf=a;
			for(long x:ts){
				if(b%x<min){
					min=b%x;
					System.out.println(min);
					maxf=x;
				}
				else if(b%x==min){
					maxf=Math.max(maxf, x);
				}
			}
			count+=min;
			b-=min;
			System.out.println(a+" "+b+" "+maxf);
			a/=maxf;
			b/=maxf;
		}
	}

}
