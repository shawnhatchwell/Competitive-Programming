import java.util.*;
import java.io.*;
public class amtrak {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(f.readLine().trim());
		for(int i=0;i<n;i++){
			StringTokenizer tk=new StringTokenizer(f.readLine().trim());
			int a[]=new int[4];
			for(int j=0;j<4;j++){
				String s=tk.nextToken();
				//System.out.println(s);
				StringTokenizer tk2=new StringTokenizer(s,":");
				a[j]=Integer.parseInt(tk2.nextToken())*60+Integer.parseInt(tk2.nextToken());
			}
			//System.out.println(a[0]+" "+a[1]+" "+a[2]+" "+a[3]);
			int b=a[1]-a[0];
			int c=a[3]-a[2];
			if(b<0){
				b+=24*60;
			}
			if(c<0){
				c+=24*60;
			}
			if(b>c){
				System.out.println("Silver Star");
			}
			else if(c>b){
				System.out.println("Silver Meteor");
			}
			else{
				System.out.println("Cannot tell");
			}
		}

	}

}