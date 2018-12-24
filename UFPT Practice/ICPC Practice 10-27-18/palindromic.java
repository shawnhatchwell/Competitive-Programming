import java.util.*;
import java.io.*;
public class palindromic {

	public static void main(String[] args) throws IOException{
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(f.readLine());
		for(int kk=0;kk<n;kk++){
			int p=Integer.parseInt(f.readLine());
			int a=p/1000;
			int b=a-1;
			int c=a+1;
			int ap=a*1000+(a%10*100)+(a/10%10*10)+(a/100);
			//System.out.println(ap);
			int bp=b*1000+(b%10*100)+(b/10%10*10)+(b/100);
			//System.out.println(bp);
			int cp=c*1000+(c%10*100)+(c/10%10*10)+(c/100);
			//System.out.println(cp);
			int diffa=Math.abs(ap-p);
			int diffb=Math.abs(bp-p);
			int diffc=Math.abs(cp-p);
			int diff=Math.min(diffa, Math.min(diffb, diffc));
			if(diff==diffb) System.out.println(bp);
			else if(diff==diffa) System.out.println(ap);
			else System.out.println(cp);
		}

	}

}
