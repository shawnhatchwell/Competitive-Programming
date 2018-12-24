import java.util.*;
import java.io.*;
public class A {

	public static void main(String[] args) throws IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(f.readLine().trim());
		for(int k=1;k<=n;k++){
			StringTokenizer tk=new StringTokenizer(f.readLine().trim());
			int i=Integer.parseInt(tk.nextToken());
			String s=tk.nextToken();
			System.out.println(k+" "+s.substring(0,i-1)+s.substring(i));
		}
		
		
	}

}