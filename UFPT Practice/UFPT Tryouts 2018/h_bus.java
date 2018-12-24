import java.io.*;
import java.util.*;
public class h_bus {

	public static void main(String[] args) throws IOException{
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(f.readLine());
		boolean b=false;
		String[] a=new String[n];
		for(int i=0;i<n;i++){
			String s=f.readLine();
			if(!b&&s.contains("OO")){
				b=true;
				if(s.indexOf("OO")==0){
					s="++"+s.substring(2);
				}
				else{
					s=s.substring(0,3)+"++";
				}
			}
			a[i]=s;
		}
		System.out.println(b?"YES":"NO");
		if(b)
		for(String s:a){
			System.out.println(s);
		}

	}

}
