import java.util.*;
import java.io.*;
public class cfr425b {

	public static void main(String[] args) throws IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		String ch=f.readLine();
		String s=f.readLine();
		int n=Integer.parseInt(f.readLine());
		for(int i=0;i<n;i++){
			String q=f.readLine();
			if(q.length()>s.length()){
				System.out.println("NO");
			}
			else{
				boolean b=true;
				for(int j=0;j<s.length();j++){
					if(s.charAt(j)!='*'){
						if(j>=q.length()){
							b=false;
						}
						else if(s.charAt(j)=='?'&&!ch.contains(""+q.charAt(j))){
							b=false;
						}
						else if(s.charAt(j)!='?'&&s.charAt(j)!=q.charAt(j)){
							b=false;
						}
					}
				}
				System.out.println(b?"YES":"NO");
			}
			
		}
	}

}