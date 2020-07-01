import java.util.*;
import java.io.*;
public class c {
	public static void main(String args[]) throws IOException{
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		String s=f.readLine();
		int count=0;
		for(int i=0;i<s.length();i++){
			//dont want to start at ) or will go negative
			while(i<s.length()&&s.charAt(i)==')') i++;
			int layer=0;
			int numPos=1;
			for(int j=i+1;j<=s.length();j++){
				//want to make sure wont go negative on starting ?
				if(j==i+1&&s.charAt(j-1)=='?'){
					layer=1;
				}
				else{
					if(s.charAt(j-1)=='(')
						layer++;
					else if(s.charAt(j-1)==')')
						layer--;
					else{
						layer--;
						numPos++;
					}
					if(layer==0){
						count++;
						//System.out.println(i+" "+j);
					}
					if(layer==-1){
						layer+=2;
						numPos-=1;
					}
					//0 pos means stop
					if(numPos==0){
						j=s.length()+1;
					}
				}
			}
		}
		System.out.println(count);
		
		
	}
}
