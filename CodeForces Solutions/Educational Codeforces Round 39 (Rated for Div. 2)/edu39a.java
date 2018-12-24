import java.util.*;
import java.io.*;
public class edu39a {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=kb.nextInt();
		}
		int b=0;
		int c=0;
		for(int i=0;i<n;i++){
			if(a[i]>0){
				b+=a[i];
			}else{
				c+=a[i];
			}
		}
		System.out.println(b-c);

	}

}
