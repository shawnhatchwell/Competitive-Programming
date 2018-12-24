import java.util.*;
import java.io.*;

public class square {
	
	public static void main(String[] args) throws IOException{
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		f = new BufferedReader(new FileReader("square.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("square.out")));
		StringTokenizer st=new StringTokenizer(f.readLine().trim());
		int x1=Integer.parseInt(st.nextToken());
		int y1=Integer.parseInt(st.nextToken());
		int x2=Integer.parseInt(st.nextToken());
		int y2=Integer.parseInt(st.nextToken());
		st=new StringTokenizer(f.readLine().trim());
		int x3=Integer.parseInt(st.nextToken());
		int y3=Integer.parseInt(st.nextToken());
		int x4=Integer.parseInt(st.nextToken());
		int y4=Integer.parseInt(st.nextToken());
		int xlen=Math.max(x2, x4)-Math.min(x1,x3);
		int ylen=Math.max(y2, y4)-Math.min(y1,y3);
		//System.out.println((int)Math.pow(Math.max(xlen, ylen), 2));
		out.println((int)Math.pow(Math.max(xlen, ylen), 2));
		out.close();
	}
	
}
