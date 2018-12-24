import java.util.*;
import java.io.*;

/*
ID: shawn.h1
LANG: JAVA
PROB: dualpal
*/
public class dualpal {
	
	public static void main(String[] args) throws IOException{
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		f = new BufferedReader(new FileReader("dualpal.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("dualpal.out")));
		
		StringTokenizer tok= new StringTokenizer(f.readLine().trim());
		int n=Integer.parseInt(tok.nextToken());
		int s=Integer.parseInt(tok.nextToken());
		String st="";
		int count=0;
		int i=0;
		while(count<n){
			i++;
			int count2=0;
			for(int x=2;x<=10;x++){
				if(isPalindrome(xby(s+i,x)))
					count2++;
			}
			if(count2>1){
				count++;
				st+=""+(s+i)+"\n";
			}
		}
		System.out.print(st);
		out.print(st);
		out.close();
	}
	public static String xby(int x,int y){
		String s="";
		while(x>0){
			s=""+(x%y)+s;
			x-=x%y;
			x/=y;
		}
		return s;
	}
	public static boolean isPalindrome(String s){
		String r="";
		for(int i=0;i<s.length()/2+1;i++){
			r+=s.charAt(s.length()-i-1);
		}
		return r.equals(s.substring(0,r.length()));
	}
	
}
