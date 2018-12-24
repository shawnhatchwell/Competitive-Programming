import java.io.*;
import java.util.*;
public class speedlimit {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(f.readLine());
		while(n!=-1){
			int[] s=new int[n];
			int[] m=new int[n+1];
			for(int i=0;i<n;i++){
				StringTokenizer tk=new StringTokenizer(f.readLine());
				s[i]=Integer.parseInt(tk.nextToken());
				m[i+1]=Integer.parseInt(tk.nextToken());
			}
			int q=0;
			for(int i=0;i<n;i++){
				q+=s[i]*(m[i+1]-m[i]);
			}
			System.out.println(q+" miles");
			n=Integer.parseInt(f.readLine());
		}
	}
}
