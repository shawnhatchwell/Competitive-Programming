import java.io.*;
import java.util.*;
public class r418d2a {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int k=kb.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=kb.nextInt();
		}
		int b=kb.nextInt();
		for(int i=0;i<k-1;i++){
			b=Math.min(b, kb.nextInt());
		}
		boolean f=false;
		for(int i=1;i<n;i++){
			if((a[i]!=0&&a[i]<a[i-1])||(a[i]==0&&a[i-1]!=0&&b<a[i-1])||(a[i]==0&&a[i-1]==0)){
				f=true;
				i=n;
			}
		}
		String s=f?"Yes":"No";
		System.out.println(s);
	}
}
