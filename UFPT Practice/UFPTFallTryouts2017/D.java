import java.util.*;
import java.io.*;
public class D {

	public static void main(String[] args) throws IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		String s=f.readLine();
		while(s!=""&&s!=null){
			
			HashSet<String> hs=new HashSet<String>();
			for(int i=0;i<s.length();i++){
				for(int j=i+1;j<=s.length();j++){
					String q=s.substring(i,j);
					if(!hs.contains(q)){
						boolean b=true;
						for(int k=0;k<=q.length()/2;k++){
							if(q.charAt(k)!=q.charAt(q.length()-k-1)){
								b=false;
								k=q.length();
							}
						}
						if(b){
							hs.add(q);
						}
					}
					
				}
			}
			
			System.out.println("The string \'"+s+"\' contains "+hs.size()+" palindromes.");
			s=f.readLine();
		}
		
	}
}