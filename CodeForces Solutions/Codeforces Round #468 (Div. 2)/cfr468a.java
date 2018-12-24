import java.util.*;
import java.io.*;
public class cfr468a {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int a=kb.nextInt();
		int b=kb.nextInt();
		int c=Math.abs(a-b);
		int d=c/2;
		int e=(c+1)/2;
		int x=(d*(d+1))/2;
		int y=(e*(e+1))/2;
		System.out.println(x+y);

	}

}
