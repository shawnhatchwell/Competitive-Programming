import java.util.*;
import java.io.*;
public class q {

	public static void main(String[] args) throws IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(f.readLine());
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		PriorityQueue<Integer> pqr=new PriorityQueue<Integer>(Collections.reverseOrder());
		for(int kk=0;kk<n;kk++){
			int q=Integer.parseInt(f.readLine());
			pq.add(q);
			pqr.add(q);
		}
		int min=Integer.MAX_VALUE;
		for(int kk=0;kk<n;kk++){
			min=Math.min(pqr.poll()+pq.poll(), min);
		}
		System.out.println(min);
	}

}