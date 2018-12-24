import java.util.*;
import java.io.*;
public class o {
	public int r;
	public int c;
	public int s;
	public o(int row,int col,int step){
		r=row;
		c=col;
		s=step;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk=new StringTokenizer(f.readLine());
		int m=Integer.parseInt(tk.nextToken());
		int n=Integer.parseInt(tk.nextToken());
		int[][] a=new int[m][n];
		for(int i=0;i<n;i++){
			String s=f.readLine();
			for(int j=0;j<n;j++){
				a[i][j]=Integer.parseInt(""+s.charAt(j));
			}
		}
		
		ArrayDeque<o>ad=new ArrayDeque<o>();
		ad.add(new o(0,0,0));
		int[][] min=new int[m][n];
		for(int i=0;i<m;i++){
			Arrays.fill(min[i], Integer.MAX_VALUE);
		}
		
		while(!ad.isEmpty()&&min[m-1][n-1]==Integer.MAX_VALUE){
			o place=ad.pollFirst();
			if(min[place.r][place.c]>place.s){
				min[place.r][place.c]=place.s;
				if(new o(place.r+a[place.r][place.c],place.c,place.s+1).inBounds(m,n)){
					ad.add(new o(place.r+a[place.r][place.c],place.c,place.s+1));
				}
				if(new o(place.r-a[place.r][place.c],place.c,place.s+1).inBounds(m,n)){
					ad.add(new o(place.r-a[place.r][place.c],place.c,place.s+1));
				}
				if(new o(place.r,place.c+a[place.r][place.c],place.s+1).inBounds(m,n)){
					ad.add(new o(place.r,place.c+a[place.r][place.c],place.s+1));
				}
				if(new o(place.r,place.c-a[place.r][place.c],place.s+1).inBounds(m,n)){
					ad.add(new o(place.r,place.c-a[place.r][place.c],place.s+1));
				}
			}
		}
		if(min[m-1][n-1]==Integer.MAX_VALUE){
			System.out.println("IMPOSSIBLE");
		}
		else
			System.out.println(min[m-1][n-1]);
	}
	public boolean inBounds(int m,int n) {
		return r>=0&&r<m&&c>=0&&c<n;
	}
}
