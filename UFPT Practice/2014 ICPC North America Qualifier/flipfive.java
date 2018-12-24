import java.util.*;
import java.io.*;
public class flipfive {

	public static void main(String[] args) throws IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk=new StringTokenizer(f.readLine());
		int p=Integer.parseInt(tk.nextToken());
		int a[]=new int[512];
		Arrays.fill(a,-1);
		ArrayDeque<Integer> ad=new ArrayDeque<Integer>();
		ad.add(0);
		a[0]=0;
		int xor[]={11,23,38,89,186,308,200,464,416};
		while(!ad.isEmpty()){
			int curr=ad.pollFirst();
			for(int i=0;i<9;i++){
				if(a[curr^xor[i]]==-1){
					a[curr^xor[i]]=a[curr]+1;
					ad.add(curr^xor[i]);
				}
			}
		}
		
		for(int kk=0;kk<p;kk++){
			String s="";
			for(int i=0;i<3;i++){
				s+=f.readLine();
			}
			int board=0;
			for(int i=0;i<9;i++){
				if(s.charAt(i)=='*'){
					board+=1<<i;
				}
			}
			System.out.println(a[board]);
		}
	}

}
