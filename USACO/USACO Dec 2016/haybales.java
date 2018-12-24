import java.util.*;
import java.io.*;

public class haybales {
	//n(number of haybales)<=10^5
	//q(number of cases)<=10^6
	//b-a<=10^9
	public static void main(String[] args) throws IOException{
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		//f = new BufferedReader(new FileReader("haybales.in"));
		//PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("haybales.out")));
		
		StringTokenizer st=new StringTokenizer(f.readLine().trim());
		int n=Integer.parseInt(st.nextToken());
		int q=Integer.parseInt(st.nextToken());
		
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		int[][] a=new int[q][3];
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		
		st=new StringTokenizer(f.readLine().trim());
		for(int i=0;i<n;i++){
			int x=Integer.parseInt(st.nextToken());
			hm.put(x,0);
			pq.add(x);
		}
		
		for(int i=0;i<q;i++){
			st=new StringTokenizer(f.readLine().trim());
			int x=Integer.parseInt(st.nextToken());
			int y=Integer.parseInt(st.nextToken());
			hm.put(x,0);
			pq.add(x);
		}
		
		System.out.println();
		//out.println();
		//out.close();
	}
	
}
