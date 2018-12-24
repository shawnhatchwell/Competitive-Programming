import java.util.*;
import java.io.*;
public class i {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		while(kb.hasNext()){
			double b0=Double.parseDouble(kb.next());
			double b1=Double.parseDouble(kb.next());
			double b2=Double.parseDouble(kb.next());
			double b3=Double.parseDouble(kb.next());
			double t0=Double.parseDouble(kb.next());
			double t1=Double.parseDouble(kb.next());
			double t2=Double.parseDouble(kb.next());
			double t3=Double.parseDouble(kb.next());
			double a0=t0-b0;
			double a1=t1-b1;
			double a2=t2-b2;
			double a3=t3-b3;
			//fit=min-max;
			double left=a0;
			double right=a0+a1+a2+a3;
			double d0=a1;
			double d1=2*a2;
			double d2=3*a3;
			double det=d1*d1-4*d0*d2;
			PriorityQueue<Double> pq=new PriorityQueue<Double>();
			PriorityQueue<Double> pqr=new PriorityQueue<Double>(Collections.reverseOrder());
			pq.add(left);
			pq.add(right);
			pqr.add(left);
			pqr.add(right);
			if(det==0){
				double root=-d1/(2*d2);
				if(root<=1&&root>=0){
					pq.add(a0+a1*root+a2*root*root+a3*root*root*root);
					pqr.add(a0+a1*root+a2*root*root+a3*root*root*root);
				}
			}
			else if(det>0){
				double root1=(-d1+Math.sqrt(det))/(2*d2);
				double root2=(-d1-Math.sqrt(det))/(2*d2);
				if(root1<=1&&root1>=0){
					pq.add(a0+a1*root1+a2*root1*root1+a3*root1*root1*root1);
					pqr.add(a0+a1*root1+a2*root1*root1+a3*root1*root1*root1);
				}
				if(root2<=1&&root2>=0){
					pq.add(a0+a1*root2+a2*root2*root2+a3*root2*root2*root2);
					pqr.add(a0+a1*root2+a2*root2*root2+a3*root2*root2*root2);
				}
			}
			System.out.println(pqr.peek()-pq.peek());
		}

	}

}
