import java.util.*;
import java.io.*;
public class cfr426b {

	public static void main(String[] args) throws IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk=new StringTokenizer(f.readLine().trim());
		int n=Integer.parseInt(tk.nextToken());
		int k=Integer.parseInt(tk.nextToken());
		String s=f.readLine();
	
		int st[]=new int[26];
		Arrays.fill(st, Integer.MAX_VALUE);
		int en[]=new int[26];
		Arrays.fill(en, -1);
		for(int j=0;j<n;j++){
			st[(int)s.charAt(j)-65]=Math.min(j,st[(int)s.charAt(j)-65]);
			en[(int)s.charAt(j)-65]=Math.max(j,en[(int)s.charAt(j)-65]);
		}
		for(int j=0;j<n;j++){
			if(j>st[(int)s.charAt(j)-65]&&j<en[(int)s.charAt(j)-65]){
				s=s.substring(0,j)+"*"+s.substring(j+1);
			}
		}
		System.out.println(s);
		HashSet<Character> hm=new HashSet<Character>();
		int max=0;
		for(int i=0;i<n;i++){
			if(s.charAt(i)!='*'){
				if(!hm.contains(s.charAt(i))){
					hm.add(s.charAt(i));
				}
				else{
					hm.remove(s.charAt(i));
				}
			}
			max=Math.max(hm.size(), max);
		}
		System.out.println(max);
		System.out.println(k);
		System.out.println(max>k?"NO":"YES");
	}

}
