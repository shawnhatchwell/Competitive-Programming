import java.io.*;
import java.util.*;
public class g_seller {

	public static void main(String[] args) throws IOException{
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk=new StringTokenizer(f.readLine());
		int n=Integer.parseInt(tk.nextToken());
		int k=Integer.parseInt(tk.nextToken());
		int a1[]=new int[n];
		int a2[]=new int[n];
		tk=new StringTokenizer(f.readLine());
		for(int i=0;i<n;i++){
			a1[i]=Integer.parseInt(tk.nextToken());
			
		}
		tk=new StringTokenizer(f.readLine());
		for(int i=0;i<n;i++){
			a2[i]=Integer.parseInt(tk.nextToken());
			
		}
		int df[]=new int[n];
		int pos=0;
		for(int i=0;i<n;i++){
			df[i]=a2[i]-a1[i];
			if(df[i]<0){
				pos++;
			}
		}
		int sum2=0;
		for(int i=0;i<n;i++)
			sum2+=a2[i];
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
		for(int i=0;i<n;i++){
			pq.add(df[i]);
		}
		for(int i=0;i<k;i++){
			sum2-=pq.poll();
		}
		while(!pq.isEmpty()&&pq.peek()>0){
			sum2-=pq.poll();
		}
		System.out.println(sum2);
	}

}
