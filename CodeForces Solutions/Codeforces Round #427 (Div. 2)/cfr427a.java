import java.util.*;
import java.io.*;
public class cfr427a {

	public static void main(String[] args) throws IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk=new StringTokenizer(f.readLine());
		int s=Integer.parseInt(tk.nextToken());
		int v1=Integer.parseInt(tk.nextToken());
		int v2=Integer.parseInt(tk.nextToken());
		int t1=Integer.parseInt(tk.nextToken());
		int t2=Integer.parseInt(tk.nextToken());
		int x1=2*t1+s*v1;
		int x2=2*t2+s*v2;
		if(x1<x2){
			System.out.println("First");
		}
		else if(x2<x1){
			System.out.println("Second");
		}
		else{
			System.out.println("Friendship");
		}

	}

}
