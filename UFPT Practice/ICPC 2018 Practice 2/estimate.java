import java.util.*;
import java.io.*;
public class estimate {

	public static void main(String[] args) throws IOException{
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(f.readLine());
		for(int i=0;i<n;i++){
			System.out.println(f.readLine().length());
		}

	}

}
