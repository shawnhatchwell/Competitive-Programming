import java.util.*;
import java.io.*;
class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(f.readLine());
		for(int i=0;i<n;i++){
			String old=f.readLine();
			old=old.substring(1, old.length()-1);
			String next=f.readLine();
			next=next.substring(1, next.length()-1);
			HashMap<String,String> otm=new HashMap<String,String>();
			HashMap<String,String> ntm=new HashMap<String,String>();
			StringTokenizer tk=new StringTokenizer(old,",");
			while(tk.hasMoreTokens()){
				StringTokenizer tk2=new StringTokenizer(tk.nextToken(),":");
				String term=tk2.nextToken();
				//System.out.println(term);
				otm.put(term,tk2.nextToken());
			}
			tk=new StringTokenizer(next,",");
			while(tk.hasMoreTokens()){
				StringTokenizer tk2=new StringTokenizer(tk.nextToken(),":");
				String term=tk2.nextToken();
				ntm.put(term,tk2.nextToken());
			}
			PriorityQueue<String> plus=new PriorityQueue<String>();
			PriorityQueue<String> min=new PriorityQueue<String>();
			PriorityQueue<String> star=new PriorityQueue<String>();
			for(String a:otm.keySet()){
				if(!ntm.containsKey(a)){
					min.add(a);
				}
				else if(!ntm.get(a).equals(otm.get(a))){
					star.add(a);
					
				}
				ntm.remove(a);
			}
			for(String a:ntm.keySet()){
				plus.add(a);
			}
			if(plus.isEmpty()&&min.isEmpty()&&star.isEmpty()){
				System.out.println("No changes\n");
			}
			else{
				if(!plus.isEmpty()){
					String s="+";
					while(!plus.isEmpty()){
						s+=plus.poll()+",";
					}
					System.out.println(s.substring(0, s.length()-1));
				}
				if(!min.isEmpty()){
					String s="-";
					while(!min.isEmpty()){
						s+=min.poll()+",";
					}
					System.out.println(s.substring(0, s.length()-1));
				}
				if(!star.isEmpty()){
					String s="*";
					while(!star.isEmpty()){
						s+=star.poll()+",";
					}
					System.out.println(s.substring(0, s.length()-1));
				}
				System.out.println();
			}
			
		}
		

	}

}
