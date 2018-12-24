import java.util.*;
import java.io.*;
public class avoidland {

	public static void main(String[] args) throws IOException{
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(f.readLine());
		PriorityQueue<Integer> x=new PriorityQueue<Integer>();
		PriorityQueue<Integer> y=new PriorityQueue<Integer>();
		for(int i=0;i<n;i++){
			StringTokenizer tk=new StringTokenizer(f.readLine());
			x.add(Integer.parseInt(tk.nextToken()));
			y.add(Integer.parseInt(tk.nextToken()));
		}
		int sum=0;
		for(int i=0;i<n;i++){
			sum+=Math.abs(i+1-x.poll())+Math.abs(i+1-y.poll());
		}
		System.out.println(sum);

	}

}
