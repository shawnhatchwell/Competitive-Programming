import java.io.*;
import java.util.*;
public class edu22b {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int x=kb.nextInt();
		int y=kb.nextInt();
		int l=kb.nextInt();
		int r=kb.nextInt();
		int a=0;
		int b=0;
		TreeSet<Long> ts=new TreeSet<Long>();
		long n1=1;
		long n2=1;
		while(n1+1<=r){
			n1*=x;
			a++;
		}
		int amax=a-1;
		while(n2+1<=r){
			n2*=y;
			b++;
		}
		int bmax=b-1;
		for(int i=0;i<amax;i++){
			for(int j=0;)
		}
	}

}
