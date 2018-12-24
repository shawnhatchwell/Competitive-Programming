import java.util.*;
import java.io.*;
public class froshweek{

	public static void main(String[] args) throws IOException{
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk=new StringTokenizer(f.readLine());
		int n=Integer.parseInt(tk.nextToken());
		int m=Integer.parseInt(tk.nextToken());
		int t[]=new int[n];
		int l[]=new int[m];
		tk=new StringTokenizer(f.readLine());
		for(int i=0;i<n;i++){
			t[i]=Integer.parseInt(tk.nextToken());
		}
		tk=new StringTokenizer(f.readLine());
		for(int i=0;i<m;i++){
			l[i]=Integer.parseInt(tk.nextToken());
		}
		Arrays.sort(t);
		Arrays.sort(l);
		int count=0;
		int tind=0;
		int lind=0;
		while(tind<n&&lind<m){
			if(t[tind]<=l[lind]){
				count++;
				tind++;
				lind++;
			}
			else{
				lind++;
			}
		}
		System.out.println(count);
	}

}
