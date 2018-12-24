import java.util.*;
import java.io.*;
public class m {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		String s=kb.nextLine();
		int[] a=new int[s.length()];
		for(int i=0;i<s.length();i++){
			for(int j=0;j<i;j++){
				if(s.charAt(i)>s.charAt(j)){
					a[i]=Math.max(a[j]+1, a[i]);
				}
			}
		}
		int max=0;
		for(int i=0;i<s.length();i++){
			max=Math.max(max, a[i]);
		}
		System.out.println(25-max);

	}

}
