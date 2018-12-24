import java.util.*;
import java.io.*;
public class flexible {

	public static void main(String[] args) throws IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk=new StringTokenizer(f.readLine());
		int w=Integer.parseInt(tk.nextToken());
		int p=Integer.parseInt(tk.nextToken());
		tk=new StringTokenizer(f.readLine());
		int a[]=new int[p+2];
		a[0]=0;
		for(int i=0;i<p;i++){
			a[i+1]=Integer.parseInt(tk.nextToken());
		}
		a[p+1]=w;
		TreeSet<Integer> hm=new TreeSet<Integer>();
		for(int i=0;i<p+2;i++){
			for(int j=i+1;j<p+2;j++){
				hm.add(a[j]-a[i]);
			}
		}
		while(!hm.isEmpty()){
			System.out.print(hm.pollFirst());
			if(hm.isEmpty()){
				System.out.println();
			}
			else{
				System.out.print(" ");
			}
		}
	}

}
