import java.util.*;
import java.io.*;
public class b {

	public static void main(String[] args) throws IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(f.readLine());
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		String a[]=new String[n];
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		for(int i=0;i<n;i++){
			st=new StringTokenizer(f.readLine());
			
			hm.put(i,st.nextToken());
			a[i]=st.nextToken();
		}
		for(int i=0;i<m;i++){
			String s=f.readLine();
			st=new StringTokenizer(s.substring(0, s.length()-1));
			st.nextToken();
			System.out.println(s+" #"+hm.get(posOf(a,st.nextToken())));
			
		}

	}

	private static int posOf(String a[],String nextToken) {
		int n=0;
		for(int i=0;i<a.length;i++){
			if(a[i].equals(nextToken)){
				n=i;
				i=a.length;
			}
				
		}
		return n;
	}

}
