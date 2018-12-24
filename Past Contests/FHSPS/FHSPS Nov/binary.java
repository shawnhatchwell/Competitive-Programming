import java.util.*;
import java.io.*;

public class binary {
	
	public static void main(String[] args) throws IOException{
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		
		
		int n=Integer.parseInt(f.readLine().trim());
		for(int i=0;i<n;i++){
			StringTokenizer t=new StringTokenizer(f.readLine().trim());
			int a=Integer.parseInt(t.nextToken());
			int b=Integer.parseInt(t.nextToken());
			int c=Integer.parseInt(t.nextToken());
			int q=a|b;
			//System.out.println(q);
			while(c>q){
				c-=Integer.highestOneBit(c);
			}
			String d=Integer.toBinaryString(q);
			String e=Integer.toBinaryString(c);
			while(e.length()<d.length()){
				e="0"+e;
			}
			//System.out.println(e+" "+d);
			for(int j=0;j<e.length();j++){
				if(e.charAt(j)=='1'&&d.charAt(j)=='1'){
					d=d.substring(0,j)+"0"+d.substring(j+1);
				}
			}
			System.out.println(Integer.parseInt(d, 2));
			

		}
		
		System.out.println();
	}
	
}