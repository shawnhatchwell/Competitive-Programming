import java.util.*;
import java.io.*;
public class robotopia {

	public static void main(String[] args) throws IOException{
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(f.readLine());
		for(int kk=0;kk<n;kk++){
			StringTokenizer tk=new StringTokenizer(f.readLine());
			int l1=Integer.parseInt(tk.nextToken());
			int a1=Integer.parseInt(tk.nextToken());
			int l2=Integer.parseInt(tk.nextToken());
			int a2=Integer.parseInt(tk.nextToken());
			int lt=Integer.parseInt(tk.nextToken());
			int at=Integer.parseInt(tk.nextToken());
			int det=l1*a2-a1*l2;
			int n1=(lt*a2-at*l2);
			int n2=(l1*at-a1*lt);
			if(det==0||n1%det!=0||n2%det!=0||n1/det<=0||n2/det<=0){
				System.out.println("?");
			}
			else{
				System.out.println(n1/det+" "+n2/det);
			}
			
		}

	}

}
