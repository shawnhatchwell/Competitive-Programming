import java.util.*;
import java.io.*;
public class oddities {

	public static void main(String[] args) throws IOException{
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk=new StringTokenizer(f.readLine());
		int n=Integer.parseInt(tk.nextToken());
		int p[]=new int[n];
		int t[]=new int[n];
		for(int i=0;i<n;i++){
			int k=Integer.parseInt(f.readLine());
			System.out.println((k%2==0)?(k+" is even"):(k+" is odd"));
		}

	}

}
