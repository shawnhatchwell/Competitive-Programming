import java.util.*;
import java.io.*;
public class flowfree {
	static int dx[]={1,0,-1,0};
	static int dy[]={0,1,0,-1};
	public static void main(String[] args) throws IOException{
		BufferedReader f=new BufferedReader(new StreamInputReader(System.in));
		char a[][]=new char[4][4];
		a[0]=f.readLine().toCharArray();
		a[1]=f.readLine().toCharArray();
		a[2]=f.readLine().toCharArray();
		a[3]=f.readLine().toCharArray();
		boolean yellow=false;
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				if(a[i][j]=='Y'){
					yellow=true;
				}
			}
		}
		if(yellow){
			System.out.println(flowYellow(a,-1,-1)?"solvable":"not solvable");
		}
		else{
			System.out.println(flowRed(a,-1,-1)?"solvable":"not solvable");
		}
		
	}
	private static boolean flowYellow(char[][] a, int x, int y) {
		if(x==-1){
			int r=0;
			int c=0;
			for(int i=0;i<4;i++){
				for(int j=0;j<4;j++){
					if(a[i][j]=='Y'){
						r=i;c=j;
					}
				}
			}
			a[x][y]='y';
			return flowYellow(a,r,c);
		}
		else if(a[x][y]=='Y'){
			
			for(int i=0;i<4;i++){
				int x2=x+dx[i];
				int y2=y+dy[i];
			}
		}
		return false;
	}
}
