import java.util.*;
import java.io.*;
public class painter implements Comparable{
	public int r1; public int c1;public int r2;public int c2;public String c;public int o;
	public painter(int a,int b,int d, int e, String f, int g) {
		r1=a;
		c1=b;
		r2=d;
		c2=e;
		c=f;
		o=g;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int cases=Integer.parseInt(bf.readLine());
		for(int kk=0;kk<cases;kk++){
			StringTokenizer st=new StringTokenizer(bf.readLine());
			int n=Integer.parseInt(st.nextToken());
			int m=Integer.parseInt(st.nextToken());
			int s=Integer.parseInt(st.nextToken());
			String[][] a=new String[n][m];
			painter p[]=new painter[s];
			
			for(int i=0;i<s;i++){
				st=new StringTokenizer(bf.readLine());
				p[i]=new painter(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()), st.nextToken(),Integer.parseInt(st.nextToken()));
			}
			Arrays.sort(p);
			for(int i=0;i<n;i++){
				for(int j=0;j<m;j++){
					
					int index=-1;
					for(int k=0;k<s;k++){
						if(i>=p[k].r1&&i<=p[k].r2&&j>=p[k].c1&&j<=p[k].c2){
							index=k;
							k=s;
						}
					}
					if(index==-1) System.out.print("#");
					else System.out.print(p[index].c);
				}
				System.out.println();
			}
		}
	}

	@Override
	public int compareTo(Object a) {
		if(o>((painter)a).o){
			return 1;
		}
		if(o<((painter)a).o){
			return -1;
		}
		return 0;
	}

}
