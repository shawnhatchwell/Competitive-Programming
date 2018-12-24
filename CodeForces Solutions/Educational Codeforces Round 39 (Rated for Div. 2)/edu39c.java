import java.util.*;
import java.io.*;
public class edu39c {

	public static void main(String[] args) throws IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		String s=f.readLine();
		String a="abcdefghijklmnopqrstuvwxyz";
		int ind=0;
		for(int i=0;i<s.length();i++){
			if(ind<26&&s.charAt(i)<a.charAt(ind)){
				s=s.substring(0,i)+a.charAt(ind)+s.substring(i+1);
			}
			if(ind<26&&s.charAt(i)==a.charAt(ind)){
				ind++;
			}
		}
		if(ind==26){
			System.out.println(s);
		}
		else{
			System.out.println(-1);
		}

	}

}
