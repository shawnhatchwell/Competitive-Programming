import java.util.*;
import java.io.*;
public class volleyball {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int n=Integer.parseInt(kb.next());
		String str=kb.next();
		String[] a=new String[6];
		for(int i=0;i<6;i++){
			a[(i+5)%6]=kb.next();
		}
		int s=Integer.parseInt(kb.next());
		String sdl[]=new String[s];
		for(int i=0;i<s;i++){
			sdl[i]=kb.next();
		}
		for(int i=0;i<sdl.length;i++){
			//System.out.println(sdl[i]);
		}
		for(int i=0;i<n;i++){
			if(a[0].equals(str)){
				String tmp=a[0];
				for(int j=0;j<5;j++){
					a[j]=a[j+1];
				}
				a[5]=tmp;
			}
			else{
				String tmp=a[0];
				for(int j=0;j<5;j++){
					a[j]=a[j+1];
				}
				a[5]=sdl[0];
				for(int j=0;j<sdl.length-1;j++){
					sdl[j]=sdl[j+1];
				}
				sdl[sdl.length-1]=tmp;
			}
		}
		String o=""+a[5];
		for(int i=0;i<5;i++) o+=" "+a[i];
		System.out.println(o);
		
	}

}
