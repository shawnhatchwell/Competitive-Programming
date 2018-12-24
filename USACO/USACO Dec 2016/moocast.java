import java.util.*;
import java.io.*;

public class moocast {
	public moocast(int x,int y,int z)
	public static void main(String[] args) throws IOException{
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		//f = new BufferedReader(new FileReader("moocast.in"));
		//PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("moocast.out")));
		
		int n=Integer.parseInt(f.readLine().trim());
		int a[][]=new int[n][3];
		for(int i=0;i<n;i++){
			StringTokenizer st=new StringTokenizer(f.readLine().trim());
			a[i][0]=Integer.parseInt(st.nextToken());
			a[i][1]=Integer.parseInt(st.nextToken());
			a[i][2]=Integer.parseInt(st.nextToken());
		}
		ArrayDeque<>
		
		System.out.println();
		//out.println();
		//out.close();
	}
	
}
