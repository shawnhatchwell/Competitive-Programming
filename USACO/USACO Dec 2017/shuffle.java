import java.util.*;
import java.io.*;

public class shuffle {
	static int[] isCyc;
	static int[] a;
	static void cyc(int p, ArrayDeque<Integer> dq){
		if(dq.contains(p)){
			boolean b=false;
			while(!dq.isEmpty()){
				int x=dq.pollFirst();
				if(x==p){
					b=true;
				}
				if(b){
					isCyc[x]=1;
				}
				else{
					isCyc[x]=-1;
				}
			}
		}
		else if(isCyc[p]!=0){
			while(!dq.isEmpty()){
				int x=dq.pollFirst();
				isCyc[x]=-1;
			}
		}
		else{
			dq.addLast(p);
			cyc(a[p],dq);
		}
	}
	public static void main(String[] args) throws IOException{
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		f = new BufferedReader(new FileReader("shuffle.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("shuffle.out")));
		
		int n=Integer.parseInt(f.readLine().trim());
		StringTokenizer st=new StringTokenizer(f.readLine());
		a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=Integer.parseInt(st.nextToken())-1;
		}
		
		isCyc=new int[n];
		for(int i=0;i<n;i++){
			if(isCyc[i]==0){
				cyc(i,new ArrayDeque<Integer>());
			}
		}
		
		int count=0;
		for(int i=0;i<n;i++){
			//System.out.println(isCyc[i]);
			if(isCyc[i]==1){
				count++;
			}
		}
		//System.out.println(count);
		out.println(count);
		out.close();
	}
	
}