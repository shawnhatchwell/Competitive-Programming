import java.util.*;
import java.io.*;
public class cfr427c {

	public static void main(String[] args) throws IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk=new StringTokenizer(f.readLine());
		int n=Integer.parseInt(tk.nextToken());
		int q=Integer.parseInt(tk.nextToken());
		int c=Integer.parseInt(tk.nextToken());
		int stars[][]=new int[n][3];
		int views[][]=new int[q][5];
		for(int i=0;i<n;i++){
			tk=new StringTokenizer(f.readLine());
			for(int j=0;j<3;j++){
				stars[i][j]=Integer.parseInt(tk.nextToken());
			}	
		}
		for(int i=0;i<q;i++){
			tk=new StringTokenizer(f.readLine());
			for(int j=0;j<5;j++){
				views[i][j]=Integer.parseInt(tk.nextToken());
			}
		}
		for(int i=0;i<q;i++){
			int bri=0;
			for(int j=0;j<n;j++){
				if(stars[j][0]>=views[i][1]&&stars[j][1]>=views[i][2]&&stars[j][0]<=views[i][3]&&stars[j][1]<=views[i][4]){
					bri+=(stars[j][2]+views[i][0])%(c+1);
				}
				System.out.println(bri);
			}
		}
	}

}