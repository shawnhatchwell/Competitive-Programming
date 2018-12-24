import java.util.*;
import java.io.*;
public class cfr426a {

	public static void main(String[] args) throws IOException {
		char[] cw={'<','^','>','v'};
		HashMap<Character,Integer> cw2=new HashMap<Character,Integer>();
		char[] ccw={'<','v','>','^'};
		HashMap<Character,Integer> ccw2=new HashMap<Character,Integer>();
		for(int i=0;i<4;i++){
			cw2.put(cw[i],i);
			ccw2.put(ccw[i],i);
		}
		
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk=new StringTokenizer(f.readLine().trim());
		char s=tk.nextToken().charAt(0);
		char e=tk.nextToken().charAt(0);
		int n=Integer.parseInt(f.readLine())%4;
		if(n%2==0){
			System.out.println("undefined");
		}
		else{
			if(cw[(cw2.get(s)+n)%4]==e){
				System.out.println("cw");
			}
			else{
				System.out.println("ccw");
			}
		}
		
	}

}
