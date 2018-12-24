import java.util.*;
import java.io.*;
public class exactchange2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(f.readLine().trim());
		for(int i=0;i<n;i++){
			int p=Integer.parseInt(f.readLine().trim());
			int n2=Integer.parseInt(f.readLine().trim());
			PriorityQueue<Integer>pq=new PriorityQueue<Integer>();
			for(int j=0;j<n2;j++){
				pq.add(Integer.parseInt(f.readLine().trim()));
			}
			int[] ma=new int[n2];
			for(int j=0;j<n2;j++){
				ma[j]=pq.poll();
			}
			TreeMap<Integer,Integer>tm=new TreeMap<Integer,Integer>();
			tm.put(0,0);
			for(int j=0;j<n2;j++){
				
			}
		}

	}

}
