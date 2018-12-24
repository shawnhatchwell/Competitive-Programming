import java.util.*;
import java.io.*;

public class tower{
	
	public static void main(String[] args) throws IOException{
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		
		String[] n=f.readLine().trim().split(" ");
		for(int i=0;i<=56;i++){
			if(Integer.bitCount(i)==3){
				char[] a=Integer.toBinaryString(i).toCharArray();
				int sum=0;
				ArrayList<Integer> b=new ArrayList<Integer>();
				for(int j=0;j<a.length;j++){
					if(a[a.length-1-j]=='1'){
						sum+=Integer.parseInt(n[j]);
						b.add(Integer.parseInt(n[j]));
					}
					Collections.sort(b);
				}
				if(sum==Integer.parseInt(n[6])){
					ArrayList<Integer> c=new ArrayList<Integer>();
					for(int j=0;j<6;j++){
						if(!b.contains(Integer.parseInt(n[j]))){
							c.add(Integer.parseInt(n[j]));
						}
					}
					Collections.sort(c);
					System.out.println(b.get(2)+" "+b.get(1)+" "+b.get(0)+" "+c.get(2)+" "+c.get(1)+" "+c.get(0));
					i=57;
				}
				else if(sum==Integer.parseInt(n[7])){
					ArrayList<Integer> c=new ArrayList<Integer>();
					for(int j=0;j<6;j++){
						if(!b.contains(Integer.parseInt(n[j]))){
							c.add(Integer.parseInt(n[j]));
						}
					}
					Collections.sort(c);
					System.out.println(c.get(2)+" "+c.get(1)+" "+c.get(0)+" "+b.get(2)+" "+b.get(1)+" "+b.get(0));
					i=57;
				}
			}
		}
		
	}
	
}