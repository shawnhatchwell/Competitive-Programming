import java.util.*;
import java.io.*;
public class r implements Comparable<Object>{
	String f;
	String l;
	public r(String first,String last){
		f=first;
		l=last;
	}
	public String toString(){
		return f+" "+l;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(f.readLine());
		PriorityQueue<r> pq=new PriorityQueue<r>(Collections.reverseOrder());
		for(int i=0;i<n;i++){
			StringTokenizer tk=new StringTokenizer(f.readLine());
			pq.add(new r(tk.nextToken(),tk.nextToken()));
		}
		for(int i=0;i<n;i++){
			System.out.println(pq.poll());
		}
		
	}

	public int compareTo(Object arg0) {
		if(this.l.compareTo(((r)arg0).l)>0){
			return -1;
		}
		else if(this.l.compareTo(((r)arg0).l)<0){
			return 1;
		}
		else if(this.f.compareTo(((r)arg0).f)>0){
			return -1;
		}
		else if(this.f.compareTo(((r)arg0).f)<0){
			return 1;
		}
		return 0;
	}

}