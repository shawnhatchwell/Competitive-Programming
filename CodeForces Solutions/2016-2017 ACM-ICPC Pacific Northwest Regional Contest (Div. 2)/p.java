import java.util.*;
import java.io.*;
public class p {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int k=kb.nextInt();
		int r=kb.nextInt();
		int a[]=new int[k];
		for(int i=0;i<k;i++){
			a[i]=kb.nextInt();
		}
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<k;i++){
			hs.add(a[i]);
		}
		int count=0;
		int ind=0;
		for(int i=1;i<=n-r+1;){
			//System.out.println(i);
			int c2=0;
			int min=Integer.MAX_VALUE;
			for(int j=0;j<r;j++){
				if(hs.contains(i+j)){
					c2++;
					min=Math.min(i+j, min);
				}
			}
			if(c2==0){
				count+=2;
				//System.out.println("ADDED 2 AT " +i);
				if(i==n-r+1) break;
				i=Math.min(i+r-1, n-r+1);
				hs.add(i);
			}
			else if(c2==1){
				count+=1;
				//System.out.println("ADDED 1 AT " +i);
				if(i==n-r+1) break;
				i=Math.min(i+r-1, n-r+1);
				hs.add(i);
			}
			else{
				for(int j=ind;j<k;j++){
					if(a[j]>=i){
						ind=j;
						j=k;
					}
				}
				if(i==n-r+1) break;
				i=Math.min(a[ind]+1, n-r+1);
			}
						
		}
		System.out.println(count);

	}

}
