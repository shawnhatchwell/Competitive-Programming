import java.util.*;
import java.io.*;
public class trirail {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(f.readLine().trim());
		for(int i=0;i<n;i++){
			int a=Integer.parseInt(f.readLine().trim());
			if(a<5){
				System.out.println(a);
			}
			else if(a<16){
				System.out.println(a+10);
			}
			else{
				System.out.println(a+20);
			}
		}

	}

}
