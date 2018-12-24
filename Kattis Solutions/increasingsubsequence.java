
import java.util.*;
import java.io.*;

public class increasingsubsequence {

	public static void main(String[] args) throws IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		String s=f.readLine().trim();
		while(!s.equals("0")){
			StringTokenizer tk=new StringTokenizer(s);
			int n=Integer.parseInt(tk.nextToken());
			int[] a=new int[n];
			String o[]=new String[n];
			int ma[]=new int[n];
			for(int i=0;i<n;i++){
				a[i]=Integer.parseInt(tk.nextToken());
				o[i]=" "+a[i];
				ma[i]=1;
			}
			
			for(int i=n-2;i>=0;i--){
				int mx=0;
				String p="";
				for(int j=i+1;j<n;j++){
					if(a[i]<a[j]){
						if(ma[j]>=mx){
							mx=ma[j];
							p=o[j];
						}
					}
				}
				ma[i]+=mx;
				o[i]+=p;
			}
			int mx=0;
			int mi=0;
			for(int i=0;i<n;i++){
				if(ma[i]>=mx){
					mx=ma[i];
					mi=i;
				}
			}
			System.out.println(ma[mi]+o[mi]);
			
			s=f.readLine().trim();
		}
		

	}

}
