import java.util.*;
import java.io.*;
public class heartrate{

	public static void main(String[] args) throws IOException{
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(f.readLine());
		for(int kk=0;kk<n;kk++){
			StringTokenizer tk=new StringTokenizer(f.readLine());
			int b=Integer.parseInt(tk.nextToken());
			double p=Double.parseDouble(tk.nextToken());
			System.out.println(60*(b-1)/p+" "+60*b/p+" "+60*(b+1)/p);
		}
	}

}
