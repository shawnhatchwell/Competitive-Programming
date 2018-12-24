import java.util.*;
import java.io.*;

public class cowsignal {
	
	public static void main(String[] args) throws IOException{
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		f = new BufferedReader(new FileReader("cowsignal.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("cowsignal.out")));
		
		StringTokenizer st=new StringTokenizer(f.readLine().trim());
		int r=Integer.parseInt(st.nextToken());
		int c=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());
		for(int i=0;i<r;i++){
			String s=f.readLine().trim();
			for(int j=0;j<k;j++){
				for(int m=0;m<c;m++){
					for(int n=0;n<k;n++){
						out.print(s.charAt(m));
					}
				}
				out.println();
			}
		}
		out.close();
	}
	
}
