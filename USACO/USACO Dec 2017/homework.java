import java.util.*;
import java.io.*;

public class homework {
	
	public static void main(String[] args) throws IOException{
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		f = new BufferedReader(new FileReader("homework.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("homework.out")));
		
		int n=Integer.parseInt(f.readLine().trim());
		int a[]=new int [n];
		StringTokenizer st=new StringTokenizer(f.readLine());
		for(int i=0;i<n;i++){
			a[i]=Integer.parseInt(st.nextToken());
		}
		
		int min[]=new int[n];
		int sum[]=new int[n];
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		pq.add(a[n-1]);
		sum[n-1]=a[n-1];
		for(int i=n-2;i>0;i--){
			sum[i]=sum[i+1]+a[i];
			pq.add(a[i]);
			min[i]=pq.peek();
		}
		
		double avg[]=new double[n-1];
		double max=0;
		for(int i=1;i<n-1;i++){
			avg[i]=(sum[i]-min[i])/(double)(n-i-1);
			max=Math.max(max, avg[i]);
		}
		for(int i=1;i<n-1;i++){
			//System.out.println(avg[i]);
			if(avg[i]==max) //System.out.println(i); 
				out.println(i);
		}
		out.close();
	}
	
}
