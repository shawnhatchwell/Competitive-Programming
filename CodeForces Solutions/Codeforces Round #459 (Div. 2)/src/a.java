import java.util.*;
public class a {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int a[]=new int[20];
		a[0]=1;
		a[1]=2;
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(1);
		hs.add(2);
		for(int i=2;i<16;i++){
			a[i]=a[i-1]+a[i-2];
			hs.add(a[i]);
		}
		String s="";
		for(int i=1;i<=1000;i++){
			if(hs.contains(i))
				s+="O";
			else
				s+="o";
		}
		System.out.println(s.substring(0, n));
	}

}
