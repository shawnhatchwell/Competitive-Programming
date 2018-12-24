import java.util.*;
import java.io.*;
public class universe {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		for(int cse=1;cse<=n;cse++){
			int d=kb.nextInt();
			String p=kb.next();
			int sht=0;
			for(int i=0;i<p.length();i++){
				if(p.charAt(i)=='S'){
					sht++;
				}
			}
			if(d<sht){
				System.out.println("Case #"+cse+": IMPOSSIBLE");
			}
			else{
				int a[]=new int[sht];
				int curr=1;
				int ind=0;
				for(int i=0;i<p.length();i++){
					if(p.charAt(i)=='S'){
						a[ind]=curr;
						ind++;
					}
					else{
						curr*=2;
					}
				}
				long sum=0;
				for(int i=0;i<sht;i++){
					sum+=a[i];
				}
				TreeMap<Integer, Integer> tm=new TreeMap<Integer,Integer>();
				if(a.length!=0)
					tm.put(a[0],1);
				for(int i=0;i<sht-1;i++){
					if(a[i]==a[i+1]){
						tm.put(a[i], tm.get(a[i])+1);
					}
					else{
						tm.put(a[i+1],1);
					}
				}
				int count=0;
				while(sum>d){
					count++;
					int max=tm.floorKey(Integer.MAX_VALUE);
					if(tm.get(max)==1){
						tm.remove(max);
					}
					else{
						tm.put(max, tm.get(max)-1);
					}
					if(max!=1){
						if(!tm.containsKey(max/2)){
							tm.put(max/2, 1);
							
						}
						else{
							tm.put(max/2, tm.get(max/2)+1);
						}
					}
					sum-=max/2;
				}
				System.out.println("Case #"+cse+": "+count);
			}
		}

	}

}
