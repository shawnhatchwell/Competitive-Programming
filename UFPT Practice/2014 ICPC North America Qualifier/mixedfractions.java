import java.util.*;
import java.io.*;
public class mixedfractions {

	public static void main(String[] args) throws IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk=new StringTokenizer(f.readLine());
		int a=Integer.parseInt(tk.nextToken());
		int b=Integer.parseInt(tk.nextToken());
		while(!(a==0&&b==0)){
			System.out.println((a/b)+" "+(a%b)+" / "+b);
			tk=new StringTokenizer(f.readLine());
			a=Integer.parseInt(tk.nextToken());
			b=Integer.parseInt(tk.nextToken());
		
		}
	}

}
