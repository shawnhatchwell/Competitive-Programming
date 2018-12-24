import java.util.*;

public class cups {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int n=Integer.parseInt(kb.nextLine());
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		for(int i=0;i<n;i++){
			String[] a=kb.nextLine().split(" ");
			String nums="0123456789";
			if(nums.contains(a[0].substring(0,1))){
				int q=Integer.parseInt(a[0])/2;
				String s=a[1];
				pq.add(q);
				hm.put(q,s);
			}
			else{
				int q=Integer.parseInt(a[1]);
				String s=a[0];
				pq.add(q);
				hm.put(q,s);
			}
			
		}
		for(int i=0;i<n;i++){
			System.out.println(hm.get(pq.poll()));
		}
	}

}
