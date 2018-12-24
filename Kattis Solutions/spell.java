import java.util.*;
import java.io.*;

public class spell {
	
	public static void main(String[] args) throws IOException{
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("a","2");
		hm.put("b","22");
		hm.put("c","222");
		hm.put("d","3");
		hm.put("e","33");
		hm.put("f","333");
		hm.put("g","4");
		hm.put("h","44");
		hm.put("i","444");
		hm.put("j","5");
		hm.put("k","55");
		hm.put("l","555");
		hm.put("m","6");
		hm.put("n","66");
		hm.put("o","666");
		hm.put("p","7");
		hm.put("q","77");
		hm.put("r","777");
		hm.put("s","7777");
		hm.put("t","8");
		hm.put("u","88");
		hm.put("v","888");
		hm.put("w","9");
		hm.put("x","99");
		hm.put("y","999");
		hm.put("z","9999");
		hm.put(" ","0");
		int n=Integer.parseInt(f.readLine().trim());
		for(int i=0;i<n;i++){
			String s="Case #"+(i+1)+": ";
			String t=f.readLine();
			for(int j=0;j<t.length();j++){
				String c=t.substring(j,j+1);
				if(hm.get(c).substring(0,1).equals(s.substring(s.length()-1))){
					s+=" ";
				}
				s+=hm.get(c);
			}
			System.out.println(s);
		}
	}
	
}