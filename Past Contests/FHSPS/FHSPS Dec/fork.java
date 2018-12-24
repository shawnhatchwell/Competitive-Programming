import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fork {
	public static void main(String[] args) throws IOException{
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		
		
		int n=Integer.parseInt(f.readLine().trim());
		for(int i=0;i<n;i++){
			int x=Integer.parseInt(f.readLine().trim());
			System.out.println(((int)(Math.pow(2, ((x-1)/5)))));
		}
		
	}
}
