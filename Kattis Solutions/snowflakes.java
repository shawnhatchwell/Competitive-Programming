import java.util.*;
import java.io.*;
public class snowflakes {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		int m=Integer.parseInt(f.readLine());
		for(int i=0;i<m;i++){
			int n=Integer.parseInt(f.readLine());
			int max=0;
			HashSet<Integer>hs=new HashSet<Integer>();
			for(int j=0;j<n;j++){
				int a=Integer.parseInt(f.readLine());
				if(!hs.contains(a)){
					hs.add(a);
				}
				else{
					if(max<hs.size()){
						max=hs.size();
					}
					hs=new HashSet<Integer>();
					hs.add(a);
				}
			}
			if(max<hs.size()){
				max=hs.size();
			}
			System.out.println(max);
		}
	}

}
