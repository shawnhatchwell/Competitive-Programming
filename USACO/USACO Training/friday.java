import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
ID: shawn.h1
LANG: JAVA
PROB: friday
*/
public class friday {
	public static void main(String args[])throws IOException{
		
		BufferedReader f = new BufferedReader(new FileReader("friday.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("friday.out")));
		int n=Integer.parseInt(f.readLine());
		int[] w = {0, 0, 0, 0, 0, 0, 0};
		int[] nw = {2, 1, 1, 3, 1, 2, 2};
		int[] lw = {3, 1, 1, 2, 2, 1, 2};
		int ix = 0;
		for(int x=0; x<n; x++){
			if ((x%4 == 0 && x%100 != 0)||(x+1900)%400==0){
				for (int y=0; y<7; y++)
					w[(ix+y)%7]+=lw[y];
				ix+=2;	
			}
			else{
				for (int y=0; y<7; y++)
					w[(ix+y)%7]+=nw[y];
	        	ix+=1;
			}
		}
		String s = "";
		for (int x=0; x<7; x++){
			s+=""+w[x]+" ";
		}
		out.println(s.trim());
		out.close();
	}
}
