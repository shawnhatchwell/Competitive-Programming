import java.util.*;
import java.io.*;
public class o{
	public static char[][]c;
	public static int n;
	public static int m;
	public static int sr;
	public static int sc;
	public static int er;
	public static int ec;
	public int r;
	public int co;
	public o(int i,int j){
		r=i;
		co=j;
	}
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		StringTokenizer tk=new StringTokenizer(kb.nextLine());
		n=Integer.parseInt(tk.nextToken());
		m=Integer.parseInt(tk.nextToken());
		String a[]=new String[n];
		for(int i=0;i<n;i++){
			a[i]=kb.nextLine();
		}
		c=new char[n][m];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				c[i][j]=a[i].charAt(j);
				if(c[i][j]=='R'){
					sr=i;
					sc=j;
				}
				if(c[i][j]=='E'){
					er=i;
					ec=j;
				}
			}
		}
		int dp[][]= new int[n][m];
		floodfillSteps(er,ec);
		
		
		
		
		
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(c[i][j]=='L'){
					floodfillLand(i,j);
				}
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(c[i][j]=='C'){
					c[i][j]='W';
				}
			}
		}
		int count=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(c[i][j]=='L'){
					count++;
					c[i][j]='*';
					floodfillStar(i,j);
				}
			}
		}
		System.out.println(count);

	}
	private static void floodfillSteps(int i, int j) {
		if(inBounds(i+1,j)&&c[i+1][j]!='#'){
			c[i+1][j]='*';
			floodfillStar(i+1,j);
		}
		if(inBounds(i-1,j)&&c[i-1][j]!='#'){
			c[i-1][j]='*';
			floodfillStar(i-1,j);
		}
		if(inBounds(i,j+1)&&c[i][j+1]!='#'){
			c[i][j+1]='*';
			floodfillStar(i,j+1);
		}
		if(inBounds(i,j-1)&&c[i][j-1]!='#'){
			c[i][j-1]='*';
			floodfillStar(i,j-1);
		}
		
		
	}
	private static boolean inBounds(int i, int j) {
		return (i>=0)&&(j>=0)&&(i<n)&&(j<m);
	}

}
