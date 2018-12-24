import java.util.*;
import java.io.*;
public class cfr426c {

	public static void main(String[] args) throws NumberFormatException, IOException {
		boolean[] ps=new boolean[(int) Math.sqrt(1000000000)+1];
		Arrays.fill(ps, true);
		ps[0]=false;
		ps[1]=false;
		for(int i=2;i<ps.length;i++){
			if(ps[i]){
				for(int j=i*2;j<ps.length;j+=i){
					ps[j]=false;
				}
			}
		}
		
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(f.readLine());
		for(int kk=0;kk<n;kk++){
			StringTokenizer tk=new StringTokenizer(f.readLine().trim());
			int a=Integer.parseInt(tk.nextToken());
			int b=Integer.parseInt(tk.nextToken());
			HashMap<Integer,Integer> hma=new HashMap<Integer,Integer>();
			HashMap<Integer,Integer> hmb=new HashMap<Integer,Integer>();
			boolean b1=true;
			for(int i=2;i<Math.min(a, b);i++){
				if(ps[i]){
					if(a%i==0^b%i==0){
						b1=false;
						a=1;
					}
					else if(a%i==0&&b%i==0){
						hma.put(i,0);
						hmb.put(i,0);
						while(a%i==0){
							a/=i;
							hma.put(i, hma.get(i)+1);
						}
						while(b%i==0){
							b/=i;
							hmb.put(i, hmb.get(i)+1);
						}
					}
				}
			}
			if(!b1){
				System.out.println("No");
			}
			else{
				for(int x:hma.keySet()){
					int big=Math.max(hma.get(x), hmb.get(x));
					int sml=Math.min(hma.get(x), hmb.get(x));
					int df=big-sml;
					big-=2*df;
					sml-=df;
					if(big%3!=0||sml%3!=0||big<0||sml<0){
						b1=false;
					}
				}
				System.out.println(b1?"Yes":"No");
			}
			
		}

	}

}
