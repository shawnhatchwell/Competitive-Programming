import java.util.*;
import java.io.*;

public class kornislav {
	
	public static void main(String[] args) throws IOException{
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		
		
		String[] n=f.readLine().trim().split(" ");
		ArrayList<Integer> a=new ArrayList<Integer>();
		for(int i=0;i<4;i++)
			a.add(Integer.parseInt(n[i]));
		Collections.sort(a);
		
		
		System.out.println(a.get(0)*a.get(2));
	}
	
}