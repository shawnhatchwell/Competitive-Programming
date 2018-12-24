import java.util.*;
import java.io.*;
public class addingwords {

	public static void main(String[] args) throws IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		while(true){
			String s=f.readLine().trim();
			if(s.charAt(0)=='d'){
				String a=s.substring(s.indexOf(" ")+1, s.lastIndexOf(" "));
				int b=Integer.parseInt(s.substring(s.lastIndexOf(" ")+1));
				hm.put(a, b);
			}
			else if(s.charAt(1)=='a'){
				String o=s.substring(s.indexOf(" ")+1)+" ";
				StringTokenizer tk=new StringTokenizer(o);
				String a=tk.nextToken();
				if(!hm.containsKey(a)){
					System.out.println(o+"unknown");
				}
				else{
					int sum=hm.get(a);
					w:
					while(tk.hasMoreTokens()){
						a=tk.nextToken();
						if(a.equals("+")){
							a=tk.nextToken();
							if(!hm.containsKey(a)){
								System.out.println(o+"unknown");
								break w;
							}
							sum+=hm.get(a);
						}
						else if(a.equals("-")){
							a=tk.nextToken();
							if(!hm.containsKey(a)){
								System.out.println(o+"unknown");
								break w;
							}
							sum-=hm.get(a);
						}
						else{
							if(!hm.containsValue(sum)){
								System.out.println(o+"unknown");
								break w;
							}
							else{
								for(String r:hm.keySet()){
									if(sum==hm.get(r)){
										System.out.println(o+r);
										break w;
									}
								}
							}
						}
					}
				}
			}
			else{
				hm=new HashMap<String,Integer>();
			}
		}

	}

}
