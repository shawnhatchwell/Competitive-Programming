import java.util.*;
import java.io.*;
public class safepassage {

	public static void main(String[] args) throws IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk=new StringTokenizer(f.readLine());
		int n=Integer.parseInt(tk.nextToken());
		int a[]=new int [n];
		for(int i=0;i<n;i++){
			a[i]=Integer.parseInt(tk.nextToken());
		}
		Arrays.sort(a);
		int time=a[1];
		boolean two=true;
		for(int i=n-1;i>2;i-=2){
			if(i==3) two=false;
			time+=a[0]+a[i]+a[1]+a[1];
			
		}
		if(two&&n>2){
			time+=a[0]+a[2];
		}
		System.out.println(time);
	}
}
