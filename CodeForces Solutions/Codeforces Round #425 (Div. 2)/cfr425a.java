import java.util.*;
import java.io.*;
public class cfr425a {

	public static void main(String[] args) throws IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk=new StringTokenizer(f.readLine());
		long n=Long.parseLong(tk.nextToken());
		long k=Long.parseLong(tk.nextToken());
		//sasha moves first
		System.out.println(n%(k*2)>=k?"YES":"NO");
	}

}