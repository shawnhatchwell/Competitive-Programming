import java.util.*;
import java.io.*;
class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(f.readLine());
		while(n!=0){
			StringTokenizer tk=new StringTokenizer(f.readLine());
			int[] a=new int[n];
			for(int i=0;i<n;i++){
				a[i]=Integer.parseInt(tk.nextToken());
			}
			int pi=-1;
			int ni=-1;
			int fpi=0;
			int fni=0;
			int next[]=new int[n];
			for(int i=0;i<n;i++){
				if(a[i]>0){
					if(pi!=-1){
						next[pi]=i;
					}
					else{
						fpi=i;
					}
					pi=i;
				}
				else if(a[i]<0){
					if(ni!=-1){
						next[ni]=i;
					}
					else{
						fni=i;
					}
					ni=i;
				}
			}
			next[pi]=-1;
			next[ni]=-1;
			pi=fpi;
			ni=fni;
			int count=0;
			while(pi!=-1&&ni!=-1){
				int min=Math.min(a[pi],-a[ni]);
				count+=Math.abs(ni-pi)*min;
				if(-a[ni]>a[pi]){
					a[ni]+=min;
					pi=next[pi];
				}
				else if(-a[ni]<a[pi]){
					a[pi]-=min;
					ni=next[ni];
				}
				else{
					pi=next[pi];
					ni=next[ni];
					//System.out.println(pi);
					//System.out.println(ni);
				}
			}
			System.out.println(count);
			n=Integer.parseInt(f.readLine());
		}

	}

}
