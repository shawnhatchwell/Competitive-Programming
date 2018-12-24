import java.util.*;
import java.io.*;

public class blocks {
	
	public static void main(String[] args) throws IOException{
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		f = new BufferedReader(new FileReader("blocks.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("blocks.out")));
		int n=Integer.parseInt(f.readLine().trim());
		String s="";
		int[] a=new int[26]; 
		for(int i=0;i<n;i++){
			StringTokenizer st=new StringTokenizer(f.readLine().trim());
			String p=st.nextToken();
			String q=st.nextToken();
			
			
			int[] pa=new int[26]; 
			for(char c:p.toCharArray()){
				pa[(""+c).compareTo("a")]=pa[(""+c).compareTo("a")]+1;
			}
			
			
			int[] qa=new int[26]; 
			for(char c:q.toCharArray()){
				qa[(""+c).compareTo("a")]++;
			}

			for(int j=0;j<26;j++){
				a[j]+=Math.max(pa[j], qa[j]);
			}
		}
		for(int x:a){
			//System.out.println(x);
			out.println(x);
		}
		
		out.close();
	}
	
}
