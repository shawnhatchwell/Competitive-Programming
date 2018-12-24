import java.util.*;
import java.io.*;
public class f {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(f.readLine());
		
		for(int kk=0;kk<n;kk++){
			String s=f.readLine();
			
			TreeSet<Character> ts=new TreeSet<Character>();
			HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
			
			for(int i=0;i<s.length();i++){
				if(!hm.containsKey(s.charAt(i))){
					ts.add(s.charAt(i));
					hm.put(s.charAt(i),hm.size());
				}
			}
			int x=ts.size();
			char a='#';
			char b='#';
			for(int i=0;i<x;i++){
				char c=ts.first();
				if(hm.get(c)!=i){
					a=c;
					for(char st:ts){
						if(hm.get(st)==i){
							b=st;
						}
					}
					i=x;
				}
			}
			if(b!='#'){
				for(int i=0;i<s.length();i++){
					if(s.charAt(i)==a){
						s=s.substring(0, i)+b+s.substring(i+1);
					}
					else if(s.charAt(i)==b){
						s=s.substring(0, i)+a+s.substring(i+1);
					}
				}
			}
			
			System.out.println(s);
		}

	}

}
