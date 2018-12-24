import java.util.*;
import java.io.*;
public class J {

	public static void main(String[] args) throws IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(f.readLine().trim());
		int a[]=new int[n];
		StringTokenizer tk=new StringTokenizer(f.readLine().trim());
		for(int i=0;i<n;i++){
			a[i]=Integer.parseInt(tk.nextToken());
		}
		int b[]=new int[n];
		for(int i=0;i<n;i++){
			b[i]=1;
		}
		int max=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<i;j++){
				if(Math.abs(a[j])<Math.abs(a[i])&&Math.abs(a[i])/a[i]!=Math.abs(a[j])/a[j]){
					b[i]=Math.max(b[i], b[j]+1);
				}
			}
		}
		for(int i=0;i<n;i++){
			max=Math.max(max, b[i]);
		}
		System.out.println(max);
		
		
	}

}