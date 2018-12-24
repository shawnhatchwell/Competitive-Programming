import java.util.*;
import java.io.*;
public class p {

	public static void main(String[] args) throws IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		String s=f.readLine();
		TreeMap<Character,Integer> tm=new TreeMap<Character,Integer>();
		for(int i=0;i<s.length();i++){
			if(!tm.containsKey(s.charAt(i))){
				tm.put(s.charAt(i), 1);
			}
			else{
				tm.put(s.charAt(i), tm.get(s.charAt(i))+1);
			}
		}
		int count=0;
		while(tm.size()>2){
			char ch='*';
			int num=Integer.MAX_VALUE;
			for(char c:tm.keySet()){
				if(tm.get(c)<num){
					num=tm.get(c);
					ch=c;
				}
			}
			count+=num;
			tm.remove(ch);			
		}
		System.out.println(count);
	}

}