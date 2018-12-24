import java.util.*;
import java.io.*;
public class discount {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int cases=Integer.parseInt(bf.readLine());
		for(int kk=0;kk<cases;kk++){
			StringTokenizer st=new StringTokenizer(bf.readLine());
			int n=Integer.parseInt(st.nextToken());
			int x=Integer.parseInt(st.nextToken());
			double tot=0;
			for(int i=0;i<n;i++){
				st=new StringTokenizer(bf.readLine());
				int a=Integer.parseInt(st.nextToken());
				String s=st.nextToken();
				double b=Double.parseDouble(st.nextToken());
				tot+=a*b;
			}
			System.out.println((tot*(100-x))/100);

		}
	}

}
