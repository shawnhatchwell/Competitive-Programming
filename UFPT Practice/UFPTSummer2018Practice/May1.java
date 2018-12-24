import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk=new StringTokenizer(f.readLine());
		int h=Integer.parseInt(tk.nextToken());
		while(h!=0){
			int w=Integer.parseInt(tk.nextToken());
			int[] a=new int[w];
			tk=new StringTokenizer(f.readLine());
			for(int i=0;i<w;i++){
				a[i]=Integer.parseInt(tk.nextToken());
			}
			int count=h-a[0];
			for(int i=1;i<w;i++){
				if(a[i]<a[i-1]){
					count+=a[i-1]-a[i];
				}
			}
			System.out.println(count);
			tk=new StringTokenizer(f.readLine());
			h=Integer.parseInt(tk.nextToken());
		}

	}

}
