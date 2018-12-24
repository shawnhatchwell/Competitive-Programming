import java.util.*;
import java.io.*;
public class edu39d {

	public static void main(String[] args) throws IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk=new StringTokenizer(f.readLine());
		int n=Integer.parseInt(tk.nextToken());
		int m=Integer.parseInt(tk.nextToken());
		int k=Integer.parseInt(tk.nextToken());
		int a[]=new int[n];
		int first[]=new int[n];
		int last[]=new int[n];
		for(int i=0;i<n;i++){
			String s=f.readLine();
			int x=Integer.parseUnsignedInt(s, 2);
			if(x!=0){
				x/=Integer.lowestOneBit(x);
				a[i]=x;
				if(x!=1){
					first[i]=x/Integer.lowestOneBit(x-1);
				}
				else{
					first[i]=0;
				}
				last[i]=x-Integer.highestOneBit(x);
			}
			else{
				a[i]=0;
				first[i]=0;
				last[i]=0;
			}
		}
		for(int i=0;i<k;i++){
			int max=0;
			int ind=0;
			boolean b=false;
			for(int j=0;j<n;j++){
				if(a[j]!=0){
					int hours=Integer.toString(a[j], 2).length();
					int hoursf=Integer.toString(first[j], 2).length();
					int hoursl=Integer.toString(last[j], 2).length();
					if(hours-hoursf<hours-hoursl&&hours-hoursf>max){
						max=hours-hoursf;
						ind=j;
						b=true;
					}
					else if(hours-hoursf>=hours-hoursl&&hours-hoursl>max){
						max=hours-hoursl;
						ind=j;
						b=false;
					}
				}
			}
			if(b){
				a[ind]=first[ind];
			}
			else{
				a[ind]=last[ind];
			}
			if(a[ind]!=0){
				if(a[ind]!=1){
					first[ind]=a[ind]/Integer.lowestOneBit(a[ind]-1);
				}
				else{
					first[ind]=0;
				}
				last[ind]=a[ind]-Integer.highestOneBit(a[ind]);
			}
			else{
				first[ind]=0;
				last[ind]=0;
			}
		}
		int count=0;
		for(int i=0;i<n;i++){
			if(a[i]!=0){
				count+=Integer.toString(a[i], 2).length();
			}
		}
		System.out.println(count);
	}

}
