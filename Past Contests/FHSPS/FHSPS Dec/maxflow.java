import java.io.*;
import java.util.*;

public class maxflow {
	public static void main(String[] args) throws IOException{
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		
		
		int n=Integer.parseInt(f.readLine().trim());
		for(int i=0;i<n;i++){
			int m=Integer.parseInt(f.readLine().trim());
			HashMap<Integer,Integer> p=new HashMap<Integer,Integer>();
			HashMap<Integer,Integer> v=new HashMap<Integer,Integer>();

			for(int j=0;j<m;j++){
				String[] s=f.readLine().trim().split(" ");
				v.put(j+1, Integer.parseInt(s[0]));
				p.put(j+1, Integer.parseInt(s[1]));

			}
			HashMap<Integer,Integer> d=new HashMap<Integer,Integer>();
			for(int j=1;j<=m;j++){
				int q=j;
				int count=0;
				while(q!=0){
					q=p.get(q);
					count++;
				}
				d.put(j, count);
			}
			boolean[] pr=new boolean[m+1];
			for(int j=0;j<m;j++){
				pr[p.get(j)]=true;
			}
			
			
			//lowering val
			for(int j=1;j<=m;j++){
				for(int k=1;k<=m;k++){
					if(pr[k]){
						
						int count=0;
						for(int l=1;l<=m;l++){
							if(p.get(l)==k){
								count+=v.get(l);
									
							}
						}
						if(count<v.get(k)){
							v.put(k, count);
						}
					}
					
				}
			}
			

		}
		
	}
}
