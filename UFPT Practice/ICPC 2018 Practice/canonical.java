import java.util.*;
import java.io.*;
public class canonical {

	public static void main(String[] args) throws IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(f.readLine());
		StringTokenizer tk=new StringTokenizer(f.readLine());
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=Integer.parseInt(tk.nextToken());
		}
		int coin[]=new int[a[n-1]+a[n-2]];
		for(int i=0;i<n;i++){
			coin[a[i]]=1;
		}
		int curr=0;
		boolean c=true;
		for(int i=2;i<a[n-1]+a[n-2];i++){
			if(coin[i]==1)curr++;
			else{
				coin[i]=coin[i-a[curr]]+1;
				for(int j=0;j<curr;j++){
					if(coin[i]>coin[i-a[j]]+1){
						c=false;
						//System.out.println(coin[i]);
						break;
						
					}
				}
			}
		}
		/*for(int q:coin){
			System.out.println(q);
		}*/
		System.out.println(c?"canonical":"non-canonical");
		
	}

	
	
}
