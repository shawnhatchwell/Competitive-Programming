import java.util.*;
import java.io.*;
public class a {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int t=kb.nextInt();
		for(int kk=0;kk<t;kk++){
			int n=kb.nextInt();
			int m=kb.nextInt();
			int k=kb.nextInt();
			int w=kb.nextInt();
			int hc[]=new int [n+1];
			for(int i=0;i<n;i++){
				hc[i+1]=kb.nextInt();
			}
			int bc[]=new int [m+1];
			for(int i=0;i<m;i++){
				bc[i+1]=kb.nextInt();
			}
			int dph[][]=new int[n+1][w];
			for(int i=1;i<n+1;i++){
				if(hc[i]<dph[0].length){
					dph[i][hc[i]]+=1;
				}
				for(int j=1;j<dph[0].length;j++){
					if(dph[i-1][j]>0&&j+hc[i]<dph[0].length){
						dph[i][j+hc[i]]=dph[i-1][j]+1;
					}
					
				}
			}
			int dpb[][]=new int[m+1][w];
			for(int i=1;i<m+1;i++){
				if(bc[i]<dpb[0].length){
					dpb[i][bc[i]]+=1;
				}
				for(int j=1;j<dpb[0].length;j++){
					if(dpb[i-1][j]>0&&j+bc[i]<dpb[0].length){
						dpb[i][j+bc[i]]=dpb[i-1][j]+1;
					}
					
				}
			}
			for(int i=0;i<dph.length;i++){
				for(int j=0;j<dph.length;j++){
					System.out.print(dph[i][j]);
				}
				System.out.println();
			}
			for(int i=0;i<dpb.length;i++){
				for(int j=0;j<dpb.length;j++){
					System.out.print(dpb[i][j]);
				}
				System.out.println();
			}
			
			int count=0;
			for(int i=(int)(w/2.0+k/2.0);i>w-(int)(w/2.0+k/2.0);i--){
				if(Math.abs(i-(w-i))<=k){
					count+=dph[dph.length-1][i]*dpb[dpb.length-1][w-i];
				}
			}
			
			
			System.out.println(count);
		}
	}

}
