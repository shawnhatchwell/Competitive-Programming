import java.util.*;
import java.io.*;
public class cd {

	public static void main(String[] args) throws IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		String s=f.readLine();
		while(!s.equals("0 0")){
			StringTokenizer tk=new StringTokenizer(s);
			int n=Integer.parseInt(tk.nextToken());
			int m=Integer.parseInt(tk.nextToken());
			HashSet<String> hm=new HashSet<String>();
			int count=0;
			for(int i=0;i<n;i++){
				hm.add(f.readLine());
			}
			for(int i=0;i<m;i++){
				if(hm.contains(f.readLine())){
					count++;
				}
			}
			System.out.println(count);
			s=f.readLine();
		}
	}

}
