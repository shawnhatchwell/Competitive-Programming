import java.util.*;
import java.io.*;
public class trouble {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader (System.in));
		int t=Integer.parseInt(f.readLine());
		for(int cse=1;cse<=t;cse++){
			int n=Integer.parseInt(f.readLine());
			PriorityQueue<Integer> evens=new PriorityQueue<Integer>();
			PriorityQueue<Integer> odds=new PriorityQueue<Integer>();
			StringTokenizer tk=new StringTokenizer(f.readLine());
			for(int i=0;i<n;i++){
				if(i%2==0){
					evens.add(Integer.parseInt(tk.nextToken()));
				}
				else{
					odds.add(Integer.parseInt(tk.nextToken()));
				}
			}
			boolean good=true;
			for(int i=0;i<n-1;i++){
				if(i%2==0){
					int e=evens.poll();
					int o=odds.peek();
					if(e>o){
						System.out.println("Case #"+cse+": "+i);
						i=n;
						good=false;
					}
				}
				else{
					int o=odds.poll();
					int e=evens.peek();
					if(o>e){
						System.out.println("Case #"+cse+": "+i);
						i=n;
						good=false;
					}
				}
			}
			if(good){
				System.out.println("Case #"+cse+": OK");
			}
		}

	}

}
