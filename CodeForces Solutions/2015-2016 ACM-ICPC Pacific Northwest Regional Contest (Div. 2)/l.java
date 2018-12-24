import java.util.*;
import java.io.*;
public class l {

	public static void main(String[] args) throws IOException {
		System.out.println(Math.log(1+(2316.82/4000)));
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk=new StringTokenizer(f.readLine());
		int n=Integer.parseInt(tk.nextToken());
		int w=Integer.parseInt(tk.nextToken());
		double prob=1;
		double safe=0;
		double sum=0;
		double last=0;
		double quit[]=new double[n];
		for(int i=0;i<n;i++){
			tk=new StringTokenizer(f.readLine());
			String s=tk.nextToken();
			double p=Double.parseDouble(tk.nextToken());
			int m=Integer.parseInt(tk.nextToken());
			
			quit[i]=prob*Math.log(1+(last/w));
			//add if you get this one wrong
			sum+=prob*(1-p)*Math.log(1+(safe/w));
			
			prob*=p;
			if(s.equals("safe")){
				safe=m;
			}
			last=m;
		}
		//add if you get all right
		sum+=prob*Math.log(1+(last/w));
		
		double max=0;
		for(int i=0;i<n;i++){
			max=Math.max(max, quit[i]);
			System.out.println(quit[i]);
		}
		System.out.println(max);
		max=Math.max(max, sum);
		
		double d=(Math.pow(Math.E, max)-1)*w;
		System.out.printf("$%.2f%n",d);
		System.out.println(d/Math.log(1+(2316.82/4000)));
		System.out.println(.4*.75*.05);
	}

}