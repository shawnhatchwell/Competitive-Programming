import java.util.*;
import java.io.*;



public class safe {
	public int a[][];
	public int r;
	public static int[][] n;
	public safe(int[][] a,int r){
		this.a=a;
		this.r=r;
	}
	public String string(){
		String s="";
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				s+=""+a[i][j];
			}
		}
		return s;
	}
	public static void main(String[] args) throws IOException {
		Scanner kb=new Scanner(System.in);
		n=new int[3][3];
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				n[i][j]=kb.nextInt();
		ArrayDeque<safe> d=new ArrayDeque<safe>();
		HashSet<String> hs=new HashSet<String>();
		d.add(new safe(n,0));
		hs.add((new safe(n,0).string()));
		boolean solved=false;
		outer:
		while(!d.isEmpty()){
			safe s=d.poll();
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					int[][] b=new int[3][3];
					for(int k=0;k<3;k++){
						for(int m=0;m<3;m++){
							b[m][k]=s.a[m][k];
						}
					}
					solved=true;
					for(int k=0;k<3;k++){
						for(int m=0;m<3;m++){
							if(k==i||m==j){
								b[k][m]=(b[k][m]+1)%4;
							}
							if(b[k][m]!=0){
								solved=false;
							}
						}
					}
					if(!hs.contains(new safe(b,s.r+1).string())){
						//System.out.println(new safe(b,s.r+1).string());
						d.add(new safe(b,s.r+1));
						hs.add((new safe(b,s.r+1)).string());
					}
					if(solved){
						System.out.println(s.r+1);
						break outer;
					}
					else if(d.isEmpty()){
						System.out.println("-1");
						break outer;
					}
					
					
				}
			}
		}
	}

}
