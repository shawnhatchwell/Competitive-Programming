import java.util.*;
import java.io.*;
public class s {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		StringTokenizer tk=new StringTokenizer(kb.nextLine());
		int n=Integer.parseInt(tk.nextToken());
		int m=Integer.parseInt(tk.nextToken());
		String a[]=new String[n];
		for(int i=0;i<n;i++){
			a[i]=kb.nextLine();
		}
		char c[][]=new char[n][m];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				c[i][j]=a[i].charAt(j);
			}
		}
		
		for(int kk=0;kk<m;kk++){
			boolean spot=false;
			int iold=0;
			for(int i=n-1;i>=0;i--){
				if(c[i][kk]=='.'&&!spot){
					spot=true;
					iold=i;
				}
				if(c[i][kk]=='#'&&spot){
					spot=false;
				}
				if(c[i][kk]=='o'&&spot){
					c[i][kk]='.';
					c[iold][kk]='o';
					spot=false;
					i=n;
				}
				
			}
		}
		
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				System.out.print(c[i][j]);
			}
			System.out.println();
		}

	}

}
