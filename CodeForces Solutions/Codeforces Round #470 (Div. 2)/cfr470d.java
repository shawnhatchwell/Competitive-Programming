import java.util.*;
import java.io.*;
public class cfr470d {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(f.readLine());
		int a[]=new int[n];
		StringTokenizer tk=new StringTokenizer(f.readLine());
		for(int i=0;i<n;i++){
			a[i]=Integer.parseInt(tk.nextToken());
		}
		int p[]=new int[n];
		tk=new StringTokenizer(f.readLine());
		for(int i=0;i<n;i++){
			p[i]=Integer.parseInt(tk.nextToken());
		}
		

	}

}
