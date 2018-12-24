import java.io.*;
import java.util.*;
public class r418d2b {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=kb.nextInt();
		}
		int b[]=new int[n];
		for(int i=0;i<n;i++){
			b[i]=kb.nextInt();
		}
		int p[]=new int[n];
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<n;i++){
			if(a[i]==b[i]){
				p[i]=a[i];
				hs.remove(p[i]);
			}
			else{
				hs.add(a[i]);
				hs.add(b[i]);
			}
		}

	}

}
