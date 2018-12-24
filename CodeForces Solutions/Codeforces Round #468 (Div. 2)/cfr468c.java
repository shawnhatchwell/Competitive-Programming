import java.util.*;
import java.io.*;
public class cfr468c {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int[] a=new int[n];
		TreeMap<Integer,Integer> tm=new TreeMap<Integer,Integer>();
		for(int i=0;i<n;i++){
			a[i]=kb.nextInt();
			if(!tm.containsKey(a[i])){
				tm.put(a[i],1);
			}
			else{
				tm.put(a[i], tm.get(a[i])+1);
			}
		}
		if(tm.size()==2){
			int x=tm.ceilingKey(Integer.MIN_VALUE);
			int y=tm.floorKey(Integer.MAX_VALUE);
			if(x-y!=1&&x-y!=-1){
				int numx=Math.min(tm.get(x),tm.get(y));
				int numy=numx;
				for(int i=0;i<n;i++){
					if(a[i]==x&&numx>0){
						a[i]=a[i]+1;
						numx--;
					}
					if(a[i]==y&&numy>0){
						a[i]=a[i]-1;
						numy--;
					}
				}
			}
		}
		else if(tm.size()==3){
			int x=tm.ceilingKey(Integer.MIN_VALUE);
			int y=tm.floorKey(Integer.MAX_VALUE);
			int z=x+1;
			if(2*Math.min(tm.get(x),tm.get(y))>tm.get(z)){
				int numx=Math.min(tm.get(x),tm.get(y));
				int numy=numx;
				for(int i=0;i<n;i++){
					if(a[i]==x&&numx>0){
						a[i]=a[i]+1;
						numx--;
					}
					if(a[i]==y&&numy>0){
						a[i]=a[i]-1;
						numy--;
					}
				}
			}
			else{
				int last=-1;
				for(int i=0;i<n;i++){
					if(a[i]==z){
						if(last==-1){
							last=i;
						}
						else{
							a[last]=a[last]-1;
							a[i]=a[i]+1;
							last=-1;
						}
					}
				}
			}
		}
		print(a,tm);

	}

	private static void print(int[] a,TreeMap<Integer,Integer> tm) {
		int count=0;
		for(int q:tm.keySet()){
			int c2=0;
			for(int i=0;i<a.length;i++){
				if(a[i]==q){
					c2++;
				}
			}
			count+=Math.min(c2, tm.get(q));
		}
		System.out.println(count);
		for(int i=0;i<a.length-1;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println(a[a.length-1]);
		
	}

}
