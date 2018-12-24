import java.util.*;
import java.io.*;
public class integerlists {

	public static void main(String[] args) throws IOException {
		BufferedReader f= new BufferedReader(new InputStreamReader(System.in));
		int x=Integer.parseInt(f.readLine());
		for(int kk=0;kk<x;kk++){
			String p=f.readLine();
			int n=Integer.parseInt(f.readLine());
			String s=f.readLine();
			StringTokenizer tk=new StringTokenizer(s.substring(1,s.length()-1),",");
			ArrayDeque<Integer> a=new ArrayDeque<Integer>();
			for(int i=0;i<n;i++){
				a.add(Integer.parseInt(tk.nextToken()));
			}
			boolean rev=false;
			boolean err=false;
			for(int i=0;i<p.length();i++){
				if(p.charAt(i)=='R'){
					rev=!rev;
				}
				else{
					if(a.isEmpty()){
						i=p.length();
						err=true;
					}
					else if(!rev){
						a.pollFirst();
					}
					else{
						a.pollLast();
					}
				}
			}
			if(rev){
				ArrayDeque<Integer> b=new ArrayDeque<Integer>();
				while(!a.isEmpty()){
					b.add(a.pollLast());
				}
				a=b;
			}
			System.out.println(err?"error":a);
			
		}

	}

}
