import java.util.*;
import java.io.*;

public class fhsps {
	
	public static void main(String[] args) throws IOException{
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		
		
		int n=Integer.parseInt(f.readLine().trim());
		
		for(int i=0;i<n;i++){
			StringTokenizer t1=new StringTokenizer(f.readLine().trim());
			StringTokenizer t2=new StringTokenizer(f.readLine().trim());
			int n2=Integer.parseInt(t1.nextToken());
			int m=Integer.parseInt(t1.nextToken());
			ArrayDeque<Integer> pq=new ArrayDeque<Integer>();
			for(int j=0;j<n2;j++){
				pq.add(Integer.parseInt(t2.nextToken()));
			}
		}
		System.out.println();
	}
	int c=4;
	for(int i=0;i<c;i++)
		c++;
	
}