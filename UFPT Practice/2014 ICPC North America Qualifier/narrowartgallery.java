import java.util.*;
import java.io.*;
public class narrowartgallery {

	public static void main(String[] args) throws IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk=new StringTokenizer(f.readLine());
		int n=Integer.parseInt(tk.nextToken());
		int k=Integer.parseInt(tk.nextToken());
		int left[]=new int[n];
		int right[]=new int[n];
		for(int i=0;i<n;i++){
			tk=new StringTokenizer(f.readLine());
			left[i]=Integer.parseInt(tk.nextToken());
			right[i]=Integer.parseInt(tk.nextToken());
		}
		int dpval[][]=new int[n][k];
		int dpblock[][]=new int[n][k];
		for(int i=0;i<n;i++){
			for(int j=0;j<k;j++){
				
			}
		}
	}

}
