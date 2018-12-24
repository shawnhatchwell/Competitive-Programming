import java.util.*;
import java.io.*;
public class cfr427b {

	public static void main(String[] args) throws IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		int k=Integer.parseInt(f.readLine());
		char[] n=f.readLine().toCharArray();
		int sum=0;
		for(char c:n){
			sum+=Integer.parseInt(""+c);
		}
		Arrays.sort(n);
		int ind=0;
		while(sum<k){
			sum+=9-Integer.parseInt(""+n[ind]);
			ind++;
		}
		System.out.println(ind);

	}

}