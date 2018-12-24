import java.io.*;
import java.util.*;
public class edu26a {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(f.readLine());
		String s=f.readLine();
		StringTokenizer tk=new StringTokenizer(s);
		int max=0;
		while(tk.hasMoreTokens()){
			String w=tk.nextToken();
			int t=0;
			for(char c:w.toCharArray()){
				if(c>='A'&&c<='Z'){
					t++;
				}
			}
			max=Math.max(max, t);
		}
		System.out.println(max);

	}

}
