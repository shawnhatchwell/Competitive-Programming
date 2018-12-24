import java.util.*;
import java.io.*;
public class d {

	public static void main(String[] args) throws IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk=new StringTokenizer(f.readLine());
		int n=Integer.parseInt(tk.nextToken());
		int m=Integer.parseInt(tk.nextToken());
		int a[]=new int[m];
		HashSet<Integer> used=new HashSet<Integer>();
		for(int i=0;i<m;i++){
			a[i]=Integer.parseInt(f.readLine());
			used.add(a[i]);
		}
		
		int ind=0;
		for(int i=1;i<=n;i++){
			//System.out.println("index"+i);
			if(!used.contains(i)){
				
					while(ind<m&&a[ind]<i){
						System.out.println(a[ind]);
						ind++;
					}
					System.out.println(i);
				
			}
		}
		
		while(ind<m){
			System.out.println(a[ind]);
			ind++;
		}
		
	}

}
