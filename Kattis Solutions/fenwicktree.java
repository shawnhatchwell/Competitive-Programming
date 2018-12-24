import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class fenwicktree {
	
	public static void main(String[] args) throws IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(f.readLine());
		int n=Integer.parseInt(st.nextToken());
		int q=Integer.parseInt(st.nextToken());
		int a[]=new int[n];
		for(int i=0;i<q;i++){
			st=new StringTokenizer(f.readLine());
			if(st.nextToken().equals("+")){
				int id=Integer.parseInt(st.nextToken());
				int v=Integer.parseInt(st.nextToken());
				while(id<n+1){
					a[id]+=v;
					id+=(id&-id);
				}
			}
			else{
				int id=Integer.parseInt(st.nextToken());
				int count=0;
				if(id==0) count=a[0];
				else
					while(id>0){
						count+=a[id];
						id-=(id&-id);
					}
				System.out.println(count);
			}
		}
	}

}
