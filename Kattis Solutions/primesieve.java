import java.util.*;
import java.io.*;
public class primesieve {

	public static void main(String[] args) throws IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(f.readLine());
		int n=Integer.parseInt(st.nextToken());
		//boolean a[]=new boolean[n+1];
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(1);
		//a[1]=true;
		int count=0;
		//true if not prime, have to switch on output
		for(int i=2;i<n+1;i++){
			if(!hs.contains(i)){
				count++;
				for(int j=i*2;j<n+1;j+=i){
					hs.add(j);
				}
			}
		}
		System.out.println(count);
		int q=Integer.parseInt(st.nextToken());
		for(int i=0;i<q;i++){
			int x=Integer.parseInt(f.readLine());
			if(hs.contains(x)) System.out.println("0");
			else System.out.println("1");
		}
	}

}
