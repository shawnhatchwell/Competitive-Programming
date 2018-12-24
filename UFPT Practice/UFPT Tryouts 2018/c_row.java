import java.io.*;
import java.util.*;
public class c_row {

	public static void main(String[] args) throws IOException{
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(f.readLine());
		String s=f.readLine();
		int count0=0;
		int count1=0;
		boolean b=true;
		for(int i=0;i<n;i++){
			if(s.charAt(i)=='0'){
				count0++;
				count1=0;
			}
			else{
				count1++;
				count0=0;
			}
			if(count1==2||count0==3||(i==1&&count0==2)||(i==n-1&&count0==2)){
				b=false;
				break;
			}
		}
		if(s.equals("0")){
			System.out.println("No");
		}
		else
		System.out.println(b?"Yes":"No");
		
	}

}
