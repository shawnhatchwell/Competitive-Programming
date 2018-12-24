import java.util.*;
import java.io.*;
public class w {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int a[]=new int[6];
		int b[]=new int[6];
		for(int i=0;i<6;i++){
			a[i]=kb.nextInt();
		}
		for(int i=0;i<6;i++){
			b[i]=kb.nextInt();
		}
		int c=0;
		int t=0;
		for(int i=0;i<6;i++){
			for(int j=0;j<6;j++){
				if(a[i]>b[j]){
					c++;
					t++;
				}
				else if(a[i]<b[j]){
					t++;
				}
			}
		}
		
		double d=(double)c/t;
		System.out.printf("%.5f%n",d);

	}

}
