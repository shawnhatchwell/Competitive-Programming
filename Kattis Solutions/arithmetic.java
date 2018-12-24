import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class arithmetic {
	
	public static void main(String[] args) throws IOException{
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		
		
		String s=f.readLine().trim();
		if(s=="0"){
			System.out.println("0");
		}
		else{
			String a="";
			while(s.length()>20){
				String p=s.substring(s.length()-20);
				s=s.substring(0,s.length()-20);
				Long d=Long.parseUnsignedLong(s, 8);
				String x=Long.toString(d, 16);
					while(x.length()<15){
						x="0"+x;
					}
				a=x+a;
			}
			Long d=Long.parseUnsignedLong(s, 8);
			a=Long.toString(d, 16)+a;
			System.out.println(a.toUpperCase());
		}
	}
	
}