import java.util.*;
import java.io.*;
public class n {

	public static void main(String[] args) throws IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk=new StringTokenizer(f.readLine());
		int n=Integer.parseInt(tk.nextToken());
		int k=Integer.parseInt(tk.nextToken());
		int a[]=new int[k];
		a[0]=1;
		a[k-1]=2;
		for(int kk=0;kk<n;kk++){
			tk=new StringTokenizer(f.readLine());
			int fl=Integer.parseInt(tk.nextToken())-1;
			String st=tk.nextToken();
			if(st.equals("SAFE")){
				for(int i=0;i<=fl;i++){
					a[i]=1;
				}
			}
			else{
				for(int i=fl;i<k;i++){
					a[i]=2;
				}
			}
		}
		int min=k-1;
		int max=0;
		for(int i=0;i<k;i++){
			if(a[i]!=2){
				max=Math.max(max,i);
			}
			if(a[i]!=1){
				min=Math.min(min,i);
			}
		}
		System.out.println((min+1)+" "+(max+1));
	}

}