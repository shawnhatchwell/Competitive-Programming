import java.io.*;
import java.util.*;
public class edu26b {

	public static void main(String[] args) throws IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk=new StringTokenizer(f.readLine());
		int n=Integer.parseInt(tk.nextToken());
		int m=Integer.parseInt(tk.nextToken());
		String a[]=new String[n];
		for(int i=0;i<n;i++){
			a[i]=f.readLine();
		}
		boolean b=false;
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		hm.put('R',0);
		hm.put('G',1);
		hm.put('B',2);
		
		//horizontal
		if(n%3==0){
			b=true;
			int h=n/3;
			boolean[] u=new boolean[3];
			for(int i=0;i<3;i++){
				char s=a[i*h].charAt(0);
				if(u[hm.get(s)]){
					i=3;
					b=false;
				}
				else{
					u[hm.get(s)]=true;
					for(int j=0;j<h;j++){
						for(int k=0;k<m;k++){
							if(a[i*h+j].charAt(k)!=s){
								b=false;
								k=m;
								j=h;
								i=3;
							}
						}
					}
				}
				
			}
			
		}
		
		//vertical
		if(!b&&m%3==0){
			b=true;
			int w=m/3;
			boolean[] u=new boolean[3];
			for(int i=0;i<3;i++){
				char s=a[0].charAt(i*w);
				if(u[hm.get(s)]){
					i=3;
					b=false;
				}
				else{
					u[hm.get(s)]=true;
					for(int j=0;j<w;j++){
						if(a[0].charAt(i*w+j)!=s){
							b=false;
							j=w;
							i=3;					
						}
					}
						
				}	
			}
			if(b){
				String st=a[0];
				for(int i=1;i<a.length;i++){
					if(!a[i].equals(st)){
						b=false;
						i=a.length;
					}
				}
			}
		}
		System.out.println(b?"YES":"NO");
	}

}
