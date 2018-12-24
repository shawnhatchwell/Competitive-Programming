import java.util.*;
import java.io.*;
public class spavanac {

	public static void main(String[] args) throws IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk=new StringTokenizer(f.readLine());
		int m=Integer.parseInt(tk.nextToken());
		int s=Integer.parseInt(tk.nextToken());
		int t=m*60+s-45;
		if(t<0){
			t+=24*60;
		}
		System.out.println(t/60+" "+t%60);
	}

}
