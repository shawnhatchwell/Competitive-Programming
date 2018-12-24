import java.util.*;
import java.io.*;
public class u {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
		for(int i=0;i<n;i++){
			pq.add(kb.nextInt());
		}
		int count=0;
		while(pq.size()>1){
			int top=pq.poll();
			int next=pq.poll();
			if(top>next){
				count+=next;
				top-=next;
				pq.add(top);
			}
			else{
				count+=top-1;
				pq.add(1);
				pq.add(1);
			}
			if(pq.peek()==1){
				count+=pq.size()/2;
				break;
			}
		}
		System.out.println(count);

	}

}
