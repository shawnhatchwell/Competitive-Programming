import java.util.*;
import java.io.*;
public class treat {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int cases=Integer.parseInt(bf.readLine());
		for(int kk=0;kk<cases;kk++){
			StringTokenizer st=new StringTokenizer(bf.readLine());
			int m=Integer.parseInt(st.nextToken());
			int n=Integer.parseInt(st.nextToken());
			int a[]=new int[m];
			st=new StringTokenizer(bf.readLine());
			for(int i=0;i<m;i++){
				a[i]=Integer.parseInt(st.nextToken());
			}
			int max=0;
			for(int i=0;i<m-n+1;i++){
				int sum=0;
				for(int j=0;j<n;j++){
					sum+=a[j+i];
				}
				max=Math.max(max, sum);
			}
			System.out.println(max);
		}

	}

}
