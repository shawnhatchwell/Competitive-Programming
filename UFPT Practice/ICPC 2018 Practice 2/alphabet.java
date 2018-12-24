import java.util.*;
import java.io.*;
public class alphabet {
	public static void main(String args[]) throws IOException{
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		String s=f.readLine().toLowerCase();
		String out="";
		HashMap<Character,String> map=new HashMap<Character,String>();
		map.put('a',"@");
		map.put('b',"8");
		map.put('c',"(");
		map.put('d',"|)");
		map.put('e',"3");
		map.put('f',"#");
		map.put('g',"6");
		map.put('h',"[-]");
		map.put('i',"|");
		map.put('j',"_|");
		map.put('k',"|<");
		map.put('l',"1");
		map.put('m',"[]\\/[]");
		map.put('n',"[]\\[]");
		map.put('o',"0");
		map.put('p',"|D");
		map.put('q',"(,)");
		map.put('r',"|Z");
		map.put('s',"$");
		map.put('t',"\'][\'");
		map.put('u',"|_|");
		map.put('v',"\\/");
		map.put('w',"\\/\\/");
		map.put('x',"}{");
		map.put('y',"`/");
		map.put('z',"2");
		for(char i:s.toCharArray()){
			if(map.containsKey(i)){
				out+=map.get(i);
			}
			else{
				out+=i;
			}
		}
		System.out.println(out);
	}
}
