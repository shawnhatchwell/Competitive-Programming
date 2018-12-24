import java.util.*;
import java.io.*;
public class cfr470c {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(f.readLine());
		StringTokenizer tk=new StringTokenizer(f.readLine());
		int v[]=new int[n];
		for(int i=0;i<n;i++){
			v[i]=Integer.parseInt(tk.nextToken());
		}
		tk=new StringTokenizer(f.readLine());
		int t[]=new int[n];
		for(int i=0;i<n;i++){
			t[i]=Integer.parseInt(tk.nextToken());
		}
		long tsum[]=new long[n];
		tsum[0]=t[0];
		for(int i=1;i<n;i++){
			tsum[i]=tsum[i-1]+t[i];
		}
		long ans[]=new long[n];
		for(int i=0;i<n;i++){
			int day=i;
			do{
				ans[day]+=Math.min(t[day], v[i]);
				//System.out.println(ans[day]);
				v[i]-=t[day];
				day++;
			}while(day<n&&v[i]>0);
		}
		System.out.print(ans[0]);
		for(int i=1;i<ans.length;i++){
			System.out.print(" "+ans[i]);
		}
		System.out.println();
		

	}

}
