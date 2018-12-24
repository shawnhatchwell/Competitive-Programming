import java.util.*;
import java.io.*;
public class u {

	public static void main(String[] args) throws IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk=new StringTokenizer(f.readLine());
		int h=Integer.parseInt(tk.nextToken());
		int w=Integer.parseInt(tk.nextToken());
		int bb=Integer.parseInt(tk.nextToken());
		int a[][]=new int[w][h];
		for(int i=0;i<w;i++){
			tk=new StringTokenizer(f.readLine());
			for(int j=0;j<h;j++){
				a[i][j]=Integer.parseInt(tk.nextToken());
			}
		}
		
		for(int kk=0;kk<bb;kk++){
			int b[][]=new int[w][h];
			for(int i=0;i<w;i++){
				for(int j=0;j<h;j++){
					b[i][j]=a[i][j];
					b[i][j]+=a[(i+w-1)%w][(j+h-1)%h];
					b[i][j]+=a[(i+w-1)%w][j];
					b[i][j]+=a[(i+w-1)%w][(j+h+1)%h];
					b[i][j]+=a[i][(j+h-1)%h];
					b[i][j]+=a[i][(j+h+1)%h];
					b[i][j]+=a[(i+w+1)%w][(j+h-1)%h];
					b[i][j]+=a[(i+w+1)%w][j];
					b[i][j]+=a[(i+w+1)%w][(j+h+1)%h];
				}
			}
			for(int i=0;i<w;i++){
				for(int j=0;j<h;j++){
					a[i][j]=b[i][j];
				}
			}
		}
		
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<w;i++){
			for(int j=0;j<h;j++){
				hs.add(a[i][j]);
			}
		}
		System.out.println(hs.size());
	}

}