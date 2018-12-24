import java.util.*;
import java.io.*;
public class cfr470a {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int r=kb.nextInt();
		int c=kb.nextInt();
		String a[]=new String[r];
		for(int i=0;i<r;i++){
			a[i]=kb.next();
		}
		boolean b=true;
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				if(bordersSheep(i,j,a)){
					b=false;
				}
			}
		}
		if(!b){
			System.out.println("No");
		}
		else{
			System.out.println("Yes");
			for(int i=0;i<r;i++){
				for(int j=0;j<c;j++){
					if(a[i].charAt(j)=='.'){
						System.out.print('D');
					}
					else{
						System.out.print(a[i].charAt(j));
					}
				}
				System.out.println();
			}
		}
	}

	private static boolean bordersSheep(int r, int c, String a[]) {
		if(a[r].charAt(c)=='S')
			if((inBounds(r-1,c,a)&&a[r-1].charAt(c)=='W')||(inBounds(r+1,c,a)&&a[r+1].charAt(c)=='W')||(inBounds(r,c-1,a)&&a[r].charAt(c-1)=='W')||(inBounds(r,c+1,a)&&a[r].charAt(c+1)=='W'))
				return true;
		return false;
	}

	private static boolean inBounds(int i, int c, String[] a) {
		
		return i>=0&&c>=0&&i<a.length&&c<a[i].length();
	}

}
