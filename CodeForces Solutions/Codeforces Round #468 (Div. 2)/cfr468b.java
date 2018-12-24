import java.util.*;
import java.io.*;
public class cfr468b {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int a=kb.nextInt()-1;
		int b=kb.nextInt()-1;
		int count=0;
		while(a!=b){
			a/=2;
			b/=2;
			count++;
		}
		if(Math.pow(2, count)==n){
			System.out.println("Final!");
		}
		else{
			System.out.println(count);
		}
	}

}
