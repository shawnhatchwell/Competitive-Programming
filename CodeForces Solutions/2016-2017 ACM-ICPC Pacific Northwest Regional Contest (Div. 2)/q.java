import java.util.*;
import java.io.*;
public class q {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int k=kb.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=kb.nextInt();
		}
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		long t=0;
		long s=0;
		for(int i=0;i<n+k;i++){
			if(i<k){
				pq.add(a[i]);
			}
			else{
				t+=pq.poll();
				s+=t;
				if(i<n){
					pq.add(a[i]);
				}
				
			}
			
		}
		System.out.println(s);
	}

}
