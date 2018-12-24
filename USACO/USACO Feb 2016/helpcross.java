import java.util.*;
import java.io.*;

/*
ID: shawn.h1
LANG: JAVA
PROB: helpcross
*/
public class helpcross implements Comparable {
	public long x;
	public long y;
	public helpcross(long x1,long y1){
		x=x1;
		y=y1;
	}
	public static void main(String[] args) throws IOException{
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		f = new BufferedReader(new FileReader("helpcross.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("helpcross.out")));
		
		StringTokenizer tk=new StringTokenizer(f.readLine().trim());
		int c=Integer.parseInt(tk.nextToken());
		int n=Integer.parseInt(tk.nextToken());
		PriorityQueue<Long> cp=new PriorityQueue<Long>();
		PriorityQueue<helpcross> np=new PriorityQueue<helpcross>();
		
		for(int i=0;i<c;i++){
			cp.add(Long.parseLong(f.readLine().trim()));
		}
		for(int i=0;i<n;i++){
			tk=new StringTokenizer(f.readLine().trim());
			np.add(new helpcross(Long.parseLong(tk.nextToken()),Long.parseLong(tk.nextToken())));
		}
		int s=0;
		while(!cp.isEmpty()&&!np.isEmpty()){
			long a=cp.peek();
			helpcross b=np.peek();
			if(a>=b.x&&a<=b.y){
				s+=1;
				cp.poll();
				np.poll();
			}
			else if(a<b.x){
				cp.poll();
			}
			else{
				np.poll();
			}
		}
		
		//System.out.println(s);
		out.println(s);
		out.close();
	}
	@Override
	public int compareTo(Object o) {
		if(this.x>((helpcross)o).x) return 1;
		else if(this.x<((helpcross)o).x) return -1;
		else if(this.y>((helpcross)o).y) return 1;
		else if(this.y<((helpcross)o).y) return -1;
		return 0;
	}
	
}
