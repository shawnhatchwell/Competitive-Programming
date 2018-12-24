import java.util.*;
import java.io.*;
public class counting {
	public static int c=0;
	public static int[] pr={2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97};

	public static void r(int id, int pv,int pd){
		if(id>0)
			for(int i=pv;i<pr.length;i++){
				pd*=pr[i];
				if(pd>100){
					i=pr.length;
				}
				else{
					r(id-1,i,pd);
					pd/=pr[i];
				}
			}
		else{
			c++;
			if(c==1000000007){
				c=0;
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int cse=Integer.parseInt(br.readLine().trim());
		for(int kk=0;kk<cse;kk++){
			int n=Integer.parseInt(br.readLine().trim());
			r(n,0,1);
			System.out.println(c);
			c=0;
		}
	}
}
