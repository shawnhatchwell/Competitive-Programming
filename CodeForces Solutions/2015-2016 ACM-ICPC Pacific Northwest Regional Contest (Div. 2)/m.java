import java.util.*;
import java.io.*;
public class m {

	public static void main(String[] args) throws IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(f.readLine());
		int a[]=new int[100];
		boolean b[]=new boolean[100];
		for(int i=0;i<100;i++){
			a[i]=i+1;
		}
		String s[]={"ADD","SUBTRACT","MULTIPLY","DIVIDE"};
		for(int i=0;i<n;i++){
			StringTokenizer tk=new StringTokenizer(f.readLine());
			String q=tk.nextToken();
			int p=Integer.parseInt(tk.nextToken());
			if(q.equals(s[0])){
				for(int j=0;j<100;j++){
					a[j]+=p;
				}
			}
			else if(q.equals(s[1])){
				for(int j=0;j<100;j++){
					a[j]-=p;
					if(a[j]<0){
						b[j]=true;
					}
				}
			}
			else if(q.equals(s[2])){
				for(int j=0;j<100;j++){
					a[j]*=p;
				}
			}
			else{
				for(int j=0;j<100;j++){
					if(a[j]>0&&a[j]%p!=0){
						b[j]=true;
					}
					a[j]/=p;
				}
			}
		}
		int c=0;
		for(int i=0;i<100;i++){
			if(b[i]){
				c++;
			}
		}
		System.out.println(c);
		
	}

}