import java.io.*;
import java.util.*;
public class k_fence {
	public static void main(String[] args) throws IOException{
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(f.readLine());
		StringTokenizer tk=new StringTokenizer(f.readLine());
		int a[]=new int[10];
		for(int i=1;i<10;i++){
			a[i]=Integer.parseInt(tk.nextToken());
			
		}
		boolean b=false;
		for(int i=1;i<=9;i++){
			if(n>a[i]){
				b=true;
			}
		}
		if(!b){
			System.out.println("-1");
		}
		else{
			//dont iterate, divide
			int count[]=new int[10];
			int min=Integer.MAX_VALUE;
			for(int i=1;i<10;i++){
				min=Math.min(min, a[i]);
				
			}
			int ind=0;
			for(int i=1;i<=9;i++){
				if(a[i]==min){
					ind=i;
				}
			}
			count[ind]=n/min;
			int remains=n%min;
			//System.out.println(min+" "+n+" "+remains);
			int rind=0;
			while(remains>0){
				boolean b2=false;
				for(int i=ind+1;i<10;i++){
					if(a[i]-a[ind]<=remains){
						b2=true;
						count[i]=remains/(a[i]-a[ind]);
						count[ind]-=remains/(a[i]-a[ind]);
						remains=remains%(a[i]-a[ind]);
						//System.out.println(remains);
					}
					
				}
				if(!b2){
					break;
				}
			}
			String out="";
			for(int i=9;i>0;i--){
				for(int j=0;j<count[i];j++){
					out+=""+i;
				}
			}
			System.out.println(out);
			
			
			
			
			
			
			
		}
		
	}

}
