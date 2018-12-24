import java.util.*;
import java.io.*;
public class edu39b {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		long a=kb.nextLong();
		long b=kb.nextLong();
		while((a>=2*b||b>=2*a)&&a!=0&&b!=0){
			if(a>=2*b){
				a%=2*b;
			}
			else{
				b%=2*a;
			}
		}
		System.out.println(a+" "+b);

	}

}