import java.util.*;
import java.io.*;

public class beekeeper {
	
	public static void main(String[] args) throws IOException{
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		String key="aeiouy";
		
		int n=Integer.parseInt(f.readLine().trim());
		while(n!=0){
			String[] s=new String[n];
			for(int i=0;i<n;i++){
				s[i]=f.readLine().trim();
			}
			int max=0;
			int ind=0;
			for(int i=0;i<n;i++){
				int count=0;
				for(int j=0;j<s[i].length()-1;j++){
					if(key.contains(""+s[i].charAt(j))&&s[i].charAt(j)==s[i].charAt(j+1)){
						count++;
					}
				}
				if(count>max){
					max=count;
					ind=i;
				}
			}
			System.out.println(s[ind]);
			n=Integer.parseInt(f.readLine().trim());
		}
		
		System.out.println();
	}
	
}