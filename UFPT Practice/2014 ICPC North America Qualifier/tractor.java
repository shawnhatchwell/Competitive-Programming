import java.util.*;
import java.io.*;
public class tractor {

	public static void main(String[] args) throws IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		for(int i=0;i<16;i++){
			for(int j=0;j<16;j++){
				int count=0;
				for(int a=0;a<=i;a++){
					for(int b=0;b<=j;b++){
						if((b&a)==0&&Integer.bitCount((b|a)+1)==1){
							count++;
						}
					}
				}
				System.out.print(count+"\t");
			}
			System.out.println();
		}
		int count=0;
		for(int a=0;a<=16;a++){
			for(int b=0;b<=16;b++){
				if((b&a)==0&&Integer.bitCount((b|a)+1)==1){
					System.out.print("1");
					count++;
				}
				else{
					System.out.print("0");
				}
			}
			System.out.println();
		}
		System.out.println(count);
		
		int n=Integer.parseInt(f.readLine());
		for(int i=0;i<n;i++){
			StringTokenizer tk=new StringTokenizer(f.readLine());
			int a=Integer.parseInt(tk.nextToken());
			int b=Integer.parseInt(tk.nextToken());
			System.out.println(a+b+1);
		}
		
	}

}
