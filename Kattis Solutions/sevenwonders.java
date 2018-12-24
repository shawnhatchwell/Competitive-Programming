import java.util.*;
import java.io.*;
public class sevenwonders {

	public static void main(String[] args) throws IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		String s=f.readLine().trim();
		int t=0;
		int c=0;
		int g=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='T'){
				t++;
			}
			else if(s.charAt(i)=='C'){
				c++;
			}
			else{
				g++;
			}
		}
		System.out.println(t*t+g*g+c*c+7*Math.min(t,Math.min(c, g)));

	}

}
