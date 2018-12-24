import java.io.*;
import java.util.*;
public class edu26c {

	public static void main(String[] args) throws IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk=new StringTokenizer(f.readLine());
		int n=Integer.parseInt(tk.nextToken());
		int a=Integer.parseInt(tk.nextToken());
		int b=Integer.parseInt(tk.nextToken());
		int ar[][]=new int[n][2];
		int[] area=new int[n];
		for(int i=0;i<n;i++){
			tk=new StringTokenizer(f.readLine());
			ar[i][0]=Integer.parseInt(tk.nextToken());
			ar[i][1]=Integer.parseInt(tk.nextToken());
			area[i]=ar[i][0]*ar[i][1];
		}
		int max=0;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				boolean bo=false;
				for(int k=0;k<4;k++){
					int same=0;
					int add=0;
					if(k==0){
						same=Math.max(ar[i][0],ar[j][0]);
						add=ar[i][1]+ar[j][1];
					}
					else if(k==1){
						same=Math.max(ar[i][1],ar[j][1]);
						add=ar[i][0]+ar[j][0];
					}
					else if(k==2){
						same=Math.max(ar[i][0],ar[j][1]);
						add=ar[i][1]+ar[j][0];
					}
					else{
						same=Math.max(ar[i][1],ar[j][0]);
						add=ar[i][0]+ar[j][1];
					}
					if(Math.max(same, add)<=Math.max(a, b)&&Math.min(same, add)<=Math.min(a, b)){
						bo=true;
						k=4;
					}
				}
				if(bo){
					max=Math.max(max,area[i]+area[j]);
				}
			}
		}
		System.out.println(max);
		
		
	}

}
