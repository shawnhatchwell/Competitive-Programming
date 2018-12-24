import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class different {

	public static void main(String[] args) throws IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		while(true){
			StringTokenizer tk=new StringTokenizer(f.readLine().trim());
			long a=Long.parseLong(tk.nextToken());
			long b=Long.parseLong(tk.nextToken());
			if(a>b){
				System.out.println(a-b);
			}
			else{
				System.out.println(b-a);
			}
		}

	}

}
