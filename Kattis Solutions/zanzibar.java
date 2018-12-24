import java.util.*;
import java.io.*;

public class zanzibar {
	
	public static void main(String[] args) throws IOException{
		BufferedReader ab=new BufferedReader(new InputStreamReader(System.in));
		String line=ab.readLine();
		int n=Integer.parseInt(line);
		for(int i=0; i<n; i++){
			line=ab.readLine();
			String[] a=line.split(" ");
			int sum=0;
			for(int x=0; x<a.length-2; x++){
				if(Integer.parseInt(a[x])*2<Integer.parseInt(a[x+1]))
					sum+=Integer.parseInt(a[x+1])-Integer.parseInt(a[x])*2;
			}
			System.out.println(sum);
		}
	}
	
}